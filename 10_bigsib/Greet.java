// Team Name: Zooming Xippy Zookeepers (Nicole Zhou, Duck, Jomin Zhang, Chompsky, Kevin Xiao, Mr.Swag)
// APCS
// HW10 Refactor Big Sib One
// 2021-10-04

/*
Dicoveries: If we want to print something from a different file of the same directory in the method "main," we can use "return" in that file. "Return" only returns the value, it does not print the value.
Unresolved Questions: What happens if the two files are in different directories?
*/

public class Greet {
	public static void main(String[] args){
		System.out.println(BigSib.greet("Crosby"));
		System.out.println(BigSib.greet("Stills"));
		System.out.println(BigSib.greet("Nash"));
	}
}
