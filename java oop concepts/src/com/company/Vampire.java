// Vampire = child class of Enemy (Vampire & Werewolf = sibling classes)

package com.company;

public class Vampire extends Enemy{     /* "extends" allows us to use the existing classes code,
                                            while also having properties of its own. */
    public void Talk(){                     // Inheritance reduces the amount of code we have to write.
        System.out.println("I want to suck your blood!");
    }

}
