


void setup()
{
		size(400,400);
	
		frameRate(60);
 	
}


void draw()
{	

	
	backgroundChange();
	createCircle();
	

	


	
 	 	
	
}





void createCircle (){

	fill((int)(Math.random()* 255), (int)(Math.random()* 255), (int)(Math.random()* 255));
	ellipse(200,200,(int)(Math.random()*300),(int)(Math.random()*200));

}


	int x = 0;
	int y = 0;
	int z = 0;
	

void backgroundChange(){

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

