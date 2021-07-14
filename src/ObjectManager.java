import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {

	Rocket rocket;

	ArrayList<Alien> aliens = new ArrayList<Alien>();

	ArrayList<Projectile> proj = new ArrayList<Projectile>();

	Random random = new Random();

	ObjectManager(Rocket a) {
		this.rocket = a;

	}

	void addProjectile(Projectile b) {

	}

	void addAlien() {
		aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH), 0, 50, 50));
	}

	void update() {
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).update();
			if(aliens.get(i).y > LeagueInvaders.HEIGHT) {
			aliens.get(i).isActive = false;
			}

		}
	}
}
