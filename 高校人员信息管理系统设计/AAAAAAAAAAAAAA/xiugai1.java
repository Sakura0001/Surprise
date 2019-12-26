package AAAAAAAAAAAAAA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

class xiugai1 extends JFrame {

    private JPanel contentPane;
    private Viewimage image;
    private Viewimage image2;
    private JLabel lblNewLabel;
    private JButton btnNewButton;
    private ButtonGroup btnGroup;
    private JRadioButton rdbtnNewRadioButton;
    private JRadioButton rdbtnNewRadioButton_1;
    private JRadioButton rdbtnNewRadioButton_2;
    private JRadioButton rdbtnNewRadioButton_3;
    private JRadioButton rdbtnNewRadioButton_4;
    private JRadioButton rdbtnNewRadioButton_5;
    private JRadioButton rdbtnNewRadioButton_6;
    private JRadioButton rdbtnNewRadioButton_7;
    private JRadioButton rdbtnNewRadioButton_8;
    private JRadioButton rdbtnNewRadioButton_9;
    private JTextField textField;
    /**
     * Launch the application.
     */
    public void play(String name){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    xiugai1 frame = new xiugai1(name);
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
    public xiugai1(String name) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 751, 473);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        image = new Viewimage();
        image.setImageFile("C:\\Users\\asus\\Desktop\\HZ7QEOJ@)G{ADTT7MJHDKY7.png");
        image.setBounds(10, 47, 247, 249);
        contentPane.add(image);

        lblNewLabel = new JLabel("\u8BF7\u9009\u62E9\u60A8\u8981\u4FEE\u6539\u7684\u5185\u5BB9QWQ");
        lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 15));
        lblNewLabel.setBounds(287, 33, 199, 41);
        contentPane.add(lblNewLabel);

        image2 = new Viewimage();
        image2.setImageFile("C:\\Users\\asus\\Desktop\\cc48b331f2dd6edc0c42d3347b84395c.jpg");
        image2.setBounds(236, -14, 295, 162);
        contentPane.add(image2);

        btnNewButton = new JButton("\u4FEE\u6539");
        btnNewButton.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 19));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rdbtnNewRadioButton.isSelected()){
                    String ss="id";
                    String s =textField.getText();
                    mysql q = new mysql();
                    try {
                        q.xiugai(name,ss,s);
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
                if(rdbtnNewRadioButton_1.isSelected()){
                    String ss="name";
                    String s =textField.getText();
                    mysql q = new mysql();
                    try {
                        q.xiugai(name,ss,s);
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
                if(rdbtnNewRadioButton_2.isSelected()){
                    String ss="sex";
                    String s =textField.getText();
                    mysql q = new mysql();
                    try {
                        q.xiugai(name,ss,s);
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
                if(rdbtnNewRadioButton_3.isSelected()){
                    String ss="age";
                    String s =textField.getText();
                    mysql q = new mysql();
                    try {
                        q.xiugai(name,ss,s);
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
                if(rdbtnNewRadioButton_4.isSelected()){
                    String ss="xibu";
                    String s =textField.getText();
                    mysql q = new mysql();
                    try {
                        q.xiugai(name,ss,s);
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
                if(rdbtnNewRadioButton_5.isSelected()){
                    String ss="zhuanye";
                    String s =textField.getText();
                    mysql q = new mysql();
                    try {
                        q.xiugai(name,ss,s);
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
                if(rdbtnNewRadioButton_6.isSelected()){
                    String ss="zhicheng";
                    String s =textField.getText();
                    mysql q = new mysql();
                    try {
                        q.xiugai(name,ss,s);
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
                if(rdbtnNewRadioButton_7.isSelected()){
                    String ss="shiyanshi";
                    String s =textField.getText();
                    mysql q = new mysql();
                    try {
                        q.xiugai(name,ss,s);
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
                if(rdbtnNewRadioButton_8.isSelected()){
                    String ss="zhiwu";
                    String s =textField.getText();
                    mysql q = new mysql();
                    try {
                        q.xiugai(name,ss,s);
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                }
                if(rdbtnNewRadioButton_9.isSelected()){
                    String ss="zhengzhi";
                    String s =textField.getText();
                    mysql q = new mysql();
                    try {
                        q.xiugai(name,ss,s);
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
                truexiugai m = new truexiugai();
                m.play();
            }
        });
        btnNewButton.setBackground(Color.WHITE);
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u4FEE \u6539.png"));
        btnNewButton.setBounds(407, 354, 159, 73);
        contentPane.add(btnNewButton);

        rdbtnNewRadioButton = new JRadioButton("i d");
        rdbtnNewRadioButton.setBackground(Color.WHITE);
        rdbtnNewRadioButton.setBounds(287, 154, 74, 23);
        contentPane.add(rdbtnNewRadioButton);

        rdbtnNewRadioButton_1 = new JRadioButton("\u59D3\u540D");
        rdbtnNewRadioButton_1.setBackground(Color.WHITE);
        rdbtnNewRadioButton_1.setBounds(287, 179, 74, 23);
        contentPane.add(rdbtnNewRadioButton_1);

        rdbtnNewRadioButton_2 = new JRadioButton("\u6027\u522B");
        rdbtnNewRadioButton_2.setBackground(Color.WHITE);
        rdbtnNewRadioButton_2.setBounds(287, 203, 74, 23);
        contentPane.add(rdbtnNewRadioButton_2);

        rdbtnNewRadioButton_3 = new JRadioButton("\u5E74\u9F84");
        rdbtnNewRadioButton_3.setBackground(Color.WHITE);
        rdbtnNewRadioButton_3.setBounds(287, 228, 74, 23);
        contentPane.add(rdbtnNewRadioButton_3);

        rdbtnNewRadioButton_4 = new JRadioButton("\u7CFB\u90E8");
        rdbtnNewRadioButton_4.setBackground(Color.WHITE);
        rdbtnNewRadioButton_4.setBounds(287, 253, 74, 23);
        contentPane.add(rdbtnNewRadioButton_4);

        rdbtnNewRadioButton_5 = new JRadioButton("\u4E13\u4E1A");
        rdbtnNewRadioButton_5.setBackground(Color.WHITE);
        rdbtnNewRadioButton_5.setBounds(287, 278, 74, 23);
        contentPane.add(rdbtnNewRadioButton_5);

        rdbtnNewRadioButton_6 = new JRadioButton("\u804C\u79F0");
        rdbtnNewRadioButton_6.setBackground(Color.WHITE);
        rdbtnNewRadioButton_6.setBounds(287, 303, 74, 23);
        contentPane.add(rdbtnNewRadioButton_6);

        rdbtnNewRadioButton_7 = new JRadioButton("\u5B9E\u9A8C\u5BA4");
        rdbtnNewRadioButton_7.setBackground(Color.WHITE);
        rdbtnNewRadioButton_7.setBounds(287, 328, 74, 23);
        contentPane.add(rdbtnNewRadioButton_7);

        rdbtnNewRadioButton_8 = new JRadioButton("\u804C\u52A1");
        rdbtnNewRadioButton_8.setBackground(Color.WHITE);
        rdbtnNewRadioButton_8.setBounds(287, 351, 74, 23);
        contentPane.add(rdbtnNewRadioButton_8);

        rdbtnNewRadioButton_9 = new JRadioButton("\u653F\u6CBB");
        rdbtnNewRadioButton_9.setBackground(Color.WHITE);
        rdbtnNewRadioButton_9.setBounds(287, 376, 74, 23);
        contentPane.add(rdbtnNewRadioButton_9);

        btnGroup = new ButtonGroup();
        btnGroup.add(rdbtnNewRadioButton);
        btnGroup.add(rdbtnNewRadioButton_1);
        btnGroup.add(rdbtnNewRadioButton_2);
        btnGroup.add(rdbtnNewRadioButton_3);
        btnGroup.add(rdbtnNewRadioButton_4);
        btnGroup.add(rdbtnNewRadioButton_5);
        btnGroup.add(rdbtnNewRadioButton_6);
        btnGroup.add(rdbtnNewRadioButton_7);
        btnGroup.add(rdbtnNewRadioButton_8);
        btnGroup.add(rdbtnNewRadioButton_9);

        textField = new JTextField();
        textField.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 19));
        textField.setBounds(394, 254, 210, 42);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btnNewButton_1 = new JButton("\u8FD4\u56DE");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                chaxun m = new chaxun ();
                m.play();
            }
        });
        btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u8FD4 \u56DE.png"));
        btnNewButton_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 19));
        btnNewButton_1.setBackground(Color.WHITE);
        btnNewButton_1.setBounds(566, 354, 159, 73);
        contentPane.add(btnNewButton_1);
    }
}
