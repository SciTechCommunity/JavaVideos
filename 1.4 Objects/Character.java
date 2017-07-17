package video4;

public abstract class Character extends GameObject {

	private double stamina;
	private double health;
	private double damage;
	
	public Character(String name, String id, double health, double stamina, double damage) {
		super(name, id);
		this.health = health;
		this.stamina = stamina;
		this.damage = damage;
	}
	
    public double getHealth(){
    	return this.health;
    }
    public double getDamage(){
    	return this.damage;
    }
    public double getStamina(){
    	return this.stamina;
    }
    abstract void takeDamage(double damage);
    abstract void healHealth(double health);
    abstract void healStamina(double stamina);
    abstract void attack(String target);

    //public void moveTo(ArrayList loc); 
    //Advanced tutorial!
}
