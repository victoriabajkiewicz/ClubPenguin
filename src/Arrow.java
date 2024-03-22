import java.awt.*;

public class Arrow {
    private int size;
    private Color color;
    private int x;
    private int y;
    private int speed;

    public Arrow(int x, int y){
        this.x = x;
        this.y = y;
        speed = 2;
        color = Color.PINK;
        size = 10;
    }


    public Arrow(int x, int y, int speed, Color color, int size){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.color = color;
        this.size = size;
    }

    public void draw(Graphics g2){
        g2.setColor(color);
        g2.fillOval(x,y,size, size);
    }


    public void move(){
        x+=speed;
        y+=speed;
    }

    public void bounce(int w, int l){
        if(x >= w-size){
            speed*=-1;
        }
        if(x < 0){
            speed*=-1;
        }
        if(y >= l-size){
            speed*=-1;
        }
        if(y< 0){
            speed*=-1;
        }

    }


}
