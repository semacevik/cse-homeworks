/*
 *Sema Çevik
 *150112077
 *homework1
 *cse161
 */


import javax.swing.JOptionPane;

public class point {
	public static void main(String [] args) {
		double x=0;//double türünden bir x deðiþkeni belirler
		double y=0;//double türünden bir y deðiþkeni belirler
	    
		String xstr=JOptionPane.showInputDialog("Please, \nEnter a point of x coordinate.");//Ekrana string türünden bir x deðiþkeni girilmesi için kutucuk çýkarýr.
		x=Double.parseDouble(xstr);//string olarak deðiþtirdiðimiz deðiþkeni tekrar double yapar
		
		String ystr=JOptionPane.showInputDialog("Please, \nEnter a point of y coordinate");
		y=Double.parseDouble(ystr);
		
		if ((x <= 5 && x >= -5 && y <= 2.5 && y >= -2.5)  ) {//kullanýcý tarafýndan girilecek noktanýn dikdörtgenin içinde olma þartýný gösterir
			JOptionPane.showMessageDialog(null,"Point is inside of the rectangle"); 
				
		}
		else {// dikdörtgenin içinde olmamasý durumunu gösterir.eðer yukardaki gibi deðilse demektir.
		
			JOptionPane.showMessageDialog(null,"Point is outside of the retangle");
		}
	
	}
}