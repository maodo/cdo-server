package ch.flatland.cdo.service.repoaccess

import ch.flatland.cdo.util.FlatlandException
import ch.flatland.cdo.util.Json
import ch.flatland.cdo.util.JsonConverterConfig
import java.io.IOException
import javax.servlet.ServletException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import org.eclipse.emf.cdo.common.id.CDOIDUtil
import ch.flatland.cdo.util.JsonConverter

class RepoAccessServlet extends AbstractAccessServlet {

	val static PARAM_OID = Json.PARAM_OID
	val static PARAM_META = Json.PARAM_META
	val static PARAM_META_TYPE = Json.PARAM_META_TYPE
	val static PARAM_JSONP_CALLBACK = "callback"
	val static SERVLET_CONTEXT = "/repo"

	override protected doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (RepoAccessPlugin.getDefault.debugging) {
			logRequest(req)
		}
		val serverBaseUrl = req.requestURL.substring(0, req.requestURL.indexOf(SERVLET_CONTEXT)) + SERVLET_CONTEXT
		var Object requestedObject = null

		// jsonConvertConfig
		var meta = false
		if (req.getParameter(PARAM_META) != null && req.getParameter(PARAM_META).length > 0) {
			if (req.getParameter(PARAM_META) == true.toString) {
				meta = true
			}
		}
		try {

			var processed = false

			// processes meta info
			if (req.getParameter(PARAM_META_TYPE) != null && req.getParameter(PARAM_META_TYPE).length > 0) {
				requestedObject = resolveEClassifier(req.getParameter(PARAM_META_TYPE))
				processed = true
			}

			// processes oid
			if (req.getParameter(PARAM_OID) != null && req.getParameter(PARAM_OID).length > 0) {
				requestedObject = view.getObject(CDOIDUtil.createLong(Long.parseLong(req.getParameter(PARAM_OID))))
				processed = true
			}

			// processes path
			if (!processed) {
				requestedObject = view.getResourceNode(req.pathInfo)
			}

		} catch (Exception e) {
			requestedObject = e
			e.printStackTrace
		} finally {
			val jsonConverterConfig = new JsonConverterConfig(serverBaseUrl, meta)
			val jsonString = new JsonConverter(jsonConverterConfig).toJson(requestedObject)

			// write response
			if (req.getParameter(PARAM_JSONP_CALLBACK) != null && req.getParameter(PARAM_JSONP_CALLBACK).length > 0) {
				resp.contentType = Json.JSON_CONTENTTYPE_UTF8
				resp.writer.append('''�req.getParameter(PARAM_JSONP_CALLBACK)�(�jsonString�)''')
			} else {
				resp.contentType = Json.JSONP_CONTENTTYPE_UTF8
				resp.writer.append(jsonString)
			}
		}
	}

	def private resolveEClassifier(String uri) throws FlatlandException {
		val segments = uri.split('/').iterator
		val classifierName = segments.last
		val packageUri = uri.replace("/" + classifierName, "")

		if (RepoAccessPlugin.getDefault.debugging) {
			println(
				'''
					>>>
					   resolveEClassifier(�uri�) �this.class.name�
					   classifierName = �classifierName�
					   packageUri = �packageUri�
					<<<
				''')
		}

		val package = view.session.packageRegistry.getEPackage(packageUri)

		if (package != null) {
			for (classifier : package.EClassifiers) {
				if (classifier.name == classifierName) {
					return classifier
				}
			}
		}

		throw new FlatlandException("Could not resolve meta info for " + uri)
	}
}
