import java.awt.Container;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.StringTokenizer;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ������  {
	
	public static void main(String[] args) {
		 int intData = 512;
		 
		    // ������� ���
		    Integer integerData = (Integer)intData;
		    System.out.println(integerData);
		    //�ڽ̰� ����ȯ ������?
		    // ������� ����
		    int sum = (int)integerData + 100;
		    System.out.println(sum);

		    Integer a = new Integer(intData);
		    System.out.println(a);
		    

	}

}