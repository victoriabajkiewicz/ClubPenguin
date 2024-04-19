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


    public void drawRight(Graphics g2){
        g2.setColor(color);
        int[] xArray = {0,6,6,9,6,6,0};
        int[] yArray = {5,5,6,4,2,3,3};
        g2.fillPolygon(xArray,yArray,7);

    }
    public void drawUp(Graphics g2){
        g2.setColor(color);
        int[] xArray = {1,3,3,4,2,0,1};
        int[] yArray = {0,0,6,6,9,6,6};
        g2.fillPolygon(xArray,yArray,7);

    }
    public void drawLeft(Graphics g2){
        g2.setColor(color);
        int[] xArray = {9,9,3,3,0,3,3};
        int[] yArray = {5,3,3,2,4,6,5};
        g2.fillPolygon(xArray,yArray,7);

    }
    public void drawDown(Graphics g2){
        g2.setColor(color);
        int[] xArray = {1,3,3,4,2,0,1};
        int[] yArray = {9,9,3,3,0,3,3};
        g2.fillPolygon(xArray,yArray,7);

    }




    public void move(){
        y+=speed;
    }


}
