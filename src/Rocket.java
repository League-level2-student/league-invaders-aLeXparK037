import java.awt.Color;
import java.awt.Graphics;

public class Rocket extends GameObject{

	Rocket(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
		
	}
	void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
	}

}
