import java.awt.Color;
import java.awt.Graphics;

public class Rocket extends GameObject{

	Rocket(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
		speed = 10;
		
	}
	void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
	}
public void left() {
	x-=speed;
}
public void right() {
	x+=speed;

}
public void down() {
	y+=speed;
}
public void up() {
	y-=speed;
}
}
