/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import detail_project.Detail_project;
import insertTeacherData.TeacherForm;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Thread.sleep;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author Shiran
 */
public class Base extends JFrame {

    //  JLabel time_label;
    public Base() {

        Font teacher_font = new Font("Corbel", Font.BOLD, 19);
        Font studennt_font = new Font("Corbel", Font.BOLD, 20);
        Font calender_font = new Font("Corbel", Font.BOLD, 30);
        Font security_font = new Font("Corbel", Font.BOLD, 36);
        Font Enterpw_font = new Font("Digital-7", Font.BOLD, 29);

        //getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        //setBackground(new Color(10, 50, 40, 140));
        setLayout(null);
        setResizable(false);

        Cursor Cur = new Cursor(Cursor.HAND_CURSOR);

        //---------------------------------clock Labels--------------------------------------
        Font clock_font = new Font("Digital-7", Font.PLAIN, 65);
        Font day_font = new Font("Digital-7", Font.BOLD, 45);
        Font date_font = new Font("Digital-7", Font.BOLD, 25);
        Font search_font = new Font("Digital-7", Font.PLAIN, 52);
        Font login_font = new Font("Corbel", Font.PLAIN, 24);
        Font ap_font = new Font("Digital-7", Font.PLAIN, 50);

        JLabel time_label = new JLabel("");
        time_label.setBounds(810, 62, 350, 64);
        time_label.setForeground(new Color(0, 255, 248));
        time_label.setBackground(new Color(123, 62, 46, 255));
        time_label.setFont(clock_font);
        // play.setCursor(Cur);
        add(time_label);

        //---
        JLabel ap_label = new JLabel("");
        ap_label.setBounds(1020, 67, 350, 64);
        ap_label.setForeground(new Color(0, 255, 248));
        ap_label.setBackground(new Color(123, 62, 46, 255));
        ap_label.setFont(ap_font);
        // play.setCursor(Cur);
        add(ap_label);

        JLabel day_label = new JLabel("");
        day_label.setBounds(807, 120, 280, 64);
        day_label.setForeground(new Color(0, 255, 248));
        day_label.setBackground(new Color(123, 62, 46, 255));
        day_label.setFont(day_font);
        // play.setCursor(Cur);
        add(day_label);

        JLabel date_label = new JLabel("122424");
        date_label.setBounds(1020, 130, 280, 64);
        date_label.setForeground(new Color(0, 255, 248));
        date_label.setBackground(new Color(123, 62, 46, 255));
        date_label.setFont(date_font);
        // play.setCursor(Cur);
        add(date_label);

        //----------Login Part Form Part  -------------------------------------------------------------
        //boder color and with set code
        Border border = BorderFactory.createLineBorder(Color.CYAN, 4);

        JLabel Enterpw_label = new JLabel("Enter your Password");
        Enterpw_label.setBounds(486, 60, 289, 34);
        Enterpw_label.setForeground(new Color(255, 255, 255));
        //   Enterpw_label.setBackground(new Color(123, 62, 46, 255));
        Enterpw_label.setFont(Enterpw_font);

        add(Enterpw_label);
        
         JLabel login_label = new JLabel("Login");
        login_label.setBounds(590, 150, 289, 34);
        login_label.setForeground(new Color(255, 0, 51));
        //   Enterpw_label.setBackground(new Color(123, 62, 46, 255));
        login_label.setCursor(Cur);
        login_label.setFont(Enterpw_font);

        add(login_label);

        JPasswordField pw_field = new JPasswordField();
        pw_field.setBounds(508, 110, 232, 40);
        pw_field.setOpaque(false);
        pw_field.setForeground(new Color(51, 255, 255));
        pw_field.setBackground(new Color(0, 255, 255, 255));
        pw_field.setBorder(border);
        pw_field.setFont(Enterpw_font);
        add(pw_field);
        
        
              login_label.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {

                String p = pw_field.getText();
                
                int a = Integer.parseInt(pw_field.getText());
            
//   int size = a.length();
               
               int pw=44664466;
               if(  pw==a){
                    TeacherForm ob = new TeacherForm ();
                      dispose();
               }else if(p.isEmpty()){
                   JOptionPane.showMessageDialog(null,"WRONG Password  ","Alert!",JOptionPane.WARNING_MESSAGE);
               }
               else{
                   JOptionPane.showMessageDialog(null,"WRONG Password  ","Alert!",JOptionPane.WARNING_MESSAGE);
               }
            }
            
               
        });
        
        
        
        
        

        //------------Text ---------------------------------------------------------------------------------
        JLabel teacher_label = new JLabel("Teacher Database");
        teacher_label.setBounds(192, 313, 160, 23);
        teacher_label.setForeground(new Color(255, 255, 255));
        //   time_label.setBackground(new Color(123, 62, 46, 255));
        teacher_label.setFont(teacher_font);
        teacher_label.setCursor(Cur);
        add(teacher_label);

        JLabel student_label = new JLabel("Student Database");
        student_label.setBounds(952, 313, 160, 23);
        student_label.setForeground(new Color(255, 255, 255));
        //   time_label.setBackground(new Color(123, 62, 46, 255));
        student_label.setFont(studennt_font);
        student_label.setCursor(Cur);
        add(student_label);

        JLabel Calender_label = new JLabel("Calender");
        Calender_label.setBounds(201, 526, 160, 28);
        Calender_label.setForeground(new Color(255, 255, 255));
        //   time_label.setBackground(new Color(123, 62, 46, 255));
        Calender_label.setFont(calender_font);
        Calender_label.setCursor(Cur);
        add(Calender_label);

        JLabel security_label = new JLabel("Security");
        security_label.setBounds(962, 526, 160, 42);
        security_label.setForeground(new Color(255, 255, 255));
        //   time_label.setBackground(new Color(123, 62, 46, 255));
        security_label.setFont(security_font);
        security_label.setCursor(Cur);
        add(security_label);

        //---------------side animation labeles---------------------------------------
        JLabel pic3 = new JLabel();
        pic3.setIcon(new ImageIcon(getClass().getResource("Group 37.png")));
        pic3.setBounds(0, -330, 1154, 702);
        add(pic3);

        
        JLabel pic1 = new JLabel();
        pic1.setIcon(new ImageIcon(getClass().getResource("Group 35.png")));
        pic1.setBounds(0, 82, 1154, 702);
        add(pic1);

        JLabel sd_label = new JLabel("Student Database");
        sd_label.setBounds(50, 62, 360, 42);
        sd_label.setForeground(new Color(255, 204, 204));
        //   time_label.setBackground(new Color(123, 62, 46, 255));
        sd_label.setFont(login_font);
        sd_label.setCursor(Cur);
        add(sd_label);

        JLabel sd_label1 = new JLabel("2018com37 - Madura Thikshana");
        sd_label1.setBounds(50, 90, 360, 42);
        sd_label1.setForeground(new Color(255, 204, 204));
        //   time_label.setBackground(new Color(123, 62, 46, 255));
        sd_label1.setFont(login_font);
        sd_label1.setCursor(Cur);
        add(sd_label1);

        JLabel sd_label2 = new JLabel("2018com86 -shiran kumarasingha");
        sd_label2.setBounds(50, 115, 360, 42);
        sd_label2.setForeground(new Color(255, 204, 204));
        //   time_label.setBackground(new Color(123, 62, 46, 255));
        sd_label2.setFont(login_font);
        sd_label2.setCursor(Cur);
        add(sd_label2);

        JLabel sd_label3 = new JLabel("2018com24 -Premuka kosala");
        sd_label3.setBounds(50, 140, 360, 42);
        sd_label3.setForeground(new Color(255, 204, 204));
        //   time_label.setBackground(new Color(123, 62, 46, 255));
        sd_label3.setFont(login_font);
        sd_label3.setCursor(Cur);
        add(sd_label3);

        //-------animation code For Label----------------------------------------------------------
        Thread t1 = new Thread() {

            @Override
            public void run() {

                while (true) {
                    for (int i = 200; i > -55; i = i - 1) {

                        sd_label.setBounds(50, i, 243, 30);
                        sd_label1.setBounds(50, i+25,360, 30);                        
                        sd_label2.setBounds(50, i+50,360, 30);                       
                       sd_label3.setBounds(50, i+80, 360, 30);                        
                        //sd_label.setBounds(839, i+98, 243, 30);                        
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

                        time_label.setText(hour + " :" + minute + " :" + second + " ");
                        ap_label.setText(strMarker);
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
        pic.setIcon(new ImageIcon(getClass().getResource("Group 20.png")));
        pic.setBounds(0, 0, 1154, 702);

        add(pic);
        
        
        

//      getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
//   setUndecorated(true);
//  setBackground(new Color(10, 50, 40, 100));
        //----------------------------------------------------------------------------------------------
        setSize(1154, 702);
        setTitle("Cadenza Pro v 1.0 By Shiran");
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        Base obj = new Base();
        //   obj.frame();
        clock();
    }

    public static void clock() {

    }

}
