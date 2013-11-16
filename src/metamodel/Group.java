/**
 */
package metamodel;

import metamodel.generator.IVisitable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.Group#getWheels <em>Wheels</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends Actuator, IVisitable {
	/**
	 * Returns the value of the '<em><b>Wheels</b></em>' reference list.
	 * The list contents are of type {@link metamodel.DifferentialWheel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wheels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wheels</em>' reference list.
	 * @see metamodel.MetamodelPackage#getGroup_Wheels()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<DifferentialWheel> getWheels();

} // Group
