package app;

import java.util.Scanner;

import main.java.app.SCP;

/**
 * Hello world!
 *
 */
public class App {
    private App() {
    }

    public static void main(String[] args) {
        String[] choices = { "Scissors", "Paper", "Stone" };

        String winner = "";
        Integer computerWinCount = 0;
        Integer playerWinCount = 0;

        Scanner scanner = new Scanner(System.in);

        String playerChoice = "";
        SCP scp = new SCP();

        while (!playerChoice.equalsIgnoreCase("Q")) {
            System.out.println("Enter 0 for scissors, 1 for paper, 2 for stone, and Q to quit. ");

            Integer computerChoice = 0;
            computerChoice = scp.generateComputerChoice();
            playerChoice = scanner.nextLine();

            if (!playerChoice.equalsIgnoreCase("Q")) {
                Integer playerChoiceInt = Integer.parseInt(playerChoice);

                if (playerChoiceInt >= 0 && playerChoiceInt <= 2) {
                    winner = scp.checkWinner(playerChoiceInt, computerChoice);
                    switch (winner) {
                        case "d":
                            System.out.println("It's a draw. ");
                            break;
                        case "p":
                            System.out.println("Player won. ");
                            playerWinCount++;
                            break;
                        case "c":
                            System.out.println("Computer won. ");
                            computerWinCount++;
                            break;
                        default:
                            break;
                    }
                } else {
                    System.out.println("Please enter a valid input. ");
                    System.out.println("Enter 0 for scissors, 1 for paper, 2 for stone, and Q to quit. ");
                    continue;
                }
            }
        }

        System.out.printf("Player win count: %d. \n", playerWinCount);
        System.out.printf("Computer win count: %d. \n", computerWinCount);
        System.out.println((playerWinCount > computerWinCount ? "Player won! "
                : (playerWinCount == computerWinCount ? "It's a draw! " : "Computer won. ")));

        scanner.close();
    }

}
