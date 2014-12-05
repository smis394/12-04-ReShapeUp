// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
import java.lang.Math;
public class Rectangle
{
  private Point origin;
  private int width;
  private int height;
  public Rectangle()
 {
   origin=new Point();
    width=0;
   height=0;
  }
  public Rectangle (Point a , Point m)
  {
    origin=a;
    height=m.getY()-a.getY();
    width=m.getX()-a.getY();
  }
  public Rectangle(Point a, int x, int y)
  {
    origin=a;
    width=a.getX()-x;
    height=a.getY()-y;
  }
  public Point getBottomLeft()
  {
   return origin;
  }
  public Point getTopRight()
  {
    Point b=new Point();
    b.setX(origin.getX()+width);
    b.setY(origin.getY()+height);
    return b;
  }
  public int getHeight()
 {
    return height;
  }
  public int getWidth()
  {
    return width;
  }
  public double area()
  {
    return height*width;
  }
  public double diagonal()
  {
    return Math.sqrt((height*height)+(width*width));
  }
  public int perimeter()
  {
    return (2*width)+(2*height);
  }
  public boolean isSquare()
  {
    if(width!=height)
    {
    return false;
    }
    else
    {
      return true;
    }
  }
  public String toString()
  {
    return "["+origin.toString()+","+getTopRight().toString()+"]";
  }
  public void translate(int x, int y)
  {
    origin.setX(origin.getX()+x);
    origin.setY(origin.getY()+y);
  }
  public void scale (int dx, int dy)
 {
    width+=dx;
    height+=dy;
  }
}
