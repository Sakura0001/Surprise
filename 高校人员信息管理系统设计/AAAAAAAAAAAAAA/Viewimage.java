package AAAAAAAAAAAAAA;

import javax.swing.*;
import java.awt.*;

class Viewimage extends JLabel {
    private String imageFile;

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if(imageFile!=null&&!"".equals(imageFile)){
            try{
                ImageIcon icon =new ImageIcon(this.imageFile);
                Image img = icon.getImage();
                g.drawImage(img,0,0,this.getWidth(),this.getHeight(),null);
            }catch(Exception e) {

            }
        }
    }
    public String getImageFile() {
        return imageFile;
    }
    public void setImageFile (String imageFile) {
        this.imageFile=imageFile;
        this.repaint();
    }
}
