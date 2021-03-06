/**
 * generated by Xtext 2.12.0
 */
package ca.mcgill.ecse.fairtracks.fairtracksDsl.provider;

import ca.mcgill.ecse.fairtracks.fairtracksDsl.util.FairtracksDslAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FairtracksDslItemProviderAdapterFactory extends FairtracksDslAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FairtracksDslItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.Fairtracksmodel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FairtracksmodelItemProvider fairtracksmodelItemProvider;

	/**
	 * This creates an adapter for a {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.Fairtracksmodel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFairtracksmodelAdapter() {
		if (fairtracksmodelItemProvider == null) {
			fairtracksmodelItemProvider = new FairtracksmodelItemProvider(this);
		}

		return fairtracksmodelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTStaticObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTStaticObjectItemProvider ftStaticObjectItemProvider;

	/**
	 * This creates an adapter for a {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTStaticObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFTStaticObjectAdapter() {
		if (ftStaticObjectItemProvider == null) {
			ftStaticObjectItemProvider = new FTStaticObjectItemProvider(this);
		}

		return ftStaticObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTPlayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTPlayerItemProvider ftPlayerItemProvider;

	/**
	 * This creates an adapter for a {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTPlayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFTPlayerAdapter() {
		if (ftPlayerItemProvider == null) {
			ftPlayerItemProvider = new FTPlayerItemProvider(this);
		}

		return ftPlayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTPickUpColorClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTPickUpColorClassItemProvider ftPickUpColorClassItemProvider;

	/**
	 * This creates an adapter for a {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTPickUpColorClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFTPickUpColorClassAdapter() {
		if (ftPickUpColorClassItemProvider == null) {
			ftPickUpColorClassItemProvider = new FTPickUpColorClassItemProvider(this);
		}

		return ftPickUpColorClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTZone} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTZoneItemProvider ftZoneItemProvider;

	/**
	 * This creates an adapter for a {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTZone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFTZoneAdapter() {
		if (ftZoneItemProvider == null) {
			ftZoneItemProvider = new FTZoneItemProvider(this);
		}

		return ftZoneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTObstacle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTObstacleItemProvider ftObstacleItemProvider;

	/**
	 * This creates an adapter for a {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTObstacle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFTObstacleAdapter() {
		if (ftObstacleItemProvider == null) {
			ftObstacleItemProvider = new FTObstacleItemProvider(this);
		}

		return ftObstacleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTZipline} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTZiplineItemProvider ftZiplineItemProvider;

	/**
	 * This creates an adapter for a {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTZipline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFTZiplineAdapter() {
		if (ftZiplineItemProvider == null) {
			ftZiplineItemProvider = new FTZiplineItemProvider(this);
		}

		return ftZiplineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTPosition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTPositionItemProvider ftPositionItemProvider;

	/**
	 * This creates an adapter for a {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFTPositionAdapter() {
		if (ftPositionItemProvider == null) {
			ftPositionItemProvider = new FTPositionItemProvider(this);
		}

		return ftPositionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTDistance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTDistanceItemProvider ftDistanceItemProvider;

	/**
	 * This creates an adapter for a {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTDistance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFTDistanceAdapter() {
		if (ftDistanceItemProvider == null) {
			ftDistanceItemProvider = new FTDistanceItemProvider(this);
		}

		return ftDistanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTTrajectory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTTrajectoryItemProvider ftTrajectoryItemProvider;

	/**
	 * This creates an adapter for a {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTTrajectory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFTTrajectoryAdapter() {
		if (ftTrajectoryItemProvider == null) {
			ftTrajectoryItemProvider = new FTTrajectoryItemProvider(this);
		}

		return ftTrajectoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTStateItemProvider ftStateItemProvider;

	/**
	 * This creates an adapter for a {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFTStateAdapter() {
		if (ftStateItemProvider == null) {
			ftStateItemProvider = new FTStateItemProvider(this);
		}

		return ftStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTObservation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTObservationItemProvider ftObservationItemProvider;

	/**
	 * This creates an adapter for a {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTObservation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFTObservationAdapter() {
		if (ftObservationItemProvider == null) {
			ftObservationItemProvider = new FTObservationItemProvider(this);
		}

		return ftObservationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTDistanceObs} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTDistanceObsItemProvider ftDistanceObsItemProvider;

	/**
	 * This creates an adapter for a {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTDistanceObs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFTDistanceObsAdapter() {
		if (ftDistanceObsItemProvider == null) {
			ftDistanceObsItemProvider = new FTDistanceObsItemProvider(this);
		}

		return ftDistanceObsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTHangingObs} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTHangingObsItemProvider ftHangingObsItemProvider;

	/**
	 * This creates an adapter for a {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTHangingObs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFTHangingObsAdapter() {
		if (ftHangingObsItemProvider == null) {
			ftHangingObsItemProvider = new FTHangingObsItemProvider(this);
		}

		return ftHangingObsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTPickUpObs} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTPickUpObsItemProvider ftPickUpObsItemProvider;

	/**
	 * This creates an adapter for a {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTPickUpObs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFTPickUpObsAdapter() {
		if (ftPickUpObsItemProvider == null) {
			ftPickUpObsItemProvider = new FTPickUpObsItemProvider(this);
		}

		return ftPickUpObsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTZoneObs} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTZoneObsItemProvider ftZoneObsItemProvider;

	/**
	 * This creates an adapter for a {@link ca.mcgill.ecse.fairtracks.fairtracksDsl.FTZoneObs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFTZoneObsAdapter() {
		if (ftZoneObsItemProvider == null) {
			ftZoneObsItemProvider = new FTZoneObsItemProvider(this);
		}

		return ftZoneObsItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (fairtracksmodelItemProvider != null) fairtracksmodelItemProvider.dispose();
		if (ftStaticObjectItemProvider != null) ftStaticObjectItemProvider.dispose();
		if (ftPlayerItemProvider != null) ftPlayerItemProvider.dispose();
		if (ftPickUpColorClassItemProvider != null) ftPickUpColorClassItemProvider.dispose();
		if (ftZoneItemProvider != null) ftZoneItemProvider.dispose();
		if (ftObstacleItemProvider != null) ftObstacleItemProvider.dispose();
		if (ftZiplineItemProvider != null) ftZiplineItemProvider.dispose();
		if (ftPositionItemProvider != null) ftPositionItemProvider.dispose();
		if (ftDistanceItemProvider != null) ftDistanceItemProvider.dispose();
		if (ftTrajectoryItemProvider != null) ftTrajectoryItemProvider.dispose();
		if (ftStateItemProvider != null) ftStateItemProvider.dispose();
		if (ftObservationItemProvider != null) ftObservationItemProvider.dispose();
		if (ftDistanceObsItemProvider != null) ftDistanceObsItemProvider.dispose();
		if (ftHangingObsItemProvider != null) ftHangingObsItemProvider.dispose();
		if (ftPickUpObsItemProvider != null) ftPickUpObsItemProvider.dispose();
		if (ftZoneObsItemProvider != null) ftZoneObsItemProvider.dispose();
	}

}
