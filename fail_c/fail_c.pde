int bull=3;
void setup() {
  size(800,500);
}

void draw() {
  
  for(int i=0;i<100;i++){
    
  if(bull%2==0){
    
    fill(255,0,0);
  ellipse(100,250,100,200);
  bull=bull+3;
  } else {
    fill(0,0,0);
    ellipse(100,250,100,200);
    bull=bull+3;
  }
  }} 