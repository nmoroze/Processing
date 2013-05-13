import processing.core.*; 
import processing.xml.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class Doodler extends PApplet {


public void setup()
{
  size(1300,700);
  background(255);
  noStroke();
  smooth();
  frameRate(500);
}
int brushSize=15;
int r=0;
int g=0;
int b=0;
int doodleNum=1;

public void draw()
{
  if (keyPressed)
  {
    checkKeys();
  }
  fill(r,g,b);
  ellipse(20,20,20,20);
  if (mousePressed)
  {
    ellipse(mouseX,mouseY,brushSize,brushSize);
  }
}

public void checkKeys()
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
      save("doodle"+doodleNum+".png");
      doodleNum++;
    }
    else if (key == '0'){r=255; g=255; b=255;} //white
    else if (key == '1'){r=0;g=0;b=0;} //black
    else if (key == '2'){r=255;g=0;b=0;} //red
    else if (key == '3'){r=0;g=255;b=0;} //green
    else if (key == '4'){r=0;g=0;b=255;} //blue
    else if (key == '5'){r=255;g=122;b=0;} //orange
    else if (key == '6'){r=255;g=0;b=255;} //magenta
    else if (key == '7'){r=255;g=255;b=0;} //yellow
    else if(key == '8'){r=0;g=255;b=255;} //teal
    else if(key == '9'){r=122;g=122;b=122;} //grey
  }

public void mouseDragged()
{
  ellipse(pmouseX,pmouseY,brushSize,brushSize);
}



  static public void main(String args[]) {
    PApplet.main(new String[] { "--present", "--bgcolor=#666666", "--stop-color=#cccccc", "Doodler" });
  }
}
