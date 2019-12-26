package AAAAAAAAAAAAAA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

class login extends JFrame {

    private JPanel contentPane;
    private JLabel lblNewLabel;
    private JButton btnNewButton_tianjia;
    private JButton btnNewButton_chaxun;
    private JButton btnNewButton_xianshi;
    private JButton btnNewButton_shanchu;
    private JButton btnNewButton_tongji;
    private JButton btnNewButton_baocun;
    private JButton btnNewButton_duqu;
    private JButton btnNewButton;

    /**
     * Launch the application.
     */
    public  void    play (){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    login frame = new login();
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
    public login() {
        setTitle("高校人员信息管理系统设计");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 756, 524);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblNewLabel = new JLabel("\u9AD8\u6821\u4EBA\u5458\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF\u8BBE\u8BA1");
        lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 18));
        lblNewLabel.setBounds(244, 41, 384, 39);
        contentPane.add(lblNewLabel);

        btnNewButton_tianjia = new JButton("\u6DFB\u52A0\u7528\u6237");
        btnNewButton_tianjia.setIcon(null);
        btnNewButton_tianjia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                zhuce m = new zhuce();
                m.play();
            }
        });
        btnNewButton_tianjia.setBounds(62, 128, 136, 32);
        contentPane.add(btnNewButton_tianjia);

        btnNewButton_chaxun = new JButton("\u67E5\u8BE2\u5E76\u4FEE\u6539\r\n");
        btnNewButton_chaxun.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                chaxun m = new chaxun();
                m.play();
            }
        });
        btnNewButton_chaxun.setBounds(62, 187, 136, 32);
        contentPane.add(btnNewButton_chaxun);

        btnNewButton_xianshi = new JButton("\u663E\u793A\u529F\u80FD");
        btnNewButton_xianshi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnNewButton_xianshi.setBounds(62, 254, 136, 32);
        contentPane.add(btnNewButton_xianshi);

        btnNewButton_shanchu = new JButton("\u5220\u9664\u529F\u80FD");
        btnNewButton_shanchu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                shanchu3 m = new shanchu3();
                m.play();
            }
        });
        btnNewButton_shanchu.setBounds(62, 322, 136, 32);
        contentPane.add(btnNewButton_shanchu);

        btnNewButton_tongji = new JButton("\u7EDF\u8BA1\u529F\u80FD");
        btnNewButton_tongji.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                tongji m = null;
                try {
                    m = new tongji();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
                m.play();
            }
        });
        btnNewButton_tongji.setBounds(511, 254, 117, 32);
        contentPane.add(btnNewButton_tongji);

        btnNewButton_baocun = new JButton("\u4FDD\u5B58\u81F3\u6587\u4EF6\r\n");
        btnNewButton_baocun.setBounds(511, 128, 117, 32);
        btnNewButton_baocun.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                mysql q = new mysql();
                try {
                    q.baocun();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                baocun_true m  =new baocun_true();
                m.play();
            }
        });
        contentPane.add(btnNewButton_baocun);

        btnNewButton_duqu = new JButton("\u8BFB\u53D6\u6587\u4EF6");
        btnNewButton_duqu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                //duqu
                mysql q = new mysql();
                try {
                    q.duqu();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                //
                duqu_true m = new duqu_true();
                m.play();
            }
        });
        btnNewButton_duqu.setBounds(511, 187, 117, 32);
        contentPane.add(btnNewButton_duqu);

        btnNewButton = new JButton("\u9000\u51FA");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u9000\u51FA.png"));
        btnNewButton.setBounds(510, 379, 136, 44);
        contentPane.add(btnNewButton);

        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u5973\u5B69\u5B50 \u521D\u97F3 \u9633\u53F0 \u9E1F\u513F 4k\u52A8\u6F2B\u58C1\u7EB8_\u5F7C\u5CB8\u56FE\u7F51.jpg"));
        lblNewLabel_1.setBounds(0, 0, 750, 485);
        contentPane.add(lblNewLabel_1);
    }
}
