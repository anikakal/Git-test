package test1;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class frame {
   public static void createGUI(){
	   JFrame.setDefaultLookAndFeelDecorated(true);
	   JFrame frame = new JFrame ("Name");
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	   JLabel label = new JLabel ("Íållo!");
	   frame.getContentPane().add(label);
	   
	   frame.setPreferredSize(new Dimension(300, 300));
	   
	   frame.pack();
	   frame.setVisible(true);
	   
  }
   
   public static void main(String[] args) {
       javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                 createGUI();
                 
           }
        });
     }
  }
