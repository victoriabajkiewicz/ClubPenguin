import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    int xLoc = 400;
    int yLoc = -20;
    int xVel = 2;
    int yVel = 2;



    Arrow myArrow;
    Arrow[] arrow20;
    public MyPanel(){
        setBackground(Color.GREEN);
        myArrow = new Arrow(200, 300);
        setPreferredSize(new Dimension(500, 500));

        fillRect(200,100,10,50);

        arrow20 = new Arrow[20];
        for(int i = 0; i < arrow20.length; i++){
          //  int size = ;
            int x =  (int)(Math.random()*500);
            int y = (int)(Math.random()*500);
            int randSpeed = (int)(Math.random()*5)+1;
            int randR = (int)(Math.random()*255);
            int randG = (int)(Math.random()*255);
            int randB = (int)(Math.random()*255);
            Color randColor = new Color(randR, randG, randB);
            arrow20[i] = new Arrow(x, y, randSpeed, randColor, size);
        }



    }

    @Override
    public void paintComponent(Graphics g){
        //super goes up a hierarchy level and calls the method
        super.paintComponent(g);
        System.out.println("hi");
        myArrow.draw(g);
        myArrow.move();
        myArrow.bounce(getWidth(), getHeight());
        for(int i = 0; i < arrow20.length; i++){
            arrow20[i].draw(g);
            arrow20[i].move();
            arrow20[i].bounce(getWidth(), getHeight());
        }
        //yLoc++;



        //delay to control ball's speed
        try{
            Thread.sleep(10);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }


        // calls paintComponent again
        repaint();

    }



}
