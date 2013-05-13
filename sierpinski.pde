//*** Fool around with different values of "corners" to get different shapes ***

//int[][] corners = {{255,5},{255,5},{255,5},{255,5},{255,5},{255,5},{130,220},{380,220}};
int[][] corners = {{510,10},{260,440},{760,440}};
//int[][] corners = {{1,1},{100,1},{1,100},{100,100}};
//int[][] corners = {{1,30},{1,30},{1,30},{1,30},{1,30},{1,30},{1,100},{100,100},{100,30},{50,1}};
float x = corners[0][0];
float y = corners[0][1];
int randCorner;

void setup()
{
  size(800,800);
}

void draw()
{
  ellipse(x,y,1,1);
  randCorner=floor(random(corners.length));
  x=(x+corners[randCorner][0])/2;
  y=(y+corners[randCorner][1])/2;
}
