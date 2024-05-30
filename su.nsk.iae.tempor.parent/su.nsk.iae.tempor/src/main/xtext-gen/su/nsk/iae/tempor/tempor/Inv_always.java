/**
 * generated by Xtext 2.30.0
 */
package su.nsk.iae.tempor.tempor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inv always</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.tempor.tempor.Inv_always#getInv <em>Inv</em>}</li>
 *   <li>{@link su.nsk.iae.tempor.tempor.Inv_always#getRelease_reaction <em>Release reaction</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.tempor.tempor.TemporPackage#getInv_always()
 * @model
 * @generated
 */
public interface Inv_always extends EObject
{
  /**
   * Returns the value of the '<em><b>Inv</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inv</em>' reference.
   * @see #setInv(SentenceDeclaration)
   * @see su.nsk.iae.tempor.tempor.TemporPackage#getInv_always_Inv()
   * @model
   * @generated
   */
  SentenceDeclaration getInv();

  /**
   * Sets the value of the '{@link su.nsk.iae.tempor.tempor.Inv_always#getInv <em>Inv</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inv</em>' reference.
   * @see #getInv()
   * @generated
   */
  void setInv(SentenceDeclaration value);

  /**
   * Returns the value of the '<em><b>Release reaction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Release reaction</em>' containment reference.
   * @see #setRelease_reaction(RelRea)
   * @see su.nsk.iae.tempor.tempor.TemporPackage#getInv_always_Release_reaction()
   * @model containment="true"
   * @generated
   */
  RelRea getRelease_reaction();

  /**
   * Sets the value of the '{@link su.nsk.iae.tempor.tempor.Inv_always#getRelease_reaction <em>Release reaction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Release reaction</em>' containment reference.
   * @see #getRelease_reaction()
   * @generated
   */
  void setRelease_reaction(RelRea value);

} // Inv_always