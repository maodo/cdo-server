/**
 */
package ch.flatland.cdo.model.config;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ch.flatland.cdo.model.config.ConfigFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='ch.flatland.cdo.model'"
 * @generated
 */
public interface ConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "config";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ch.flatland.cdo.model.config";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "config";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigPackage eINSTANCE = ch.flatland.cdo.model.config.impl.ConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link ch.flatland.cdo.model.config.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.flatland.cdo.model.config.impl.ConfigImpl
	 * @see ch.flatland.cdo.model.config.impl.ConfigPackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Data Store</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__DATA_STORE = 0;

	/**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__AUTHENTICATOR = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__BINDING = 2;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.flatland.cdo.model.config.impl.DataStoreImpl <em>Data Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.flatland.cdo.model.config.impl.DataStoreImpl
	 * @see ch.flatland.cdo.model.config.impl.ConfigPackageImpl#getDataStore()
	 * @generated
	 */
	int DATA_STORE = 1;

	/**
	 * The feature id for the '<em><b>Store Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__STORE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Repository Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__REPOSITORY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Connection Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__CONNECTION_URL = 2;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__USER_NAME = 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__PASSWORD = 4;

	/**
	 * The number of structural features of the '<em>Data Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Data Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.flatland.cdo.model.config.impl.AuthenticatorImpl <em>Authenticator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.flatland.cdo.model.config.impl.AuthenticatorImpl
	 * @see ch.flatland.cdo.model.config.impl.ConfigPackageImpl#getAuthenticator()
	 * @generated
	 */
	int AUTHENTICATOR = 2;

	/**
	 * The feature id for the '<em><b>Authenticator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR__AUTHENTICATOR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Connection Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR__CONNECTION_URL = 1;

	/**
	 * The feature id for the '<em><b>Domain Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR__DOMAIN_BASE = 2;

	/**
	 * The feature id for the '<em><b>User Id Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR__USER_ID_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Read Only Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR__READ_ONLY_PASSWORD = 4;

	/**
	 * The feature id for the '<em><b>Admin Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR__ADMIN_PASSWORD = 5;

	/**
	 * The number of structural features of the '<em>Authenticator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Authenticator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.flatland.cdo.model.config.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.flatland.cdo.model.config.impl.BindingImpl
	 * @see ch.flatland.cdo.model.config.impl.ConfigPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 3;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__IP = 0;

	/**
	 * The feature id for the '<em><b>Tcp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TCP = 1;

	/**
	 * The feature id for the '<em><b>Tcp Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TCP_PORT = 2;

	/**
	 * The feature id for the '<em><b>Http</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__HTTP = 3;

	/**
	 * The feature id for the '<em><b>Http Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__HTTP_PORT = 4;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.flatland.cdo.model.config.StoreType <em>Store Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.flatland.cdo.model.config.StoreType
	 * @see ch.flatland.cdo.model.config.impl.ConfigPackageImpl#getStoreType()
	 * @generated
	 */
	int STORE_TYPE = 4;

	/**
	 * The meta object id for the '{@link ch.flatland.cdo.model.config.AuthenticatorType <em>Authenticator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.flatland.cdo.model.config.AuthenticatorType
	 * @see ch.flatland.cdo.model.config.impl.ConfigPackageImpl#getAuthenticatorType()
	 * @generated
	 */
	int AUTHENTICATOR_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link ch.flatland.cdo.model.config.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see ch.flatland.cdo.model.config.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the containment reference '{@link ch.flatland.cdo.model.config.Config#getDataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Store</em>'.
	 * @see ch.flatland.cdo.model.config.Config#getDataStore()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_DataStore();

	/**
	 * Returns the meta object for the containment reference '{@link ch.flatland.cdo.model.config.Config#getAuthenticator <em>Authenticator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authenticator</em>'.
	 * @see ch.flatland.cdo.model.config.Config#getAuthenticator()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Authenticator();

	/**
	 * Returns the meta object for the containment reference '{@link ch.flatland.cdo.model.config.Config#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding</em>'.
	 * @see ch.flatland.cdo.model.config.Config#getBinding()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Binding();

	/**
	 * Returns the meta object for class '{@link ch.flatland.cdo.model.config.DataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Store</em>'.
	 * @see ch.flatland.cdo.model.config.DataStore
	 * @generated
	 */
	EClass getDataStore();

	/**
	 * Returns the meta object for the attribute '{@link ch.flatland.cdo.model.config.DataStore#getStoreType <em>Store Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Type</em>'.
	 * @see ch.flatland.cdo.model.config.DataStore#getStoreType()
	 * @see #getDataStore()
	 * @generated
	 */
	EAttribute getDataStore_StoreType();

	/**
	 * Returns the meta object for the attribute '{@link ch.flatland.cdo.model.config.DataStore#getRepositoryName <em>Repository Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Name</em>'.
	 * @see ch.flatland.cdo.model.config.DataStore#getRepositoryName()
	 * @see #getDataStore()
	 * @generated
	 */
	EAttribute getDataStore_RepositoryName();

	/**
	 * Returns the meta object for the attribute '{@link ch.flatland.cdo.model.config.DataStore#getConnectionUrl <em>Connection Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Url</em>'.
	 * @see ch.flatland.cdo.model.config.DataStore#getConnectionUrl()
	 * @see #getDataStore()
	 * @generated
	 */
	EAttribute getDataStore_ConnectionUrl();

	/**
	 * Returns the meta object for the attribute '{@link ch.flatland.cdo.model.config.DataStore#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see ch.flatland.cdo.model.config.DataStore#getUserName()
	 * @see #getDataStore()
	 * @generated
	 */
	EAttribute getDataStore_UserName();

	/**
	 * Returns the meta object for the attribute '{@link ch.flatland.cdo.model.config.DataStore#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see ch.flatland.cdo.model.config.DataStore#getPassword()
	 * @see #getDataStore()
	 * @generated
	 */
	EAttribute getDataStore_Password();

	/**
	 * Returns the meta object for class '{@link ch.flatland.cdo.model.config.Authenticator <em>Authenticator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authenticator</em>'.
	 * @see ch.flatland.cdo.model.config.Authenticator
	 * @generated
	 */
	EClass getAuthenticator();

	/**
	 * Returns the meta object for the attribute '{@link ch.flatland.cdo.model.config.Authenticator#getAuthenticatorType <em>Authenticator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authenticator Type</em>'.
	 * @see ch.flatland.cdo.model.config.Authenticator#getAuthenticatorType()
	 * @see #getAuthenticator()
	 * @generated
	 */
	EAttribute getAuthenticator_AuthenticatorType();

	/**
	 * Returns the meta object for the attribute '{@link ch.flatland.cdo.model.config.Authenticator#getConnectionUrl <em>Connection Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Url</em>'.
	 * @see ch.flatland.cdo.model.config.Authenticator#getConnectionUrl()
	 * @see #getAuthenticator()
	 * @generated
	 */
	EAttribute getAuthenticator_ConnectionUrl();

	/**
	 * Returns the meta object for the attribute '{@link ch.flatland.cdo.model.config.Authenticator#getDomainBase <em>Domain Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Base</em>'.
	 * @see ch.flatland.cdo.model.config.Authenticator#getDomainBase()
	 * @see #getAuthenticator()
	 * @generated
	 */
	EAttribute getAuthenticator_DomainBase();

	/**
	 * Returns the meta object for the attribute '{@link ch.flatland.cdo.model.config.Authenticator#getUserIdField <em>User Id Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id Field</em>'.
	 * @see ch.flatland.cdo.model.config.Authenticator#getUserIdField()
	 * @see #getAuthenticator()
	 * @generated
	 */
	EAttribute getAuthenticator_UserIdField();

	/**
	 * Returns the meta object for the attribute '{@link ch.flatland.cdo.model.config.Authenticator#getReadOnlyPassword <em>Read Only Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only Password</em>'.
	 * @see ch.flatland.cdo.model.config.Authenticator#getReadOnlyPassword()
	 * @see #getAuthenticator()
	 * @generated
	 */
	EAttribute getAuthenticator_ReadOnlyPassword();

	/**
	 * Returns the meta object for the attribute '{@link ch.flatland.cdo.model.config.Authenticator#getAdminPassword <em>Admin Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin Password</em>'.
	 * @see ch.flatland.cdo.model.config.Authenticator#getAdminPassword()
	 * @see #getAuthenticator()
	 * @generated
	 */
	EAttribute getAuthenticator_AdminPassword();

	/**
	 * Returns the meta object for class '{@link ch.flatland.cdo.model.config.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see ch.flatland.cdo.model.config.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the attribute '{@link ch.flatland.cdo.model.config.Binding#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see ch.flatland.cdo.model.config.Binding#getIp()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Ip();

	/**
	 * Returns the meta object for the attribute '{@link ch.flatland.cdo.model.config.Binding#isTcp <em>Tcp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tcp</em>'.
	 * @see ch.flatland.cdo.model.config.Binding#isTcp()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Tcp();

	/**
	 * Returns the meta object for the attribute '{@link ch.flatland.cdo.model.config.Binding#getTcpPort <em>Tcp Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tcp Port</em>'.
	 * @see ch.flatland.cdo.model.config.Binding#getTcpPort()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_TcpPort();

	/**
	 * Returns the meta object for the attribute '{@link ch.flatland.cdo.model.config.Binding#isHttp <em>Http</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http</em>'.
	 * @see ch.flatland.cdo.model.config.Binding#isHttp()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Http();

	/**
	 * Returns the meta object for the attribute '{@link ch.flatland.cdo.model.config.Binding#getHttpPort <em>Http Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Port</em>'.
	 * @see ch.flatland.cdo.model.config.Binding#getHttpPort()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_HttpPort();

	/**
	 * Returns the meta object for enum '{@link ch.flatland.cdo.model.config.StoreType <em>Store Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Store Type</em>'.
	 * @see ch.flatland.cdo.model.config.StoreType
	 * @generated
	 */
	EEnum getStoreType();

	/**
	 * Returns the meta object for enum '{@link ch.flatland.cdo.model.config.AuthenticatorType <em>Authenticator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Authenticator Type</em>'.
	 * @see ch.flatland.cdo.model.config.AuthenticatorType
	 * @generated
	 */
	EEnum getAuthenticatorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigFactory getConfigFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ch.flatland.cdo.model.config.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.flatland.cdo.model.config.impl.ConfigImpl
		 * @see ch.flatland.cdo.model.config.impl.ConfigPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Data Store</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__DATA_STORE = eINSTANCE.getConfig_DataStore();

		/**
		 * The meta object literal for the '<em><b>Authenticator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__AUTHENTICATOR = eINSTANCE.getConfig_Authenticator();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__BINDING = eINSTANCE.getConfig_Binding();

		/**
		 * The meta object literal for the '{@link ch.flatland.cdo.model.config.impl.DataStoreImpl <em>Data Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.flatland.cdo.model.config.impl.DataStoreImpl
		 * @see ch.flatland.cdo.model.config.impl.ConfigPackageImpl#getDataStore()
		 * @generated
		 */
		EClass DATA_STORE = eINSTANCE.getDataStore();

		/**
		 * The meta object literal for the '<em><b>Store Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STORE__STORE_TYPE = eINSTANCE.getDataStore_StoreType();

		/**
		 * The meta object literal for the '<em><b>Repository Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STORE__REPOSITORY_NAME = eINSTANCE.getDataStore_RepositoryName();

		/**
		 * The meta object literal for the '<em><b>Connection Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STORE__CONNECTION_URL = eINSTANCE.getDataStore_ConnectionUrl();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STORE__USER_NAME = eINSTANCE.getDataStore_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STORE__PASSWORD = eINSTANCE.getDataStore_Password();

		/**
		 * The meta object literal for the '{@link ch.flatland.cdo.model.config.impl.AuthenticatorImpl <em>Authenticator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.flatland.cdo.model.config.impl.AuthenticatorImpl
		 * @see ch.flatland.cdo.model.config.impl.ConfigPackageImpl#getAuthenticator()
		 * @generated
		 */
		EClass AUTHENTICATOR = eINSTANCE.getAuthenticator();

		/**
		 * The meta object literal for the '<em><b>Authenticator Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATOR__AUTHENTICATOR_TYPE = eINSTANCE.getAuthenticator_AuthenticatorType();

		/**
		 * The meta object literal for the '<em><b>Connection Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATOR__CONNECTION_URL = eINSTANCE.getAuthenticator_ConnectionUrl();

		/**
		 * The meta object literal for the '<em><b>Domain Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATOR__DOMAIN_BASE = eINSTANCE.getAuthenticator_DomainBase();

		/**
		 * The meta object literal for the '<em><b>User Id Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATOR__USER_ID_FIELD = eINSTANCE.getAuthenticator_UserIdField();

		/**
		 * The meta object literal for the '<em><b>Read Only Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATOR__READ_ONLY_PASSWORD = eINSTANCE.getAuthenticator_ReadOnlyPassword();

		/**
		 * The meta object literal for the '<em><b>Admin Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATOR__ADMIN_PASSWORD = eINSTANCE.getAuthenticator_AdminPassword();

		/**
		 * The meta object literal for the '{@link ch.flatland.cdo.model.config.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.flatland.cdo.model.config.impl.BindingImpl
		 * @see ch.flatland.cdo.model.config.impl.ConfigPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__IP = eINSTANCE.getBinding_Ip();

		/**
		 * The meta object literal for the '<em><b>Tcp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__TCP = eINSTANCE.getBinding_Tcp();

		/**
		 * The meta object literal for the '<em><b>Tcp Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__TCP_PORT = eINSTANCE.getBinding_TcpPort();

		/**
		 * The meta object literal for the '<em><b>Http</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__HTTP = eINSTANCE.getBinding_Http();

		/**
		 * The meta object literal for the '<em><b>Http Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__HTTP_PORT = eINSTANCE.getBinding_HttpPort();

		/**
		 * The meta object literal for the '{@link ch.flatland.cdo.model.config.StoreType <em>Store Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.flatland.cdo.model.config.StoreType
		 * @see ch.flatland.cdo.model.config.impl.ConfigPackageImpl#getStoreType()
		 * @generated
		 */
		EEnum STORE_TYPE = eINSTANCE.getStoreType();

		/**
		 * The meta object literal for the '{@link ch.flatland.cdo.model.config.AuthenticatorType <em>Authenticator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.flatland.cdo.model.config.AuthenticatorType
		 * @see ch.flatland.cdo.model.config.impl.ConfigPackageImpl#getAuthenticatorType()
		 * @generated
		 */
		EEnum AUTHENTICATOR_TYPE = eINSTANCE.getAuthenticatorType();

	}

} //ConfigPackage