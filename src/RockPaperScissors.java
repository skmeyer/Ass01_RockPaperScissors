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
            do
            {
                System.out.print("Player A, input your move [RPS]: ");
                playerA = in.nextLine();
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S"))
                {
                    do
                    {
                        System.out.print("Player B, input your move [RPS]: ");
                        playerB = in.nextLine();
                        done = true;
                        if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S"))
                        {
                            done = true;
                        }
                        else
                        {
                            System.out.println("Invalid move. Please choose Rock, Paper, or Scissors.");
                            done = false;
                        }
                    }while(!done);
                }
                else
                {
                    System.out.println("Invalid move. Please choose Rock, Paper, or Scissors.");
                    done = false;
                }
            }while (!done);

            if(playerA.equalsIgnoreCase("R")) // outcomes if A does Rock
            {
                if(playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock vs Rock, it's a tie!");
                }
                else if(playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers Rock! Player B wins!");
                }
                else // B must Scissors
                    System.out.println("Rock breaks Scissors! Player A wins!");
            }

            else if(playerA.equalsIgnoreCase("P")) // outcomes if A does Paper
            {
                if(playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper vs Paper, it's a tie!");
                }
                else if(playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers Rock! Player A wins!");
                }
                else // B must be Scissors
                    System.out.println("Scissors cut paper! Player B wins!");
            }
            else if(playerA.equalsIgnoreCase("S")) // outcomes if A does Scissors
            {
                if(playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors vs Scissors, it's a tie!");
                }
                else if(playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock breaks Scissors! Player B wins!");
                }
                else // B must be Paper
                    System.out.println("Scissors cut Paper! Player A wins!");
            }
            System.out.print("Would you like to play again? [Y/N]: ");
            continueYN = in.nextLine();

        }while(continueYN.equalsIgnoreCase("Y"));
        
    }
}