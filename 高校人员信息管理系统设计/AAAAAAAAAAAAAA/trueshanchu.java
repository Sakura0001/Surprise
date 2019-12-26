package AAAAAAAAAAAAAA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class trueshanchu extends JFrame {

    private JPanel contentPane;
    private Viewimage image;
    /**
     * Launch the application.
     */
    public  void play() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    trueshanchu frame = new trueshanchu();
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
    public trueshanchu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton button = new JButton("New button");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                chaxun m1= new chaxun();
                m1.play();
            }
        });
        button.setIcon(new ImageIcon("C:\\Users\\asus\\Desktop\\00`DSUU~HEX}YHAXU_V5)Z8.png"));
        button.setBounds(10, 200, 414, 51);
        contentPane.add(button);


        image =new Viewimage();
        image.setImageFile("C:\\Users\\asus\\Desktop\\MY[CMCL6OZW)3PHRA{5U(CM.png");
        image.setBounds(0, 0, 434, 261);
        contentPane.add(image);
    }
}
