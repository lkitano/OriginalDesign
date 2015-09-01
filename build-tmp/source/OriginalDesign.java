import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
		size(400,400);
	
		frameRate(60);
 	
}


public void draw()
{	

	
	backgroundChange();
	createCircle();
	

	


	
 	 	
	
}





public void createCircle (){

	fill((int)(Math.random()* 255), (int)(Math.random()* 255), (int)(Math.random()* 255));
	ellipse(200,200,(int)(Math.random()*300),(int)(Math.random()*200));

}


	int x = 0;
	int y = 0;
	int z = 0;
	

public void backgroundChange(){

	background(x, y , z);
	if(x < 255){
		x+=3;
	} else {
		x-=255;
	};
	if(y < 255){
		y+=5;
	} else {
		y-=255;
	};
	if(z < 255){
		z+=7;
	}else {
		z-=255;
	};

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
