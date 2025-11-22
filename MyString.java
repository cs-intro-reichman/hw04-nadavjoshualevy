public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
         String modified = "";
         for (int i = 0; str.length()>i; i++){
            char c = str.charAt(i);
            if (c >= 97 && 122>=c){
                modified += c;
            }
            else if (c >= 65 && c<= 90){
                c += 32;
                modified += c;
            }
            else {modified += c;}

         }
        return modified;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
    Boolean isSub = false;
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
