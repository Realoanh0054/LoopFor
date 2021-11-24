package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*BAI 12.1 tính tổng các số từ 1 đến 100*/
		int tong = 0;
		for (int i = 0; i <= 100; i++) {
			tong += i;
		}			 
		System.out.println ("Tong cac so tu 1 đen 100 : " + tong);
		System.out.println("-------------------------------------");
	
	/*BAI 12.2  Tính tổng các số chia hết cho 3 bé hơn n.*/

	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap n : ");
	int n = sc.nextInt();
	int tong1 = 0;
	for (int a = 0; a <= n; a++) {
		if(a % 3 == 0)
		tong1 += a;
	}
	System.out.println("Tong cac so chia het cho 3 be hon n : " + tong1);
	System.out.println("-------------------------------------------");
	
	/*12.3. Viet chuong trinh in ra 100 so fibonacci*/
	int count = 100, num1 = 0, num2 = 1;
	System.out.println(count + " so fibonaci dau tien la : ");
	for(int b = 1; b <= count; b++) {
		System.out.print(num1+ "  ");
		int sum = num1 + num2;
		num1 = num2;
		num2 = sum;
	}
	
    /* 12.4. Kiem tra mot so nguyen la so polinom*/
	
	System.out.println("Nhap vao so nguyen m: ");
	int m = sc.nextInt();
	int temp = m; 
	int invert = 0;
	for ( ;m > 0; ) {
		int mod = m % 10;
		m = m / 10;
		invert = invert * 10 + mod;	
	}
	if(invert == temp)
		System.out.println(temp + " la so polinom");
	else
		System.out.println(temp + "khong la so polinom");
	System.out.println("-------------------------------------");
	
	/*BAI 12.5*/
	System.out.println("Liet ke cac so tu 100 den 999 chia het cho 3 la :");
	for(int c = 100; c <= 999; c++) {
		int temp1 = (c / 100) + ((c - (c/100)*100)/10) + (c % 10);
		if (temp1 % 3 == 0) System.out.print(c + "   ");
		}
	}
}
