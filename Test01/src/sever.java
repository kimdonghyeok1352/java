import java.awt.Container;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;

public class sever  {
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
        f.setSize(20,20);     
        f.setLayout( null );

        class key implements KeyListener{
            
            public void keyPressed(KeyEvent e) {

                Point p = f.getLocation();
                
                if( e.getKeyCode() == 37 ) f.setLocation( p.x-20, p.y);
                if( e.getKeyCode() == 38 ) f.setLocation( p.x, p.y-20);
                if( e.getKeyCode() == 39 ) f.setLocation( p.x+20, p.y);
                if( e.getKeyCode() == 40 ) f.setLocation( p.x, p.y+20);             
            }

            public void keyReleased(KeyEvent e){ }          
            public void keyTyped(KeyEvent e) { }            
                        
        }       
        
        f.setVisible(true);
        f.addKeyListener(new key());
        f.setFocusable(true);
        
    }       
}
