public class TestComplexNumber{
	public static void main(String args[]){
		ComplexNumber c1=new ComplexNumber(3, 4);
			ComplexNumber c2=new ComplexNumber(8, -5);
			ComplexNumber c3,c4,c5,c6,c7 ;
			c4=c1.add(c2);
			System.out.println(c4);
			c5=c1.multiply(c2);
			System.out.println(c5);
			System.out.println(c1.getAngle());
			c3=c1.divide(c2);
			System.out.println(c3);
			c6=c1.subtract(c2);
			System.out.println(c6);
		boolean a=	c2.equals(c1);
			System.out.println(a);
			c7=c2.conjugate();
			System.out.println(c7);
			System.out.println(c2.getMagnitude());
			System.out.println(c2.reciprocal());
			System.out.println(c1.reciprocal());
			
			
			
			
			
			
		
	}
		
}