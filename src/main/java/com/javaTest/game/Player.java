package com.javaTest.game;

public class Player {
    private Dice dice;
    private int winningNumber;

    public Player(Dice dice, int winningNumber) {
        this.dice = dice;
        this.winningNumber = winningNumber;
    }

    public boolean play(){
        int diceNumber = dice.roll();
        return (diceNumber == winningNumber);
    }
}
