public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market", //1
            "Programming is both painful and engaging",//2
            "This has nothing to do with machine learning",//3
            "We need to leverage our core competencies",//4
            "Let's talk about data and algorithms",//5
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
    for(int i = 0; sentences.length>i; i++){
    String toCheck = arrayPreProcess(sentences, i); //gets the first sentence and preprocess 
    for (int j=0; keywords.length>j; j++){
    String keywordtocheck = preProcess(keywords[j]);
     if (contains(toCheck, keywordtocheck) == true){System.out.println(sentences[i]);}//check if sentence contain keyword
    }
}
    }

   

    public static String preProcess(String str) {
		String mod = "";
		for (int i = 0; str.length()>i; i++){
			char c = str.charAt(i);
			if (c >= 'A' && c<= 'Z'){
				mod += c ;
			}
			if (c >= 'a' && c<= 'z') {
				mod += c ;
			}
		}
			
		return mod.toLowerCase();
	} 

   public static String arrayPreProcess(String[] sentences, int n) {
    if (n >= 0 && n < sentences.length) {
        String modified = preProcess(sentences[n]);
        return modified;
    }
    return "";
}

     public static String keyWordPreProcess(String[] keywords, int n) {
    if (n >= 0 && n < keywords.length) {
        String modified = preProcess(keywords[n]);
        return modified;
    }
    return "";
}
 public static boolean contains(String str1, String str2) {
    Boolean isSub = false;
    if (str2.length() == 0) { return true; }
    if (str2.length() > str1.length()) { return false;} 
    else {
        for (int i = 0; str1.length()>i;i++){
            char c = str1.charAt(i);
            if(c == str2.charAt(0)){isSub = true ;
            for (int j = 1; str2.length()>j; j++){
            if (i + j >= str1.length()) {
                isSub = false;
                break;
                }
            if (str1.charAt(i+j) != str2.charAt(j)) {isSub = false;
            break;
            }
         
            } 
               if (isSub) {
                return true; 
            }   
            }
        }
    }

        return isSub;
    }

    

       
}
