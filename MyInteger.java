//Tsagan Garyaeva
//COMP-271-001RL
//p400#10.3 Integer
//Lab1
//9-16-2017





package labs;

public class MyInteger {
	int value;
	
	//Constructor
	public MyInteger(int value) {
		this.value= value;
	}
	public static int parseInt(char[]value){
		int power = value.length -1;
		int parsedInteger = 0;
		
		for (int i=0; i<value.length; i++)
		parsedInteger+=(Math.pow(value[i], power--));
		return parsedInteger;
		
	}
	public static int parseInt(String value){
		return (parseInt(value.toCharArray()));
	}
	
	
	public boolean equals (int value){
		return (this.value== value);
	}
	
	public boolean equals (MyInteger obj){
		return (this.value== obj.value);
	}
	
	
	public int getValue(){
		return value;
	}
	
	
	//Methods  is EVEN
	public boolean isEven(){
		return (0==(value%2));
	}
	public static  boolean isEven(int value){
		return (0==(value%2));
	}
	
	public static  boolean isEven(MyInteger obj){
		return (0==(obj.value%2));
	}
	
	
	//Methods  is ODD
	public boolean isOdd(){
		return (1==(value%2));
		}
	
	public static  boolean isOdd(int value){
		return (1==(value%2));
		}
	
	public static  boolean isOdd(MyInteger obj){
		return (1==(obj.value%2));
		}
	
	
	//Methods  is PRIME
	public boolean isPrime(){
		if (isEven() && value !=2)
			return false;
		int tempValue= (int)Math.sqrt(value);
		
		for(int i=3;i<=tempValue; i++)
			if (value% i==0)
				return false;
		return true;
	}
	
	public static boolean isPrime(int value){
		if (isEven(value) && value !=2)
			return false;
		int tempValue= (int)Math.sqrt(value);
		
		for(int i=3;i<=tempValue; i++)
			if (value% i==0)
				return false;
		return true;
	}
	public static boolean isPrime(MyInteger obj){
		if (isEven(obj.value) && obj.value !=2)
			return false;
		int tempValue= (int)Math.sqrt(obj.value);
		
		for(int i=3;i<=tempValue; i++)
			if (obj.value% i==0)
				return false;
		return true;
	}
	
	
}
