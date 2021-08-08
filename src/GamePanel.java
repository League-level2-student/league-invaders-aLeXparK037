import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	Timer frameDraw;
	int currentState = MENU;
	Font titleFont;
	Font subFont;
	Rocket rocket = new Rocket(250, 700, 50, 50);
	ObjectManager object = new ObjectManager(rocket);
	Timer alienSpawn;
	
	
	
	@Override
	public void paintComponent(Graphics g){
		g.fillRect(10, 10, 100, 100);
		if(currentState == MENU){
		    drawMenuState(g);
		}else if(currentState == GAME){
		    drawGameState(g);
		}else if(currentState == END){
		    drawEndState(g);
		}
		
	}
	
	GamePanel(){
		   titleFont = new Font("Arial", Font.PLAIN, 48);
		   subFont = new Font("Arial", Font.PLAIN, 18);
		   frameDraw = new Timer(1000/60, this);
		   frameDraw.start();


	}
	
	 void updateMenuState() {
		
	 }
	void updateGameState() {
		object.update();
		if (rocket.isActive==false) {
			currentState = END;
		}
	}
	void updateEndState()  {  
		
	}
	
	 void drawMenuState(Graphics g) {
		 g.setColor(Color.BLUE);
		 g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		 g.setFont(titleFont);
		 g.setColor(Color.WHITE);
		 g.drawString("League Invaders", 75, 200);
		 
		 g.setFont(subFont);
		 g.drawString("press ENTER to begin", 150, 500);
		 
		 g.drawString("pess SPACE for instructions", 125, 650);

	 }
	 void drawGameState(Graphics g) {
		 g.setColor(Color.BLACK);
		 g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		 object.draw(g);
	 }
	 void drawEndState(Graphics g)  {
		 g.setColor(Color.RED);
		 g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		 g.setFont(titleFont);
		 g.setColor(Color.WHITE);
		 g.drawString("Game Over", 150, 200);
		 
		 g.setFont(subFont);
		 g.drawString("You killed  enemies", 150, 500);
		 
		 g.drawString("pess ENTER to restart", 125, 650);

		 
	 }
	 
	 void startGame (){
		 alienSpawn = new Timer(1000, object);
		 alienSpawn.start();
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(currentState == MENU){
		    updateMenuState();
		}else if(currentState == GAME){
		    updateGameState();
		}else if(currentState == END){
		    updateEndState();
		}
	    repaint();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		    if (currentState == END) {
		        currentState = MENU;
		    } else {
		        currentState++;
		        if (currentState == GAME) {
		        	startGame();
		        	
		        }
		        if (currentState == END) {
		        	alienSpawn.stop();
		        }
		    }
		    
		}
		
		if (e.getKeyCode()==KeyEvent.VK_SPACE) {
    		object.addProjectile(rocket.getProjectile());
    	}
		
		if (e.getKeyCode()==KeyEvent.VK_UP  && rocket.y>=0) {
		    rocket.up();
		}
		if (e.getKeyCode()==KeyEvent.VK_DOWN && rocket.y<=800) {
		    rocket.down();
		}
		if (e.getKeyCode()==KeyEvent.VK_LEFT && rocket.x>=0) {
		    rocket.left();
		}
		if (e.getKeyCode()==KeyEvent.VK_RIGHT && rocket.x <= 500) {
		    rocket.right();
		}
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_UP  && rocket.y>=0) {
		    rocket.up();
		}
		if (e.getKeyCode()==KeyEvent.VK_DOWN && rocket.y<=800) {
		    rocket.down();
		}
		if (e.getKeyCode()==KeyEvent.VK_LEFT && rocket.x>=0) {
		    rocket.left();
		}
		if (e.getKeyCode()==KeyEvent.VK_RIGHT && rocket.x <= 500) {
		    rocket.right();
		}
	}
	
}
