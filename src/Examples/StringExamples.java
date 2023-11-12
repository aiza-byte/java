package Examples;

public class StringExamples {
    //Documentation : https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)


    //charAt(int index)
    //concat(String str)
    //contains(CharSequence s)
    //endsWith(String suffix)
    //equals(Object anObject)
    //indexOf(String str)
    //isEmpty()
    //lastIndexOf(int ch, int fromIndex)
    //lastIndexOf(String str)
    //replace(char oldChar, char newChar)
    //replaceFirst(String regex, String replacement)
    //split(String regex)
    //startsWith(String prefix, int toffset)
    //substring(int beginIndex)
    //substring(int beginIndex, int endIndex)
    //toLowerCase()
    //toUpperCase()
    //trim()
    public static void main(String[] args) {
        String s = "Azi facem exemple cu stringuri!  ";
        String s1 = "Maine";

        String[] split = s.split(" ");
        System.out.println(split);

        String substringExemple = s.substring(10, 17);

        String replace = s.replace("Azi", s1);
    }
}
