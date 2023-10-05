package pong;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle{
	
	int id;
	int yVelocity;
	int speed = 10;
	
	Paddle(int x,int y,int PADDLE_WIDTH,int PADDLE_HEIGHT,int id)
	{
		super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
		this.id=id;
	}
	
	public void keyPressed(KeyEvent e)
	{
		switch(id)
		{
		
		case 1 : 
			if(e.getKeyCode()==KeyEvent.VK_W)
			{
				setDirection(-speed);
				move();
			}
			if(e.getKeyCode()==KeyEvent.VK_S)
			{
				setDirection(speed);
				move();
			}
			break;
			
		case 2 : 
			if(e.getKeyCode()==KeyEvent.VK_UP)
			{
				setDirection(-speed);
				move();
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN)
			{
				setDirection(speed);
				move();
			}
			break;
		}
		
	}
	
	
	public void keyReleased(KeyEvent e)
	{
		switch(id)
		{
		
		case 1 : 			
			if(e.getKeyCode()==KeyEvent.VK_W)
			{
				setDirection(0);
				move();
			}
			if(e.getKeyCode()==KeyEvent.VK_S)
			{
				setDirection(0);
				move();
			}
			break;
		case 2 : 
			if(e.getKeyCode()==KeyEvent.VK_UP)
			{
				setDirection(0);
				move();
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN)
			{
				setDirection(0);
				move();
			}
			break;
		}
		
	}
	
	
	
	
	public void draw(Graphics g)
	{
		if(id==1)
			g.setColor(new Color(243,0,255));
		else
			g.setColor(Color.CYAN);
		g.fillRect(x,y,width,height);
	}
	
	
	public void setDirection(int yDirection)
	{
		yVelocity =yDirection;
		
	}

	public void move()
	{
		y = y+ yVelocity;
	}
}
