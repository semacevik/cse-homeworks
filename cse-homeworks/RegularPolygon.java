/*sema çevik
150112077
hw5*/




public class RegularPolygon{
	private int n=3;
	private double side=0.0;
	private double x=0;
	private double y=0;
	
	public RegularPolygon(int a,double b,double c,double d){
		n=a;
		side=b;
		x=c;
		y=d;
			
	}
	public int getN(){// return the n of polygon
	return n;
	}	
		public double getSide(){//return the side of polygon
			return side;
		}
		public double getX(){//return the x of polygon
			return x;
		}
		public double getY(){//return the y of polygon
			return y;
		}
		public void setN(int h){//set  new number of side to polygon
			n=h;
		}
		public void setSide(double g){//set new side to polygon
			side=g;
		}
		public void setX(double t){// set new x coordinate value to polygon
			x=t;
		}
		public void setY(double f){// set new y coordinate value to polygon
			y=f;
		}
		public double getArea(){
			double k;
			k=(n*side*side)/(4*Math.PI/n);
			return k;
		}
		public double getPerimeter(){
			return n*side;
		}
		public String toString(){
			String f="n :"+getN()+"  side: "+getSide()+"  x coordinate: "+getX()+"  y coordinate: "+getY()+"  area: "+getArea()+"  perimeter: "+getPerimeter();
			return f;
		}
}