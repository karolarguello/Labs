import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class labWeekFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Strings are immutable and cannot be changed and take more space in memory
		//StringBuilder is mutable, can be changed, and take less space in memory 
		
		StringBuilder stringBuilderInst = new StringBuilder();
		
		for (int i=0; i<10; i++) {
			stringBuilderInst.append(i);
			if (i!=9) {
				stringBuilderInst.append("-");
			}
		}
		System.out.println(stringBuilderInst.toString());
		
		List<String> friends = new ArrayList<String>();
		friends.add("Rachael");
		friends.add("Christina");
		friends.add("Susie");
		friends.add("Nate");
		friends.add("Ana");
		
		System.out.println(shortestString(friends));
		
		List<String> swapped = swapFirstAndLast(friends);
		for (String friend : swapped);
		System.out.println(friends);
		
		System.out.println(elementsCombine(swapped));
		
		System.out.println("-------");
		List<String> searchResults = searchMethod(friends, "e");
		for (String result : searchResults) {
			System.out.println(result);
		}
		
		List <Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,15,16,20,25,30,45);
		List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numbers);
		
		for (List<Integer> list : sortedNumbers) {
			for (Integer number : list) {
				System.out.println(number);
			}
			System.out.println("-----------");
		}
		
		List<Integer> stringLength = calculateStringLengths(friends);
		for (Integer i : stringLength) {
			System.out.println(i);
		}
		
		Set<String> fiveValues = new HashSet<String>();
		fiveValues.add("Eat");
		fiveValues.add("Pray");
		fiveValues.add("Love");
		fiveValues.add("Homework");
		fiveValues.add("Code");
		
		Set<String> findStartsWith = charParameter(fiveValues, 'E');
		for (String word : findStartsWith) {
			System.out.println(word);
		}
		
		List<String> listResult = setToList(fiveValues);
		for (String listString : listResult) {
			System.out.println(listString);
		}
		
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(2);
		integerSet.add(5);
		integerSet.add(6);
		integerSet.add(7);
		integerSet.add(9);
		integerSet.add(12);
		
		Set<Integer> extractEvens = onlyEvenNumbers(integerSet);
		for (Integer number : extractEvens) {
			System.out.println(number);
		}
		
		Map<String, String> dictionary = new HashMap<String, String> ();
		dictionary.put("Reptiles", "They are vertebrates, meaning that they have a backbone, and they are cold-blooded.");
		dictionary.put("Mammal", "Breathes air, has a backbone, and grows hair at some point during its life.");
		dictionary.put("Fish", "Live in the fresh and salt waters of the world. They are vertebrates, and they are cold-blooded.");
		
		String value = dictionaryMethod(dictionary, "Mammal");
		System.out.println(value);
		
		Map<Character, Integer> counts = stringCount(listResult);
		for (Character character : counts.keySet()) {
			System.out.println(character + " - " + counts.get(character));
		}
	}


	public static String shortestString(List<String> list) {
		String shortest = list.get(0);
		for (String friends : list) {
			if (friends.length() < shortest.length()) {
				shortest = friends;
			}
		}
		return shortest;
	}
	public static List <String> swapFirstAndLast(List<String> list){
		String temp = list.get(0);
		list.set(0, list.get(list.size()- 1));
		list.set(list.size()- 1, temp);
		return list;
	}
	public static String elementsCombine (List<String> strings) {
		StringBuilder result = new StringBuilder();
		for (String string : strings) {
			result.append(string + ", "); 
		}
		return result.toString();
	}
	
	public static List<String> searchMethod (List<String> list, String query) {
		List<String> result = new ArrayList<String>();
		for (String string : list) {
			if (string.contains(query)) {
				result.add(string);
			}
		}
		return result;
	}
	public static List<List<Integer>> sortDivisibleNumbers(List<Integer> list) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		
		for (Integer number : list) {
			if (number % 2 == 0) {
				results.get(0).add(number);
			}
			if (number % 3 ==0) {
				results.get(1).add(number);
			}
			if (number % 5 == 0) {
				results.get(2).add(number);
			}
			if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
				results.get(3).add(number);
			}
		}
		return results;
	}
	
	public static List<Integer> calculateStringLengths(List<String> list) {
		List<Integer> lengths = new ArrayList<Integer>();
			for (String string : list) {
				lengths.add(string.length());
			}
			return lengths;
	}
	public static Set<String> charParameter(Set<String> set, char c) {
		Set<String> results = new HashSet<String>();
		
		for (String string : set) {
			if (string.charAt(0) == c) {
				results.add(string);
		}
		}
		
		return results;
	}
	public static List<String> setToList(Set<String> set){
		List<String> results = new ArrayList<String>();
		for (String string : set) {
			results.add(string);
		}
		return results;
	}
	
	public static Set<Integer> onlyEvenNumbers(Set<Integer> set){
		Set<Integer> results = new HashSet<Integer>();
		for (Integer number : set) {
			if (number % 2 == 0) {
				results.add(number);
			}
		}
		return results;
	}
		
	public static String dictionaryMethod(Map<String, String> map, String string) {
		for (String key : map.keySet())	{
			if (key.equals(string)) {
				return map.get(key);
			}
		}
		return "";
	}
	
	public static Map<Character, Integer> stringCount(List<String> list){
		Map<Character, Integer> results = new HashMap<Character, Integer>();
			for (String string: list) {
				char c = string.charAt(0);
				if (results.get(c) == null) {
					results.put(c, 1);
				} else {
					results.put(c, results.get(c)+ 1);
				}
			}
		return results;
	}
}	
