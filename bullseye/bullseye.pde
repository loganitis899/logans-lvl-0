int sub=9;
void setup() {
  size(500, 500);
   
}
void draw() {
  
    
    if(sub<450){
   if(sub%2==0){
     fill(0,0,0);
 ellipse(250,250,450-sub,450-sub); 
sub=sub+3;
}else{
  fill(255,255,255);
  ellipse(250,250,450-sub,450-sub);
  sub=sub+3;
    }
}}