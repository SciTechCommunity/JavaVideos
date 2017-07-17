Welcome back! In this section we will cover how to manipulate data and objects after creating them. We are going to grab the Enemy class from the last section and add 3 key methods which will be used to add modifiers to our program (i.e a poisoned enemy will deal 3 less damage than normal). Without these *setters*, we would have to create a new object reference each time we wanted to alter something.

The Enemy class should look like this, with a few small changes such as adding a getter for stamina.
```
public class Enemy{

    private int stamina, health, attack;
    
    public Enemy(int stamina, int health, int attack)
    {
        this.stamina = stamina;
        this.health = health;
        this.attack = attack;
    }
    
    public boolean attack(Character target)
    {
        //Attack the target
    }
    
    public void heal(int ammount)
    {
        this.health += ammount;
    }
    
    public int getHealth()
    {
        return this.health;
    }
    
    public int getDamage()
    {
        return this.attack;
    }
    
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

