import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {

	Projectile(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
		speed = 10;
	}
public void update() {
	y-=speed;
    super.update();

}
void draw(Graphics g) {
	 g.setColor(Color.RED);
     g.fillRect(x, y, width, height);
}
}
