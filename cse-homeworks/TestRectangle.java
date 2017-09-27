public class TestRectangle{
	public static void main (String args []){
	 Rectangle r1=new Rectangle(4 , 40);//Creates Rectangle object width 4 hight 40   
	 Rectangle r2=new Rectangle(3.5 , 35.9);//Creates Rectangle object width 3.5 hight 35.9
	 
     r1.getwidth();
	 r1.gethight();
	 r1.getArea();
	 r1.getPerimeter();
	 
	 
	 r2.getwidth();
	 r2.gethight();
	 r2.getArea();
	 r2.getPerimeter();
	 
	 
	 
	 System.out.println(r1.toString());//write toString method to r1
	 System.out.println("  ");
	 
	 System.out.println(r2.toString());//write toString method to r2
	 
	 
	}
}