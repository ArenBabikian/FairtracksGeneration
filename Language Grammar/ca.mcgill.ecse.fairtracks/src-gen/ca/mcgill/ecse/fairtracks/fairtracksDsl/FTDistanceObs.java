/**
 * generated by Xtext 2.12.0
 */
package ca.mcgill.ecse.fairtracks.fairtracksDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FT Distance Obs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTDistanceObs#getDistance <em>Distance</em>}</li>
 *   <li>{@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTDistanceObs#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.fairtracks.fairtracksDsl.FairtracksDslPackage#getFTDistanceObs()
 * @model
 * @generated
 */
public interface FTDistanceObs extends FTObservation
{
  /**
   * Returns the value of the '<em><b>Distance</b></em>' attribute.
   * The literals are from the enumeration {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTDistanceValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distance</em>' attribute.
   * @see ca.mcgill.ecse.fairtracks.fairtracksDsl.FTDistanceValue
   * @see #setDistance(FTDistanceValue)
   * @see ca.mcgill.ecse.fairtracks.fairtracksDsl.FairtracksDslPackage#getFTDistanceObs_Distance()
   * @model
   * @generated
   */
  FTDistanceValue getDistance();

  /**
   * Sets the value of the '{@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTDistanceObs#getDistance <em>Distance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distance</em>' attribute.
   * @see ca.mcgill.ecse.fairtracks.fairtracksDsl.FTDistanceValue
   * @see #getDistance()
   * @generated
   */
  void setDistance(FTDistanceValue value);

  /**
   * Returns the value of the '<em><b>Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' reference.
   * @see #setObject(FTObjectWithDistance)
   * @see ca.mcgill.ecse.fairtracks.fairtracksDsl.FairtracksDslPackage#getFTDistanceObs_Object()
   * @model
   * @generated
   */
  FTObjectWithDistance getObject();

  /**
   * Sets the value of the '{@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTDistanceObs#getObject <em>Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' reference.
   * @see #getObject()
   * @generated
   */
  void setObject(FTObjectWithDistance value);

} // FTDistanceObs
