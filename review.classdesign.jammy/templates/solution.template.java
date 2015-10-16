
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Google code jam problem solver.
 * Template generated by <a href="https://github.com/Faylixe/review.classdesign.jammy">Jammy</a> plugin.
 * 
 * @author
 */
public final class %s {

	/** Scanner instance that allows to parse problem input. **/
	private final Scanner scanner;

	/**
	 * Default constructor.
	 * 
	 * @param scanner Scanner instance that allows to parse problem input. 
	 */
	private %s(final Scanner scanner) {
		this.scanner = scanner;
	}

	/**
	 * Solve a problem instance using internal
	 * scanner to retrieve problem input.
	 */
	public void solve() {
		// TODO : Parse problem input and print solution here.
	}

	/**
	 * Solver entry point.
	 * 
	 * @param args Command line parameters.
	 * @throws FileNotFoundException If input file could not be parsed.
	 */
	public static void main(final String [] args) throws FileNotFoundException {
		final File file = new File(args[0]);
		final Scanner scanner = new Scanner(file);
		final int n = scanner.nextInt();
		final %s solver = new %s(scanner);
		for (int i = 0; i < n; i++) {
			System.out.print("Case #" + i + " : ");
			solver.solve();
		}
		scanner.close();
	}

}