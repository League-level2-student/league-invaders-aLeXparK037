import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject {

	Alien(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
		speed=11;
	}
public void update() {
	y+=speed;
    super.update();

}
void draw(Graphics g) {
	g.setColor(Color.YELLOW);
    g.fillRect(x, y, width, height);
}
}
