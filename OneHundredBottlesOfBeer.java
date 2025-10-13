import java.util.Scanner;

public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter # of verses: ");
      int verses = scanner.nextInt();
      scanner.close();

      int bottleCount = 100;

      for (int i = 0; i < verses; i++){
         String[] songlines = {"bottles of beer on the wall", "bottles of beer", "If one of those bottles should happen to fall"};

         if (bottleCount == 1){
           songlines[0] = "bottle of beer on the wall";
           songlines[1] = "bottle of beer";
        }
        System.out.println(bottleCount + " " + songlines[0]);
        System.out.println(bottleCount + " " + songlines[1]);
        System.out.println(songlines[2]);

        if (bottleCount - 1 == 1){
          songlines[0] = "bottle of beer on the wall";
      }
        System.out.println(bottleCount - 1 + " " + songlines[0]);

      bottleCount --;
    }
  }
}
