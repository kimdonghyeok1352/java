import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class client {

	public static void main(String[] args) {
		Socket s =null;
		try {
			s=new Socket();
			System.out.println("연결요청");
			s.connect(new InetSocketAddress("localhost",5001));
			System.out.println("연결성공");
			byte b[]  = null;
			String msg =null;
			
			OutputStream os = s.getOutputStream();
			msg ="Hi Server";
			b=msg.getBytes("UTF-8");
			//문자열을 바이트로 변경해서 전송하겠다.
			os.write(b);
			System.out.println("데이터보내기성공");
			os.close();
			
		}catch(Exception e) {};

	}

}
