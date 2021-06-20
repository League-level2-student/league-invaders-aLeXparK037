import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	final static int WIDTH = 500;
	final static int HEIGHT = 800;
	GamePanel game = new GamePanel();
	public static void main(String [] args) {
		LeagueInvaders one = new LeagueInvaders();
		one.setup();
	}
	 LeagueInvaders() {
		 frame = new JFrame();
		 game = new GamePanel();
		 frame.addKeyListener(game);
	}
	void setup() {
		frame.add(game);
		frame.setVisible(true);
		frame.setSize(500,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
