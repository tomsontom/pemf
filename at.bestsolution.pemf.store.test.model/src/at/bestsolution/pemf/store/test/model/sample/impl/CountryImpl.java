/**
 */
package at.bestsolution.pemf.store.test.model.sample.impl;

import at.bestsolution.pemf.store.test.model.sample.Company;
import at.bestsolution.pemf.store.test.model.sample.Country;
import at.bestsolution.pemf.store.test.model.sample.Region;
import at.bestsolution.pemf.store.test.model.sample.SamplePackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EStoreEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.pemf.store.test.model.sample.impl.CountryImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.pemf.store.test.model.sample.impl.CountryImpl#getRegions <em>Regions</em>}</li>
 *   <li>{@link at.bestsolution.pemf.store.test.model.sample.impl.CountryImpl#getCompany <em>Company</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CountryImpl extends BaseObjectImpl implements Country {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SamplePackage.Literals.COUNTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(SamplePackage.Literals.COUNTRY__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(SamplePackage.Literals.COUNTRY__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getRegions() {
		return (Region)eGet(SamplePackage.Literals.COUNTRY__REGIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegions(Region newRegions) {
		eSet(SamplePackage.Literals.COUNTRY__REGIONS, newRegions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Company getCompany() {
		return (Company)eGet(SamplePackage.Literals.COUNTRY__COMPANY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompany(Company newCompany) {
		eSet(SamplePackage.Literals.COUNTRY__COMPANY, newCompany);
	}

} //CountryImpl
