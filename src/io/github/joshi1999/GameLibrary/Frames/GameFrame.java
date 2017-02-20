package io.github.joshi1999.GameLibrary.Frames;

import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;


public class GameFrame extends JFrame
{
	public GameFrame(String name)
	{
		super(name);
	}
	
	private final GraphicsConfiguration gfxConf = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
	
	public void Paint(Graphics g)
	{
		
	}
	
	private BufferedImage offImg;
	public void paint(Graphics g)
	{
		if(offImg == null || offImg.getWidth() != getWidth() || offImg.getHeight() != getHeight())
		{
			offImg = gfxConf.createCompatibleImage(getWidth(), getHeight());
			Paint(offImg.createGraphics());
		}
		
		g.drawImage(offImg,  0,  0, this);
		offImg = null;
	}
}
