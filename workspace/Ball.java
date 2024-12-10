import java.awt.*;


public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int size;
	private int xVelocity;
	private int yVelocity;
	


	//constructor(s): ** size is basically radius **
	public Ball(int x, int y, int size){
		this.xVelocity = 5;
		this.yVelocity = 5;
		this.x = x;
		this.y = y;
		this.size = size;
	}
	//methods:
	// ** DONT KNOW WHAT TO DO ABOUT DRAW, REVERSE, MOVE, WHY ARE GETTERS NOT WORKING??? **
	//getters:
	public void draw(Graphics g){
		g.setColor(Color.white);
		g.fillOval(x, y, size, size);
	}

	public void move(){
		this.x += xVelocity;
		this.y += yVelocity;
	}

	public int getXPos(){
		return Math.abs(x);
	}
	
	public int getYPos(){
		return Math.abs(y);
	}

	public int getSize(){
		return size;
	}

	// setters
	public void setXVelocity(int xVelocity){
		this.xVelocity = xVelocity;
	}

	public void setYVelocity(int yVelocity){
		this.yVelocity = yVelocity;
	}

	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}
	
	//others
	public void reverseX(){
		this.xVelocity = xVelocity * -1;
	}

	public void reverseY(){
		this.yVelocity = yVelocity * -1;
	}
}
