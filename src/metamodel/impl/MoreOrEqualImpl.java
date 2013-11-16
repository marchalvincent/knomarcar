/**
 */
package metamodel.impl;

import metamodel.MetamodelPackage;
import metamodel.MoreOrEqual;
import metamodel.generator.IVisitor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>More Or Equal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MoreOrEqualImpl extends BinaryOperatorImpl implements MoreOrEqual {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoreOrEqualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.MORE_OR_EQUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void accept(IVisitor v) {
		v.visit(this);
	}

} //MoreOrEqualImpl
