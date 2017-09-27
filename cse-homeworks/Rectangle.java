/*sema çevik 150112077 hw5 */



public class Rectangle {
  private double width;
  private double hight;
	
	public    Rectangle(double w,double h){
		 width=w;
		 hight=h;
	}
	public double getwidth(){//{return the width of rectangle
		return width;
	}
	public double gethight(){//return the hight of rectangle
		return hight;
	}
	public void setwidth(double a){//set new width for rectangle
		width=a;
	}
	public void sethight(double b){//set new hight for rectangle
		hight=b;
	}
	public double getArea(){//return the area of rectangle
		return width*hight;
	}
	public double getPerimeter(){// return the perimeter of rectangle
		return 2*(width+hight);
	}
	public String toString(){
		String k;
		k= "Width: " +getwidth()+ ", "+"Hight: "+gethight()+" ,"+"Area: "+getArea()+" ,"+"Perimeter: "+getPerimeter();//  return rectangular specifications 
		return k;
	}
}