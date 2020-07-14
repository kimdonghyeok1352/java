import java.util.Scanner;

public class 프로그래머스 {

	public static void main(String[] args) {
		String a = "수박";
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0) {
			for(int i =1; i<=n-1; i ++) {
				System.out.println(a);
			}
		}
	}

}
