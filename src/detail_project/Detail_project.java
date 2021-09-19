/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detail_project;

import Base.Base;
import Start.Start;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Thread.sleep;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Detail_project extends JFrame {

    //  JLabel time_label;
    public Detail_project() {

        //getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        //setBackground(new Color(10, 50, 40, 140));
        setLayout(null);
        setResizable(false);
        Cursor Cur = new Cursor(Cursor.HAND_CURSOR);

        Font clock_font = new Font("Digital-7", Font.PLAIN, 65);
        Font day_font = new Font("Digital-7", Font.BOLD, 27);
        Font date_font = new Font("Digital-7", Font.BOLD, 27);
        Font search_font = new Font("Digital-7", Font.PLAIN, 52);
        Font login_font = new Font("Digital-7", Font.PLAIN, 39);

        JLabel time_label = new JLabel("");
        time_label.setBounds(786, 62, 350, 64);
        time_label.setForeground(new Color(0, 255, 248));
        time_label.setBackground(new Color(123, 62, 46, 255));
        time_label.setFont(clock_font);
        // play.setCursor(Cur);
        add(time_label);

        JLabel day_label = new JLabel("");
        day_label.setBounds(786, 110, 280, 64);
        day_label.setForeground(new Color(0, 255, 248));
        day_label.setBackground(new Color(123, 62, 46, 255));
        day_label.setFont(day_font);
        // play.setCursor(Cur);
        add(day_label);

        JLabel date_label = new JLabel("122424");
        date_label.setBounds(930, 110, 280, 64);
        date_label.setForeground(new Color(0, 255, 248));
        date_label.setBackground(new Color(123, 62, 46, 255));
        date_label.setFont(date_font);
        // play.setCursor(Cur);
        add(date_label);

        //Login Part-----------------------------------------------------------------------
        JLabel login_label = new JLabel("Login");
        login_label.setBounds(147, 34, 280, 64);
        login_label.setForeground(new Color(204, 0, 0));
        login_label.setBackground(new Color(123, 62, 46, 255));
        login_label.setFont(login_font);
        //login_label.setCursor(Cur);
        add(login_label);

        JLabel enterpw_label = new JLabel("Enter your Password");
        enterpw_label.setBounds(59, 93, 289, 34);
        enterpw_label.setForeground(new Color(0, 255, 248));
        enterpw_label.setBackground(new Color(123, 62, 46, 255));
        enterpw_label.setFont(date_font);
        // play.setCursor(Cur);
        add(enterpw_label);

        //boder color and with set code
        Border border = BorderFactory.createLineBorder(Color.CYAN, 2);

        JTextField pw_field = new JTextField();
        pw_field.setBounds(66, 131, 232, 31);
        pw_field.setOpaque(false);
        pw_field.setForeground(new Color(51, 255, 255));
        pw_field.setBackground(new Color(0, 255, 255, 255));
        pw_field.setBorder(border);
        pw_field.setFont(date_font);
        add(pw_field);

        //------------------------------------------------------------------------------------
        JLabel search_label = new JLabel("SEARCH");
        search_label.setBounds(505, 383, 280, 64);
        search_label.setForeground(new Color(0, 255, 248));
        search_label.setBackground(new Color(123, 62, 46, 255));
        search_label.setFont(search_font);
        search_label.setCursor(Cur);
        add(search_label);

        //----second pic part-----------------------------------------------------------
        
          JLabel pic2 = new JLabel();
        pic2.setIcon(new ImageIcon(getClass().getResource("dawn.png")));
        pic2.setBounds(815, 467, 274, 171);

        add(pic2);
        
             JLabel pic3 = new JLabel();
        pic3.setIcon(new ImageIcon(getClass().getResource("up.png")));
        pic3.setBounds(815, 195, 347, 163);

        add(pic3);
        //---------------------------------------------------------------
        JLabel label1 = new JLabel("J-School Pro V  0.1");
        label1.setBounds(837, 370, 243, 30);
        label1.setForeground(new Color(0, 255, 248));
        label1.setBackground(new Color(123, 62, 46, 255));
        Font label1_font = new Font("Digital-7", Font.PLAIN, 24);
        label1.setFont(label1_font);
        label1.setCursor(Cur);
        add(label1);
        
                //---------------------------------------------------------------------------------------------------------
//
        JLabel label2 = new JLabel("Shiran Kumarasingha");
        label2.setBounds(837, 380, 380, 64);
        label2.setForeground(new Color(0, 255, 248));
        label2.setBackground(new Color(123, 62, 46, 255));
        Font label2_font = new Font("Digital-7", Font.PLAIN, 24);
        label2.setFont(label2_font);
        label2.setCursor(Cur);
        add(label2);
        
        
        
//
////        
        JLabel label3 = new JLabel("(Member Of cadenza)");
        label3.setBounds(837, 410, 280, 64);
        label3.setForeground(new Color(0, 255, 248));
        label3.setBackground(new Color(123, 62, 46, 255));
        Font label3_font = new Font("Digital-7", Font.PLAIN, 20);
        label3.setFont(label3_font);
        label3.setCursor(Cur);
        add(label3);
        
        JLabel label4 = new JLabel("Cadenza Product :");
        label4.setBounds(837, 410, 280, 64);
        label4.setForeground(new Color(0, 255, 248));
        label4.setBackground(new Color(123, 62, 46, 255));
        Font label4_font = new Font("Digital-7", Font.PLAIN, 20);
        label4.setFont(label3_font);
        label4.setCursor(Cur);
        add(label4);
//
//
        JLabel label5 = new JLabel("groupofcadenzadetail@gmail.com");
        label5.setBounds(837, 429, 280, 64);
        label5.setForeground(new Color(0, 255, 248));
        label5.setBackground(new Color(123, 62, 46, 255));
        Font label5_font = new Font("Digital-7", Font.PLAIN, 19);
        label5.setFont(label5_font);
        label5.setCursor(Cur);
        add(label5);
        
//        JLabel label6 = new JLabel("Contact No.");
//        label6.setBounds(837, 429, 280, 64);
//        label6.setForeground(new Color(0, 255, 248));
//        label6.setBackground(new Color(123, 62, 46, 255));
//        Font label6_font = new Font("Digital-7", Font.PLAIN, 19);
//        label6.setFont(label6_font);
//        label6.setCursor(Cur);
//        add(label6);
//        
//        JLabel label7 = new JLabel("077-2931027");
//        label7.setBounds(837, 429, 280, 64);
//        label7.setForeground(new Color(0, 255, 248));
//        label7.setBackground(new Color(123, 62, 46, 255));
//        Font label7_font = new Font("Digital-7", Font.PLAIN, 19);
//        label7.setFont(label7_font);
//        label7.setCursor(Cur);
//        add(label7);

        //-------animation code For Label----------------------------------------------------------
        Thread t1 = new Thread() {

            @Override
            public void run() {
                
                while(true){
                for (int i = 450; i >220; i = i - 1) {
                  

                        label1.setBounds(837, i, 243, 30);
                        label2.setBounds(839, i+25, 243, 30);                        
                        label3.setBounds(839, i+50, 243, 30);                       
                        label4.setBounds(839, i+80, 243, 30);                        
                        label5.setBounds(839, i+98, 243, 30);                        
//                        label6.setBounds(839, i+123, 243, 30);                        
//                        label7.setBounds(839, i+138, 243, 30);






                        try {
                            sleep(37);
                        } catch (InterruptedException e) {
                        }
                    
                }
                }
            }
        };

        t1.start();
        
  




        //------------------------------------------------------------------

        search_label.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                Base fr = new Base();
                dispose();
            }
        });

        Thread clock = new Thread() {
            public void run() {

                while (true) {
                    try {

                        //   DateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
                        // String dateString = dateFormat.format(new Date()).toString();
                        Calendar cal = new GregorianCalendar();

                        //get Day Name---
                        Calendar calendar = Calendar.getInstance();

                        Format f = new SimpleDateFormat("a");

                        String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

                        String day = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));

                        //   int day = 
                        int month = cal.get(Calendar.MONTH);
                        int year = cal.get(Calendar.YEAR);
                        String dayWeekText = String.valueOf(days[calendar.get(Calendar.DAY_OF_WEEK) - 1]);
                        String strMarker = f.format(new Date());

                        //   int dayWeekText = cal.get(Calendar.DAY_OF_WEEK);
                        int second = cal.get(Calendar.SECOND);
                        int minute = cal.get(Calendar.MINUTE);
                        int hour = cal.get(Calendar.HOUR);

                        time_label.setText(hour + " :" + minute + " :" + second + " " + strMarker);
                        date_label.setText(day + "/" + month + "/" + year);
                        day_label.setText(dayWeekText);

                        sleep(1000);
                    } catch (Exception ex) {
                        Logger.getLogger(Detail_project.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }
        };

        clock.start();

        JLabel pic = new JLabel();
        pic.setIcon(new ImageIcon(getClass().getResource("Group 32.png")));
        pic.setBounds(0, 0, 1154, 702);

        add(pic);
        
      

//      getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
//   setUndecorated(true);
//  setBackground(new Color(10, 50, 40, 100));
        //----------------------------------------------------------------------------------------------
        setSize(1154, 701);
        setTitle("Cadenza Pro v 1.0 By Shiran");
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        Detail_project obj = new Detail_project();
        //   obj.frame();
        clock();
    }

    public static void clock() {

    }

}
