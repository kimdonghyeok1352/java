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
			setTitle("����");
			
			Container c = this.getContentPane();
			c.setBackground(Color.blue);
			this.setLayout(new FlowLayout());
			
			JButton btn1 = new JButton("��ư1");
			btn1.setBackground(Color.GREEN);
			this.add(btn1);
			JButton btn2 = new JButton("��ư2");
			btn2.setToolTipText("�̹�ư�� ũ�Ժ�����");
			this.add(btn2);
			setSize(250,250);
			setVisible(true);
	}
}
	public static void main(String[] args) {
		new My();

	}

}
