/**
 */
package at.bestsolution.pemf.store.test.model.sample;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.pemf.store.test.model.sample.Country#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.pemf.store.test.model.sample.Country#getRegions <em>Regions</em>}</li>
 *   <li>{@link at.bestsolution.pemf.store.test.model.sample.Country#getCompany <em>Company</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.pemf.store.test.model.sample.SamplePackage#getCountry()
 * @model
 * @generated
 */
public interface Country extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.bestsolution.pemf.store.test.model.sample.SamplePackage#getCountry_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.bestsolution.pemf.store.test.model.sample.Country#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.pemf.store.test.model.sample.Region#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference.
	 * @see #setRegions(Region)
	 * @see at.bestsolution.pemf.store.test.model.sample.SamplePackage#getCountry_Regions()
	 * @see at.bestsolution.pemf.store.test.model.sample.Region#getCountry
	 * @model opposite="country" containment="true"
	 * @generated
	 */
	Region getRegions();

	/**
	 * Sets the value of the '{@link at.bestsolution.pemf.store.test.model.sample.Country#getRegions <em>Regions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regions</em>' containment reference.
	 * @see #getRegions()
	 * @generated
	 */
	void setRegions(Region value);

	/**
	 * Returns the value of the '<em><b>Company</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.pemf.store.test.model.sample.Company#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company</em>' container reference.
	 * @see #setCompany(Company)
	 * @see at.bestsolution.pemf.store.test.model.sample.SamplePackage#getCountry_Company()
	 * @see at.bestsolution.pemf.store.test.model.sample.Company#getCountries
	 * @model opposite="countries" transient="false"
	 * @generated
	 */
	Company getCompany();

	/**
	 * Sets the value of the '{@link at.bestsolution.pemf.store.test.model.sample.Country#getCompany <em>Company</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company</em>' container reference.
	 * @see #getCompany()
	 * @generated
	 */
	void setCompany(Company value);

} // Country
