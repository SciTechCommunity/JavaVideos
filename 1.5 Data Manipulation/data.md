Welcome back! In this section we will cover how to manipulate data and objects after creating them. We are going to grab the Enemy class from the last section and add 3 key methods which will be used to add modifiers to our program (i.e a poisoned enemy will deal 3 less damage than normal). Without these *setters*, we would have to create a new object reference each time we wanted to alter something.

The Enemy class should look like this, with a few small changes such as adding a getter for stamina.
```
public class Enemy{

    //All the methods from before and now the following.
    
    public int getStamina()
    {
        return this.stamina;
    }
}
```

How can we change the Health, Damage, or Stamina of an Enemy object after it has been created? We could do the following

```
Enemy gobling = new Enemy(1,1,1);
gobling.health = 2;
```

Software design wise, this is a bad idea. Imagine if you were the owner of a tavern and a thief wanted to steal your gold. Normally you would have to take the gold out of your safe, but in this instance the thief just magically plucks it out without having to pass any barriers. Variables should always be private so that people cannot interact with them directly. 

So how do we set up this secure way to edit the variables? We use *setters* which we briefly discussed in the last section. 

```
public void setHealth(int health)
{
    this.health = health;
}
```

How about you pause this video and give it a go making setters for stamina and damage output?

___

Great! If you had any trouble, post below in the comments. Here's a quick example of how these setters can now be used.

```
public void PoisonPotion(Character target)
{
    target.SetHealth( target.getHealth() - 10 );
}
```
This poison poition will take 10 health away from whatever the current target's health is.
