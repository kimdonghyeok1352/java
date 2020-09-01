import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class dddass {

	public static void main(String[] args) throws IOException {
		/*
		BufferedWriter bf = new BufferedWriter(new FileWriter("data.txt"));
		bf.write("10");
		bf.newLine();
		bf.write("-5");
		bf.newLine();
		bf.write("1");
		bf.close();
		}
		*/
		BufferedReader br = new BufferedReader(new FileReader("data.txt"));
		String str;
		int sum=0;
		while((str = br.readLine())!=null) {
			sum += Integer.parseInt(str);
			
		}
		System.out.println(sum);
		
	
br.close();	}

}
