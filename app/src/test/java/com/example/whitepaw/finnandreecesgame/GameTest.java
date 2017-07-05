package com.example.whitepaw.finnandreecesgame;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Whitepaw on 04/07/2017.
 */

public class GameTest {
    Game game;

    @Before
    public void before() {
        game = new Game(1);
    }

    @Test
    public void functionOnCounter() {
        assertNotNull(game.generateComputersChoice());
    }

    @Test
    public void UserHasInput() {
        assertEquals("paper", game.getPlayerInput());
    }

    @Test
    public void GameHasLogic() {
        assertEquals("Computer Wins!", game.gameLogic("scissors"));
    }

}
