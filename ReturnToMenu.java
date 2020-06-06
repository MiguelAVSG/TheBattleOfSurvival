import greenfoot.*;  

public class ReturnToMenu extends Actor
{
    public void act() 
    {
        click();
    }    
    
    private void click(){
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Menu());
            Greenfoot.stop();
        }
    }
}
