import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class homework extends JFrame {

	

	homework() {

		

		Container c = getContentPane();

		c.setLayout(new FlowLayout());

		

		JLabel jl2 = new JLabel("��Ȱ��");

		JLabel jl3 = new JLabel("�����");

		JLabel jl4 = new JLabel("����");

		JLabel jl5 = new JLabel("����");

		

		JButton jb1 = new JButton("�Է�");

		JButton jb2 = new JButton("�Է¿Ϸ�");

 

		JTextField jf2 = new JTextField(10);

		JTextField jf3 = new JTextField(10);

		JTextField jf4 = new JTextField(10);

		JTextField jf5 = new JTextField(10);

		JTextArea ja1 = new JTextArea(50, 50);

		String s[] = { "1��","2��","3��","4��","5��","6��","7��","8��","9��","10��", "11��", "12��" };

		JComboBox combo = new JComboBox(s);

		jb1.addActionListener(new ActionListener() {

 

			@Override

			public void actionPerformed(ActionEvent e) {

				int sum = Integer.valueOf(jf2.getText()) + Integer.valueOf(jf3.getText())

						+ Integer.valueOf(jf4.getText());

				jf5.setText(Integer.toString(sum));

			}

		});

		jb2.addActionListener(new ActionListener() {

 

			@Override

			public void actionPerformed(ActionEvent e) {

 

				String str = jf5.getText();

				ja1.setText(ja1.getText() + str + '\n');

				jf2.setText("");

				jf3.setText("");

				jf4.setText("");

				jf5.setText("");

			}

		});

		

		

		c.add(jb1);

		c.add(jb2);

		c.add(combo);

 

		c.add(jl2);

		c.add(jf2);

		c.add(jl3);

		c.add(jf3);

		c.add(jl4);

		c.add(jf4);

		c.add(jl5);

		c.add(jf5);

		c.add(ja1);

		

 

		setSize(600, 600);

		setVisible(true);

	}

 

	public static void main(String[] args) {

		new homework();

	}

 

}