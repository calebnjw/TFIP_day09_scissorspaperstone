package main.java.app;

import java.util.Random;

public class SCP {
  public Integer generateComputerChoice() {
    Random random = new Random();
    return random.nextInt(3);
  }

  public String checkWinner(Integer playerChoice, Integer computerChoice) {
    String winner;

    // 0 -> scissors, 1 -> paper, 2 -> stone.
    if (playerChoice == computerChoice) {
      winner = "d";
    } else if ((playerChoice == 0 && computerChoice == 1) ||
        (playerChoice == 1 && computerChoice == 2) ||
        (playerChoice == 2 && computerChoice == 0)) {
      winner = "p";
    } else {
      winner = "c";
    }

    return winner;
  }
}
