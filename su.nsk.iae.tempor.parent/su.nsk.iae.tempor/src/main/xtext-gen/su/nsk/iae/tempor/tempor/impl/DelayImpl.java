/**
 * generated by Xtext 2.30.0
 */
package su.nsk.iae.tempor.tempor.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import su.nsk.iae.tempor.tempor.Delay;
import su.nsk.iae.tempor.tempor.SentenceDeclaration;
import su.nsk.iae.tempor.tempor.TemporPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.tempor.tempor.impl.DelayImpl#getDel <em>Del</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelayImpl extends MinimalEObjectImpl.Container implements Delay
{
  /**
   * The cached value of the '{@link #getDel() <em>Del</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDel()
   * @generated
   * @ordered
   */
  protected SentenceDeclaration del;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DelayImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TemporPackage.Literals.DELAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SentenceDeclaration getDel()
  {
    if (del != null && del.eIsProxy())
    {
      InternalEObject oldDel = (InternalEObject)del;
      del = (SentenceDeclaration)eResolveProxy(oldDel);
      if (del != oldDel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemporPackage.DELAY__DEL, oldDel, del));
      }
    }
    return del;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SentenceDeclaration basicGetDel()
  {
    return del;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDel(SentenceDeclaration newDel)
  {
    SentenceDeclaration oldDel = del;
    del = newDel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TemporPackage.DELAY__DEL, oldDel, del));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TemporPackage.DELAY__DEL:
        if (resolve) return getDel();
        return basicGetDel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TemporPackage.DELAY__DEL:
        setDel((SentenceDeclaration)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TemporPackage.DELAY__DEL:
        setDel((SentenceDeclaration)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TemporPackage.DELAY__DEL:
        return del != null;
    }
    return super.eIsSet(featureID);
  }

} //DelayImpl
