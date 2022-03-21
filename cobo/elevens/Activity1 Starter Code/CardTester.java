/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

		Card test0 = new Card("Jack", "Hearts", 11);
		Card test1 = new Card("Jack", "Hearts", 11);
		Card test2 = new Card("Seven", "Diamonds", 7);

		System.out.println(test0);
		System.out.println(test1);
		System.out.println(test2);

		System.out.println(test0.matches(test1));
		System.out.println(test0.matches(test2));
	}
}
