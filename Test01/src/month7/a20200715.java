package month7;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
public class a20200715 extends JFrame {
		a20200715(){
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			JLabel j = new JLabel("안녕하세요");
					
			ImageIcon i = new ImageIcon("C://Users//soldesk//Desktop"+
			"그림.jpg");
			JLabel j1 = new JLabel(i);
			JLabel j2 = new JLabel("수요일이네요",SwingConstants.CENTER);
			c.add(j);
			c.add(j1);
			c.add(j2);
			setVisible(true);
		}
	public static void main(String[] args) {
		new a20200715();

	}

}
class Mouse implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton btn1=(JButton)e.getSource();
		btn1.setBackground(Color.red);
	}
}
public class a20200715 extends JFrame {
	a20200715() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn1 = new JButton("버튼 1");
		btn1.addActionListener(new Mouse());
		/*btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btn1.setBackground(Color.red);
				
			}
		});*/
/*btn1.addMouseListener(new MouseAdapter() {
	public void mouseClicked(MouseEvent e) {
		btn1.setBackground(Color.red);
	}
});

c.add(btn1);
setSize(500,500);
setVisible(true);
}		
public static void main(String[] args) {
new a20200715();

}

}

public class a20200715 extends JFrame {
JCheckBox cafe [] = new JCheckBox[3];
//객체배열
String menu [] = {"라떼","딸기스무디","아메라키노"};
JLabel total;
//총합
a20200715() {
Container c = getContentPane();
c.setLayout(new FlowLayout());

Check ch = new Check();
for(int i =0; i<cafe.length; i++) {
	cafe[i] = new JCheckBox(menu[i]);
	c.add(cafe[i]);
	cafe[i].addItemListener(ch);
}
total = new JLabel();
c.add(total);
setSize(500,500);
setVisible(true);
}	
class Check implements ItemListener{
int sum=0;
public void itemStateChanged(ItemEvent e) {
	if(e.getStateChange()==ItemEvent.SELECTED) {
		if(e.getItem()==cafe[0]) {
			sum+=5000;
		}
		else if(e.getItem()==cafe[1]) {
			sum+=4000;
		}
		else
			sum+=4500;
	}
	total.setText("현재"+sum+"원");
	
}

}
public static void main(String[] args) {
new a20200715();

}

}
public class a20200715 extends JFrame  {
a20200715(){
Container c = getContentPane();
c.setLayout(new FlowLayout());
JButton btn1 = new JButton("ok");
JButton btn2 = new JButton("cancel");
JButton btn3 = new JButton("get");
JTextField txtX = new JTextField(10);
JTextField txtY = new JTextField(10);
c.setBackground(Color.blue);
btn1.addMouseListener(new MouseListener() {
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		c.setBackground(Color.orange);
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
});

btn2.addMouseListener(new MouseListener() {
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		btn2.setEnabled(false);
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
});

btn3.addMouseListener(new MouseListener() {
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		txtX.setText(Integer.toString(e.getX()));
		txtY.setText(Integer.toString(e.getY()));
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
});

c.add(btn1);
c.add(btn2);
c.add(btn3);
c.add(txtX);
c.add(txtY);
setSize(500,500);
setVisible(true);
}

public static void main(String[] args) {

new a20200715();
}

}
public class a20200715 {

	public static void main(String[] args) {
		boolean b = false;
		String s = Boolean.toString(b);
		
		String a="36.5";
		double c = Double.parseDouble(a);
		
		String s1 = "35";
		int i = Integer.parseInt(s1);
	}

}
class Person{
	String a,b;
	int c,d;
	Person(String a, String b, int c, int d){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	String show2() {
		return a+b;
	}
	int show() {
		return c+d;
	}
}
public class a20200715 {

	public static void main(String[] args) throws IOException {
		Person p=new Person("Jack", "computer", 20, 123);

		   //데이터 다 출력하는 함수
		
		FileWriter a = new  FileWriter("pp.txt");
		BufferedWriter out = new BufferedWriter(a);
		out.write(p.show()+p.show2());
		out.close();
	}

}
class Circle{

    private double x,y;

    private int r;

    Circle(double x, double y, int r){

           this.x=x;  this.y=y; this.r=r; }

    void show(){

      System.out.println(x + " " +y + " " +r);}}
public class a20200715 {

	public static void main(String[] args) throws IOException {
		Circle c = new Circle(1.0,1.0,4);
		Circle c2 = new Circle(2.5,3.5,6);
		c.show();
		c2.show();
	}

}
interface Person {

	String work();
}
class Worker implements Person{
	Person p;
	public String work() {
		return "일한다";
		
	}
}
class Student implements Person{
	Person p;
	public String work() {
		return "공부한다";
	}
}

public class a20200715 {
	static void pr(Person p) {

		System.out.println(p.work());
	}

	public static void main(String[] args) {
		pr(new Worker()); 

		pr(new Student());
	}

}
abstract class Ab{
	int sum=0;
	abstract int total(int a[]) ;
	
}
class Cd extends Ab{
	int total (int a[]) {
		for(int i=1; i<=5;i++) {
			sum+=i;
		}
		return sum;
	}
}
public class a20200715 {

	public static void main(String[] args) {
		Ab c = new Cd();

		System.out.println(c.total(new int[] { 1, 2, 3, 4, 5 }));
	}

}

public class a20200715 {

	public static void main(String[] args) {
		String p = "1+2+3";
		StringTokenizer s = new StringTokenizer(p,"+");
		
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
	}


	
	
	

public class a20200715 extends JFrame{
	a20200715(){
		Container c= getContentPane();
		JRadioButton j1 = new JRadioButton("짜장면");
		JRadioButton j2 = new JRadioButton("짬뽕");
		this.add(j1);
		this.add(j2);
		j1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("짜장면");
				
			}
		});
		j2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				c.setBackground(Color.blue);
				
			}
		});
		ButtonGroup b1 = new ButtonGroup();
		
		this.setLayout(new FlowLayout());
		setVisible(true);
	}
	public static void main(String[] args) {
		new a20200715();
		
	}
}

public class a20200715 extends JFrame{
	 JRadioButton j1=new JRadioButton("짜장면");
	 JRadioButton j2=new JRadioButton("탕수육");

	 a20200715(){
	  
	  Container c=getContentPane();
	  
	  c.add(j1);
	  c.add(j2);
	  c.setLayout(new FlowLayout());
	  
	  ButtonGroup b1=new ButtonGroup();
	  b1.add(j1);
	  b1.add(j2);
	  
	  A a =new A();
	  j1.addItemListener(a);
	  j2.addItemListener(a);
	 
	  setVisible(true);
	 }
	 class A implements ItemListener{
	  public void itemStateChanged(ItemEvent e) {
	   if(e.getStateChange()!=ItemEvent.SELECTED) {
	    return;//선택되지않앗으면 그대로 두고
	   }
	   if(e.getItem()==j1) {
	    System.out.println("짜장면");
	   }//선택이 버튼j1이라면 짜장면출력
	   else if(e.getItem()==j2) {
	    getContentPane().setBackground(Color.pink);
	   }//선택이 j2이라면 백그라운드색을 핑크로 변경
	 }
	 }
	 public static void main(String[] args) { 
	  new a20200715();
	  
	 }
	}

class Check implements ItemListener {
	JRadioButton j1;
	JRadioButton j2;
	JRadioButton j3;

	Check(JRadioButton j1, JRadioButton j2, JRadioButton j3) {
		this.j1 = j1;
		this.j2 = j2;
		this.j3 = j3;
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			// 체크박스 선택 햇을때 라디오버튼을 활성화
			j1.setEnabled(true);
			j2.setEnabled(true);
			j3.setEnabled(true);
		} else { // 체크박스 선택 안했을 시
			j1.setEnabled(false);
			j2.setEnabled(false);
			j3.setEnabled(false);
		}
	}

}

public class a20200715 {
	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setLayout(new GridLayout(0, 1));
		JCheckBox j = new JCheckBox("공부 선택");

		JRadioButton b1 = new JRadioButton("Java");
		JRadioButton b2 = new JRadioButton("Python");
		JRadioButton b3 = new JRadioButton("C#");

		ButtonGroup g1 = new ButtonGroup();
		g1.add(b1);
		g1.add(b2);
		g1.add(b3);
		// 체크박스 선택시
		j.addItemListener(new Check(b1, b2, b3));
		f.add(j);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		// 라디오버튼 비활성화
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);

		// 라디오버튼 이벤트 처리
		b1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("자바!!");
				}
			}
		});
		b2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("파이썬!!");
				}
			}
		});
		b3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("C#!!");
				}
			}
		});
		f.setVisible(true);
	}
}

class Text implements ActionListener {
	JTextField id;
	JPasswordField pw;

	Text(JTextField id, JPasswordField pw) {
		this.id = id;
		this.pw = pw;
	}

	public void actionPerformed(ActionEvent e) {// 이거 외워야됨;; 노답
		System.out.println("아이디:" + id.getText());
		System.out.println("비밀번호:" + new String(pw.getPassword()));
	}
}

public class a20200715 {

	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setLayout(new GridLayout(2, 2));

		JLabel j1 = new JLabel("ID:", SwingConstants.LEFT);
		JTextField j2 = new JTextField(10);
		JLabel j3 = new JLabel("PW :", SwingConstants.LEFT);
		JPasswordField j4 = new JPasswordField(10);
		j4.setEchoChar('*');// 비밀번호 ***로가능하게함
		j4.addActionListener(new Text(j2,j4));
		j.add(j1);
		j.add(j2);
		j.add(j3);
		j.add(j4);
		j.setVisible(true);
	}
}

public class a20200715 extends JFrame{
	a20200715(){
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,5));
		JCheckBox jb[] = new JCheckBox[15];
		for(int i = 0 ; i<15; i++) {
			jb[i] = new JCheckBox("체크박스"+(i+1));
			c.add(jb[i]);
		}
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
	
	new a20200715();
	
	}
}
		
public class a20200715 extends JFrame{
	JTextField j = new JTextField(20);
	JTextArea j1 =new JTextArea(10,20);
	a20200715(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel j2 = new JLabel("엔터키 입력");
		c.add(j);
		c.add(j1);
		c.add(j2);
		c.add(new JScrollPane(j1));
		//textarea에 스크롤팬 삽입
		j.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField jt = (JTextField)e.getSource();
				j1.append(j.getText());
				jt.setText("");
			}
		});
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
	
	new a20200715();
	
	}
}
public class a20200715 extends JFrame{
	
	a20200715(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JCheckBox cb1 = new JCheckBox("비활성화");
		JCheckBox cb2 = new JCheckBox("감추기");
		JButton b1 = new JButton("일반버튼");
		cb1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
					b1.setEnabled(false);
				else
					b1.setEnabled(true);
			}
		});
				
		
		cb2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange()==ItemEvent.SELECTED)
					b1.setVisible(false);
					else
					b1.setVisible(true);
				
			}
		});
		c.add(cb1);
		c.add(cb2);
		c.add(b1);
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
	
	new a20200715();
	
	}
}

enum Day{
	Mon,Tue,Wen;
}
enum Month{
	Jun,July,Aug;
}
public class a20200715 {
	static void pr(Month m) {
		switch(m) {
		case Jun:
			System.out.println("6월");
		}
	}
	public static void main(String[] args) {
		
		pr(Month.Jun);//?
		Month m = Month.Aug;
		

	}
}


enum Price{
	COM(200),IPAD(100);
	//int com=200;
	int i;
	Price(int i){
		this.i=i;
	}
	int get() {
		return i;
	}
}

public class a20200715 {
	
	public static void main(String[] args) {
		
				System.out.println(Price.COM.get());

	}
}*/

public class a20200715 {

	public static void main(String[] args) {
		
	}
}