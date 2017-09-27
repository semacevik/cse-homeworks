public class TestRegularPolygon{
	public static void main(String args[]){
		RegularPolygon r1=new RegularPolygon(6 , 4, 0, 0);//Create polygon object  
		RegularPolygon r2=new RegularPolygon(10 , 4, 5.6, 7.8);//Create polygon object 
		r1.getN();
		r1.getSide();
		r1.getX();
		r1.getY();
		r1.getArea();
		r1.getPerimeter();
		
		r2.getN();
		r2.getSide();
		r2.getX();
		r2.getY();
		r2.getArea();
		r2.getPerimeter();
		
		System.out.println(r1.toString());//write toString method to r1 polygon
		System.out.println("  ");
		System.out.println(r2.toString());//write toString method to r2 polygon
		
		
	}
}