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

    ImageIcon leftPic = new ImageIcon("penguinL.png");
    ImageIcon upPic = new ImageIcon("penguinU.png");
    ImageIcon rightPic = new ImageIcon("penguinR.png");
    ImageIcon downPic = new ImageIcon("penguinD.png");

    JLabel leftLabel = new JLabel(leftPic);
    JLabel upLabel = new JLabel(upPic);
    JLabel rightLabel = new JLabel(rightPic);
    JLabel downLabel = new JLabel(downPic);

public static int code = 0;


    int random = 0;

    //Arrow myArrow;
    Arrow[] arrow20;
    public MyPanel(){

        // ImageIcon leftPic = new ImageIcon("penguinL.png");
        // ImageIcon upPic = new ImageIcon("penguinU.png");
        // ImageIcon rightPic = new ImageIcon("penguinR.png");
        // ImageIcon downPic = new ImageIcon("penguinD.png");
        leftPic.setImage(leftPic.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        upPic.setImage(upPic.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        rightPic.setImage(rightPic.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        downPic.setImage(downPic.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));


        // JLabel leftLabel = new JLabel(leftPic);
        // JLabel upLabel = new JLabel(upPic);
        // JLabel rightLabel = new JLabel(rightPic);
        // JLabel downLabel = new JLabel(downPic);

        add(leftLabel);
        add(upLabel);
        add(rightLabel);
        add(downLabel);

        leftLabel.setVisible(false);
        rightLabel.setVisible(false);
        upLabel.setVisible(false);
        downLabel.setVisible(false);
        
        setBackground(Color.BLACK);

        setPreferredSize(new Dimension(500, 500));
//keylistene
        setFocusable(true);
        requestFocus();
        //left = 37
        //up = 38
        //right = 39
        //down = 40
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                if(e.getKeyCode()==37){

                    //set image
                   // leftLabel.setVisible(true);
//getJLabel.setVisible(true);
                     code = e.getKeyCode();
                    leftLabel.setVisible(true);
                    rightLabel.setVisible(false);
                    upLabel.setVisible(false);
                    downLabel.setVisible(false);
                }
                if(e.getKeyCode()==38){
                    code = e.getKeyCode();
                    leftLabel.setVisible(false);
                    upLabel.setVisible(true);
                    rightLabel.setVisible(false);
                    downLabel.setVisible(false);
                }
                if(e.getKeyCode()==39){
                    rightLabel.setVisible(true);
                    leftLabel.setVisible(false);
                    upLabel.setVisible(false);
                    downLabel.setVisible(false);
                }
                if(e.getKeyCode()==40){
                    downLabel.setVisible(true);
                    upLabel.setVisible(false);
                    leftLabel.setVisible(false);
                    rightLabel.setVisible(false);
                }
                
            }
        });

      
        
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                if(e.getKeyCode()==38){
                    //set image
                    code = e.getKeyCode();

                }
            }
        });
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                if(e.getKeyCode()==39){
                    //set image
                    code = e.getKeyCode();

                }
            }
        });
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                if(e.getKeyCode()==40){
                    //set image
                     code = e.getKeyCode();
                    

                }
            }
        });




        arrow20 = new Arrow[20];
        for(int i = 0; i < arrow20.length; i++){

            
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

            arrow20[i] = new Arrow(randColor);
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
            if(arrow20[i].getColor() == Color.RED){
               arrow20[i].drawRight(g);
                arrow20[i].move();
            }
            else if(arrow20[i].getColor() == Color.YELLOW){
                arrow20[i].drawUp(g);
                arrow20[i].move();
            }
            else if(arrow20[i].getColor() == Color.GREEN){
                arrow20[i].drawLeft(g);
                arrow20[i].move();
            }
            else if(arrow20[i].getColor() == Color.BLUE){
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
