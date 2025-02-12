import java.util.Scanner;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String trash = "";
        boolean done = false;
        String continueYN = "";

        do
        {
            System.out.println("Player A, input your move [RPS]: ");
            if(in.hasNext())
            {
                playerA = in.nextLine();
                done = true;
            }
                else if((playerA != "R" || playerA != "P" || playerA != "S"))
            {
                System.out.println("Invalid move. Choose Rock, Paper, or Scissors.");
            }
        }while(!done);

    }
}