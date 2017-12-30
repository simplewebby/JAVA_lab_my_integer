
//Tsagan Garyaeva
//COMP-271-001RL
//p400#10.3 Integer
//Lab1
//9-16-2017




package Labs1;

import labs.MyInteger;

public class lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyInteger myInteger = new MyInteger(1);
			System.out.println((myInteger.isOdd())  ? "It is an odd number!" : "It is an even number!");
			MyInteger myInteger1 = new MyInteger(61);
			System.out.println((myInteger1.isEven())  ? "It is an even number!" : "It is an odd number!");
			MyInteger myInteger2 = new MyInteger(31);
			System.out.println((myInteger2.isPrime())  ? "It is  a prime number!" : "It is not a prime number!");
			
			
			
	}

}
