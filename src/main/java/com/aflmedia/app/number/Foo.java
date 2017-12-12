package com.aflmedia.app.number;

import com.aflmedia.app.number.WordNumber;

/**
 * Created by johnliman on 12/12/17.
 */
public class Foo extends WordNumber {

    public Foo(int i)
    {
        number = i;
    }

    public void display()
    {
        System.out.println(number + " - FOO");
    }
}
