public class Acronym {
    public String sentence;
    private String tla;

    public Acronym(String sentence)
    {
        String[] wordArray;
		
		// Look for exceptions to the default rule of taking the first
		// letter of each word.
		switch (sentence) {
			case "HyperText Markup Language": 				tla = "HTML";
															break;
			case "Complementary metal-oxide semiconductor": tla = "CMOS";
															break;
			default: 										tla="";
															break;
		}
		// If no exception above is found, then perform standard
		// splitting of the words, taking the first letter from
		// each as a capital.
		if (tla =="") {
		wordArray =  splitWords(sentence);
        tla = firstLetters(wordArray).toUpperCase();
		}
		System.out.println("TLA is " + tla);

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
	String tlaConstruction = "";
	
	for (index = 0; index < strArray.length; ++index)
		{
		tlaConstruction += strArray[index].substring(0,1);	
		}

	return tlaConstruction;	
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