int ufe=0;
int rightX=1;
void setup() {
 size(800,500); 
}
  void draw() {

   for(int i=0; i<10;i++){
     if(rightX<=650){
     drawBull(rightX,250);
     background(0,0,0);
     fill(255,255,255);

  rightX=rightX+1;

     }
   }
     
  }
  void drawBull(ufe,250) {
      ellipse(100+ufe,250,100,100);
  }