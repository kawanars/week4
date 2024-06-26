package week4;

public interface week4 {
	public static void main (String[] args){

	
	
	//Coding Steps
	//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
	 //we have some ways to write an array but this one is short
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	
	//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
	 //here we are asking to print the age position 0 (3) - the age in the number of position (8) but -1 to get the correct position 7 (93)

	System.out.println(ages[0] - ages[ages.length-1]);
	
	//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
	//was just create one more number like the first exercise, I used the same number but I think we were able to change all 9.
	int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 27};
	
	//i. Make sure that there are 9 elements of type int in this new array.
	//we are asking to print the length if the length is equal to 9, what is the case.
	
	if (ages2.length == 9) {
	System.out.println(ages2.length);
	}

	//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
    // same as exercise 1.a, we get the first position and remove the last one.
	

	System.out.println(ages2[0]-ages2[ages2.length-1]);
	
	//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
	//if you have 100 numbers is gonna print all number, the code is saying to print all number starting in position 0.
	 for(int i=0;i<ages.length;i++)
	 System.out.println(ages[i]);
	
	//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
	
	 int sum = 0;
     for (int age : ages2)
         sum += age;
     double averageAge = (double) sum / ages2.length;
     System.out.println(averageAge);

	
	//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	// We use String because we have names, 
	String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
	
	
	//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
	int sumLetters = 0;
    for (String name : names)
        sumLetters += name.length();
    double averageNumLetters = (double) sumLetters / names.length;
    System.out.println(averageNumLetters);
	
	
	//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
	
	StringBuilder sb = new StringBuilder();
	int lengthOfArray = 0;
	for (int i=0; i<names.length; i++) {
		if (lengthOfArray == names.length-1) {
			sb.append(names[i]);
		}
		else {
				sb.append(names[i] + " ");
	}

	System.out.println(sb);
	
	//3. How do you access the last element of any array?
	
	// length is how big is but will start counting with 1, in array we start counting in 0 so we need to remove 1 to get the correct number.
	//System.out.println(names[names.length - 1]);

	//4. How do you access the first element of any array?
	
	// always start counting with 0
	//System.out.println(names[0]);
	
	//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
	int[] nameLengths = new int[names.length];
    for (int i = 0; i < names.length; i++)
        nameLengths[i] = names[i].length();
	
	
	//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
    int sumLengths = 0;
    for (int length : nameLengths)
        sumLengths += length;
    System.out.println(sumLengths);
    
    
    
    
	//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
    System.out.println(multiplyString("Hello", 3));
	
	//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	 
    System.out.println(createFullName("John", "Doe"));
	
	//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

    int[] days = {20, 15, 50, 40, 9};
    boolean result = greaterThan100(days);
    System.out.println(result);
	
	//10. Write a method that takes an array of double and returns the average of all the elements in the array.

	double[] doubleArray = {1.5, 1.7, 1, 0,5};
	double averages = resultAverages(doubleArray);
	System.out.println(averages);
	
	//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.

	double[] doubleArray2 = {2.5, 2.7, 2.8, 2.9};
	boolean firstGreater = arrayGreater(doubleArray, doubleArray2);
	if(firstGreater) {
		System.out.println("First Greater");
	}
	else {
		System.out.println("Second Greater");
	}
	
	
	//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

	boolean isHotOutside = false;
	double moneyInPocket = 10.50;
	boolean getDrink = willBuyDrink(isHotOutside, moneyInPocket);
	if (getDrink) {
		System.out.println("Get a drink");
		
	}
	else {
		System.out.println("Do not get a drink");
	}
	
	
	//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	// we have a class and did to see what is the average of the kids age
}
	int[] kidsAge = {8, 10, 9, 8, 7, 9, 6, 9};
    System.out.println(calculateAverage(kidsAge));
}

private static char[] calculateAverage(int[] kidsAge) {
	return null;
}

private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	return false;
}

public static String multiplyString(String str, int num) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < num; i++)
        result.append(str);
    return result.toString();
}

public static String createFullName(String firstName, String lastName) {
    return firstName + " " + lastName;
}

public static boolean greaterThan100(int[] arr) {
    int sum = 0;
    for (int value : arr)
        sum += value;
    return sum > 100;
}

public static double resultAverages(double[] arr) {
    double sum = 0;
    for (double value : arr)
        sum += value;
    return sum / arr.length;
}

public static double arrayGreater(double[] arr1, double[] arr2) {
    return resultAverages(arr1);
}
}


		
	


