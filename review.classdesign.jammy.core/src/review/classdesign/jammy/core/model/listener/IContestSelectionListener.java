package review.classdesign.jammy.core.model.listener;

import review.classdesign.jammy.core.model.webservice.contest.ContestInfo;

/** 
 * Listener that is used for notifying
 * contest selection change.
 * 
 * @author fv
 */
public interface IContestSelectionListener {

	/**
	 * Notifies that the current contextual {@link ContestInfo}
	 * instance has changed.
	 * 
	 * @param contest Newly selected contest instance.
	 */
	void contestSelected(ContestInfo contest);

}