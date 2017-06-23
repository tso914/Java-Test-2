public class Acronym {
    public String sentence;
    private String tla;

    public Acronym(String sentence)
    {
        String[] wordArray;
        wordArray =  splitWords(sentence);
        tla = firstLetters(wordArray);
  //      return tla;

    }

    public String get(){
        return tla;
    }

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
	}
	System.out.println("--------- Part 2 ------------");
	tla = new Acronym("This is the end of the world").get();
    System.out.println(tla);
   }
}