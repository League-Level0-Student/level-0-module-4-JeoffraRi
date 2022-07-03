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
    @Override
    public void settings() {
        size(660, 371);
	
    }
    @Override
    public void setup() {
    	
    }

    @Override
    public void draw() {
    	ballX=ballX+xSpeed;
    	ballY=ballY+ySpeed;
    	background(190,190,190);
    	noStroke();
    	fill(180, 0, 0); //in draw method
        ellipse(ballX, ballY, 20, 20); //in draw method
        stroke(250, 250, 0); //in draw method
    }

    static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
    
}