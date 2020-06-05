import greenfoot.*;

public class Play extends Actor
{
    public void act() 
    {
        click();
    }    
    
    private void click(){
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Nivel1());
        }
    }
}
