int sub=9;
void setup() {
  size(500, 500);
   
}
void draw() {
  
    
    if(sub<700){
   if(sub%2==0){
     fill(0,0,0);
 ellipse(250,250,700-sub,700-sub); 
sub=sub+1;
}else{
  fill(255,255,255);
  ellipse(250,250,700-sub,700-sub);
  sub=sub+1;
    }
}} 