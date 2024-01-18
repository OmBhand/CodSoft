
import java.util.Random;
import java.util.Scanner;
class Game
{
    int secret;
    public Game()
    {
        Random dom = new Random();
        secret = dom.nextInt(100);
        System.out.println("Choose a number between 1 to 100:- ");
    }
    public int sno()
    {
        return secret;
    }
}
class GuessGame{
    static int getUserInput() {
        int player;
        System.out.println("Enter the number you are Guessing:- ");
        Scanner gg = new Scanner(System.in);
        player = gg.nextInt();
        return player;
    }
    static void isCorrectNumber(int v, int m) {
        if (v == m) {
            System.out.println("Bravo....You got the Correct number.");
        } else if (v > m) {
            System.out.println("Sorry the choosen number is Bigger than the Hidden Number!!!!!");
        } else {
            System.out.println("Sorry the choosen number is Smaller than the Hidden Number!!!!");
        }
    }
    public static void main(String[] args){
        int get = 0, hid = 0, s = 0;
        Game g = new Game();
        do {
            get = getUserInput();
            hid = g.sno();
            isCorrectNumber(get, hid);
            s++;
        }
        while (get != hid);
        System.out.println("You guessed the number in " + s + " Attempts....");
        System.out.println("The Number is " + hid);
    }
}

