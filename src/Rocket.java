import java.awt.Color;
import java.awt.Graphics;

public class Rocket extends GameObject{

	Rocket(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
		speed = 15;
		
	}
	void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
        g.drawRect(collisionBox.x, collisionBox.y, collisionBox.width, collisionBox.height);
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
public Projectile getProjectile() {
    return new Projectile(x+ width /2, y, 10, 10);
} 
}
