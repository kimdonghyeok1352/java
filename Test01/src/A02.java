
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
class Aa implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		if(b.getText().equals("Java")) {
			b.setText("자바");
		}
		//이벤트가 어디에서 발생했는지 알아낸다
		//getSource메소는 Object 클래스객체이므로
		//다운캐스팅 해서 알아낸다.
	}
}
class A02 extends JFrame {
	A02() {
		//
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton j1 = new JButton("Java");
		j1.addActionListener(new Aa());
		
		c.add(j1);
		setVisible(true);

	
	}
	public static void main(String[] args) {
		new A02();
	}
}