import greenfoot.*; 
import java.awt.*;

public class PointsAndLife extends Actor
{
    private GreenfootImage image;
    private int counter;
    private String message;
    
    public PointsAndLife (int contador, String mensaje) 
    {
        this.counter = contador;
        this.message = mensaje;
        image = new GreenfootImage(250,150);
        image.setColor(new greenfoot.Color(200,0,0,255));
        image.setFont(new greenfoot.Font ("Verdana", 24));
        draw();
    }    
    
    public void draw()
    {
        image.clear();
        image.drawString(message+counter,20,20);
        setImage(image);
    }
    
    public void increment()
    {
        counter = counter+10;
        draw();
    }
    
    public void incrementLife(){
        counter++;
        draw();
    }
        
    public void decrement()
    {
        counter--;
        draw();
    }
    
    public void decrementdouble(){
        counter = counter - 2;
        draw();
    }
    
    public int getValue()
    {
        return counter;
    }
}
