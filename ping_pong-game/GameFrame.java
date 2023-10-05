package pong;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

//FRAME CONSISTS OF MIN AND MAX BUTTON;
public class GameFrame extends JFrame {
	GamePanel panel =new GamePanel();
GameFrame()
{
	
	ImageIcon  image= new ImageIcon("1023.jpg");
	
	panel =new GamePanel();
	this.add(panel);
	this.setTitle("Pong Game");
	this.setResizable(false);
	
	this.setIconImage(image.getImage());
	
	this.setBackground(Color.pink);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.pack();
	this.setVisible(true);
	this.setLocationRelativeTo(null);
}
}
