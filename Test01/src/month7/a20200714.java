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
import java.awt.event.MouseMotionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*class a20200714 extends JFrame {
	a20200714() {
		super("JFrame");
		Container c = getContentPane();
		JButton j1 =new JButton("j1");
		JButton j2 =new JButton("j2");
		c.setLayout(new FlowLayout());
		//버튼에 대한 이벤트 처리 인터페이스
		j1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			System.out.println("버튼 1");
		
			}});
		j2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			j2.setBackground(Color.green);
			}});
		
		c.add(j1);
		c.add(j2);
		setVisible(true);
	
	}

	public static void main(String[] args) {
		new a20200714();
	}
}
class Mouse implements MouseListener {
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭!!");
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스 떼기");
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}
}

public class a20200714 {
	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		// Mouse m = new Mouse();

		MouseListener m = new Mouse();// up
		JButton j1 = new JButton("one");
		JButton j2 = new JButton("two");

		j1.addMouseListener(m);
		j2.addMouseListener(m);

		f.add(j1);
		f.add(j2);
		f.setVisible(true);

	}
}
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

class Mouse extends MouseAdapter {
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭");
	}
}

public class a20200714 {
	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());

		JButton j1 = new JButton("one");
		JButton j2 = new JButton("two");
		j1.addMouseListener(new Mouse());
		j2.addMouseListener(new Mouse());
		f.add(j1);
		f.add(j2);
		f.setVisible(true);
	}
}
class Mouse implements MouseMotionListener{
	//마우스 움직임
	public void mouseDragged(MouseEvent e) {
		System.out.println(e.getX() + " "+ e.getY());
	}
	public void mouseMoved(MouseEvent e) {
		System.out.println(e.getX() + " "+ e.getY());
	}
}

public class a20200714 {
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());

		JButton j1 = new JButton("one");
		JButton j2 = new JButton("two");
		j1.addMouseMotionListener(new Mouse());
		j2.addMouseMotionListener(new Mouse());
		f.add(j1);
		f.add(j2);
		f.setVisible(true);
	}
}
	

public class a20200714 extends JFrame {
	a20200714(){
		JButton b1 = new JButton("자바는");
		Container c = getContentPane();
		this.setLayout(new FlowLayout());
		JTextField txtX = new JTextField(10);
		JTextField txtY = new JTextField(10);
		c.add(txtX);
		c.add(txtY);
		
		b1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				b1.setText("자바는");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				b1.setText("재밌어");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
				
			});
		

	c.add(b1);

	setVisible(true);
	}

	public static void main(String[] args) {
		new a20200714();
	}
}
class a20200714 extends JFrame {
	a20200714(){
		this.setLayout(new FlowLayout());
		JCheckBox chk1 = new JCheckBox("C++");
		JCheckBox chk2 = new JCheckBox("Java");
		JCheckBox chk3 = new JCheckBox("C#",true);
		this.add(chk1);
		this.add(chk2);
		this.add(chk3);
		setVisible(true);
	}
	public static void main(String[] args) {
		new a20200714();
	}

}
class a20200714 extends JFrame {
	a20200714(){
		this.setLayout(new FlowLayout());
		JRadioButton rd1 = new JRadioButton("C++");
		JRadioButton rd2 = new JRadioButton("Java");
		JRadioButton rd3 = new JRadioButton("C#",true);
		this.add(rd1);
		this.add(rd2);
		this.add(rd3);
		
		ButtonGroup gg = new ButtonGroup();
		gg.add(rd1);
		gg.add(rd2);
		gg.add(rd3);
		setVisible(true);
	}
	public static void main(String[] args) {
		new a20200714();
	}

}
class a20200714 extends JFrame {
	a20200714(){
		JCheckBox j = new JCheckBox("자바");
		this.setLayout(new FlowLayout());
		j.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					System.out.println("자바 재밌다");
				}
			}
		});
		this.add(j);
		setVisible(true);
	}
	public static void main(String[] args) {
		new a20200714();
	}

}
class a20200714 extends JFrame {
	a20200714(){
		JMenuBar j = new JMenuBar();
		JMenu j1 = new JMenu("File");
		JMenu j2 = new JMenu("Edit");
		JMenu j3 = new JMenu("치킨");
		
		JMenuItem j4 = new JMenuItem("New");
		JMenuItem j5 = new JMenuItem("Undo Typing");
		
		setJMenuBar(j);//메뉴바 세팅
		j.add(j1);
		j.add(j2);
		j.add(j3);
		
		j1.add(j4);
		j2.add(j);
		
		setVisible(true);
		
		
		
		
	}
	public static void main(String[] args) {
		new a20200714();
	}

}*/
class a20200714 extends JFrame {
	a20200714(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton b1 = new JButton("one");
		JButton b2 = new JButton("two");
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				b1.setBackground(Color.green);
				
			}	
		});
		b2.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				b2.setText("치킨");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("나무");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				b2.setText("바다");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				b2.setText("하늘");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		
		});
		c.add(b1);
		c.add(b2);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new a20200714();
	}

}