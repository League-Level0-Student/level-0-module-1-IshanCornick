int x = 400; 
int y = 600; 
int takeoff = 0;
void setup() {
    size(800, 800);

}
void movement() {
    takeoff ++;
}

void draw() {
  background(0, 0, 40); 
  movement();
  fill(random(255), 0, 0);
  ellipse(x, y + 130 - takeoff, 90, 90);
  fill(248, 128, 0);
  ellipse(x, y + 115 - takeoff, 70, 70);
  fill(255, 153, 0);
  ellipse(x, y + 95 - takeoff, 35, 35);
  fill(100, 100, 100);
  triangle(x, y + 10 - takeoff, x + 50, y + 100 - takeoff, x - 50, y + 100 - takeoff);
 }
