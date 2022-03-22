/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks0 = {"one", "two", "three"};
		String[] suits0 = {"hearts", "club"};
		int[] values0 = {1, 2, 3};

		System.out.println("---------First Deck---------");
		Deck deck0 = new Deck(ranks0, suits0, values0);
		System.out.println("empty?\t" + deck0.isEmpty());
		for (int i = deck0.size(); i > 0; i--){
			System.out.println("dealing...\t" + deck0.deal());
			System.out.println("empty?\t" + deck0.isEmpty());
		}
		System.out.println();


		String[] ranks1 = {};
		String[] suits1 = {};
		int[] values1 = {};

		System.out.println("---------Second Deck---------");
		Deck deck1 = new Deck(ranks1, suits1, values1);
		System.out.println("empty?\t" + deck1.isEmpty());
		for (int i = deck1.size(); i > 0; i--){
			System.out.println("dealing...\t" + deck1.deal());
			System.out.println("empty?\t" + deck1.isEmpty());
		}
		System.out.println();


		String[] ranks2 = {"one"};
		String[] suits2 = {"hearts", "spades", "clubs"};
		int[] values2 = {1};

		System.out.println("---------Third Deck---------");
		Deck deck2 = new Deck(ranks2, suits2, values2);
		System.out.println("empty?\t" + deck2.isEmpty());
		for (int i = deck2.size(); i > 0; i--){
			System.out.println("dealing...\t" + deck2.deal());
			System.out.println("empty?\t" + deck2.isEmpty());
		}
	}
}
