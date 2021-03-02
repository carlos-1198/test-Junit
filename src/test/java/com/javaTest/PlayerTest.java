package com.javaTest;

import com.javaTest.game.Dice;
import com.javaTest.game.Player;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {
    //Validate that the dice number and the winning number are the same
    @Test
    public void winnerNumber(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(3);
        Player player = new Player(dice, 3);
        assertTrue(player.play());
    }
    //Validate that you loose if your dice number is lower than the winnerNumber
    @Test
    public void LooseByLowerNumber(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(3);
        Player player = new Player(dice, 5);
        assertFalse(player.play());
    }
    //Validate that you loose if your dice number is higher than the winnerNumber
    @Test
    public void LooseByHigherNumber(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(6);
        Player player = new Player(dice, 2);
        assertFalse(player.play());
    }

}