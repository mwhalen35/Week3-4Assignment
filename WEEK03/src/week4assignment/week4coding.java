package week4assignment;

public class week4coding {

	public static void main(String[] args) {
		// 1. create an array of int called ages that contains the following values: 3,9,23,64,2,8,28,93	
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		// a. programatically subtract the value of the first element in the array from the last element (don't use ages[7] in your code). Print the results to the console.
		int firstMinusLastElement = (ages[0] - ages[ages.length - 1]);
		System.out.println("Question 1a. : " + firstMinusLastElement);
		// b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		ages[ages.length-1] = 50;
		int firstMinusLastElement2 = (ages[0] - ages[ages.length - 1]);
	    System.out.println("Question 1b. :" + firstMinusLastElement2);
//		// c. Use a loop to iterate through the array and calculate the average age. Print result to console.
		double myArray = 0;
		for (int x : ages) {
			myArray += x;
		}
		System.out.println("Question 1c. : " + myArray/ages.length);		
			
			
		// 2. Create an array of String called names that contains the following values: "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob".			
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; 
		// a. Use a loop to iterate through the array and calculate the average number of letters per name. Print result to console.
		double lettersInName = 0;
			for (String name : names) {
				lettersInName += name.length();
			}
			System.out.println("Question 2a. : " + lettersInName / (names.length));
		// b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, print result to console. 
		String question2 = "";
			for (String name : names) {
				String second = (name + " ");
				question2 += second;
			}
			System.out.println("Question 2b. : " + question2);
			
		 
			
		// 3. How do you access the last element in any array?
			System.out.println("Question 3 : " + names[5]);
		// 4. How do you access the first element in any array?
			System.out.println("Question 4 : " + names[0]);
		// 5. Create a new array of int called nameLengths. Write a loop to iterate over previously created names array and add the length of each name to the nameLengths array.
			int[] nameLengths = new int[names.length];
			 for (int i = 0; i<names.length; i++) {
				 nameLengths[i] += names[i].length();	
			 }
			 for(int x : nameLengths) {
				 System.out.println("Question 5 : " + x);
			 }
//			System.out.println(Arrays.toString(nameLengths));
			 
		//6. Write a loop to iterate over nameLengths array and calculate the sum of all elements in the array. Print to console.
			 double t = 0;
			 for(int a : nameLengths) {
				 t += a;
			 }
				 	System.out.println("Question 6 : " + t);

	// 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
			 System.out.println("Question 7: " + wordRepeat("Hello", 3));
	// 8. Write a method that takes tw String, fristName and lastName, and reutrns a full name ( full name should be the first name and the last name as a String separated by a space.)
			 String firstName = "Jane";
			 String lastName =  "Doe";
			 String fullName = createFullName(firstName, lastName);
			 
			System.out.println("Question 8 : " + fullName);

	// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
//			int[] arrayNine = {10, 50, 7, 25, 15, 1};
		    int[] arrayNine = {10, 8, 7, 6, 2, 1};
			
			System.out.println("Question 9: " + sumOfInts(arrayNine));
			
	// 10. Write a method that takes an array of double and returns the average of all the elements in the array.
			double[] elements = {1, 2, 3, 4 ,5};
			
			System.out.println("Question 10: " + avgElements(elements));
	// 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array. arr1 = 148.4 arr2 = 110.94
			double[] array1 = {45.5, 66.7, 26.2, 10.0};
			double[] array2 = {98.6, 5.45, 6.89};
		   System.out.println("Question 11 : " + greatOrLess(array1, array2));
			
			
	// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		  boolean isHotOutside = true;
	      double moneyInPocket = 1.75;
		  System.out.println("Question 12: " + willBuyDrink(isHotOutside, moneyInPocket));
	// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	// my question: Write a method that takes a boolean and a float that returns true if boolean returns true and float is less than 50 and greater than 18.
		  boolean ageInWriting = true;
		  float ageInNumbers = 18;
		  
		  System.out.println("Question 13: " + areOfAge(ageInWriting, ageInNumbers));
			   
			
			
		} // END OF MAIN METHOD
		
		
		// 7.
		public static String wordRepeat(String word, int n) {
			String str = "";
			for(int i = 0; i < n; i++) {
				str += word;
			}
			return str;
		}
		
		// 8. 
		public static String createFullName(String f, String l) {
			String fullName = f + " " + l;
			return fullName;
		}
		// 9. 
		public static boolean sumOfInts(int[] arrayNine) {
			int intSum = 0;
			for (int sum : arrayNine) {
				intSum += sum;
			}
			if (intSum > 100) {
				return true;
			}
			return false;
		}	
		// 10. 
		public static double avgElements(double[] elements) {
			double sum = 0;
			for (double element : elements) {
				sum += element;
			}
			return sum / elements.length;
		}
		// 11. 
		public static boolean greatOrLess(double[] array1, double[] array2) {
			double arraySum = avgElements(array1);
	    	double arraySum1 = avgElements(array2);
			if (arraySum > arraySum1) {
				return true;
			}
			return false;
		}
		// 12. 
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside == true && moneyInPocket > 10.50) {
				return true;
			}
			return false;
		}
	   // 13.
		public static boolean areOfAge(boolean ageInWriting, float ageInNumbers) {
			if (ageInWriting == true && ageInNumbers < 50 && ageInNumbers >= 18) {
				return true;
			}
			return false;
		}


	} // END OF CLASS


