package com.aflmedia.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testCircleGame() throws Exception
    {
        CircleGame game = new CircleGame(5, 2);
        game.play();
        assertTrue(game.getWinningChild() == 3);
    }

    public void testCircleGameKGreaterThanChildren() throws Exception
    {
        CircleGame game = new CircleGame(66, 100);
        game.play();
        assertEquals(game.getWinningChild(), 7);

    }

    public void testCircleGameException()
    {
        try
        {
            CircleGame game = new CircleGame(0, 4);
        }
        catch (AflMediaException ame)
        {
            assertEquals(ame.getMessage(), "To play the game there needs to be more than 1 child.");
        }
    }

}
