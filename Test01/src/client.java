import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class client {

	public static void main(String[] args) {
		Socket s =null;
		try {
			s=new Socket();
			System.out.println("�����û");
			s.connect(new InetSocketAddress("localhost",5001));
			System.out.println("���Ἲ��");
			byte b[]  = null;
			String msg =null;
			
			OutputStream os = s.getOutputStream();
			msg ="Hi Server";
			b=msg.getBytes("UTF-8");
			//���ڿ��� ����Ʈ�� �����ؼ� �����ϰڴ�.
			os.write(b);
			System.out.println("�����ͺ����⼺��");
			os.close();
			
		}catch(Exception e) {};

	}

}
