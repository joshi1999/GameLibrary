package io.github.joshi1999.GameLibrary.GameObjects;

import java.awt.Image;
import java.awt.Point;

public class Entity 
{
	Point pos;
	String name;
	Image image;
	
	//Stats
	int life;
	int xp;
	int food;
	int weapon;
	int shield;
	
	public Entity(String name, int x, int y)
	{
		this.name = name;
		pos.x = x;
		pos.y = y;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getPosX()
	{
		return pos.x;
	}
	
	public int getPosY()
	{
		return pos.y;
	}
	
	public Point getPos()
	{
		return pos;
	}
	
	public void setPosX(int x)
	{
		pos.x = x;
	}
	
	public void setPosY(int y)
	{
		pos.y = y;
	}
	
	public void setPos(int x, int y)
	{
		pos.x = x;
		pos.y = y;
	}
	
	public void setPos(Point pos)
	{
		this.pos = pos;
	}
	
	public void setImage(Image image)
	{
		this.image = image;
	}
	
	public Image getImage()
	{
		return image;
	}
	
	
}
