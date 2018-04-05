
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ligent
 */
public class tinhtong {

    /**
     * @param args the command line arguments
     */
    
    public tinhtong()
    {
        Frame f = new Frame();
        f.setTitle("Tonh tong 2 so");
        f.setSize(400,200);
        FlowLayout lay = new FlowLayout();
        f.setLayout(lay);
        
        Label lblA = new Label("A=");
        f.add(lblA); //gan vao Frame
        TextField txtA = new TextField(20);
        f.add(txtA);
        
        Label lblB = new Label("B=");
        f.add(lblB); //gan vao Frame
        TextField txtB = new TextField(20);
        f.add(txtB);
        
        Button btnTinhTong = new Button("Tinh");
        btnTinhTong.addActionListener(new LangNgheCong());
        f.add(btnTinhTong);
        
        
        Label lblTong = new Label("Tong=");
        f.add(lblTong);
        TextField txtTong = new TextField(20);
        f.add(txtTong);
        
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new tinhtong();
        
    }
    //bo lang nghe
    class LangNgheCong implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            //lay a
            int a = Integer.parseInt(txtA.getText());
            //lay b
            int b = Integer.parseInt(txtB.getText());
            //tinh tong
            int Tong=a+b;
            //xuat
            txtTong.setText(String.valueOf(Tong));
            
        }
    
        
    }
    Label lblA, lblB, lblTong;
    TextField txtA,txtB,txtTong;
    Button btnTong;
    
}




















