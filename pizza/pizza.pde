
import ddf.minim.*;
AudioSample sound;
 
void setup(){
  Minim minim=new Minim(this);
  sound=minim.loadSample("slpaz.mp3");
  
 size(500,500); 
 fill(255,255,204);
ellipse(255,255,400,400);

fill(255,0,0);
ellipse(255,255,350,350);

fill(255,255,0);
ellipse(255,255,300,300);
}
void draw(){
 


if(mousePressed){
  PImage chez = loadImage("chez.gif")  ;
    image(chez, 280, 210);

PImage siks = loadImage("siks.gif") ; 
    image(siks, 255, 255);



PImage pizza = loadImage("pizza.gif")  ;
pizza.resize(50, 50);
    image(pizza, 200, 200);
    sound.trigger();
}

}
