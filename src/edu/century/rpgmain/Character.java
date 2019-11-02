package edu.century.rpgmain;

public class Character
{
	//=== variables ===
	
	//information
	private String name; //the name of the character, this is for the player to read
	private int level; //this is the current level of the character. Characters level up by defeating enemies
	private int experience; //this is the character's total experience points. Gaining enough will level the character up
	
	//main statistics
	private int maxHealth; //the maximum amount of health the character can have
	private int health; //the character's current health value. Character is defeated when this value reaches 0
	private int maxSp; //skill points, this is the maximum amount of skill points the character has
	private int sp; //the character's current amount of skill points. These are spent to use special moves
	private int power; //the character's attack power, this decides how much damage they do
	private int defense; //the chracter's defense value, this decides how much damage they can negate from incoming attacks
	private int speed; //the character's speed value, faster characters will attack before slower ones
	private int luck; //the character's luck value, the higher this value is, the more likely the character is to dodge attacks
	
	//=== constructors ===
	
	//default constructor
	public Character()
	{
		//set all variables to default values
		name = "New Character";
		level = 1;
		experience = 0;
		
		maxHealth = 30;
		health = 30;
		maxSp = 20;
		sp = 20;
		power = 5;
		defense = 5;
		speed = 5;
		luck = 5;
	}
	
	//basic constructor
	public Character(String name, int maxHealth, int maxSp)
	{
		//set entered parameters
		this.name = name;
		this.maxHealth = maxHealth;
		this.maxSp = maxSp;
		
		//fill in default values
		level = 1;
		experience = 0;
		health = maxHealth;
		sp = maxSp;
		power = 5;
		defense = 5;
		speed = 5;
		luck = 5;
	}
	
	//full constructor
	public Character(String name, int maxHealth, int maxSp, int power, int defense, int speed, int luck)
	{
		//set entered parameters
		this.name = name;
		this.maxHealth = maxHealth;
		this.maxSp = maxSp;
		this.power = power;
		this.defense = defense;
		this.speed = speed;
		this.luck = luck;
		
		//fill in default values
		level = 1;
		experience = 0;
		health = maxHealth;
		sp = maxSp;
	}
	
	//=== display methods ===
	
	//to string
	@Override
	public String toString()
	{
		String nameLength = name.replaceAll(".", "="); //the name variable but every character is replaced with '=', used for formatting
		
		String str = ("======= " + name + " ======="); //this is the actual string being displayed
		str += ("\nLevel: " + level);
		str += ("\n(Total Experience: " + experience + ")");
		str += ("\n\nHealth: " + health + "/" + maxHealth);
		str += ("\nSP: " + sp + "/" + maxSp);
		str += ("\n\nPower: " + power);
		str += ("\nDefense: " + defense);
		str += ("\nSpeed: " + speed);
		str += ("\nLuck: " + luck);
		str += ("\n========" + nameLength + "========"); //this ensures that the bottom row of '=' is equal to the top row, which uses the character's name variable
		
		return (str);
	}
	
	//=== getters / setters ===
	
	//name
	public void setName(String name)
	{
		if (name.equals("")) //if the name string is empty
		{
			this.name = "Empty String"; //show that the string passed was empty
		}
		else
		{
			this.name = name; //otherwise, assign the new name
		}
	}
	
	public String getName()
	{
		return (name);
	}
	
	//level
	public void setLevel(int level)
	{
		this.level = level;
	}
	
	public int getLevel()
	{
		return (level);
	}
	
	//experience
	public void setExperience(int experience)
	{
		this.experience = experience;
	}
	
	public int getExperience()
	{
		return (experience);
	}
	
	//maxHealth
	public void setMaxHealth(int maxHealth)
	{
		this.maxHealth = maxHealth;
	}
	
	public int getMaxHealth()
	{
		return (maxHealth);
	}
	
	//health
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	public int getHealth()
	{
		return (health);
	}
	
	//maxSp
	public void setMaxSp(int maxSp)
	{
		this.maxSp = maxSp;
	}
	
	public int getMaxSp()
	{
		return (maxSp);
	}
	
	//sp
	public void setSp(int sp)
	{
		this.sp = sp;
	}
	
	public int getSp()
	{
		return (sp);
	}
	
	//power
	public void setPower(int power)
	{
		this.power = power;
	}
	
	public int getPower()
	{
		return (power);
	}
	
	//defense
	public void setDefense(int defense)
	{
		this.defense = defense;
	}
	
	public int getDefense()
	{
		return (defense);
	}
	
	//speed
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	public int getSpeed()
	{
		return (speed);
	}
	
	//luck
	public void setLuck(int luck)
	{
		this.luck = luck;
	}
	
	public int getLuck()
	{
		return (luck);
	}
}
