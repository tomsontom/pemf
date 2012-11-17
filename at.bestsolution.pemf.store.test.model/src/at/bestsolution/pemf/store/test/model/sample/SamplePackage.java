/**
 */
package at.bestsolution.pemf.store.test.model.sample;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bestsolution.pemf.store.test.model.sample.SampleFactory
 * @model kind="package"
 * @generated
 */
public interface SamplePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sample";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bestsolution.at/pemf/sample";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sample";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SamplePackage eINSTANCE = at.bestsolution.pemf.store.test.model.sample.impl.SamplePackageImpl.init();

	/**
	 * The meta object id for the '{@link at.bestsolution.pemf.store.test.model.sample.impl.BaseObjectImpl <em>Base Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.pemf.store.test.model.sample.impl.BaseObjectImpl
	 * @see at.bestsolution.pemf.store.test.model.sample.impl.SamplePackageImpl#getBaseObject()
	 * @generated
	 */
	int BASE_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT__SID = 0;

	/**
	 * The number of structural features of the '<em>Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.pemf.store.test.model.sample.impl.CompanyImpl <em>Company</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.pemf.store.test.model.sample.impl.CompanyImpl
	 * @see at.bestsolution.pemf.store.test.model.sample.impl.SamplePackageImpl#getCompany()
	 * @generated
	 */
	int COMPANY = 1;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__SID = BASE_OBJECT__SID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__NAME = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__COUNTRIES = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link at.bestsolution.pemf.store.test.model.sample.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.pemf.store.test.model.sample.impl.CountryImpl
	 * @see at.bestsolution.pemf.store.test.model.sample.impl.SamplePackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__SID = BASE_OBJECT__SID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__REGIONS = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Company</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__COMPANY = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link at.bestsolution.pemf.store.test.model.sample.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.pemf.store.test.model.sample.impl.RegionImpl
	 * @see at.bestsolution.pemf.store.test.model.sample.impl.SamplePackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 3;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__SID = BASE_OBJECT__SID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__COUNTRY = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link at.bestsolution.pemf.store.test.model.sample.BaseObject <em>Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Object</em>'.
	 * @see at.bestsolution.pemf.store.test.model.sample.BaseObject
	 * @generated
	 */
	EClass getBaseObject();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.pemf.store.test.model.sample.BaseObject#getSid <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see at.bestsolution.pemf.store.test.model.sample.BaseObject#getSid()
	 * @see #getBaseObject()
	 * @generated
	 */
	EAttribute getBaseObject_Sid();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.pemf.store.test.model.sample.Company <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Company</em>'.
	 * @see at.bestsolution.pemf.store.test.model.sample.Company
	 * @generated
	 */
	EClass getCompany();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.pemf.store.test.model.sample.Company#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bestsolution.pemf.store.test.model.sample.Company#getName()
	 * @see #getCompany()
	 * @generated
	 */
	EAttribute getCompany_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.pemf.store.test.model.sample.Company#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Countries</em>'.
	 * @see at.bestsolution.pemf.store.test.model.sample.Company#getCountries()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_Countries();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.pemf.store.test.model.sample.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see at.bestsolution.pemf.store.test.model.sample.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.pemf.store.test.model.sample.Country#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bestsolution.pemf.store.test.model.sample.Country#getName()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Name();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.pemf.store.test.model.sample.Country#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regions</em>'.
	 * @see at.bestsolution.pemf.store.test.model.sample.Country#getRegions()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_Regions();

	/**
	 * Returns the meta object for the container reference '{@link at.bestsolution.pemf.store.test.model.sample.Country#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Company</em>'.
	 * @see at.bestsolution.pemf.store.test.model.sample.Country#getCompany()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_Company();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.pemf.store.test.model.sample.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see at.bestsolution.pemf.store.test.model.sample.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.pemf.store.test.model.sample.Region#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bestsolution.pemf.store.test.model.sample.Region#getName()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_Name();

	/**
	 * Returns the meta object for the container reference '{@link at.bestsolution.pemf.store.test.model.sample.Region#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Country</em>'.
	 * @see at.bestsolution.pemf.store.test.model.sample.Region#getCountry()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Country();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SampleFactory getSampleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.bestsolution.pemf.store.test.model.sample.impl.BaseObjectImpl <em>Base Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.pemf.store.test.model.sample.impl.BaseObjectImpl
		 * @see at.bestsolution.pemf.store.test.model.sample.impl.SamplePackageImpl#getBaseObject()
		 * @generated
		 */
		EClass BASE_OBJECT = eINSTANCE.getBaseObject();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_OBJECT__SID = eINSTANCE.getBaseObject_Sid();

		/**
		 * The meta object literal for the '{@link at.bestsolution.pemf.store.test.model.sample.impl.CompanyImpl <em>Company</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.pemf.store.test.model.sample.impl.CompanyImpl
		 * @see at.bestsolution.pemf.store.test.model.sample.impl.SamplePackageImpl#getCompany()
		 * @generated
		 */
		EClass COMPANY = eINSTANCE.getCompany();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY__NAME = eINSTANCE.getCompany_Name();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__COUNTRIES = eINSTANCE.getCompany_Countries();

		/**
		 * The meta object literal for the '{@link at.bestsolution.pemf.store.test.model.sample.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.pemf.store.test.model.sample.impl.CountryImpl
		 * @see at.bestsolution.pemf.store.test.model.sample.impl.SamplePackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__NAME = eINSTANCE.getCountry_Name();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__REGIONS = eINSTANCE.getCountry_Regions();

		/**
		 * The meta object literal for the '<em><b>Company</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__COMPANY = eINSTANCE.getCountry_Company();

		/**
		 * The meta object literal for the '{@link at.bestsolution.pemf.store.test.model.sample.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.pemf.store.test.model.sample.impl.RegionImpl
		 * @see at.bestsolution.pemf.store.test.model.sample.impl.SamplePackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__NAME = eINSTANCE.getRegion_Name();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__COUNTRY = eINSTANCE.getRegion_Country();

	}

} //SamplePackage
