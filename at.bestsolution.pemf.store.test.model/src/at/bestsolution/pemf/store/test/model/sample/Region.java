/**
 */
package at.bestsolution.pemf.store.test.model.sample;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.pemf.store.test.model.sample.Region#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.pemf.store.test.model.sample.Region#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.pemf.store.test.model.sample.SamplePackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends BaseObject {
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
	 * @see at.bestsolution.pemf.store.test.model.sample.SamplePackage#getRegion_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.bestsolution.pemf.store.test.model.sample.Region#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.bestsolution.pemf.store.test.model.sample.Country#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' container reference.
	 * @see #setCountry(Country)
	 * @see at.bestsolution.pemf.store.test.model.sample.SamplePackage#getRegion_Country()
	 * @see at.bestsolution.pemf.store.test.model.sample.Country#getRegions
	 * @model opposite="regions" transient="false"
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '{@link at.bestsolution.pemf.store.test.model.sample.Region#getCountry <em>Country</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' container reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

} // Region
