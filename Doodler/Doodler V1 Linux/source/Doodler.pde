void setup()
{
  size(700,500);
  background(255);
  noStroke();
  frameRate(1000);
  smooth();
}
int brushSize=10;

void draw()
{
  if (keyPressed)
  {
    if (key == 'c')
    {
      background(255);
    }
    if (key == 'q')
    {
      brushSize++;
    }
    if (key == 'w')
    {
      brushSize--;
      if(brushSize<1){brushSize = 1;}
    }
  }
  if (mousePressed)
  {
    fill(0);
    ellipse(mouseX, mouseY,brushSize,brushSize);
  }
}
