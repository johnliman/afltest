package com.aflmedia.app;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

        try {

            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("Enter the number of children: ");
            // TODO check if the entered is a number
            int n = reader.nextInt();

            System.out.println("Enter the k value: ");
            // TODO check if the entered is a number
            int k = reader.nextInt();

            CircleGame game = new CircleGame(n, k);
            game.play();

            System.out.println("The winning child is " + game.getWinningChild());

        } catch (AflMediaException e) {
            System.out.println(e.getMessage());

        }




    }

}
