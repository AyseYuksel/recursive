import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);	
	System.out.println("Sayacýn kactan baslamasý gerektigini girin : ");
	int sayacdeger=scan.nextInt();
	
	sayac(sayacdeger);
		
	}
	
	public static void sayac(int n) {
		
		if(n == 0) {
			System.out.println("Sayma islemi tamamlandi.");
		}else {
		System.out.println(n);
		n--;
		sayac(n); 
	}
  }
}
