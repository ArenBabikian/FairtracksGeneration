/*
 * generated by Xtext 2.12.0
 */
package ca.mcgill.ecse.fairtracks.ui.tests;

import ca.mcgill.ecse.fairtracks.ui.internal.FairtracksActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class FairtracksDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return FairtracksActivator.getInstance().getInjector("ca.mcgill.ecse.fairtracks.FairtracksDsl");
	}

}
