// In Abstraction, we only care about calling the method(), we don't care about the underlying implementation

package com.company;

public class Main {

    public static void main(String[] args) {

        Enemy enemy = new Enemy(); //

        // To us, it doesn't matter how the code is executed, as long as it is.
        enemy.Talk();

        Vampire vampire = new Vampire();
        Werewolf werewolf = new Werewolf();

            vampire.Talk();
            werewolf.Talk();


           //Enemy enemy = vampire;    With a pointer of the parent obj, you can call methods on a class
           //enemy.Talk();

        Enemy [] enemies = {vampire, werewolf}; // With Polymorphism, it looks at what kind of obj it's pointing to(Enemy),
        enemies[0].Talk();                      // it looks at the method on that(Vampire & Werewolf), and if its overridden it'll call the child obj method(Talk()).
        enemies[1].Talk();


        // Encapsulation - when we restrict access of certain properties or methods of our obj to whatever is calling that obj.
        // - we are encapsulating our properties within the obj
        // - we do this by setting our properties to private
        vampire.setHealth(25);
        vampire.getHealth();
    }
}
