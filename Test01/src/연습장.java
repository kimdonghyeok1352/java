import java.awt.Container;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ������ extends JFrame {
	JTextField j = new JTextField(20);
	JTextArea j1 = new JTextArea(10, 20);

	������() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel j2 = new JLabel("����Ű �Է�");
		c.add(j);
		c.add(j1);
		c.add(j2);
		c.add(new JScrollPane(j1));
		// textarea�� ��ũ���� ����
		j.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField jt = (JTextField) e.getSource();
				j1.append(j.getText());
				j.setText("");
			}
		});
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {

		new ������();

	}
}