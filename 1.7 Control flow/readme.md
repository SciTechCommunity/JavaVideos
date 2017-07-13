**Control Flow**

Control flow is an important topic in computer science as it helps your program make decisions and can be implemented in algorithms. An everyday example of this would be you stopping at a stop sign and checking to see if any cars are coming before driving forwards. However, you aren't here for an everyday example, so we are going to show you the RPG example. Your Hero is in the middle of a battle against some bandits and he attacks them with a broadsword, and one of the bandits health meter goes below 0. 

``` if ( bandit1.getHealth() <= 0 ){ bandit1.die(); } ```

This code example gets the health of the bantit we just struck down, and checks it to see if it should die. Notice the usage of _<=_ in the code. This means less than or equal to. Sure we want the bandit to die if its health drops below 0, but in a rare case the health might end up exactly at 0, so we have to cover both cases. Control flow often is like a river, flowing from choice to choice and branching off based on what you write your program to cover. For example, take the following code snippet.

``` if  ( bandit1.getHealth() >= mostHealth ){ mostHealth = bandit1.getHealth(); Hero.attack(bandit1); }
else if ( bandit2.getHealth() >= mostHealth ){ mostHealth = bandit2.getHealth(); Hero.attack(bandit2); }
else if ( bandit3.getHealth() >= mostHealth ){ mostHealth = bandit3.getHealth(); Hero.attack(bandit1); }```

This control flow determines the priority or order that a Hero should attack the bandits, picking the one with the most health each time. 
