import greenfoot.*; 

public class Instructions extends Actor
{
    public void act() 
    {
        click();
    }    
    
    private void click(){
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new InstructionsScreen());
        }
    }
}
