// Team Name: Noble Narwhals (Nicole Zhou, Duck, Nakib Abedin, Joker)
// APCS
// HW13 Where do BigSibs Come From?
// 2021-10-6

/*
DISCO: We found out how what constructors are and how to write them.
QCC: Why does the constructor need to be private?
*/

public class Greet {
	public static void main(String[] args) {
		String greeting;

		BigSib richard = new BigSib();

		greeting = richard.greet("freshman");
		System.out.println(greeting);
	}
}
