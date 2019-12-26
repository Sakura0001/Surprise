package AAAAAAAAAAAAAA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class chongfu extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public  void play() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    chongfu frame = new chongfu();
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
    public chongfu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 420, 300);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("\u6570\u636E\u5E93\u4E2D\u5B58\u5728\u76F8\u540C\u7684\u7F16\u53F7\u6216\u59D3\u540D\uFF0C\u8BF7\u786E\u5B9A\u7F16\u53F7\u6216\u59D3\u540D\u662F\u5426\u6B63\u786E\u3002\r\n");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u9519\u8BEF.png"));
        lblNewLabel.setBounds(0, 39, 394, 123);
        contentPane.add(lblNewLabel);

        JButton btnNewButton = new JButton("\u8FD4\u56DE");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                zhuce m= new zhuce();
                m.play();

            }
        });
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u9000\u51FA.png"));
        btnNewButton.setBounds(94, 157, 201, 57);
        contentPane.add(btnNewButton);

        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\chunse.png"));
        lblNewLabel_1.setBounds(0, 0, 404, 261);
        contentPane.add(lblNewLabel_1);
    }

}

