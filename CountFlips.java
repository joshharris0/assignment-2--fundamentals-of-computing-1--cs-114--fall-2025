import java.util.Scanner;

public class CountFlips {
  public static void main(String[] args) {
    Coin myCoin = new Coin();
    int tails = 0;
    int heads = 0;
    System.out.println("Flipped 100x");
    for (int i = 0; i < 100; i++){
       myCoin.flip();
        if (myCoin.isHeads())
        heads++;
      else
        tails++;
    }
        System.out.println("# of heads flipped: " + heads);
        System.out.println("# of tails flipped: " + tails);
    }
}
