import greenfoot.*; 

public class Exit extends Actor
{
    public void act() 
    {
        click();
    }    
    
    private void click(){
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.stop();
        }
    }
}
