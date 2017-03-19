int sub=9;
int bub=9;
int rightX=5;
int leftX=5;
void setup() {
  size(800, 500);
   
}
void draw() {

    
     if(sub<200){
   if(sub%2==0){
     fill(0,0,0);
 ellipse(100+rightX,250,200-sub,200-sub); 
sub=sub+9;
rightX=rightX+5;
}else{
  fill(255,255,255);
  ellipse(100+rightX,250,200-sub,200-sub);
  sub=sub+9;
  rightX=rightX+5;
 
    }
}
if(sub<200){
   if(sub%2==0){
     fill(0,0,0);
 ellipse(700-leftX,250,200-sub,200-sub); 
bub=bub+9;

}else{
  fill(255,255,255);
  ellipse(700-leftX,250,200-sub,200-sub);
  bub=bub+9;

    }
}
}