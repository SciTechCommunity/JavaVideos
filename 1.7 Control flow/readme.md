**Control Flow**

Control flow is an important topic in computer science as it helps your program make decisions and can be implemented in algorithms. An everyday example of this would be you stopping at a stop sign and checking to see if any cars are coming before driving forwards. However, you aren't here for an everyday example, so we are going to show you the RPG example. Your Hero is in the middle of a battle against some bandits and he attacks them with a broadsword, and one of the bandits health meter goes below 0. 

``` if ( bandit1.getHealth() <= 0 ){ bandit1.die(); } ```

This code example gets the health of the bandit we just struck down, and checks it to see if it should die. Notice the usage of _<=_ in the code. This means less than or equal to. Sure we want the bandit to die if its health drops below 0, but in a rare case the health might end up exactly at 0, so we have to cover both cases. That's what control flow is all about, covering the cases that might happen. Control flow often is like a river, flowing from choice to choice and branching off based on what you write your program to cover. For example, take the following code snippet.

``` 
if      ( bandit1.getHealth() >= mostHealth ){ mostHealth = bandit1.getHealth(); Hero.attack(bandit1); }
else if ( bandit2.getHealth() >= mostHealth ){ mostHealth = bandit2.getHealth(); Hero.attack(bandit2); }
else if ( bandit3.getHealth() >= mostHealth ){ mostHealth = bandit3.getHealth(); Hero.attack(bandit1); }
```

This control flow determines the priority or order that a Hero should attack the bandits, picking the one with the most health each time. It then assign the mostHealth to that bandit's health, ensuring that we keep check on the strongest bandit.

Let's take a step back and look at a different version of control flow: while loops. In java it looks like this:

``` 
while ( Hero.getHealth() > 0 ){ game.Run(); }
menu();
```

While the Hero's health is greater than zero, the game will run (this means that all the necessary methods are called and you can keep playing). Otherwise it will break out of the loop and it will call the menu method, which will be like the game over screen. 

There are several other ways that Java handles control flow, like *for loops*, *case statements*, and *breaking*. 

```
public void attack(Character target){
  if  ( Hero.getStamina() < Hero.weapon.getStaminaUse() ){ break; }
  this.stamina -= this.weapon.getStaminaUse();
  target.takeDamage( Hero.getDamage() );
}
```

You might think that attacking an enemy will work, until you realize that your Hero only has 5 stamina left and his hefty broadsword requires 6 stamina to use. The *if* statement here checks that comparison and will *break* out of the attack since your Hero does not have enough stamina to actually attack. If your Hero has enough stamina though, it will decrease it's stamina by the stamina cost of the equipped weapon and then deal appropriate damage to the target. This method abstracts some important details out, like checking to see if the target is a friend or foe, but let's just assume the target is indeed an Enemy character. 
