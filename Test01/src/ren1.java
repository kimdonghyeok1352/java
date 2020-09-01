import java.util.Scanner;

public class ren1 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int a [] = new int[7];
		for(int i=0; i<7; i++) {
			a[i] = n.nextInt();
		}
		int b = a[2]/10;
		int c = a[3]/10;
		int d = a[4]/10;
		int e = a[5]/10;
		int f = a[6]/10;
		System.out.println(a[0]-a[2]+" "+a[2]/10);
		System.out.println(a[0]-a[2]-a[3]+" "+(b+c));
		System.out.println(a[0]-a[2]-a[3]-a[4]+" "+(b+c+d));
		System.out.println(a[0]-a[2]-a[3]-a[4]+" "+(b+c+d-100));
		System.out.println(a[0]-a[2]-a[3]-a[4]-a[6]+" "+(b+c+d-100+f));
		
		
		
		

	}

}
