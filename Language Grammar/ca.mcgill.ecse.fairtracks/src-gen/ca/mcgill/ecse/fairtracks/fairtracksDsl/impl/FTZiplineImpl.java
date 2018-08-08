/**
 * generated by Xtext 2.12.0
 */
package ca.mcgill.ecse.fairtracks.fairtracksDsl.impl;

import ca.mcgill.ecse.fairtracks.fairtracksDsl.FTZipline;
import ca.mcgill.ecse.fairtracks.fairtracksDsl.FTZone;
import ca.mcgill.ecse.fairtracks.fairtracksDsl.FairtracksDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FT Zipline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.fairtracks.fairtracksDsl.impl.FTZiplineImpl#getStartZone <em>Start Zone</em>}</li>
 *   <li>{@link ca.mcgill.ecse.fairtracks.fairtracksDsl.impl.FTZiplineImpl#getEndZone <em>End Zone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FTZiplineImpl extends FTStaticObjectImpl implements FTZipline
{
  /**
   * The cached value of the '{@link #getStartZone() <em>Start Zone</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartZone()
   * @generated
   * @ordered
   */
  protected FTZone startZone;

  /**
   * The cached value of the '{@link #getEndZone() <em>End Zone</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndZone()
   * @generated
   * @ordered
   */
  protected FTZone endZone;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FTZiplineImpl()
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
    return FairtracksDslPackage.Literals.FT_ZIPLINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FTZone getStartZone()
  {
    if (startZone != null && startZone.eIsProxy())
    {
      InternalEObject oldStartZone = (InternalEObject)startZone;
      startZone = (FTZone)eResolveProxy(oldStartZone);
      if (startZone != oldStartZone)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FairtracksDslPackage.FT_ZIPLINE__START_ZONE, oldStartZone, startZone));
      }
    }
    return startZone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FTZone basicGetStartZone()
  {
    return startZone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartZone(FTZone newStartZone)
  {
    FTZone oldStartZone = startZone;
    startZone = newStartZone;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FairtracksDslPackage.FT_ZIPLINE__START_ZONE, oldStartZone, startZone));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FTZone getEndZone()
  {
    if (endZone != null && endZone.eIsProxy())
    {
      InternalEObject oldEndZone = (InternalEObject)endZone;
      endZone = (FTZone)eResolveProxy(oldEndZone);
      if (endZone != oldEndZone)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FairtracksDslPackage.FT_ZIPLINE__END_ZONE, oldEndZone, endZone));
      }
    }
    return endZone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FTZone basicGetEndZone()
  {
    return endZone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndZone(FTZone newEndZone)
  {
    FTZone oldEndZone = endZone;
    endZone = newEndZone;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FairtracksDslPackage.FT_ZIPLINE__END_ZONE, oldEndZone, endZone));
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
      case FairtracksDslPackage.FT_ZIPLINE__START_ZONE:
        if (resolve) return getStartZone();
        return basicGetStartZone();
      case FairtracksDslPackage.FT_ZIPLINE__END_ZONE:
        if (resolve) return getEndZone();
        return basicGetEndZone();
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
      case FairtracksDslPackage.FT_ZIPLINE__START_ZONE:
        setStartZone((FTZone)newValue);
        return;
      case FairtracksDslPackage.FT_ZIPLINE__END_ZONE:
        setEndZone((FTZone)newValue);
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
      case FairtracksDslPackage.FT_ZIPLINE__START_ZONE:
        setStartZone((FTZone)null);
        return;
      case FairtracksDslPackage.FT_ZIPLINE__END_ZONE:
        setEndZone((FTZone)null);
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
      case FairtracksDslPackage.FT_ZIPLINE__START_ZONE:
        return startZone != null;
      case FairtracksDslPackage.FT_ZIPLINE__END_ZONE:
        return endZone != null;
    }
    return super.eIsSet(featureID);
  }

} //FTZiplineImpl