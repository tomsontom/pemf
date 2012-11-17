/**
 */
package at.bestsolution.pemf.store.test.model.sample.impl;

import at.bestsolution.pemf.store.test.model.sample.Country;
import at.bestsolution.pemf.store.test.model.sample.Region;
import at.bestsolution.pemf.store.test.model.sample.SamplePackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EStoreEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.pemf.store.test.model.sample.impl.RegionImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.pemf.store.test.model.sample.impl.RegionImpl#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionImpl extends BaseObjectImpl implements Region {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SamplePackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(SamplePackage.Literals.REGION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(SamplePackage.Literals.REGION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getCountry() {
		return (Country)eGet(SamplePackage.Literals.REGION__COUNTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(Country newCountry) {
		eSet(SamplePackage.Literals.REGION__COUNTRY, newCountry);
	}

} //RegionImpl
