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
  size(700,500);
  background(255);
  noStroke();
  frameRate(1000);
  smooth();
}
int brushSize=10;

public void draw()
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
  static public void main(String args[]) {
    PApplet.main(new String[] { "--present", "--bgcolor=#666666", "--stop-color=#cccccc", "Doodler" });
  }
}
