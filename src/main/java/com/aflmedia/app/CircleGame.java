package com.aflmedia.app;

import java.util.ArrayList;

/**
 * AFL Exercise 1
 * Consider the following children’s game:

 •	n children stand around a circle.
 •	To play the game there needs to be more than 1 child.
 •	Starting with a given child and working clockwise, each child gets a sequential number, which we will refer to as it’s id.
 •	Then starting with the first child, they count out from 1 until k. The k’th child is now out and leaves the circle.

 The count starts again with the child immediately next to the eliminated one.
 •	k can be larger than or less than the number of children
 •	Children are so removed from the circle one by one. The winner is the child left standing last.
 *
 *
 * Write a program, which, when given n and k, returns the sequence of children as they go out, and the id of the
 * winning child. Create any additional classes you need to support the design of your solution.
 *
 *
 */
public class CircleGame {
    private int numberOfChildren;
    private int knockOutNumber; // k
    private ArrayList<Integer> children;
    private int winningChildId;


    public CircleGame(int numberOfChildren, int knockOutNumber) throws AflMediaException {
        children = new ArrayList<Integer>();
        this.numberOfChildren = numberOfChildren;
        this.knockOutNumber = knockOutNumber;

        // check pre-requisites rule
        checkGameRules();

        initialiseGame();

    }

    private void checkGameRules() throws AflMediaException
    {
        // To play the game there needs to be more than 1 child.
        if (numberOfChildren < 1)
        {
            throw new AflMediaException("To play the game there needs to be more than 1 child.");
        }

    }

    private void initialiseGame()
    {
        for (int i = 0; i < numberOfChildren; i++) {
            children.add(i+1);
        }

    }

    public void play()
    {
        int indexOfChild = 0;

        while (children.size() > 1)
        {
            indexOfChild = (indexOfChild + knockOutNumber - 1) % children.size();

            System.out.print("Children that leaves the circle: ");
            System.out.println(children.get(indexOfChild));

            children.remove(indexOfChild);

        }
        System.out.println();

        winningChildId = children.get(0);
    }


    public int getWinningChild()
    {
        return winningChildId;
    }



}
