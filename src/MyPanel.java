import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyPanel extends JPanel {
//    int xLoc = 400;
//    int yLoc = -20;
//    int xVel = 2;
//    int yVel = 2;

    int points = 0;




    int random = 0;

    //Arrow myArrow;
    Arrow[] arrow20;
    public MyPanel(){
        setBackground(Color.BLACK);

        setPreferredSize(new Dimension(500, 500));
setFocusable(true);
requestFocus();
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                if(e.getKeyCode()==37){

                    //set image

                }
            }
        });
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                if(e.getKeyCode()==38){
                    //set image

                }
            }
        });
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                if(e.getKeyCode()==39){
                    //set image

                }
            }
        });
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                if(e.getKeyCode()==40){
                    //set image

                }
            }
        });


        //left = 37
        //up = 38
        //right = 39
        //down = 40






        arrow20 = new Arrow[20];
        for(int i = 0; i < arrow20.length; i++){

            int x =  400;
            int y = 0;
            int speed = 5;
            random = (int)((Math.random()*4)+1);

            Color randColor = Color.BLACK;

           if(random == 1){
              randColor = Color.RED;

           }
           else if(random == 2){
               randColor = Color.YELLOW;
           }
           else if(random == 3){
                randColor = Color.GREEN;
           }
           else if(random == 4){
                randColor = Color.BLUE;
           }

            arrow20[i] = new Arrow(x, y, speed, randColor);
        }



    }




    @Override
    public void paintComponent(Graphics g){
        //super goes up a hierarchy level and calls the method
        super.paintComponent(g);
        g.setColor(Color.GRAY);
        g.fillRect(0,150,100,100);


//draws arrow depending on its color and randomization
        for(int i = 0; i < arrow20.length; i++){
            if(random == 1){
               arrow20[i].drawRight(g);
                arrow20[i].move();
            }
            else if(random == 2){
                arrow20[i].drawUp(g);
                arrow20[i].move();
            }
            else if(random == 3){
                arrow20[i].drawLeft(g);
                arrow20[i].move();
            }
            else if(random == 4){
                arrow20[i].drawDown(g);
                arrow20[i].move();
            }


        }




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
