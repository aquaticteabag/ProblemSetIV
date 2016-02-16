
public class ProblemSet4 {

	public static void main(String[] args) {
		String test1 = "KAYAK";
		int n = 3;
		
		//outputs tests of each method
		System.out.println(test1 + (pal(test1) ? " is" : " is not") + " a palindrome.");
		factorial(n);
		reverseDisplay(17403);
		System.out.println();
		System.out.println(decimalToBinary(15));
	}
	
	//#1 by all of my work and reason this should work. However it does not.
	static boolean pal(String s){
		
		if (s.length() == 1 || s.length() == 0){
			return true;
		}
		
		if(s.length() == 2 && s.charAt(0) == s.charAt(1)){
			return true;
		}
		else if (s.charAt(0) == s.charAt(s.length() - 1)){
			pal(s.substring(0,s.length()-1));
		}
		return false;
		
	}

	//#2 one wrapper method calls another tail recursive factorial method, and returns the total to the wrapper
	//that prints the result and returns void
	public static void factorial(int n){
		factorial(n,1);
		System.out.println(n + "! = " + factorial(n,1));
	}
	
	public static int factorial(int n, int total){
		if (n == 0)
			return total;
		else
			return factorial(n-1, n*total);
	}
	
	//#3 Takes an integer and uses mod division and the principles of integer division to reverse the order of the 
	//numerals in the method and display the result to the user. The method is recursive.
	public static void reverseDisplay(int n){
		if (n != 0){
		System.out.print(n%10);
		reverseDisplay(n/10);
		}
	}
	
	//#4 Takes an integer and returns it as a binary string by using mod division and integer division recursively 
	public static String decimalToBinary(int n){
		if (n != 0){
			if (n%2 == 0){
				return (decimalToBinary(n/2) + "0");
			} else return(decimalToBinary(n/2) + "1");
		} else 
		return ("");
	}
	
}


