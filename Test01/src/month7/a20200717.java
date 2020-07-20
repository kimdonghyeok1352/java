package month7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JToolBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
public class a20200717 extends JFrame {
	JSlider j = new JSlider(100,200,130);//�ּҰ� �ִ밪 ǥ�ð�
	JLabel j1 = new JLabel(" ");
	
	
	a20200717() {
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(j);
		c.add(j1);
		j.setMajorTickSpacing(20);//ū ������ ����
		j.setPaintLabels(true);//
		j.setPaintTicks(true);
		j1.setHorizontalAlignment(JLabel.CENTER);//���ڿ���ġ �߾�
		j1.setOpaque(true);
		j1.setBackground(Color.green);
		j1.setText(Integer.toString(j.getValue()));
		//���� �������� ���ڿ��� �����ؼ� �����ӿ� ����.
		j.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider s =(JSlider)e.getSource();
				j1.setText(Integer.toString(j.getValue()));
				
			}
		});
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new a20200717();

	}

}

public class a20200717 extends JFrame {
	JSlider j = new JSlider(100,200,130);//�ּҰ� �ִ밪 ǥ�ð�
	JLabel j1 = new JLabel(" ");
	
	
	a20200717() {
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JMenuBar jm = new JMenuBar();
		JMenu j1 = new JMenu("search");
		JMenu j2 = new JMenu("project");
		JMenuItem j3 = new JMenuItem("Open");
		JMenuItem j4 = new JMenuItem("Open file...");
		
		setJMenuBar(jm);
		
		jm.add(j1);
		jm.add(j2);
		
		j2.add(j3);
		j2.add(j4);
		
		
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new a20200717();

	}

}

public class a20200717 extends JFrame {
	
	
	
	a20200717() {
		
		Container c = getContentPane();
		
		
		JToolBar j = new JToolBar();
		JButton j1 = new JButton("��");
		
		j1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int r = JOptionPane.showConfirmDialog(null, "������ ����?"
						,"����",JOptionPane.YES_NO_CANCEL_OPTION);
				if(r==JOptionPane.CLOSED_OPTION) {
					//���� �� �������� ���
					return;
				}
				else if(r==JOptionPane.YES_OPTION) {
					System.exit(0);//�����ڵ�
				}
				else 
				return; // not exit
			}
		});
		j.add(j1);
		c.add(j,BorderLayout.NORTH);//������ ��ġ ������ BorderLayout���� ����
		
		
		
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new a20200717();

	}

}


public class a20200717 {
	static void high(int a[][], int b, int c) {
		b=3;
		c=3;
		Scanner n = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = n.nextInt();
				if (a[i][j] > 3) {
					System.out.println(a[i][j]);

				}
				else 
					System.out.println(3);
			}
		}
	}

	public static void main(String[] args) {

		int[][] ary = new int[3][3];

		high(ary, 3, 3);

	}

}


class Calc {

	int sum = 0;

	int calculate() {
		Scanner s = new Scanner(System.in);
		while (true) {
			int a = s.nextInt();

			if (a % 2 == 1) {
				sum += a;
			}
			return sum;
		}

	}
}

public class a20200717 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("5~10 ���� �Է�");

		int a = s.nextInt();
		if (a < 5 || a > 10) {
			System.out.println("�ٽ��Է� ");

		}

	}

}

interface Cal {
	int cal(int a, int b);
}

class Show implements Cal {
	int a, b;
	int sum = 0;

	public int cal(int a, int b) {
		this.a=a; this.b=b;
		for (int i = a; i <= b; i++) {
			sum+=i;
		}
		return sum;
	}
}

public class a20200717 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		Cal c = new Show();
		int a = n.nextInt();
		int b = n.nextInt();
		System.out.println(c.cal(a, b));

	}

}

class Gen<T> {
	T t;
	T d;

	Gen(T t, T d) {
		this.t = t;
		this.d = d;

	}

	T one() {
		return t;
	}

	T two() {
		return d;
	}

	boolean three() {

		return t.equals(d);

	}

}

public class a20200717 {
	public static void main(String[] args) {

		Gen<String> g = new Gen<String>("seoul", "busan");

		System.out.println(g.one()); // seoul ���

		System.out.println(g.two()); // busan ���

		System.out.println(g.three()); // false ��� (�� ���ڿ� ��)
	}
}


/*

public class a20200717 extends JFrame {
	a20200717(){
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			ImageIcon im1 [] = {new ImageIcon("C:/Users/soldesk/Desktop/aa.jpg"),
							   new ImageIcon("C://Users//soldesk//Desktop/bb.jpg"),
							   new ImageIcon("C:/Users/soldesk/Desktop/cc.jpg")
			};
			JLabel j [] = new JLabel[3];
			for(int i =0; i<3; i++) {
				j[i]= new JLabel(im1[i]);
			c.add(j[i]);
			}
			
			setSize(500,500);
			setVisible(true);
	}
	public static void main(String[] args) {
		new a20200717();
		
	}
}


public class a20200717 {
	static int add(int a[],int b) {
		int sum=0;
		for(int i =0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		 int r=add(arr,5);
		 

		 

	
	}
}

public class a20200717 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(new Integer(5));//�⺻ ���� 5�� ��üȭ���Ѽ� ���Ϳ� ����
		v.add(5);
		v.add(10);//�ڵ��ڽ�
		v.add(0,20); //�ε��� 0�� 20�� �ְڴ�~
		System.out.println(v.size());
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);//���Ϳ��� ������
			System.out.println(n);
		}
	}
}

class Xy{
	private int x,y;
	Xy(int x, int y){
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return  x+ "  " +y;
	}
}
public class a20200717 {
	public static void main(String[] args) {
		Vector<Xy> v = new Vector<Xy>();
		v.add(new Xy(1,2));
		v.add(new Xy(2,3));
		v.add(new Xy(4,5));
		v.remove(2);//�ε��� ��
		for(int i=0; i<v.size(); i++) {
			Xy x = v.get(i);
			System.out.println(x);
		
		
		}
	}
}


public class a20200717 {
	public static void main(String[] args) {

		Vector<Integer> a = new Vector<Integer>();
		Scanner n = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {

			int cc = n.nextInt();
			a.add(cc);
		}
		int min=0;
		for(int i =0; i<5; i++) {
			if(min>a.get(i)) {
				min = a.get(i);
			}
		}
			
		System.out.println(min);

	}
}

public class a20200717 {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		Scanner n = new Scanner(System.in);
		for(int i = 0; i<5; i++) {
			al.add(n.next());
			switch(al.get(i)) {
			case "a":
				System.out.println("good");
				break;
			case "b":
				System.out.println("not bad");
				break;
			case "c":
				System.out.println("bad");
			}
		}
		
		
	}
}

public class a20200717 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(2);
		v.add(3);
		v.add(4);
		int sum = 0;
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();// ���������͸� n�� ����
			sum+=n;
		}
		System.out.println(sum);
		
	}
}
public class a20200717 {
	public static void main(String[] args) {
		HashMap<String, String> h = new HashMap<String,String>();
		h.put("��", "water");
		h.put("Ŀ��", "coffe");
		h.put("��", "tea");
		//Ű���� �ߺ� �Ұ�|| ���� �ߺ�����
		Set<String> keys = h.keySet();
		//��� Ű�� set�÷������� �ްڴ�.
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String a=it.next(); //Ű
			String b=h.get(a);	//Ű�� �´� ��
			System.out.println(a+ " "+ b);
		}
	}
}

public class a20200717 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		hm.put("vvv", 123);
		hm.put("qqq", 456);	
		System.out.println(hm.get("vvv")+" " +hm.get("qqq"));
		
	}
}
public class a20200717 {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put("jun", "123");
		h.put("jihye", "234");
		h.put("sangwoon", "345");

		Scanner n = new Scanner(System.in);
		while (true) {
			System.out.println("���̵� ����Է�");
			String id = n.next();
			String pw = n.next();

			if (!h.containsKey(id)) {
				System.out.println("���� ���̵�");
				continue;// id �ٽ� �Է���
			} else {// ���̵� �������
				if (!h.get(id).equals(pw)) {
					System.out.println("���Ʋ��");
				} else {
					System.out.println("�α��οϷ�");
				}
			}
			break;
		}
	}
}

public class a20200717 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a", 123);
		hm.put("b", 456);
		Scanner n = new Scanner(System.in);
		while (true) {
			System.out.println("�Է�");
			String a = n.next();
			if (a.equals("a")) {
				System.out.println(hm.get("a"));
			} else if (a.equals("b")) {
				System.out.println(hm.get("b"));
			} else {
				System.out.println("�߸��Է��߳׿�");
			}
		}
	}

}

public class a20200717 {
	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			String name = s.next();
			int age = s.nextInt();
			h.put(name, age);
		}
		Set<String> key = h.keySet();
		Iterator<String> it = key.iterator();

		int max = 0;
		String str = "";//
		while (it.hasNext()) {
			String name = it.next();
			int age = h.get(name);
			if (max < age) {
				max = age;
				str = name;
			}
		}
		System.out.println(str + " " + max);
		// ���� ���̰� ���� ����� �̸� ���
	}
}*/
class Stu{
	String n;
	int y;
	Stu(String n,int y){
		this.n=n;
		this.y=y;
		
	}
}
public class a20200717 {
	public static void main(String[] args) {
		Set<Stu> s = new HashSet<Stu>();
		s.add(new Stu("����",24));
		s.add(new Stu("����",22));
		s.add(new Stu("����",22));
		
		System.out.println(s.size());
	}
}