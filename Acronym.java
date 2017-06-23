public class Acronym {

// Split a sentence into an array of words
   public static String[] splitWords(String sentence) {
	System.out.println("Splitting " + sentence);
	return sentence.split(" ");
	}

// Return a string containing the first letters from an array
		
   public static String firstLetters(String[] strArray) {
	
	int index;
	String tla = "";
	
	for (index = 0; index < strArray.length; ++index)
		{
		tla += strArray[index].substring(0,1);	
		}
	System.out.println("String Array 0 " + strArray[0]);
	System.out.println("String Array 1 " + strArray[1]);
	System.out.println("Array Size is " + strArray.length);
	System.out.println("TLA is " + tla);
	return tla;	
	}


   public static void main(String[] args) {

	int index;
	String[] wordArray;
	String tla;
	
	for (index = 0; index < args.length; ++index)
	{
		System.out.println("args[" + index + "]: " + args[index]);
		
		wordArray =  splitWords(args[0]);
		tla = firstLetters(wordArray);
		System.out.println("Result " + tla);
		
	}
	


   }
}