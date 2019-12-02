package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Ball {
	
	public double x,y;
	
	public int width,height;
	
	public double dx,dy;
	public double speed = 1.5;
	
	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 4;
		this.height = 4;
		
		dx = new Random().nextGaussian();
		dy = new Random().nextGaussian();
	}
	
	public void tick() {
		
		if(x + (dx * speed) >= Game.WIDTH) {
			dx *=-1;
		}
		else if( x+ (dx * speed) < 0) {
			dx *=-1;
		}
		
		if (y >= Game.HEIGHT) {
			
		}
		else if(y < 0){
			
		}
		
		Rectangle bounds = new Rectangle((int)(x+(dx*speed)), (int)(y+(dy*speed)), width, height);
			
		
		
		x += dx * speed;
		y += dy * speed;
		
				
	}
	
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect((int)x, (int)y, widht, height);
	}

}
