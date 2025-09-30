import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Give two words");
    String word1 = scan.nextLine();
    String word2 = scan.nextLine();

    System.out.println("Give a number");
    int N = scan.nextInt();
    scan.nextLine();
    lastFirstN(word1, word2, N);


    System.out.println("Give me two words");
    String word3 = scan.nextLine();
    String word4 = scan.nextLine();
    stringManip(word3, word4);


    System.out.println("Give me a word");
    String word5 = scan.nextLine();
    System.out.println("Give the substring you want to remove from the word)");
    String remove = scan.nextLine();
    removeStr(word5, remove);
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    String output;
    String firstN;
    String lastN;

    firstN = s2.substring(0, n);
    lastN = s1.substring(s1.length() - n);

    output = lastN + firstN;
    System.out.println(output);
  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
    String new1; //made variables
    String firstLetter;
    String lastLetters;

    new1 = s1.toUpperCase(); //set variable new1 to the first input in all uppercase letters

    firstLetter = s2.substring(0, 1); //setting the variable firstLetter to the first letter of the second input
    lastLetters = s2.substring(1); //setting lastLetters to everything after the first letter

    System.out.println(new1 + " " + "and" + " " + firstLetter.toUpperCase() + lastLetters); //printed the first word and the second word with the first letter capitalized
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    String result; //created a variable named result
    int index = s1.indexOf(s2); //found the index of where s2 is in s1
    result = (s1.substring(0, index) + s1.substring(index + s2.length())); //set result to the substring before s2 was found and then everything else after s2 by doing substring of index plus length of s2
    System.out.println(result);

    String output = null;
    return output;
  }
}
