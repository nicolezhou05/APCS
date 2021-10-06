// Team Name: Noble Narwhals (Nicole Zhou, Duck, Nakib Abedin, Joker)
// APCS
// HW12 On Elder Individuality and the Elimination of Radio Fuzz
// 2021-10-05

/*
DISCO: Non-static and static do not go together
QCC: How do you use a instance variable in a static method?
*/

public class Greet {
	public static void main(String[] args){
		String greeting;

		BigSib richard = new BigSib();
		richard.setHelloMsg("Word up");

		greeting = richard.greet("freshman");
		System.out.println(greeting);
	}
}
