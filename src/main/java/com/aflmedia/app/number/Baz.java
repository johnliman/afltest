package com.aflmedia.app.number;

/**
 * Created by johnliman on 12/12/17.
 */
public class Baz extends WordNumber {

    public Baz(int i)
    {
        this.number = i;
    }


    public void display()
    {
        System.out.println(number + " - BAZ");
    }
}
