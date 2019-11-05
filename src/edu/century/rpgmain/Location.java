package edu.century.rpgmain;

public class Location
{
	//=== variables ===
	
	//information
	private String name; //the name of the location, this is for the player to read
	private int difficulty; //this is the level of difficulty for the location
	private Character[] population; //this array contains the current characters within the location, which the player can encounter
	
	//=== constructors ===
	
	//default constructor
	public Location()
	{
		//set all variables to default values
		name = "New Location";
		difficulty = 1;
		population = new Character[20];
	}
	
	//full constructor
	public Location(String name, int difficulty, int popSize)
	{
		//set entered parameters
		this.name = name;
		this.difficulty = difficulty;
		this.population = new Character[popSize];
	}
	
	//=== display methods ===
	
	//to string
//	@Override
//	public String toString()
//	{
//		//TODO: Make display method
//	}
	
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
	
	//difficulty
	public void setDifficulty(int difficulty)
	{
		this.difficulty = difficulty;
	}
	
	public int getDifficulty()
	{
		return (difficulty);
	}
}
