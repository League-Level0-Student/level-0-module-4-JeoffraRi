package _99_extra.pong;

import javax.swing.JOptionPane;

import processing.core.PApplet;
import processing.core.PImage;

public class Pong extends PApplet {
	
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int xSpeed = 3;
    int ySpeed = 2;
    int ballX = 0;
    int ballY = 0;
    int paddleX = 0;
    int paddleY = 329;
    int paddleLength = 110;
    
    int Score = 0;
    @Override
    public void settings() {
        size(660, 371);
    }
    
    @Override
    public void setup() {
    }
    
    boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
    	return (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength);
	}

    @Override
    public void draw() {
    	paddleX = mouseX;
    	
    	if (intersects(ballX,ballY,paddleX,paddleY,paddleLength)) {
    		ySpeed = -ySpeed;
    		Score = Score+1;
    	}
    	
    	if (ballY < 0) ySpeed = -ySpeed;
    	if (ballY>371) JOptionPane.showMessageDialog(null, "Your score was "+Score+".");
    	if(ballX > width) xSpeed = -xSpeed;
    	if(ballX < 0) xSpeed = -xSpeed;
    	
    	ballX=ballX+xSpeed;
    	ballY=ballY+ySpeed;
    	background(190,190,190);
    	
    	noStroke();
    	fill(180, 0, 0); //in draw method
        ellipse(ballX, ballY, 20, 20); //in draw method
        fill (0,0,130);
        
        rect(paddleX, paddleY, paddleLength, 30);
        stroke(250, 250, 0); //in draw method
    }

	static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
    
}