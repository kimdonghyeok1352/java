import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

/*���� 1
public class ncstest1 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int a = n.nextInt();
		int b = n.nextInt();
		System.out.println(a+b);

	}

}



2��
class Circle{
	private double r;
	Circle(double r){
		this.r=r;
	}
	double area() {
		return 3.14*r*r;
	}
}
public class ncstest1 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		Circle c[] = new Circle[5];
		double r[] = new double[5];
		for(int i =0; i<5; i++) {
			r[i] = n.nextDouble();
			Circle(r[i]);
			System.out.println(c[i].area());
		}
		
	}
}

����3

class Num{
	int a;
	int sum=0;
	int max=0;
	void add(int a) {
		this.a=a;
		
		for(int i=0; i<4; i++) {
			sum+=a;
		}
		for(int i=0; i<4; i++) {
			if(max<a) {
				max =a;
			}
		}
	}
	int getSum() {
		return sum;
	}
	int getMax() {
		return max;
	}
}
public class ncstest1 {

	public static void main(String[] args) {
		Num nb = new Num();
		nb.add(7);
		nb.add(-1);
		nb.add(20);
		nb.add(5);
		System.out.println("��"+nb.getSum());
		System.out.println("Max"+nb.getMax());
		
		
		
		
	}
}
/*����4
public class ncstest1 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		HashMap<String, Double> hm = new HashMap<String,Double>();
		hm.put("�����", 1.2);
		hm.put("������", 2.2);
		Set<String> key = hm.keySet();
		Iterator<String> it = key.iterator();
		String s=n.next();
		if(s.equals(it.next())) {
			System.out.println(1.2);
		}
		if(s.equals("������")) {
			System.out.println(hm.get(2.2));
		}
		
	}
	

}
���� 5
public class ncstest1 extends JFrame {
	ncstest1(){
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,3));
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		
		c.add(jb1);
		c.add(jb2);
		c.add(jb3);
		c.add(jb4);
		c.add(jb5);
		c.add(jb6);
		c.add(jb7);
		c.add(jb8);
		c.add(jb9);
		
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
	new ncstest1();
	}

}
6��
class Student{
	String a,b;
	int c;
	Student(String a,String b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void show() {
		System.out.println(a+b+c);
	}
}
public class ncstest1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Student s = new Student("jack","123",20);
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("java.txt"));
		oo.writeObject(s);
		s.show();
		oo.close();
		
	}

}
7��
*/

class Worker{
	private int r;
	
	Worker(int r){
		this.r=r;
	}
	
	void setter() {
		Scanner n = new Scanner(System.in);
		int aa = n.nextInt();
		String bb = n.next();
		String cc = n.next();
		String dd = n.next();
		int ee = n.nextInt();
		
		System.out.println("���"+aa);
		System.out.println("�̸�"+bb);
		System.out.println("�μ� "+cc);
		System.out.println("�ּ� "+dd);
		System.out.println("���� "+ee);
		System.out.println("��������ԷµǾ����ϴ�");
	}
	void getter() {
		Scanner n = new Scanner(System.in);
		System.out.println("�˻��ϰ��� �ϴ� ����� �����?");
		int aa = n.nextInt();
		
		
	}
}
public class ncstest1 {

	public static void main(String[] args) {
		Worker w = new Worker(30);
		System.out.println("1.��������Է�");
		
		System.out.println("2.������� ���� ��ȸ");
		System.out.println("3.���α׷�����");
		Scanner n = new Scanner(System.in);
		int r = n.nextInt();
		switch(r) {
		
		case 1:
			w.setter();
			break;
		
		case 2:
			w.getter();
			break;
		case 3:
			System.out.println("����");
			break;
			
		
		}
	}

}


