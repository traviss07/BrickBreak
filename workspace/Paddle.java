import java.awt.*;

//
//  Class author:  Travis Schultz
//  Date created:  December 4, 2024
//  General description: Contains the code that makes the 'paddle' component in the brickbreak game function,
//  including the movement function of the paddle and it having collisions for the ball to bounce off of,
//  with these methods being used to create function in BrickBreak.java
//  The paddle has range of motion on the X axis only.
//

public class Paddle {

	//your code here!
	

	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;

	//constructor(s): 
	public Paddle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.velocity = 5;
	}
	//methods:
	//getters
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
	//
	//  Pre-condition: v must be an integer
	//  Post-condition: the velocity will change (be increased or decreased) by the amount v, 
	//  if velocity results in a value greater than 8 or less than -8 its value is updated to the minimum or maximum
	//
	public void addVelocity(int v){
		this.velocity += v;
		if(velocity > 8)
		velocity = 8;
		if(velocity < -8)
		velocity = -8;
	}

	//
	//  Pre-condition: g must be of the type graphics.
	//  Post-condition: the g object will become red and create a rectangle
	//
	public void draw(Graphics g){
		g.setColor(Color.red);
		g.fillRect(x, y, width, height);
	}

	//
	//  Pre-condition: there is no input, the object this is ran with must have a velocity and an x value
	//  Post-condition: the object's x value will increased by its current velocity, appearing as movement
	//
	public void move(){
		this.x += velocity;
	}
	
}
