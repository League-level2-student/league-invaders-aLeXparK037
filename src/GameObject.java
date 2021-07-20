import java.awt.Rectangle;

public class GameObject {
	int x;
	 int y;
	 int width;
	 int height;
	 int speed = 0;
	 boolean isActive = true;
	 Rectangle collisionBox;
	 GameObject(int x, int y, int w, int h){
		 this.x = x;
		 this.y = y;
		 this.width = w;
		this.height = h;
		collisionBox = new Rectangle(x,y,w,h);
		
	 }
	 public void update() {
	        collisionBox.setBounds(x, y, width, height);
	 }
}
