package com.aflmedia.app;

public class App 
{
    public static void main( String[] args )
    {

        try {
            CircleGame game = new CircleGame(5, 2);
        } catch (AflMediaException e) {
            e.printStackTrace();
        }
    }

}
