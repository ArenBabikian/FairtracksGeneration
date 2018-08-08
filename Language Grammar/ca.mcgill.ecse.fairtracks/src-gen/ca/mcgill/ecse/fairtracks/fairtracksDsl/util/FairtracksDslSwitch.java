/**
 * generated by Xtext 2.12.0
 */
package ca.mcgill.ecse.fairtracks.fairtracksDsl.util;

import ca.mcgill.ecse.fairtracks.fairtracksDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.mcgill.ecse.fairtracks.fairtracksDsl.FairtracksDslPackage
 * @generated
 */
public class FairtracksDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FairtracksDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FairtracksDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FairtracksDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case FairtracksDslPackage.FAIRTRACKSMODEL:
      {
        Fairtracksmodel fairtracksmodel = (Fairtracksmodel)theEObject;
        T result = caseFairtracksmodel(fairtracksmodel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FairtracksDslPackage.FT_STATIC_OBJECT:
      {
        FTStaticObject ftStaticObject = (FTStaticObject)theEObject;
        T result = caseFTStaticObject(ftStaticObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FairtracksDslPackage.FT_OBJECT_WITH_DISTANCE:
      {
        FTObjectWithDistance ftObjectWithDistance = (FTObjectWithDistance)theEObject;
        T result = caseFTObjectWithDistance(ftObjectWithDistance);
        if (result == null) result = caseFTStaticObject(ftObjectWithDistance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FairtracksDslPackage.FT_PLAYER:
      {
        FTPlayer ftPlayer = (FTPlayer)theEObject;
        T result = caseFTPlayer(ftPlayer);
        if (result == null) result = caseFTObjectWithDistance(ftPlayer);
        if (result == null) result = caseFTStaticObject(ftPlayer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FairtracksDslPackage.FT_PICK_UP_COLOR_CLASS:
      {
        FTPickUpColorClass ftPickUpColorClass = (FTPickUpColorClass)theEObject;
        T result = caseFTPickUpColorClass(ftPickUpColorClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FairtracksDslPackage.FT_ZONE:
      {
        FTZone ftZone = (FTZone)theEObject;
        T result = caseFTZone(ftZone);
        if (result == null) result = caseFTObjectWithDistance(ftZone);
        if (result == null) result = caseFTStaticObject(ftZone);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FairtracksDslPackage.FT_OBSTACLE:
      {
        FTObstacle ftObstacle = (FTObstacle)theEObject;
        T result = caseFTObstacle(ftObstacle);
        if (result == null) result = caseFTObjectWithDistance(ftObstacle);
        if (result == null) result = caseFTStaticObject(ftObstacle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FairtracksDslPackage.FT_ZIPLINE:
      {
        FTZipline ftZipline = (FTZipline)theEObject;
        T result = caseFTZipline(ftZipline);
        if (result == null) result = caseFTStaticObject(ftZipline);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FairtracksDslPackage.FT_REAL_COORDINATES:
      {
        FTRealCoordinates ftRealCoordinates = (FTRealCoordinates)theEObject;
        T result = caseFTRealCoordinates(ftRealCoordinates);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FairtracksDslPackage.FT_DISTANCE:
      {
        FTDistance ftDistance = (FTDistance)theEObject;
        T result = caseFTDistance(ftDistance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FairtracksDslPackage.FT_TRAJECTORY:
      {
        FTTrajectory ftTrajectory = (FTTrajectory)theEObject;
        T result = caseFTTrajectory(ftTrajectory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FairtracksDslPackage.FT_STATE:
      {
        FTState ftState = (FTState)theEObject;
        T result = caseFTState(ftState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FairtracksDslPackage.FT_OBSERVATION:
      {
        FTObservation ftObservation = (FTObservation)theEObject;
        T result = caseFTObservation(ftObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FairtracksDslPackage.FT_DISTANCE_OBS:
      {
        FTDistanceObs ftDistanceObs = (FTDistanceObs)theEObject;
        T result = caseFTDistanceObs(ftDistanceObs);
        if (result == null) result = caseFTObservation(ftDistanceObs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FairtracksDslPackage.FT_HANGING_OBS:
      {
        FTHangingObs ftHangingObs = (FTHangingObs)theEObject;
        T result = caseFTHangingObs(ftHangingObs);
        if (result == null) result = caseFTObservation(ftHangingObs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FairtracksDslPackage.FT_PICK_UP_OBS:
      {
        FTPickUpObs ftPickUpObs = (FTPickUpObs)theEObject;
        T result = caseFTPickUpObs(ftPickUpObs);
        if (result == null) result = caseFTObservation(ftPickUpObs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FairtracksDslPackage.FT_ZONE_OBS:
      {
        FTZoneObs ftZoneObs = (FTZoneObs)theEObject;
        T result = caseFTZoneObs(ftZoneObs);
        if (result == null) result = caseFTObservation(ftZoneObs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fairtracksmodel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fairtracksmodel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFairtracksmodel(Fairtracksmodel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FT Static Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FT Static Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFTStaticObject(FTStaticObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FT Object With Distance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FT Object With Distance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFTObjectWithDistance(FTObjectWithDistance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FT Player</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FT Player</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFTPlayer(FTPlayer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FT Pick Up Color Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FT Pick Up Color Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFTPickUpColorClass(FTPickUpColorClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FT Zone</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FT Zone</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFTZone(FTZone object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FT Obstacle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FT Obstacle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFTObstacle(FTObstacle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FT Zipline</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FT Zipline</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFTZipline(FTZipline object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FT Real Coordinates</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FT Real Coordinates</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFTRealCoordinates(FTRealCoordinates object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FT Distance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FT Distance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFTDistance(FTDistance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FT Trajectory</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FT Trajectory</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFTTrajectory(FTTrajectory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FT State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FT State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFTState(FTState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FT Observation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FT Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFTObservation(FTObservation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FT Distance Obs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FT Distance Obs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFTDistanceObs(FTDistanceObs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FT Hanging Obs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FT Hanging Obs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFTHangingObs(FTHangingObs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FT Pick Up Obs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FT Pick Up Obs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFTPickUpObs(FTPickUpObs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FT Zone Obs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FT Zone Obs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFTZoneObs(FTZoneObs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //FairtracksDslSwitch