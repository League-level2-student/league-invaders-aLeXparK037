import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener{

	Rocket rocket;

	ArrayList<Alien> aliens = new ArrayList<Alien>();

	ArrayList<Projectile> proj = new ArrayList<Projectile>();

	Random random = new Random();

	ObjectManager(Rocket a) {
		this.rocket = a;

	}

	void addProjectile(Projectile b) {
		proj.add(b);
//Ended on step 3 of Model Management. debug code for projectiles. Rocket wont fire projectiles. After, begin with Collision Management.
	}

	void addAlien() {
		aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH), 0, 50, 50));
	}

	void update() {
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).update();
			if (aliens.get(i).y > LeagueInvaders.HEIGHT) {
				aliens.get(i).isActive = false;
			}

			for (int b = 0; b < proj.size(); b++) {
				proj.get(b).update();
				if (proj.get(b).y > LeagueInvaders.HEIGHT) {
					proj.get(b).isActive = false;
				}
			}

		}
	}

	void draw(Graphics g) {
		rocket.draw(g);

		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).draw(g);

		}

		for (int b = 0; b < proj.size(); b++) {
			proj.get(b).draw(g);

		}

	}
	void purgeObjects() {
		for (int i = 0; i < aliens.size(); i++) {
			if (aliens.get(i).isActive == false) {
				aliens.remove(i);
			}

		}
		for (int b = 0; b < proj.size(); b++) {
			if (proj.get(b).isActive == false) {
				proj.remove(b);
			}

		}
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		addAlien();
	}

}
