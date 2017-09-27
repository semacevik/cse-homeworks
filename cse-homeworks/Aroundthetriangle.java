/*
 *Sema Çevik
 *150112077
 *homework1
 *cse161
 */

import javax.swing.JOptionPane;

public class Aroundthetriangle {
	public static void main(String [] args) {
		double x=0;//double x deðiþkeni
		double y=0;//double y deðiþkeni
		double z=0;//double z deðiþkeni
		double around=0;//double çevre deðiþkeni
		
		String xstring=JOptionPane.showInputDialog("Enter first side of triangle");
	    x=Double.parseDouble(xstring);//string deðiþkeni double yapar
		
		String ystring=JOptionPane.showInputDialog("Enter second side of triangle");
	    y=Double.parseDouble(ystring);
		
		String zstring=JOptionPane.showInputDialog("Enter third side of triangle");
		z=Double.parseDouble(zstring);
		
		if (x+y>z && x+z>y && y+z>x){//eðer 2 kenarýn toplamý diðer kenardan büyükse þartý
			around=x+y+z;
		    JOptionPane.showMessageDialog(null,"Around=" + (x+y+z));//bu þart doðruysa çevre kenarlar toplamýna eþittir
		    
		}
		else {
			JOptionPane.showMessageDialog(null,"ERROR!\nThis numbers don't constitude a triangle."); //eþit deðilse böyle bir üçgen olamayacaðýný göstermek için
		}
	}
}