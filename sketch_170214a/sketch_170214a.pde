void setup() {
  size(800, 800);
}
void draw(){
  background(20,20,20);
  fill(255,255,255);
  ellipse(200,100,200,100);
  ellipse(600,100,200,100);
  if(mouseX>=300){
    mouseX=300;}
  if(mouseX<=100){
    mouseX=100;}
  if(mouseY<=50){
    mouseY=50;}
  if(mouseY>=150){
    mouseY=150;}
  fill(0,200, 100);
  ellipse(mouseX,mouseY,20,20);
  ellipse(mouseX+400, mouseY, 20,20);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  