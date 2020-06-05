import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SaveButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SaveButton extends Actor
{
    private static SaveButton save;
    private static int lifes;
    private static int points;
    private static int level;
    
    public SaveButton(int lifes,int points, int level){
        this.lifes=lifes;
        this.points=points;
        this.level=level;
    }
    
    public static SaveButton getSaveGame(int lifes, int points, int level){
       if (save == null){
           save = new SaveButton(lifes,points,level);
        }
       else{
           save.SetAll(lifes,points,level);
        }
        return save;
    }
    
    public void act(){
        
        if (Greenfoot.mouseClicked(this)){
             SaveGame save = SaveGame.getSaveGame();
             
             save.setFile(lifes,points,level);
        }
    }
    
    public void SetAll(int lifes,int points, int level){
        this.lifes = lifes;
        this.points = points;
        this.level = level;
    }
}
