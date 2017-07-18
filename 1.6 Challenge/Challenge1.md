Welcome to the first challenge problem! For this problem will give you incomplete code and you have to finish it based off of the knowledge you have picked up so far on your journey. Feel free to look over your notes or previous videos if you are stuck, but don't look up the answer or you won't learn as much!

A gobling blocks your path with a giant bar of gold. Your character has 6 strength...but needs 8 to move the bar aside.


```
public class Hero
{
     private int health, strength, stamina;
     
     public Hero(int stamina, int health, int strength)
     {
            this.stamina = stamina;
            this.health = health;
            this.strength = strength;
     }
     
     public int getHealth()
     {
          return this.health;
     }
    
     public int getStrength()
     {
          return this.strength;
     }
     
     public int getStamina()
     {
          return this.stamina;
     }
     //Your code here.
}
```
```
public class Test
{
     public static void main(String[] args)
     {
          Hero hero = new Hero(1,1,1);
          //Your code here.
     
     }
     
     public void moveBar()
     {
          if(Hero.getstrength() >= 8)
          {
               System.out.println("Congrats, you solved the problem!");
          }
     }
}
```
