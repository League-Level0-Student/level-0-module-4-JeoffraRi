package _99_extra.hide_the_creeper;

import javax.swing.JOptionPane;

import processing.core.PApplet;
import processing.core.PImage;

public class HideTheCreeper extends PApplet {
	PImage creeper;   
	PImage minecraft;
	int CreepSize = 40;
	int MouseAdj = CreepSize/2;//at the top of your program
    static final int WIDTH = 600;
    static final int HEIGHT = 400;

    @Override
    public void settings() {
        size(600, 400);
    }

    @Override
    public void setup() {
    	creeper=loadImage("creeper.png");  
    	creeper.resize(CreepSize,CreepSize); //in setup method
        minecraft = loadImage("background.jpeg");     //in setup method
    	minecraft.resize(600, 400);          //in setup method
    	background(minecraft);          //in setup method
    	
    }

    @Override
    public void draw() {
    	image(minecraft, 0, 0);
    	image(creeper, 572, 263);
    	if(isNear(mouseX,592)&&isNear(mouseY,283)) {
    		noStroke();
    		fill(0,125,0);
    		ellipse(mouseX,mouseY,50,50);
  }else if (!isNear(mouseX,592)&&!isNear(mouseY,283)) {
	  		noStroke();
	  		fill(250,0,0);
	  		ellipse(mouseX,mouseY,50,50);
	  		JOptionPane.showMessageDialog(null, "You found the creeper!");
  }
    }

    static public void main(String[] args) {
        PApplet.main(HideTheCreeper.class.getName());
    }
    
    boolean isNear(int a, int b) {
    	if (abs(a - b) < 10)
    	     return true;
    	else
    	     return false;
    	}
    
}
