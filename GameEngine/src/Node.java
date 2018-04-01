import java.awt.Graphics;

public class Node extends WindowManager {
	private int x = 0;
	private int y = 0;
	private boolean visible = true;
	
	public void CreateNode(int initialX, int initialY) {
		x = initialX;
		y = initialY;		
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int newX) {
		x = newX;
	}
	
	public void setY(int newY) {
		y = newY;
	}
	
	public boolean getVisible() {
		return visible;
	}
	
	public void setVisible(boolean newVisible) {
		visible = newVisible;
	}
	
	public void show ( Graphics g) {
		//g.drawImage(img, x, y, null);
	}
}
