package review.classdesign.jammy.wizard.contest;

import org.eclipse.jface.wizard.IWizard;

import review.classdesign.jammy.wizard.AbstractWizardHandler;

/**
 * Default handler used for Jammy contest selection
 * command.
 * 
 * @author fv
 */
public final class ContestHandler extends AbstractWizardHandler {

	/** {@inheritDoc} **/
	@Override
	protected IWizard createWizard() {
		return new ContestWizard();
	}


}
