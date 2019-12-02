package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Player {
	public boolean right,left;
	
	public int x,y;
	
	public int widht,height;
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		this.widht = 40;
		this.height = 10;
		
	}
	
	public void tick() {
		if(right) {
			x++;
		}
		else if(left) {
			x--;
		}
		
		if(x + widht > Game.WIDTH ) {
			x = Game.WIDTH - widht;
		}
		else if(x < 0 ) {
			x = 0;
		}
	}
	
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, widht, height);
	}
}
