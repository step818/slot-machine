package com.casino.games;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class SlotMachineTest {

    SlotMachine game;

    @Before
    public void setUp(){
        game = new SlotMachine();
    }


    @After
    public void tearDown(){
        System.out.println("After");
    }

    @Test
    public void testSpinReel() {
        Collection<Reel> result = game.spinReel();
        assertNotNull(result);
        assertEquals(3, result.size());
    }
}