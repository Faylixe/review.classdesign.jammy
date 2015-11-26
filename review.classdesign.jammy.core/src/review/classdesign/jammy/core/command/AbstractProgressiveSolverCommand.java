package review.classdesign.jammy.core.command;

import io.faylixe.googlecodejam.client.webservice.ContestInfo;
import io.faylixe.googlecodejam.client.webservice.Problem;

import java.util.Optional;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import review.classdesign.jammy.core.Jammy;
import review.classdesign.jammy.core.ProblemSolver;
import review.classdesign.jammy.core.common.EclipseUtils;

/**
 * 
 * @author fv
 */
public abstract class AbstractProgressiveSolverCommand extends AbstractProgressiveCommand {
	
	/** {@inheritDoc} **/
	@Override
	public void run(final IProgressMonitor monitor) {
		final Optional<Problem> currentProblem = Jammy.getDefault().getCurrentProblem();
		final Optional<ContestInfo> currentContest = Jammy.getDefault().getCurrentContest();
		if (currentContest.isPresent() && currentProblem.isPresent()) {
			final Problem problem = currentProblem.get();
			try {
				monitor.beginTask(getTaskName(), IProgressMonitor.UNKNOWN);
				final ProblemSolver solver = ProblemSolver.get(problem, monitor);
				monitor.subTask(getTaskName());
				processSolver(solver, monitor);
			}
			catch (final CoreException e) {
				EclipseUtils.showError(e);
			}
		}
	}
	
	/**
	 * 
	 * @param solver
	 */
	protected abstract void processSolver(ProblemSolver solver, IProgressMonitor monitor) throws CoreException;

	/**
	 * 
	 * @return
	 */
	protected abstract String getTaskName();

}
