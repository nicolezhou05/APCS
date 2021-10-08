// Team Name: Noble Narwhals (Nicole Zhou, Duck, Nakid Abedin, Joker)
// APCS
// HW14 Customize Your Creation
// 2021-10-7

/*
DISCO: The constructor with parameters was very much like setHelloMsg. All we have to do is to make it into a constructor.
QCCL Why do we need overloaded constructors?
*/

public class Greet {
	public static void main(String[] args) {
		String greeting;
		BigSib richard = new BigSib("Word up");
		BigSib grizz = new BigSib("Hey ya");
		BigSib dotCom = new BigSib("Sup");
		BigSib tracy = new BigSib("Salutations");
		greeting = richard.greet("freshman");
		System.out.println(greeting);
		greeting = tracy.greet("Dr. Spaceman");
		System.out.println(greeting);
		greeting = grizz.greet("Kong Fooey");
		System.out.println(greeting);
		greeting = dotCom.greet("mom");
		System.out.println(greeting);
	}
}
