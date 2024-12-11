import java.awt.*;

//
//  Class author:  Travis Schultz
//  Date created:  December 4, 2024
//  General description: Contains the code that makes the ball component in the brickbreak game function, 
// 	mainly the movement function of the ball and how the ball behaves when it is controlled. The ball's movement
//  is generally based off of collisions with bricks or paddles, with these methods being used in BrickBreak.java
//  The ball has range of motion on both the x and y axis.
//

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

	//
	//  Pre-condition: xVelocity must be an integer and cannot be zero as the method wouldn't do anything
	//  Post-condition: the xVelocity changing from positive to negative or vice versa
	//
	public void reverseX(){
		this.xVelocity = xVelocity * -1;
	}

	//
	//  Pre-condition: yVelocity must be an integer and cannot be zero as the method wouldn't do anything.
	//  Post-condition: the yVelocity changes from positive to negative or vice versa
	//
	public void reverseY(){
		this.yVelocity = yVelocity * -1;
	}
}
