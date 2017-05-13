Hey there Students! In this video we are going to cover what an object is and how Java uses Objects as a core part of it's language. A *class* is a fundamental part of Java and is made up of data and methods. An *Object* is an instance of a class that may differ in attributes. Data is value, such as a sword dealing 5 damage. Methods are behaviours that handle data in the Object, such as how **hero.attack(bandit)** would use the sword damage to attack an enemy. 


Java groups objects into classes according to their behaviour. So a class for *swords* and *daggers* would be separate from *armor* and *shield*. On a more base level, the Strings "sword" and "dagger" and "armor" would belong to the String class because they are the same data type. 


To create an Object in Java, you have to initialize it, meaning you give it meaningful data. 

**Enemy bandit = new Enemy(15, 45, 3)** 

Now what is going on here? We are creating a bandit object that is apart of an Enemy class, and we are setting 3 values to 15, 45, and 3. We can call these Stamina, Health, and attack, although they can be anything you want them to be.

This creates a *bandit* object that we may use as much as we want. For example now we can call **bandit.attack(hero)**!

You might have already guessed this from looking at our example, but to access methods or data from the Object you have to use the period( **.** ) symbol to move each level down. Imagine it's a tree. You start off at bandit, and navigate down to the methods instead of bandit. 

So if we wanted to find out how much health a bandit has, we would look at the class below.
```java
Enemy{
    Enemy(stamina, health, damage);
    attack();
    heal();
    getHealth();
    getDamage();
}
```
And then go **bandit.getHealth()**, we would get the health of the bandit displayed to us! This is called an *Accessor methods*, which just returns data without altering it at all.

We can also use methods to adjust data. So if our hero gets damaged, we could say **hero.moveTo(3,4)** to move away from the enemy to prevent another blow. This would change the hero's location, altering the data inside the object. This would be called a *mutator method*. Mutator methods mutate data. 

>A golden rule is to never use both an accessor and a mutator in the same method.
