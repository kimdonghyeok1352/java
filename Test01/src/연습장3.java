import java.util.Scanner;

class Work123 {
	int a;
	String b;
	String c;
	Work123(int a, String b, String c){
	
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	
}

public class 연습장3 {

	public static void main(String[] args) {
		Work123 w = new Work123(1,"!@","#!@");
		Scanner n = new Scanner(System.in);
		while(true) {
			System.out.println("1.~~");
			System.out.println("2.~~");
			System.out.println("3.~~");
			int z = n.nextInt();
			switch(z) {
			case 1:
				System.out.println("번호입력");
				int a = n.nextInt();
				w.setA(a);
				System.out.println("이름");
				String b = n.next();
				w.setB(b);
				System.out.println("주소");
				String c = n.next();
				w.setC(c);
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				break;
			case 2:
				System.out.println("확인하고 싶은 번호 입력");
				int y = n.nextInt();
				if(y==w.getA()) {
					System.out.println(w.getA());
					System.out.println(w.getB());
					System.out.println(w.getC());
					break;
				
				}
			case 3: 
				System.out.println("종료");
				System.exit(0);
			}
		}
	}

}
