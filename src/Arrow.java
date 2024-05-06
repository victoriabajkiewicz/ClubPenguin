import java.awt.*;

public class Arrow {
    private Color color;
    private int x;
    private int y;
    private int speed;


    public Arrow(int x, int y, int speed, Color color){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.color = color;
    }
    int[] xArrayR = {0,60,60,90,60,60,0};
    int[] yArrayR = {50,50,60,40,20,30,30};

    int[] xArrayU = {10,30,30,40,20,0,10};
    int[] yArrayU = {0,0,60,60,90,60,60};

    int[] xArrayL = {90,90,30,30,0,30,30};
    int[] yArrayL = {50,30,30,20,40,60,50};

    int[] xArrayD = {10,30,30,40,20,0,10};
    int[] yArrayD = {90,90,30,30,0,30,30};

    public void drawRight(Graphics g2){
        g2.setColor(color);
        g2.fillPolygon(xArrayR,yArrayR,7);

    }
    public void drawUp(Graphics g2){
        g2.setColor(color);
        g2.fillPolygon(xArrayU,yArrayU,7);

    }
    public void drawLeft(Graphics g2){
        g2.setColor(color);
        g2.fillPolygon(xArrayL,yArrayL,7);

    }
    public void drawDown(Graphics g2){
        g2.setColor(color);
        g2.fillPolygon(xArrayD,yArrayD,7);

    }




    public void move(){
       // y+=speed;
        //for loop for x and y array to make it move
        for(int i = 0; i < yArrayR.length; i++){
            yArrayR[i]+=2;
            yArrayU[i]+=2;
            yArrayD[i]+=2;
            yArrayL[i]+=2;
        }
    }


}
