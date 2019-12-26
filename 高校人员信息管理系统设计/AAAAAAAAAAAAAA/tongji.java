package AAAAAAAAAAAAAA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

class tongji extends JFrame {

    private JPanel contentPane;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JLabel lblNewLabel_5;
    private JLabel lblNewLabel_8;
    private JLabel lblNewLabel_6;
    private JLabel lblNewLabel_9;
    private JLabel lblNewLabel_7;
    private JLabel lblNewLabel;

    /**
     * Launch the application.
     */
    public void play() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    tongji frame = new tongji();
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
    public tongji() throws SQLException, ClassNotFoundException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 910, 399);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblNewLabel_2 = new JLabel("\u76EE\u524D\u7EDF\u8BA1\u7684\u4EBA\u6570\uFF1A\r\n");
        lblNewLabel_2.setFont(new Font("ËÎÌå", Font.PLAIN, 25));
        lblNewLabel_2.setForeground(new Color(255, 0, 255));
        lblNewLabel_2.setBounds(150, 57, 260, 51);
        contentPane.add(lblNewLabel_2);

        lblNewLabel_1 = new JLabel("\u6559  \u5E08\uFF1A");
        lblNewLabel_1.setFont(new Font("ËÎÌå", Font.PLAIN, 22));
        lblNewLabel_1.setForeground(new Color(51, 0, 204));
        lblNewLabel_1.setBounds(237, 83, 101, 104);
        contentPane.add(lblNewLabel_1);

        lblNewLabel_3 = new JLabel("\u7A7A");
        lblNewLabel_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        lblNewLabel_3.setBounds(372, 120, 168, 29);
        contentPane.add(lblNewLabel_3);

        lblNewLabel_4 = new JLabel("\u5B9E\u9A8C\u5458\uFF1A");
        lblNewLabel_4.setForeground(new Color(0, 102, 204));
        lblNewLabel_4.setFont(new Font("ËÎÌå", Font.PLAIN, 22));
        lblNewLabel_4.setBounds(237, 154, 101, 51);
        contentPane.add(lblNewLabel_4);

        lblNewLabel_5 = new JLabel("\u7A7A\r\n");
        lblNewLabel_5.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        lblNewLabel_5.setBounds(372, 160, 168, 30);
        contentPane.add(lblNewLabel_5);

        lblNewLabel_8 = new JLabel("\u6559\u5E08\u517C\u884C\u653F\uFF1A\r\n");
        lblNewLabel_8.setForeground(new Color(102, 255, 255));
        lblNewLabel_8.setFont(new Font("ËÎÌå", Font.PLAIN, 22));
        lblNewLabel_8.setBounds(501, 159, 137, 28);
        contentPane.add(lblNewLabel_8);

        lblNewLabel_6 = new JLabel("\u884C\u653F\u4EBA\u5458\uFF1A");
        lblNewLabel_6.setForeground(new Color(0, 102, 204));
        lblNewLabel_6.setFont(new Font("ËÎÌå", Font.PLAIN, 22));
        lblNewLabel_6.setBounds(501, 121, 137, 29);
        contentPane.add(lblNewLabel_6);

        lblNewLabel_9 = new JLabel("\u7A7A\r\n");
        lblNewLabel_9.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        lblNewLabel_9.setBounds(682, 154, 137, 33);
        contentPane.add(lblNewLabel_9);

        lblNewLabel_7 = new JLabel("\u7A7A\r\n");
        lblNewLabel_7.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        lblNewLabel_7.setBounds(682, 120, 202, 29);
        contentPane.add(lblNewLabel_7);

        JLabel lblNewLabel_10 = new JLabel("\u7537  \u6027\uFF1A");
        lblNewLabel_10.setForeground(new Color(102, 255, 255));
        lblNewLabel_10.setFont(new Font("ËÎÌå", Font.PLAIN, 22));
        lblNewLabel_10.setBounds(237, 215, 101, 33);
        contentPane.add(lblNewLabel_10);

        JLabel lblNewLabel_12 = new JLabel("\u5973   \u6027\uFF1A");
        lblNewLabel_12.setFont(new Font("ËÎÌå", Font.PLAIN, 22));
        lblNewLabel_12.setForeground(new Color(102, 255, 255));
        lblNewLabel_12.setBounds(501, 215, 125, 33);
        contentPane.add(lblNewLabel_12);

        JLabel lblNewLabel_13 = new JLabel("\u7A7A");
        lblNewLabel_13.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        lblNewLabel_13.setBounds(679, 214, 152, 33);
        contentPane.add(lblNewLabel_13);

        JLabel lblNewLabel_11 = new JLabel("\u7A7A");
        lblNewLabel_11.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 22));
        lblNewLabel_11.setBounds(372, 214, 114, 33);
        contentPane.add(lblNewLabel_11);



        lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\ZJIX1A[`}D_7EQRKH16}B1Q.png"));
        lblNewLabel.setBounds(0, -45, 980, 448);
        contentPane.add(lblNewLabel);

        JButton btnNewButton = new JButton("\u8FD4\u56DE");
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\LJ1{836TFLN6X0]G7@5WM45.png"));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                login m = new login();
                m.play();
            }
        });
        btnNewButton.setForeground(new Color(0, 204, 255));
        btnNewButton.setBounds(804, 10, 101, 84);
        contentPane.add(btnNewButton);

        mysql q= new mysql();
        int q1=q.count1();
        String str = String.valueOf(q1);
        lblNewLabel_3.setText(str);

        int q2=q.count2();
        String str2 = String.valueOf(q2);
        lblNewLabel_5.setText(str2);

        int q3=q.count3();
        String str3 = String.valueOf(q3);
        lblNewLabel_7.setText(str3);

        int q4=q.count4();
        String str4 = String.valueOf(q4);
        lblNewLabel_9.setText(str4);

        int q5=q.count5();
        String str5 = String.valueOf(q5);
        lblNewLabel_11.setText(str5);

        int q6=q.count6();
        String str6 = String.valueOf(q6);
        lblNewLabel_13.setText(str6);

    }

}