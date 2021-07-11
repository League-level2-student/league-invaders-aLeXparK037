import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {

Rocket rocket;

ArrayList<Alien>aliens = new ArrayList<Alien>();

ArrayList<Projectile>proj = new ArrayList<Projectile>();

Random random = new Random();

ObjectManager(Rocket a){
	this.rocket=a;
	
}
void addProjectile(Projectile b){
	
}
void addAlien() {
	aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH),0,50,50));
}
}
