import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A03 {
	static class My extends JFrame{
		My(){
			setTitle("연습");
			
			Container c = this.getContentPane();
			c.setBackground(Color.blue);
			this.setLayout(new FlowLayout());
			
			JButton btn1 = new JButton("버튼1");
			btn1.setBackground(Color.GREEN);
			this.add(btn1);
			JButton btn2 = new JButton("버튼2");
			btn2.setToolTipText("이버튼은 크게보여요");
			this.add(btn2);
			setSize(250,250);
			setVisible(true);
	}
}
	public static void main(String[] args) {
		new My();

	}

}
