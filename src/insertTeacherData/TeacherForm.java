/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertTeacherData;

import detail_project.Detail_project;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Thread.sleep;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class TeacherForm extends JFrame {

    public TeacherForm() {
        setLayout(null);
        setResizable(false);
        //--------------------------------------------------------------------------------------

        //fonts---------------------------------------------------------------------------------
        Font btn_font = new Font("Segoe UI", Font.PLAIN, 20);
        Font login_txt = new Font("Segoe UI", Font.PLAIN, 20);
        Font login_label = new Font("Segoe UI", Font.PLAIN, 15);        
        Font date_label = new Font("Digital-7", Font.PLAIN, 23);
        Font days_label = new Font("Digital-7", Font.PLAIN, 19);        
        Font times_label = new Font("Digital-7", Font.PLAIN, 33);        
        Font sps_label = new Font("Digital-7", Font.PLAIN, 19);        
        Font text1_font = new Font("Agency FB", Font.BOLD, 29);       
        Font text2_font = new Font("Agency FB", Font.PLAIN, 21);        
        Font form_font = new Font("Corbel", Font.PLAIN, 24);






        Font text_label = new Font("Agency FB", Font.PLAIN, 25);

        //boder color and with set code
        Border border = BorderFactory.createLineBorder(Color.CYAN, 2);
        //login part-----------------------------------------------------------------------------

        JLabel teacher_label = new JLabel("Type Any things releted to teacher");
        teacher_label.setBounds(18, 67, 497, 28);
        teacher_label.setForeground(new Color(255, 255, 255));
        //   time_label.setBackground(new Color(123, 62, 46, 255));
        teacher_label.setFont(login_label);
        //    teacher_label.setCursor(Cur);
        add(teacher_label);

        JTextField t1 = new JTextField();
        t1.setBounds(18, 97, 278, 29);
        t1.setOpaque(false);
        t1.setForeground(new Color(51, 255, 255));
        t1.setBackground(new Color(0, 255, 255, 255));
        t1.setBorder(border);
        t1.setFont(login_txt);
        add(t1);

        //JButoon-------------------------------------------------------------------------------
        JButton insert = new JButton("insert");
        insert.setBounds(880, 606, 108, 34);
        insert.setFont(btn_font);
        insert.setForeground(new Color(255, 255, 255));
        insert.setContentAreaFilled(false);
        add(insert);

        JButton exit = new JButton("Exit");
        exit.setBounds(1006, 606, 108, 34);
        exit.setForeground(new Color(255, 0, 102));
        exit.setContentAreaFilled(false);
        exit.setFont(btn_font);
        add(exit);

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });
        
        //-------------------Clock Part-----------------------------------------------------------------
        
        
        JLabel dates_label = new JLabel("");
        dates_label.setBounds(494, 77, 101, 23);
        dates_label.setForeground(new Color(255, 255, 255));
        //   time_label.setBackground(new Color(123, 62, 46, 255));
        dates_label.setFont(date_label);
        //    teacher_label.setCursor(Cur);
        add(dates_label);
        
          JLabel day_label = new JLabel("");
        day_label.setBounds(391, 89, 157,15);
        day_label.setForeground(new Color(255, 255, 255));
        //   time_label.setBackground(new Color(123, 62, 46, 255));
        day_label.setFont(days_label);
        //    teacher_label.setCursor(Cur);
        add(day_label);
        
        JLabel time_label = new JLabel("");
        time_label.setBounds(627, 83, 157,45);
        time_label.setForeground(new Color(255, 255, 255));
        //   date_label.setBackground(new Color(123, 62, 46, 255));
        time_label.setFont(times_label);
        //    teacher_label.setCursor(Cur);
        add(time_label);
        
        JLabel sp_label = new JLabel("");
        sp_label.setBounds(720, 100, 48,22);
        sp_label.setForeground(new Color(51, 255, 255));
        //   date_label.setBackground(new Color(123, 62, 46, 255));
        sp_label.setFont(sps_label);
        //    teacher_label.setCursor(Cur);
        add(sp_label);

          JLabel text1_label = new JLabel("JSchool Pro insert Information Panel");
        text1_label.setBounds(780, 56,386,34);
        text1_label.setForeground(new Color(181, 167, 167));
        //   date_label.setBackground(new Color(123, 62, 46, 255));
        text1_label.setFont(text1_font);
        //    teacher_label.setCursor(Cur);
        add(text1_label);
        
        
        
        JLabel text2_label = new JLabel("Insert Teacher Information to database");
        text2_label.setBounds(780,85,386,34);
        text2_label.setForeground(new Color(181, 167, 167));
        //   date_label.setBackground(new Color(123, 62, 46, 255));
        text2_label.setFont(text2_font);
        //    teacher_label.setCursor(Cur);
        add(text2_label);
        
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
                        sp_label.setText(strMarker);
                        dates_label.setText(day + "/" + month + "/" + year);
                        day_label.setText(dayWeekText);

                        sleep(1000);
                    } catch (Exception ex) {
                        Logger.getLogger(Detail_project.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }
        };

        clock.start();
 
        
        //form Label and TextField-----------------------------------------------------------
        
        JLabel d1_label = new JLabel("Id No");
        d1_label.setBounds(32,200,56,29);
        d1_label.setForeground(new Color(255, 255, 255));
        //   date_label.setBackground(new Color(123, 62, 46, 255));
        d1_label.setFont(form_font);
        //    teacher_label.setCursor(Cur);
        add(d1_label);
        
         JLabel d2_label = new JLabel("Name");
        d2_label.setBounds(32,252,106,29);
        d2_label.setForeground(new Color(255, 255, 255));
        //   date_label.setBackground(new Color(123, 62, 46, 255));
        d2_label.setFont(form_font);
        //    teacher_label.setCursor(Cur);
        add(d2_label);
        
        
         JLabel d3_label = new JLabel("Gender");
        d3_label.setBounds(32,304,100,29);
        d3_label.setForeground(new Color(255, 255, 255));
        //   date_label.setBackground(new Color(123, 62, 46, 255));
        d3_label.setFont(form_font);
        //    teacher_label.setCursor(Cur);
        add(d3_label);
        
         JLabel d4_label = new JLabel("Birth Day");
        d4_label.setBounds(32,356,100,29);
        d4_label.setForeground(new Color(255, 255, 255));
        //   date_label.setBackground(new Color(123, 62, 46, 255));
        d4_label.setFont(form_font);
        //    teacher_label.setCursor(Cur);
        add(d4_label);
        
         JLabel d5_label = new JLabel("Phone");
        d5_label.setBounds(32,408,100,29);
        d5_label.setForeground(new Color(255, 255, 255));
        //   date_label.setBackground(new Color(123, 62, 46, 255));
        d5_label.setFont(form_font);
        //    teacher_label.setCursor(Cur);
        add(d5_label);
        
         JLabel d6_label = new JLabel("Married");
        d6_label.setBounds(32,460,100,29);
        d6_label.setForeground(new Color(255, 255, 255));
        //   date_label.setBackground(new Color(123, 62, 46, 255));
        d6_label.setFont(form_font);
        //    teacher_label.setCursor(Cur);
        add(d6_label);
        
         JLabel d7_label = new JLabel("Your Class");
        d7_label.setBounds(32,512,200,29);
        d7_label.setForeground(new Color(255, 255, 255));
        //   date_label.setBackground(new Color(123, 62, 46, 255));
        d7_label.setFont(form_font);
        //    teacher_label.setCursor(Cur);
        add(d7_label);
        
         JLabel d8_label = new JLabel("Nature Of Teaching");
        d8_label.setBounds(502,200,200,29);
        d8_label.setForeground(new Color(255, 255, 255));
        //   date_label.setBackground(new Color(123, 62, 46, 255));
        d8_label.setFont(form_font);
        //    teacher_label.setCursor(Cur);
        add(d8_label);
        
         JLabel d9_label = new JLabel("Trained Subject");
        d9_label.setBounds(502,247,200,29);
        d9_label.setForeground(new Color(255, 255, 255));
        //   date_label.setBackground(new Color(123, 62, 46, 255));
        d9_label.setFont(form_font);
        //    teacher_label.setCursor(Cur);
        add(d9_label);
        
         JLabel d10_label = new JLabel("Like Subject");
        d10_label.setBounds(502,294,200,29);
        d10_label.setForeground(new Color(255, 255, 255));
        //   date_label.setBackground(new Color(123, 62, 46, 255));
        d10_label.setFont(form_font);
        //    teacher_label.setCursor(Cur);
        add(d10_label);
        
          JLabel d11_label = new JLabel("End Of Education");
        d11_label.setBounds(502,341,200,29);
        d11_label.setForeground(new Color(255, 255, 255));
        //   date_label.setBackground(new Color(123, 62, 46, 255));
        d11_label.setFont(form_font);
        //    teacher_label.setCursor(Cur);
        add(d11_label);
        
          JLabel d12_label = new JLabel("Vocational Qualification");
        d12_label.setBounds(502,394,400,29);
        d12_label.setForeground(new Color(255, 255, 255));
        //   date_label.setBackground(new Color(123, 62, 46, 255));
        d12_label.setFont(form_font);
        //    teacher_label.setCursor(Cur);
        add(d12_label);
        
        JLabel d13_label = new JLabel("Appu Date");
        d13_label.setBounds(502,441,200,29);
        d13_label.setForeground(new Color(255, 255, 255));
        //   date_label.setBackground(new Color(123, 62, 46, 255));
        d13_label.setFont(form_font);
        //    teacher_label.setCursor(Cur);
        add(d13_label);
        
        JLabel d14_label = new JLabel("Nature Of Teaching");
        d14_label.setBounds(502,489,200,29);
        d14_label.setForeground(new Color(255, 255, 255));
        //   date_label.setBackground(new Color(123, 62, 46, 255));
        d14_label.setFont(form_font);
        //    teacher_label.setCursor(Cur);
        add(d14_label);
        
               
        JTextField td1 = new JTextField();
        td1.setBounds(143, 200, 304, 28);
        td1.setOpaque(false);
        td1.setForeground(new Color(51, 255, 255));
        td1.setBackground(new Color(0, 255, 255, 255));
        td1.setBorder(border);
        td1.setFont(login_txt);
        add(td1);
        
        JTextField td2 = new JTextField();
        td2.setBounds(143, 253, 304, 28);
        td2.setOpaque(false);
        td2.setForeground(new Color(51, 255, 255));
        td2.setBackground(new Color(0, 255, 255, 255));
        td2.setBorder(border);
        td2.setFont(login_txt);
        add(td2);
        
        
        JTextField td3 = new JTextField();
        td3.setBounds(143, 306, 147, 28);
        td3.setOpaque(false);
        td3.setForeground(new Color(51, 255, 255));
        td3.setBackground(new Color(0, 255, 255, 255));
        td3.setBorder(border);
        td3.setFont(login_txt);
        add(td3);
        
        JTextField td4 = new JTextField();
        td4.setBounds(143, 359, 147, 28);
        td4.setOpaque(false);
        td4.setForeground(new Color(51, 255, 255));
        td4.setBackground(new Color(0, 255, 255, 255));
        td4.setBorder(border);
        td4.setFont(login_txt);
        add(td4);
        
        JTextField td5 = new JTextField();
        td5.setBounds(143, 412, 147, 28);
        td5.setOpaque(false);
        td5.setForeground(new Color(51, 255, 255));
        td5.setBackground(new Color(0, 255, 255, 255));
        td5.setBorder(border);
        td5.setFont(login_txt);
        add(td5);
        
        JTextField td6 = new JTextField();
        td6.setBounds(143, 465, 304, 28);
        td6.setOpaque(false);
        td6.setForeground(new Color(51, 255, 255));
        td6.setBackground(new Color(0, 255, 255, 255));
        td6.setBorder(border);
        td6.setFont(login_txt);
        add(td6);
        
        JTextField td7 = new JTextField();
        td7.setBounds(143, 512, 304, 28);
        td7.setOpaque(false);
        td7.setForeground(new Color(51, 255, 255));
        td7.setBackground(new Color(0, 255, 255, 255));
        td7.setBorder(border);
        td7.setFont(login_txt);
        add(td7);
        
       
        
        //BackGround Picture  ---------------------------------------------------------------
        JLabel pic = new JLabel();
        pic.setIcon(new ImageIcon(getClass().getResource("Group 28.png")));
        pic.setBounds(0, 0, 1154, 702);

        add(pic);

        //-------------------------------------------------
        setSize(1154, 701);
        setTitle("Cadenza Pro v 1.0 By Shiran");
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        TeacherForm obj = new TeacherForm();
    }
}
