import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
    public class Main {
    public static void main(String[] args) {
JFrame frame = new JFrame();
        frame.setSize(500,500);


        MyPanel panel = new MyPanel();


        ImageIcon leftPic = new ImageIcon("Images/penguinL.jpg");
        ImageIcon upPic = new ImageIcon("Images/penguinU.jpg");
        ImageIcon rightPic = new ImageIcon("Images/penguinR.jpg");
        ImageIcon downPic = new ImageIcon("Images/penguinD.jpg");
        leftPic.setImage(leftPic.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT));
        upPic.setImage(upPic.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT));
        rightPic.setImage(rightPic.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT));
        downPic.setImage(downPic.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT));


        JLabel leftLabel = new JLabel(leftPic);
        JLabel upLabel = new JLabel(upPic);
        JLabel rightLabel = new JLabel(rightPic);
        JLabel downLabel = new JLabel(downPic);

        panel.add(leftLabel);
        panel.add(upLabel);
        panel.add(rightLabel);
        panel.add(downLabel);







        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(57,150,100));






    }
}