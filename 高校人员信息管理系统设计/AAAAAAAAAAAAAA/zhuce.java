package AAAAAAAAAAAAAA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

public class zhuce extends JFrame {
    private JPanel contentPane;
    private JLabel lblId;
    private JTextField textField;
    private JTextField textField_1;
    private JLabel lblNewLabel_1;
    private JRadioButton rdbtnNewRadioButton;
    private JRadioButton rdbtnNewRadioButton_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private ButtonGroup btnGroupSex;//男女放到一个组中。
    private ButtonGroup btnGroup;
    private JLabel lblNewLabel_4;
    private JLabel lblNewLabel_5;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JButton btnNewButton_1;
    private JRadioButton rdbtnNewRadioButton_2;
    private JRadioButton rdbtnNewRadioButton_3;
    private JRadioButton rdbtnNewRadioButton_4;
    private JRadioButton rdbtnNewRadioButton_5;

    /**
     * Launch the application.
     */
    public  void play() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    zhuce frame = new zhuce();
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
    public zhuce() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 383, 612);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblId = new JLabel("    *i  d\r\n\uFF1A");
        lblId.setForeground(new Color(255, 0, 0));
        lblId.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
        lblId.setBounds(59, 58, 81, 21);
        contentPane.add(lblId);

        textField = new JTextField();
        textField.setBounds(172, 60, 150, 21);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel = new JLabel("    *\u59D3\u540D\uFF1A\r\n");
        lblNewLabel.setForeground(Color.ORANGE);
        lblNewLabel.setBounds(59, 99, 81, 21);
        contentPane.add(lblNewLabel);

        textField_1 = new JTextField();
        textField_1.setBounds(172, 91, 150, 21);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        lblNewLabel_1 = new JLabel("    *\u6027\u522B\uFF1A");
        lblNewLabel_1.setBounds(59, 138, 81, 21);
        contentPane.add(lblNewLabel_1);

        rdbtnNewRadioButton = new JRadioButton("\u7537");
        rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
        rdbtnNewRadioButton.setBounds(172, 137, 44, 23);
        contentPane.add(rdbtnNewRadioButton);

        rdbtnNewRadioButton_1 = new JRadioButton("\u5973");
        rdbtnNewRadioButton_1.setBounds(232, 137, 50, 23);
        contentPane.add(rdbtnNewRadioButton_1);

        btnGroupSex = new ButtonGroup();
        btnGroupSex.add(rdbtnNewRadioButton);
        btnGroupSex.add(rdbtnNewRadioButton_1);

        JLabel lblNewLabel_2 = new JLabel("    *\u5E74\u9F84\uFF1A");
        lblNewLabel_2.setBounds(59, 177, 81, 21);
        contentPane.add(lblNewLabel_2);

        textField_2 = new JTextField();
        textField_2.setBounds(172, 177, 150, 21);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        JLabel lblNewLabel_3 = new JLabel("    \u7CFB\u90E8\uFF1A\r\n");
        lblNewLabel_3.setBounds(59, 208, 81, 21);
        contentPane.add(lblNewLabel_3);

        textField_3 = new JTextField();
        textField_3.setBounds(172, 208, 150, 21);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        JLabel label = new JLabel("    \u4E13\u4E1A\uFF1A");
        label.setBounds(59, 239, 81, 15);
        contentPane.add(label);

        textField_4 = new JTextField();
        textField_4.setText("");
        textField_4.setBounds(172, 239, 150, 21);
        contentPane.add(textField_4);
        textField_4.setColumns(10);



        lblNewLabel_5 = new JLabel("    \u804C\u79F0:");
        lblNewLabel_5.setBounds(59, 279, 81, 21);
        contentPane.add(lblNewLabel_5);

        textField_5 = new JTextField();
        textField_5.setBounds(172, 279, 150, 21);
        contentPane.add(textField_5);
        textField_5.setColumns(10);

        JLabel lblNewLabel_6 = new JLabel("    \u5B9E\u9A8C\u5BA4\uFF1A");
        lblNewLabel_6.setBounds(59, 321, 81, 21);
        contentPane.add(lblNewLabel_6);

        textField_6 = new JTextField();
        textField_6.setBounds(172, 321, 150, 21);
        contentPane.add(textField_6);
        textField_6.setColumns(10);

        JLabel lblNewLabel_7 = new JLabel("    \u804C\u52A1\uFF1A\r\n");
        lblNewLabel_7.setBounds(59, 365, 81, 21);
        contentPane.add(lblNewLabel_7);

        textField_7 = new JTextField();
        textField_7.setBounds(172, 365, 150, 21);
        contentPane.add(textField_7);
        textField_7.setColumns(10);

        JLabel lblNewLabel_8 = new JLabel("    \u653F\u6CBB\uFF1A");
        lblNewLabel_8.setBounds(59, 409, 96, 21);
        contentPane.add(lblNewLabel_8);

        textField_8 = new JTextField();
        textField_8.setBounds(172, 409, 150, 21);
        contentPane.add(textField_8);
        textField_8.setColumns(10);

        JButton btnNewButton = new JButton("\u4FDD\u5B58\r\n");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = textField.getText();
                String name= textField_1.getText();
                String sex ;
                if(rdbtnNewRadioButton.isSelected()) {
                    sex="男";
                }else {
                    sex="女";
                }
                String age = textField_2.getText();
                String xibu= textField_3.getText();
                String zhuanye=textField_4.getText();
                String zhicheng=textField_5.getText();
                String shiyanshi = textField_6.getText();
                String zhiwu= textField_7.getText();
                String zhengzhi= textField_8.getText();
                String leibie = null;
                if("".equals(id)){
                    id="空";
                }
                if("".equals(name)){
                    name="空";
                }
                if("".equals(sex)){
                    sex="空";
                }
                if("".equals(age)){
                    age="空";
                }
                if("".equals(xibu)){
                    xibu="空";
                }
                if("".equals(zhuanye)){
                    zhuanye="空";
                }
                if("".equals(zhicheng)){
                    zhicheng="空";
                }
                if("".equals(shiyanshi)){
                    shiyanshi="空";
                }
                if("".equals(zhiwu)){
                    zhiwu="空";
                }
                if("".equals(zhengzhi)){
                    zhengzhi="空";
                }
                if(rdbtnNewRadioButton_2.isSelected()){
                    leibie="教师";
                }
                if(rdbtnNewRadioButton_3.isSelected()){
                    leibie="实验员";
                }
                if(rdbtnNewRadioButton_4.isSelected()){
                    leibie="行政人员";
                }
                if(rdbtnNewRadioButton_5.isSelected()){
                    leibie="教师兼行政人员";
                }
                mysql m = new mysql();
                if(leibie=="教师"){
                    try {
                        dispose();
                        m.zhuce1(id ,name ,sex,age ,xibu,zhuanye,zhicheng,shiyanshi,zhiwu,zhengzhi);
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
                if(leibie=="实验员"){
                    try {
                        dispose();
                        m.zhuce2(id ,name ,sex,age ,xibu,zhuanye,zhicheng,shiyanshi,zhiwu,zhengzhi);
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                }
                if(leibie=="行政人员"){
                    try {
                        dispose();
                        m.zhuce3(id ,name ,sex,age ,xibu,zhuanye,zhicheng,shiyanshi,zhiwu,zhengzhi);
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
                if(leibie=="教师兼行政人员"){
                    try {
                        dispose();
                        m.zhuce4(id ,name ,sex,age ,xibu,zhuanye,zhicheng,shiyanshi,zhiwu,zhengzhi);
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u786E\u8BA4\u4FDD\u5B58 (1).png"));
        btnNewButton.setBounds(46, 488, 127, 45);
        contentPane.add(btnNewButton);

        btnNewButton_1 = new JButton("\u8FD4\u56DE");
        btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u9000\u51FA.png"));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                login m= new login();
                m.play();
            }
        });
        btnNewButton_1.setBounds(195, 488, 127, 45);
        contentPane.add(btnNewButton_1);

        rdbtnNewRadioButton_4 = new JRadioButton("\u884C\u653F");
        rdbtnNewRadioButton_4.setBounds(204, 442, 59, 23);
        contentPane.add(rdbtnNewRadioButton_4);

        JLabel lblNewLabel_9 = new JLabel("   *\u7C7B\u522B\uFF1A");
        lblNewLabel_9.setBounds(2, 443, 62, 21);
        contentPane.add(lblNewLabel_9);

        rdbtnNewRadioButton_2 = new JRadioButton("\u6559\u5E08");
        rdbtnNewRadioButton_2.setBounds(59, 442, 61, 23);
        contentPane.add(rdbtnNewRadioButton_2);

        rdbtnNewRadioButton_3 = new JRadioButton("\u5B9E\u9A8C\u5458");
        rdbtnNewRadioButton_3.setBounds(122, 442, 80, 23);
        contentPane.add(rdbtnNewRadioButton_3);

        rdbtnNewRadioButton_5 = new JRadioButton("\u6559\u5E08\u517C\u884C\u653F");
        rdbtnNewRadioButton_5.setBounds(265, 442, 96, 23);
        contentPane.add(rdbtnNewRadioButton_5);

        lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u80CC\u666F.png"));
        lblNewLabel_4.setBounds(0, 0, 367, 573);
        contentPane.add(lblNewLabel_4);

        btnGroup = new ButtonGroup();
        btnGroup.add(rdbtnNewRadioButton_2);
        btnGroup.add(rdbtnNewRadioButton_3);
        btnGroup.add(rdbtnNewRadioButton_4);
        btnGroup.add(rdbtnNewRadioButton_5);
    }
}