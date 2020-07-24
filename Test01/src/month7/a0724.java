package month7;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
public class a0724 extends JFrame {
	HashMap<String, String> h = new HashMap<String, String>();
	JTextField f1;
	JTextField f2;
	JButton[] b = new JButton[2];
	String[] name = { "����", "ã��" };
	JTextArea ta;

	a0724() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		f1 = new JTextField(10);
		f2 = new JTextField(10);
		ta = new JTextArea(10, 20);
		c.add(new JLabel("����"));
		c.add(f1);
		c.add(new JLabel("�ѱ�"));
		c.add(f2);
		for (int i = 0; i < 2; i++) {
			b[i] = new JButton(name[i]);
			c.add(b[i]);

			b[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton b1 = (JButton) e.getSource();
					if (b1 == b[0]) { // ���Թ�ư ������
						if (h.containsKey(f1.getText())) {
							h.put(f1.getText(), f2.getText());
							// �ΰ����� �ؽøʿ� ����
						} else { // �ؽ�Ʈ�ʵ忡 ������ ���� �ȵ���������
							h.put(f1.getText(), f2.getText());
							ta.setText(ta.getText() + "����" + f1.getText() + "," + f2.getText() + "\n");

						}

					} else { // ã���ư ������ ��
						Set<String> key = h.keySet();
						Iterator<String> it = key.iterator();
						while (it.hasNext()) {
							String k = it.next();
							String value = h.get(k);

							if (f1.getText().equals(k)) {
								f2.setText(value);
							}
						}

					}

				}
			});
		}
		setSize(500,500);
		c.add(new JScrollPane(ta));
		setVisible(true);

	}

	public static void main(String[] args) {
		new a0724();
	}
}

class Per{
	String s;
	Per(String s){
		this.s=s;
	}
	 public String toString() {
		return s;
	}
}
public class a0724 {
	public static void main(String[] args) {
		ArrayList<Per> al = new ArrayList<Per>();
		al.add(new Per("aa"));
		al.add(new Per("bb"));
		al.add(new Per("cc"));
		
		Iterator<Per> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

class Man{
	int a;
	Man(int a){
		this.a=a;
	}
	void show() {
		System.out.println(a);
	}
}
class Man1 extends Man{
	
	String s;
	
	Man1(int a, String s){
		super(a);
		this.s=s;
	}
	void show() {
		System.out.println(a+s);
	}
}
public class a0724 {
	public static void main(String[] args) {
		Man m1 = new Man(40);
		Man1 m2 = new Man1(20,"ȫ���");
		m1.show();//40
		m2.show();//20ȫ���
	}
}

public class a0724 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		while(true) {
			System.out.println("�������Է�");
			try {
				
			int a= n.nextInt();
			int b = n.nextInt();
			System.out.println(a+b);
			break;
			}catch(Exception e) {
				System.out.println("�Ǽ��Է� ������");
				n.nextLine();
				continue;
			}
		}
	}
}

class Circle{
	private double r;
	Circle(double r){
		this.r=r;
	}
	double area() {
		return 3.14*r*r;
	}
}
public class a0724 {
	public static void main(String[] args) {
		Circle[] c = new Circle[3];
		
		Scanner n = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			c[i] = new Circle(n.nextDouble());
			System.out.println(c[i].area());
		}
		
	}
}

public class a0724 {
	public static void main(String[] args) {
	Double d = new Double(5.5); 
	String s = d.toString();
	double b = Double.parseDouble(s);
	//�Ǽ� 5.5���ڽ�
	//�ڽ̵� 5.5�� ���ڿ��� ����
	//���ڿ� 5.5�� ��ڽ�
	}
}

class Circle {
	
	int a;

	Circle(int a) {
		this.a = a;
		
	}
	public boolean equlas(Object obj) {
		Circle c = (Circle)obj;
		if(a==c.a) {
			return true;
		}
		return false;
	}
}

public class a0724 {
	public static void main(String[] args) {
		Circle a = new Circle(20);
		Circle b = new Circle(20);
		if(a.equals(b))
			System.out.println("����");
		else
			System.out.println("�ٸ���");
	}
}

interface Poi{
	
	void show(String s, int i);
	void show(String s);
}
class Point implements Poi{
	
	public void show(String s, int i) {
		
				
		System.out.println(s+i);
	}
	public void show(String s) {
		
		System.out.println(s);
	}
}
public class a0724 {
	public static void main(String[] args) {
		Poi p = new Point();
		p.show("��ź",50000);
		p.show("BTS");
	}
}

class At extends Thread{
	int a,b;
	At(int a, int b){
		this.a=a;
		this.b=b;
	}
	public void run() {
		for(int i = a; i<b; i++) {
			System.out.println(i);
		}
	}
}
class Bt extends Thread{
	int c,d;
	Bt(int c, int d){
		this.c=c;
		this.d=d;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i+10);
		}
	}
}
public class a0724 {
	public static void main(String[] args) {
		At a = new At(1,10);//1~10
		Bt b = new Bt(11,20);//11~20
		a.start();
		b.start();
	}
}

class Student implements Serializable{
	String s;
	int a;
	Student(String s, int a){
		this.s=s;
		this.a=a;
	}
	void show() {
		System.out.println(s+a);
	}
}
public class a0724 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Student s  = new Student("��ǻ�Ͱ���",20);
		
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("obj.txt"));
		oo.writeObject(s);
		s.show();
		oo.close();
		
		
	}
}


public class a0724 extends JFrame {
	a0724(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JCheckBox jc1 = new JCheckBox("green");
		JCheckBox jc2 = new JCheckBox("blue");
		jc1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				c.setBackground(Color.green);
				
			}
		});
		jc2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				c.setBackground(Color.blue);
				
			}
		});
		c.add(jc1);
		c.add(jc2);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new a0724();
		
	}
}
*/
public class a0724 {
	static int get(int a[][]) {
		int max=0;
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				if(max<a[i][j]) {
					max=a[i][j];
				}
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		int score [][] = {{2,3,5},{5,3,7}};
		int high = get(score);
		System.out.println("�ִ밪" + high);
	}
}
