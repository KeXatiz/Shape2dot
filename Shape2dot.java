
package Shape2dot;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Shape2dot extends JFrame implements ActionListener, MouseMotionListener {
    JPanel top = new JPanel();
    JPanel shape = new JPanel();
    JPanel choice = new JPanel();
    
    Shape2dot(){
        super("2D shape");
        
        this.add(shape,BorderLayout.CENTER);
        
        /* Properties of the frame */
        setSize(1030, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);        
    }
    
    public static void main(String[] a){
        new Shape2dot();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
