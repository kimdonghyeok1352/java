import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ������2 {
	public static void main(String[] args) {
		Map<Integer, Double> m = new HashMap<Integer, Double>();
		m.put(3, 3.5);
		m.put(3, 5.5);
		m.put(4, 6.5);
		Set<Map.Entry<Integer, Double>> s = m.entrySet();
		for (Map.Entry<Integer, Double> m1 : s) {// for-each����
			System.out.println(m1.getValue());
			System.out.println(m1.getKey());
		}
	}
}
