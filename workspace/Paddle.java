import java.awt.Graphics;
import java.awt.*;

public class Paddle {

	//your code here!
	

	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;

	//constructor(s): ** IS THIS RIGHT?? IDK**
	public Paddle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.velocity = 5;
	}
	// ** DON'T KNOW WHAT TO DO WITH DRAW, MOVE, ADDVELOCITY
	//methods:
	public void draw(Graphics g){
		g.setColor(Color.red);
		g.fillRect(x, y, width, height);
	}

	public void move(){
		this.x += velocity;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}

	public int getVelocity(){
		return velocity;
	}

	// setters
	public void setX(int x){
		this.x = x;
	}

	public void setVelocity(int velocity){
		this.velocity = velocity;
	}

	//others
	public void addVelocity(int v){
		this.velocity += v;
		if(velocity > 8)
		velocity = 8;
		if(velocity < -8)
		velocity = -8;
	}
}
