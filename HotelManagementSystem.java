
package hotel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public HotelManagementSystem() {
		
                //setSize(1366,430);         
                setLayout(null);
                //setLocation(100,100);
                setBounds(20, 150, 1250, 565);

		l1 = new JLabel("");
                b1 = new JButton("Next");
                
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
				
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/3.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1250, 565,Image.SCALE_SMOOTH);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                JLabel lid=new JLabel("HOTEL MANAGEMENT SYSTEM");
                lid.setBounds(250,30,1500,100);
                lid.setFont(new Font("serif",Font.PLAIN,50));
                lid.setForeground(Color.red);
                l1.add(lid);
                
                b1.setBounds(1050,452,150,50);
		l1.setBounds(0, 0, 1250, 565);
                
                l1.add(b1);
		add(l1);
 
                b1.addActionListener(this);
                setVisible(true);
                
                
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                HotelManagementSystem window = new HotelManagementSystem();
                window.setVisible(true);			
	}
}