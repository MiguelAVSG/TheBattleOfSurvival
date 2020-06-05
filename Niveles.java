import greenfoot.*;  

public class Niveles extends World
{
    GreenfootSound mainMusic = new GreenfootSound("maintheme.mp3");
    
    public Niveles()
    { 
        super(1024, 600, 1); 
         Player player = new Player();
        addObject(player,475,397);
        player.setLocation(488,455);
    }
    
    public void act(){
     mainMusic.playLoop();
    }
}
