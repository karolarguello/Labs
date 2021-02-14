
public class labWeek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  a [] = new int [] {1,5,2,8,13,6};
		System.out.println(a [0]);
		
		System.out.println(a[a.length - 1]);
		// System.out.println(a [6]);
		// System.out.println(a[-1]);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a [i]); 
		}
		for (int i : a) {
			System.out.println(i);
		}
		double sum = 0;
		for  (int number : a) {
			sum += number;
		}
		System.out.println(sum);
		
		double average = sum / a.length;
		System.out.println(average);
		
		for (int number : a) {
			if (number %2 == 1) {
				System.out.println(number);
			}
				
		}
		String names [] = new String [] { "Sam", "Sally", "Thomas", "Robert"};
		
		int  sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters);
		
		greet ("Tom");
		
		String greeting = greet2 ("Karol");
		System.out.println(greeting);
		
		System.out.println(isStringLongerThanInt ("Hello" , 3));
		
		System.out.println(doesArrayContainString(names, "Sam"));
		
		System.out.println(findSmallestNumber(a));
		
		double doubles [] = new double [] {30.8, 9.2, 58.7};
		System.out.println(arrayOfDoubles (doubles));
		
		int [] nameLengths = arrayOfStringsToInt (names);
		for (int number :nameLengths) {
			System.out.println(number);
		}
		
		System.out.println(evenOddLetters(names));
		
		System.out.println(isStringAPalindrome ("racecar"));
	}

	public static void greet (String name) {
		System.out.println("Hello, " + name + "!");
	}
	
	public static String greet2 (String name) {
		return "Hi, " + name + "!";
 	}
	
	public static boolean isStringLongerThanInt(String string, int number) {
		return string.length() > number;
 	}
	
	public static boolean doesArrayContainString (String [] array, String string) {
		for (String str : array) {
			if (str.equals(string)) {
				return true;
			}
		}
		return false;
	}
	
	public static int findSmallestNumber (int[] numbers) {
		int smallest = numbers [0];
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}
	
	public static double arrayOfDoubles (double [] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}
	public static int [] arrayOfStringsToInt (String [] arrayOfString) {
		int[] results = new int[arrayOfString.length];
		for (int i = 0 ; i < arrayOfString.length; i++) {
			results [i] = arrayOfString[i].length();
		}
		return results;
	}
	public static boolean evenOddLetters (String[] stringArray) {
		int evenLetters = 0;
		int oddLetters = 0;
		for (String string : stringArray) {
			if (string.length() % 2 ==0) {
				evenLetters += string.length();
			} else {
				oddLetters += string.length();
			}
		}
		return evenLetters > oddLetters;
	}
	
	public static boolean isStringAPalindrome (String palindrome) {
		for (int i = 0; i < palindrome.length() / 2 ; i++) {
			if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}


