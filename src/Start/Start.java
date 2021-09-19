package Start;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import detail_project.Detail_project;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author Shiran
 */
public class Start extends JFrame {

    JProgressBar jb;
    int i = 0, num = 0;

    Start() {
        setLayout(null);
        setResizable(false);
        
        Font load = new Font("Digital-7", Font.PLAIN, 26);

        //-----------JProgress Bar----------------------------------------------------
        jb = new JProgressBar(0, 2000);
        jb.setBounds(133, 582, 888, 30);
        jb.setValue(0);
        jb.setForeground(new Color(0, 255, 204));
        jb.setBackground(new Color(153, 255, 255));
        jb.setStringPainted(true);
        jb.setFont(load );
        add(jb);

        //------------------------------------------------------------------------------
        
        JLabel loading = new JLabel("Loading...");
        loading.setBounds(133,551,201,25);
         loading.setForeground(new Color(255, 0, 51));
         loading.setFont(load );
         add(loading);
        
        
        
        //-------------------------------------------------------------------------------
        //---------------------------------------------------------------
//         JLabel label1 = new JLabel("J-School Pro V  0.1");
//        label1.setBounds(34, 270, 243, 30);
//        label1.setForeground(new Color(0, 255, 248));
//        label1.setBackground(new Color(123, 62, 46, 255));
//         Font label1_font = new Font("Digital-7", Font.PLAIN, 24);
//        label1.setFont(label1_font);
//     //   label1.setCursor(Cur);
//        add(label1);
//
//        JLabel label2 = new JLabel("Shiran Kumarasingha");
//        label2.setBounds(34, 285, 380, 64);
//        label2.setForeground(new Color(0, 255, 248));
//        label2.setBackground(new Color(123, 62, 46, 255));
//        Font label2_font = new Font("Digital-7", Font.PLAIN, 24);
//        label2.setFont(label2_font);
//    //    label2.setCursor(Cur);
//        add(label2);
//        
//        JLabel label3 = new JLabel("Cadenza");
//        label3.setBounds(34, 300, 280, 64);
//        label3.setForeground(new Color(0, 255, 248));
//        label3.setBackground(new Color(123, 62, 46, 255));
//        Font label3_font = new Font("Digital-7", Font.PLAIN, 24);
//        label3.setFont(label3_font);
//   //     label3.setCursor(Cur);
//        add(label3);
////        
//        JLabel label4 = new JLabel("Cadenza");
//        label4.setBounds(505, 383, 280, 64);
//        label4.setForeground(new Color(0, 255, 248));
//        label4.setBackground(new Color(123, 62, 46, 255));
//        label4.setFont(search_font);
//        label4.setCursor(Cur);
//        add(label4);
//        JLabel label5 = new JLabel("groupofcadenzadetail@gmail.com");
//        label5.setBounds(34, 315, 280, 64);
//        label5.setForeground(new Color(0, 255, 248));
//        label5.setBackground(new Color(123, 62, 46, 255));
//       Font label5_font = new Font("Digital-7", Font.PLAIN, 19);
//        label5.setFont(label5_font);
//      //  label5.setCursor(Cur);
//        add(label5);
//        //------------------------------------------------------------------
//        
        //--------------------------------------------------------------------------------
        JLabel pic = new JLabel();
        pic.setIcon(new ImageIcon(getClass().getResource("load.png")));
        pic.setBounds(0, 0, 1154, 702);
        add(pic);

        setSize(1154, 701);
        setTitle("Cadenza Pro v 1.0 By Shiran");
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void iterate() {
        while (i <= 2000) {
            jb.setValue(i);
            i = i + 60;
            try {
                Thread.sleep(150);
            } catch (Exception e) {
            }
        }
        
         Detail_project ob = new Detail_project ();
        dispose();
         
    }

    public static void main(String[] args) {
        Start obj = new Start();
        obj.iterate();

    }
}
