/*
 *Sema �evik
 *150112077
 *homework1
 *cse161
 */

import javax.swing.JOptionPane;

public class Aroundthetriangle {
	public static void main(String [] args) {
		double x=0;//double x de�i�keni
		double y=0;//double y de�i�keni
		double z=0;//double z de�i�keni
		double around=0;//double �evre de�i�keni
		
		String xstring=JOptionPane.showInputDialog("Enter first side of triangle");
	    x=Double.parseDouble(xstring);//string de�i�keni double yapar
		
		String ystring=JOptionPane.showInputDialog("Enter second side of triangle");
	    y=Double.parseDouble(ystring);
		
		String zstring=JOptionPane.showInputDialog("Enter third side of triangle");
		z=Double.parseDouble(zstring);
		
		if (x+y>z && x+z>y && y+z>x){//e�er 2 kenar�n toplam� di�er kenardan b�y�kse �art�
			around=x+y+z;
		    JOptionPane.showMessageDialog(null,"Around=" + (x+y+z));//bu �art do�ruysa �evre kenarlar toplam�na e�ittir
		    
		}
		else {
			JOptionPane.showMessageDialog(null,"ERROR!\nThis numbers don't constitude a triangle."); //e�it de�ilse b�yle bir ��gen olamayaca��n� g�stermek i�in
		}
	}
}