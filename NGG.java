import java.util.*;
import java.util.random.*;

public class NGG {

    int guessnum = 0;
    int RandomNumber;
    int ch;

    public void guess() {
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("START GAME");
        System.out.println("Can you guess a number ???");
        Random rd = new Random();
        int RandomNumber = rd.nextInt(100) + 1;
       
        for (int i = 0; i < 5; i++) {
           
            System.out.println("Enter your number");
            guessnum = sc.nextInt();
            
            if (RandomNumber == guessnum) {
                System.out.println("Yes you got a correct number");
                break;
            } else if (RandomNumber > guessnum) {
                System.out.println("My number is greater than usernumber");
            } else {
                System.out.println("My number is smaller than usernumber");
            }

        }
        if(RandomNumber!= guessnum){
            System.out.println("Trial failed ! Try Again");
            
        }
        System.out.println("Your number is "+RandomNumber);
        System.out.println("End Game");
        System.out.println("If you want Play Again");
        System.out.println("1.Replay\n2.End");
        ch=sc.nextInt();
    }while(ch==1);

    };

}