/**
 * generated by Xtext 2.30.0
 */
package su.nsk.iae.tempor.tempor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Del Fin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.tempor.tempor.DelFin#getDelay <em>Delay</em>}</li>
 *   <li>{@link su.nsk.iae.tempor.tempor.DelFin#getFin <em>Fin</em>}</li>
 *   <li>{@link su.nsk.iae.tempor.tempor.DelFin#isImm <em>Imm</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.tempor.tempor.TemporPackage#getDelFin()
 * @model
 * @generated
 */
public interface DelFin extends EObject
{
  /**
   * Returns the value of the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delay</em>' containment reference.
   * @see #setDelay(Delay)
   * @see su.nsk.iae.tempor.tempor.TemporPackage#getDelFin_Delay()
   * @model containment="true"
   * @generated
   */
  Delay getDelay();

  /**
   * Sets the value of the '{@link su.nsk.iae.tempor.tempor.DelFin#getDelay <em>Delay</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay</em>' containment reference.
   * @see #getDelay()
   * @generated
   */
  void setDelay(Delay value);

  /**
   * Returns the value of the '<em><b>Fin</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fin</em>' reference.
   * @see #setFin(SentenceDeclaration)
   * @see su.nsk.iae.tempor.tempor.TemporPackage#getDelFin_Fin()
   * @model
   * @generated
   */
  SentenceDeclaration getFin();

  /**
   * Sets the value of the '{@link su.nsk.iae.tempor.tempor.DelFin#getFin <em>Fin</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fin</em>' reference.
   * @see #getFin()
   * @generated
   */
  void setFin(SentenceDeclaration value);

  /**
   * Returns the value of the '<em><b>Imm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imm</em>' attribute.
   * @see #setImm(boolean)
   * @see su.nsk.iae.tempor.tempor.TemporPackage#getDelFin_Imm()
   * @model
   * @generated
   */
  boolean isImm();

  /**
   * Sets the value of the '{@link su.nsk.iae.tempor.tempor.DelFin#isImm <em>Imm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imm</em>' attribute.
   * @see #isImm()
   * @generated
   */
  void setImm(boolean value);

} // DelFin
