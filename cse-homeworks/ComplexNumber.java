public class ComplexNumber {
	private double real, imaginary;
	public ComplexNumber(double r,double im) {
		real=r;
		imaginary=im;
	}
	public double getReal(){
		return real;
	}
	public double getImaginary(){
		
		return imaginary;
	}
    public ComplexNumber reciprocal() { // find the reciprocal of complexnumber
        double total = real*real + imaginary*imaginary;
        return new ComplexNumber(real / total, -imaginary / total);
    }
	public  ComplexNumber add (ComplexNumber b2 ){//makes the collection process with complex numbers
		
		double sum1=real+b2.getReal();
		double sum2=imaginary+b2.getImaginary();
		return new ComplexNumber (sum1 ,  sum2);
		
	}
	public ComplexNumber subtract(ComplexNumber b2){//The extraction process with complex numbers
		double difference1=real-b2.getReal();
		double difference2=imaginary-b2.getImaginary();
		return new ComplexNumber (difference1 , difference2);
	}
	public ComplexNumber multiply(ComplexNumber b2){//multiply complex numbers
		double r=real*b2.getReal()-imaginary*b2.getImaginary();
		double im=imaginary*b2.getReal()+real*b2.getImaginary();
		return new ComplexNumber (r,im);
	}
	public ComplexNumber divide(ComplexNumber b2){//divide complex numbers
		double c=real*real+imaginary*imaginary;
		double a=real*b2.getReal()+imaginary*b2.getImaginary();
		double b=imaginary*b2.getReal()-real*b2.getImaginary();
		return new ComplexNumber(a/c,-b/c);
	
       
	}
	public boolean equals(ComplexNumber b2){//Checks the equality of two complex numbers
		if (real==b2.getReal()&& imaginary==b2.getImaginary())
		return true;
		else
			return false;
	}
	public  ComplexNumber conjugate(){//find the conjugate of complex number
		double conreal=this.real;
		double conimagin=-this.imaginary;
		return new ComplexNumber(conreal , conimagin);
	}
  	public double getAngle(){//find angle of complex number arctan(b/a)
  		double angle=Math.atan(imaginary/real)*180/Math.PI;
  		return angle;
		
	}
	public double getMagnitude(){//find magnitude of complex number
		double value=Math.sqrt(real*real+imaginary*imaginary);
		
		return value;
	}
  public String toString() {//add "i" complex number
        if (imaginary == 0) return real + "";
        if (real == 0) return imaginary + "i";
        if (imaginary <  0) return real + " - " + (-imaginary) + "i";
        return real + " + " + imaginary + "i";
    }
	
}