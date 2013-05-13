void setup()
{
  size(1300,700);
  background(255);
  noStroke();
  smooth();
  frameRate(500);
}
int brushSize=20;
int r=0;
int g=0;
int b=0;
int doodleNum=1;

void draw()
{
  if (keyPressed)
  {
    if (key == 'c')
    {
      background(255);
    }
    else if (key == 'q')
    {
      brushSize++;
    }
    else if (key == 'w')
    {
      brushSize--;
      if(brushSize<1){brushSize = 1;}
    }
    else if (key == 's')
    {
      doodleNum++;      
      save("doodle"+doodleNum+".png");
    }
    else if (key == '0'){r=255; g=255; b=255;} //white
    else if (key == '1'){r=0;g=0;b=0;} //black
    else if (key == '2'){r=255;g=0;b=0;} //red
    else if (key == '3'){r=0;g=255;b=0;} //green
    else if (key == '4'){r=0;g=0;b=255;} //blue
    else if (key == '5'){r=255;g=122;b=0;} //orange
    else if (key == '6'){r=255;g=0;b=255;} //magenta
    else if (key == '7'){r=255;g=255;b=0;} //yellow
  }
  fill(r,g,b);
  if (mousePressed)
  {
    ellipse(mouseX, mouseY,brushSize,brushSize);
  }
  rect(0,0,50,50);
}
