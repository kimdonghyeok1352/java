import java.util.Scanner;
import java.util.InputMismatchException;
class Food{
	String menu;
	int price;
	Food(String menu){
		this.menu=menu;
		price = 10000;
	}
	public String toString() {
		return menu;
	}
}
public class A01 {

	public static void main(String[] args) {
			Food f = new Food("짜장면");
			System.out.println(f+" "+f.price+"원");
	}
}