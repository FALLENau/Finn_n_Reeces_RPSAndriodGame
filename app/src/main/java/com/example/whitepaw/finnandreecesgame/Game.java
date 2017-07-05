package com.example.whitepaw.finnandreecesgame;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by Whitepaw on 05/07/2017.
 */

public class Game {
    private int playerInput;
    HashMap<String, String> loserList;

    public Game(int input) {
        this.playerInput = input;
        this.loserList = new HashMap<>();
        setupHashmap();
    }

    public void setupHashmap(){
        loserList.put("rock","paper");
        loserList.put("paper","scissors");
        loserList.put("scissors","rock");
    }

    public String generateComputersChoice() {
        Random randomGenrator = new Random();
        int randomNumber = randomGenrator.nextInt(3);

        String tool = "";
        switch (randomNumber) {
            case 0:
                tool = "rock";
                break;
            case 1:
                tool = "paper";
                break;
            case 2:
                tool = "scissors";
                break;
        }
        return tool;
    }

    public String getPlayerInput() {

        String input = "nothing";
        switch (playerInput) {
            case 0:
                input = "rock";
                break;
            case 1:
                input = "paper";
                break;
            case 2:
                input = "scissors";
                break;
        }

        return input;
    }

    public String gameLogic(String computer) {
        String player = this.getPlayerInput();

        if (loserList.get(player).equals(computer)) {
            return "Computer Wins!";
        }
        else if (loserList.get(computer).equals(player)) {
            return "Player Wins!";
        }
        else { return "It's a draw..."; }
    }
}

