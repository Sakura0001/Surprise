package AAAAAAAAAAAAAA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class xiugai extends JFrame {

    private JPanel contentPane;
    private JButton btnNewButton_1;
    private JButton btnNewButton;
    private JLabel lblNewLabel_14;
    private JLabel lblNewLabel_15;
    private JLabel lblNewLabel_16;
    private JLabel lblNewLabel_17;
    private JLabel lblNewLabel_18;
    private JLabel lblNewLabel_19;
    private JLabel lblNewLabel_20;
    private JLabel lblNewLabel_21;
    private JLabel lblNewLabel_22;
    private JLabel lblNewLabel_1;
    private Viewimage image;
    private JButton btnNewButton_2;
    private JLabel lblNewLabel_23;
    String id ;String name ;String sex;String age ;String xibu;String zhuanye;String zhicheng;String shiyanshi;String zhiwu;String zhengzhi;

    /**
     * Launch the application.
     */
    public  void play(String id ,String name ,String sex,String age ,String xibu,String zhuanye,String zhicheng,String shiyanshi,String zhiwu,String zhengzhi) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    xiugai frame = new xiugai( id , name , sex, age , xibu, zhuanye,zhicheng, shiyanshi,zhiwu, zhengzhi);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */

    public xiugai(String id ,String name ,String sex,String age ,String xibu,String zhuanye,String zhicheng,String shiyanshi,String zhiwu,String zhengzhi) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 828, 576);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("\u60A8\u67E5\u8BE2\u7684\u662F\uFF1A");
        lblNewLabel.setForeground(new Color(204, 51, 255));
        lblNewLabel.setFont(new Font("·ÂËÎ", Font.ITALIC, 22));
        lblNewLabel.setBounds(214, 46, 141, 41);
        contentPane.add(lblNewLabel);

        lblNewLabel_1 = new JLabel("\u65E0");
        lblNewLabel_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        lblNewLabel_1.setBounds(378, 45, 183, 41);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("\u4E2A\u4EBA\u4FE1\u606F\u5982\u4E0B\uFF1A");
        lblNewLabel_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        lblNewLabel_2.setBounds(35, 116, 170, 30);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("i  d\uFF1A");
        lblNewLabel_3.setForeground(new Color(0, 0, 0));
        lblNewLabel_3.setFont(new Font("·ÂËÎ", Font.PLAIN, 22));
        lblNewLabel_3.setBounds(35, 172, 69, 30);
        contentPane.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("\u59D3\u540D\uFF1A\r\n");
        lblNewLabel_4.setFont(new Font("·ÂËÎ", Font.PLAIN, 22));
        lblNewLabel_4.setBounds(35, 202, 69, 41);
        contentPane.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("\u6027\u522B\uFF1A");
        lblNewLabel_5.setFont(new Font("·ÂËÎ", Font.PLAIN, 22));
        lblNewLabel_5.setForeground(new Color(0, 0, 0));
        lblNewLabel_5.setBounds(35, 243, 69, 30);
        contentPane.add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("\u5E74\u9F84\uFF1A");
        lblNewLabel_6.setFont(new Font("·ÂËÎ", Font.PLAIN, 22));
        lblNewLabel_6.setBounds(35, 278, 69, 30);
        contentPane.add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel("\u7CFB\u90E8\uFF1A");
        lblNewLabel_7.setFont(new Font("·ÂËÎ", Font.PLAIN, 22));
        lblNewLabel_7.setBounds(35, 307, 69, 30);
        contentPane.add(lblNewLabel_7);

        JLabel lblNewLabel_8 = new JLabel("\u4E13\u4E1A\uFF1A");
        lblNewLabel_8.setFont(new Font("·ÂËÎ", Font.PLAIN, 22));
        lblNewLabel_8.setBounds(35, 340, 69, 30);
        contentPane.add(lblNewLabel_8);

        JLabel lblNewLabel_9 = new JLabel("\u804C\u79F0\uFF1A");
        lblNewLabel_9.setFont(new Font("·ÂËÎ", Font.PLAIN, 22));
        lblNewLabel_9.setBounds(35, 368, 69, 30);
        contentPane.add(lblNewLabel_9);

        JLabel lblNewLabel_10 = new JLabel("\u5B9E\u9A8C\u5BA4\uFF1A");
        lblNewLabel_10.setFont(new Font("·ÂËÎ", Font.PLAIN, 22));
        lblNewLabel_10.setBounds(35, 398, 88, 30);
        contentPane.add(lblNewLabel_10);

        JLabel lblNewLabel_11 = new JLabel("\u804C\u52A1\uFF1A");
        lblNewLabel_11.setFont(new Font("·ÂËÎ", Font.PLAIN, 22));
        lblNewLabel_11.setBounds(35, 425, 69, 30);
        contentPane.add(lblNewLabel_11);

        JLabel lblNewLabel_12 = new JLabel("\u653F\u6CBB\u9762\u8C8C\uFF1A");
        lblNewLabel_12.setFont(new Font("·ÂËÎ", Font.PLAIN, 22));
        lblNewLabel_12.setBounds(35, 456, 110, 30);
        contentPane.add(lblNewLabel_12);

        JLabel lblNewLabel_13 = new JLabel("\u65E0");
        lblNewLabel_13.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        lblNewLabel_13.setBounds(161, 172, 211, 30);
        contentPane.add(lblNewLabel_13);

        lblNewLabel_14 = new JLabel("New label");
        lblNewLabel_14.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        lblNewLabel_14.setBounds(161, 202, 211, 31);
        contentPane.add(lblNewLabel_14);

        lblNewLabel_15 = new JLabel("New label");
        lblNewLabel_15.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        lblNewLabel_15.setBounds(161, 243, 211, 26);
        contentPane.add(lblNewLabel_15);

        lblNewLabel_16 = new JLabel("New label");
        lblNewLabel_16.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        lblNewLabel_16.setBounds(161, 278, 211, 26);
        contentPane.add(lblNewLabel_16);

        lblNewLabel_17 = new JLabel("New label");
        lblNewLabel_17.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        lblNewLabel_17.setBounds(161, 307, 211, 26);
        contentPane.add(lblNewLabel_17);

        lblNewLabel_18 = new JLabel("New label");
        lblNewLabel_18.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        lblNewLabel_18.setBounds(161, 340, 211, 26);
        contentPane.add(lblNewLabel_18);

        lblNewLabel_19 = new JLabel("New label");
        lblNewLabel_19.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        lblNewLabel_19.setBounds(161, 368, 211, 26);
        contentPane.add(lblNewLabel_19);

        lblNewLabel_20 = new JLabel("New label");
        lblNewLabel_20.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        lblNewLabel_20.setBounds(161, 398, 211, 26);
        contentPane.add(lblNewLabel_20);

        lblNewLabel_21 = new JLabel("New label");
        lblNewLabel_21.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        lblNewLabel_21.setBounds(161, 425, 211, 26);
        contentPane.add(lblNewLabel_21);

        lblNewLabel_22 = new JLabel("New label");
        lblNewLabel_22.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        lblNewLabel_22.setBounds(161, 456, 211, 26);
        contentPane.add(lblNewLabel_22);

        btnNewButton = new JButton("\u5220\u9664");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                shanchu m = new shanchu(name);
                m.play(name);
            }
        });
        btnNewButton.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u5220 \u9664.png"));
        btnNewButton.setBounds(426, 403, 211, 73);
        contentPane.add(btnNewButton);

        btnNewButton_1 = new JButton("\u4FEE\u6539");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                xiugai1 m = new xiugai1(name);
                m.play(name);
            }
        });
        btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u4FEE \u6539.png"));
        btnNewButton_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        btnNewButton_1.setBounds(426, 214, 211, 73);
        contentPane.add(btnNewButton_1);

        btnNewButton_2 = new JButton("\u8FD4\u56DE");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                chaxun w=new chaxun();
                w.play();
            }
        });
        btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u8FD4 \u56DE.png"));
        btnNewButton_2.setBounds(13, 26, 110, 61);
        contentPane.add(btnNewButton_2);

        image = new Viewimage();
        image.setImageFile("C:\\Users\\asus\\Desktop\\\u80CC\u666F (2).png");
        image.setBounds(0, 0, 812, 537);
        contentPane.add(image);

        lblNewLabel_1.setText(name);
        lblNewLabel_13.setText(id);
        lblNewLabel_14.setText(name);
        lblNewLabel_15.setText(sex);
        lblNewLabel_16.setText(age);
        lblNewLabel_17.setText(xibu);
        lblNewLabel_18.setText(zhuanye);
        lblNewLabel_19.setText(zhicheng);
        lblNewLabel_20.setText(shiyanshi);
        lblNewLabel_21.setText(zhiwu);
        lblNewLabel_22.setText(zhengzhi);


    }
}