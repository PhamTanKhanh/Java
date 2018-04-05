
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ligent
 */
public class swhello extends JFrame{

    /**
     * @param args the command line arguments
     */
    public swhello()          
    {
        // TODO code application logic here
        setTitle("hello");
        setSize(400, 200);
        setLayout(new FlowLayout());
        //
        Container cp = getContentPane();
        //
        JLabel lbHello = new JLabel("something here");
        cp.add(lbHello);
        setVisible(true);
    }
    public static void main(String[] args) {
        new swhello();
    }
    
}
