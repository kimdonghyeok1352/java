import java.util.Scanner;
import java.util.InputMismatchException;

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