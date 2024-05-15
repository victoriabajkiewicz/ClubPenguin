import javax.swing.*;
import java.awt.*;
    public class Main {
    public static void main(String[] args) {
JFrame frame = new JFrame();
        frame.setSize(500,500);

        

        MyPanel panel = new MyPanel();
       // panel.setLayout(new GridLayout(3,3));


        // ImageIcon leftPic = new ImageIcon("penguinL.png");
        // ImageIcon upPic = new ImageIcon("penguinU.png");
        // ImageIcon rightPic = new ImageIcon("penguinR.png");
        // ImageIcon downPic = new ImageIcon("penguinD.png");
        // leftPic.setImage(leftPic.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT));
        // upPic.setImage(upPic.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT));
        // rightPic.setImage(rightPic.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT));
        // downPic.setImage(downPic.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT));


        // JLabel leftLabel = new JLabel(leftPic);
        // JLabel upLabel = new JLabel(upPic);
        // JLabel rightLabel = new JLabel(rightPic);
        // JLabel downLabel = new JLabel(downPic);

        // panel.add(leftLabel);
        // panel.add(upLabel);
        // panel.add(rightLabel);
        // panel.add(downLabel);

    // leftLabel.setVisible(false);

        
    //     if(panel.code==37){
    //          leftLabel.setVisible(true);
    //     }
       
    //     upLabel.setVisible(true);
    //     rightLabel.setVisible(true);
    //     downLabel.setVisible(true);

        // public JLabel getLeftLabel(){
        //     return leftLabel;
        // }
        
       

        //left = 37
        //up = 38
        //right = 39
        //down = 40








        frame.add(panel);
       // frame.pack();
        frame.setVisible(true);
       // panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(255,255,255));






    }
}