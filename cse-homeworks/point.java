/*
 *Sema �evik
 *150112077
 *homework1
 *cse161
 */


import javax.swing.JOptionPane;

public class point {
	public static void main(String [] args) {
		double x=0;//double t�r�nden bir x de�i�keni belirler
		double y=0;//double t�r�nden bir y de�i�keni belirler
	    
		String xstr=JOptionPane.showInputDialog("Please, \nEnter a point of x coordinate.");//Ekrana string t�r�nden bir x de�i�keni girilmesi i�in kutucuk ��kar�r.
		x=Double.parseDouble(xstr);//string olarak de�i�tirdi�imiz de�i�keni tekrar double yapar
		
		String ystr=JOptionPane.showInputDialog("Please, \nEnter a point of y coordinate");
		y=Double.parseDouble(ystr);
		
		if ((x <= 5 && x >= -5 && y <= 2.5 && y >= -2.5)  ) {//kullan�c� taraf�ndan girilecek noktan�n dikd�rtgenin i�inde olma �art�n� g�sterir
			JOptionPane.showMessageDialog(null,"Point is inside of the rectangle"); 
				
		}
		else {// dikd�rtgenin i�inde olmamas� durumunu g�sterir.e�er yukardaki gibi de�ilse demektir.
		
			JOptionPane.showMessageDialog(null,"Point is outside of the retangle");
		}
	
	}
}