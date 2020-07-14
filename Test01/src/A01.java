import java.util.Scanner;
import java.util.InputMismatchException;

/*
class Cook {// 요리쓰레드
	String food;
	boolean send = false;

	void set(String f) {
		food = f;
		send = true;

		synchronized (this) {
			notifyAll();// 잠자고 있는 쓰레드 다 깨운다

		}

	}
	String get() {
		if(send == false) {
			try {
				synchronized (this) {
					wait();//손님이 기다림
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return food;
	}
}
class Chef extends Thread{
	Cook c;
	Chef(Cook c){
		this.c=c;
	}
	public void run() {
		c.set("음식");
	}
}
//hello
class Custumer extends Thread{
	Cook c;
	Custumer(Cook c){
		this.c=c;
	}
	public void run() {
		System.out.println(c.get());
	}
}
public class A01 {

	public static void main(String[] args) {
		Cook co = new Cook();
		Custumer c1 = new Custumer(co);
		Custumer c2 = new Custumer(co);
		Chef c3 = new Chef(co);
		
		try {
			c1.start();
			c2.start();
			Thread.sleep(1000);
			c3.start();
			
			c1.join();
			c2.join();
			c3.join();
		}catch(Exception e) {}
	}
}
*/
/*interface Cal {
	int total(int a, int b); // a부터 b까지의 합 리턴

	int big(int a, int b);
	 // a,b중 큰 값 리턴

	int hap();

	void big();
}
class Calcu implements Cal {
		int a, b;
		int sum = 0;

		Calcu(int a, int b) {
			this.a = a;
			this.b = b;
		}

	public int hap() {
		for (int i = a; i <= b; i++) {
			sum += i;
			 
		}
		return sum;
	}

		public void big() {
			if (a > b) {
				System.out.println(a);
			} else {
				System.out.println(b);
			}
		}
	}

	public class A01 {

	public static void main(String[] args) {
		Calcu cc = new Calcu(1,5);

		System.out.println(cc.hap());

		cc.big();

	}

}*/
class Th extends Thread{
	String str;
	Th(String str){
		this.str=str;
	}
	public void run() {
		System.out.println(str);
	}
}
public class A01 {

	public static void main(String[] args) {
		Th t = new Th("쓰레드 1");
		Thread th = new Thread(t);
		th.start();

	}
}