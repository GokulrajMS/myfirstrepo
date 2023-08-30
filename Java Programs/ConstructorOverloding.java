class Perimeter
{
public Perimeter()
 {
 System.out.println("From default");
 }
 public Perimeter(int x)
 {
 System.out.println("Circle perimeter: " + 2*Math.PI*x);
 }
 public Perimeter(int x, int y)
 {
 System.out.println("Rectangle perimeter: " +2*(x+y));
 }
}
class ConstructorOverloading2
{
 public static void main(String args[])
 {
 Perimeter p1 = new Perimeter();
 Perimeter p2 = new Perimeter(10);
Perimeter p3 = new Perimeter(10, 20);
 }
}
