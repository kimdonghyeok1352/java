
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

abstract class Profile{
	abstract void add(String name,String id) ;
	abstract String check(String id);
	
}
class Person{
	String name,id;
	Person(String n,String i){
		name = n; id =i;
	}
	String getname() {
		return name;
	}
	String getid() {
		return id;
	}
}
class Per extends Profile{
	Person ary[];//°´Ã¼ ¹è¿­ ¼±¾ð
	int n;
	
	Per(int n){
		ary = new Person[n];
		n=0;
	}
	public void add(String name,String id) {
		ary[n] = new Person(name,id);
		n++;
	}
	public String check(String id) {
		for(int i = 0; i<n; i++) {
			if(id.compareTo(ary[i].getid())==0) {
				return ary[i].getname();
			}
		}
		return null;
	}
}
public class A02 {

	public static void main(String[] args) {
		Profile p = new Per(5);
		p.add("½ÂÃ¶", "123");
		p.add("µÎÈñ", "345");
		p.add("ÁÖÈñ", "344");
		
		System.out.println(p.check("123"));
	}
}