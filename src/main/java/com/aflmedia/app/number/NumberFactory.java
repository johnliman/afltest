package com.aflmedia.app.number;

/*
Write a program that will iterate though a sequence of integers starting from 0 up to and including a number that can be passed in and the program will:
•	output the number and “FOO” when the integer is divisible by 3
•	output the number and “BAR” when the integer is divisible by 5
•	output the number and “BAZ” only when the integer is divisible by both 3 and 5
Take into consideration that we might want to add new rules in the future including different numbers, operators and
iteration patterns. Create any additional classes you need to support the design of your solution.

* */

import java.util.ArrayList;

public class NumberFactory {

    private int maxNumber;

    private ArrayList<WordNumber> listOfNumbers;

    public NumberFactory(int maxNumber)
    {
        this.maxNumber = maxNumber;

        this.listOfNumbers = new ArrayList<WordNumber>();

        init();

    }

    protected void init()
    {
        for (int number=0; number <= maxNumber; number++)
        {
            WordNumber wordNumber = getNumber(number);
            if (wordNumber != null)
            {
                listOfNumbers.add(wordNumber);
            }
        }
    }

    public WordNumber getNumber(int i)
    {
        if (i % 3 == 0 && i % 5 == 0)
        {
            return new Baz(i);
        }

        if (i % 3 == 0)
        {
            return new Foo(i);
        }

        if (i % 5 == 0)
        {
            return new Bar(i);
        }

        return null;
    }

    public void printNumbers()
    {
        for (WordNumber wordNumber : listOfNumbers)
        {
            wordNumber.display();
        }
    }


}
