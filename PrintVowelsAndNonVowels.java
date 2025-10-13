import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {

    int CountA = 0;
    int CountE = 0;
    int CountI = 0;
    int CountO = 0;
    int CountU = 0;
    int CountNonVowel = 0;

      Scanner scanner = new Scanner(System.in);
      System.out.print("Please enter a string: ");
      String inpt = scanner.nextLine();
      scanner.close();

      for (int i = 0; i < inpt.length(); i++){
        char ch = inpt.charAt(i);

        if (ch == 'a') {
          CountA++;
        }
        else if (ch == 'e'){
          CountE++;
        }
        else if (ch == 'i'){
          CountI++;
        }
        else if (ch == 'o'){
          CountO++;
        }
        else if (ch == 'u'){
          CountU++;
        }
        else {
          CountNonVowel++;
        }
      }

    System.out.println("a:" + CountA);
    System.out.println("e:" + CountE);
    System.out.println("i:" + CountI);
    System.out.println("o:" + CountO);
    System.out.println("u:" + CountU);
    System.out.println("Nonvowel:" + CountNonVowel);

  }
}
