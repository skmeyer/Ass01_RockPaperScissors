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

        do {
            do {
                System.out.println("Player A, input your move [RPS]: ");
                playerA = in.nextLine();
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                    do {
                        System.out.println("Player B, input your move [RPS]: ");
                        playerB = in.nextLine();
                        done = true;
                        if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                            done = true;
                        } else {
                            System.out.println("Invalid move. Please choose Rock, Paper, or Scissors.");
                            done = false;
                        }
                    } while (!done);
                } else {
                    System.out.println("Invalid move. Please choose Rock, Paper, or Scissors.");
                    done = false;
                }
            } while (!done);

            if(playerA.equalsIgnoreCase("R"))
            {
                if(playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("It's a tie!");
                }
                else if(playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers Rock! Player B wins!");
                }
                else if(playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("Rock breaks Scissors! Player A Wins!");
                }
            else if(playerA.equalsIgnoreCase("P"))
            {
                
            }
            }






        }while(continueYN.equalsIgnoreCase("Y"));


    }
}