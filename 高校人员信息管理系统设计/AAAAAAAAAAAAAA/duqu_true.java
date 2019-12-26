package AAAAAAAAAAAAAA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class duqu_true extends JFrame {

    private JPanel contentPane;
    private Viewimage image;
    /**
     * Launch the application.
     */
    public  void play() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    duqu_true frame = new duqu_true();
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
    public duqu_true() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        image = new Viewimage();
        image.setImageFile("C:\\Users\\asus\\Desktop\\≥…π¶(1).png");
        image.setBounds(42, 55, 138, 109);
        contentPane.add(image);

        JLabel lblNewLabel = new JLabel("\u606D\u559C\u60A8∂¡»°\u6210\u529F\r\n");
        lblNewLabel.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 23));
        lblNewLabel.setBounds(190, 94, 188, 38);
        contentPane.add(lblNewLabel);

        JButton btnNewButton = new JButton("\u8FD4\u56DE\r\n");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                login m = new login();
                m.play();
            }
        });
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\\u8FD4 \u56DE.png"));
        btnNewButton.setBounds(125, 185, 177, 54);
        contentPane.add(btnNewButton);
    }
}
