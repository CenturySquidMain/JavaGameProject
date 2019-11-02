package edu.century.rpgmain;

public class Driver
{
	public static void main(String[] args)
	{
		Character c1 = new Character("Squid Person", 50, 20);
		c1.setHealth(39);
		c1.setSp(15);
		
		System.out.println(c1.toString());
	}
}
