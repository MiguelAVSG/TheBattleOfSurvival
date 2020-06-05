import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Fire extends Actor

    {
    private int yVelocity=3;
    private int yDirection=1;
    int dir;
    private int xVelocity=2;
    private int xDirection=1;
    private int indexCount;
    
    
     private GreenfootImage[] imagesF = new GreenfootImage [6];
    
    int numF=0;
    
    //public void addedToWorld(World world)
    {
        for(int i=0;i<imagesF.length;i++)
        {
            imagesF[i]= new GreenfootImage("f"+i+".png");
            setImage(imagesF[0]);
        }
    }
   

    /**
     * Act - do whatever the fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Fire (int dir){
        this.dir = dir;
        if(dir == 1)
        turn(0);
        else
        turn(0);
        
    }
    
    public void act() {
    
        // Add your action code here.
       int x= getX();
       int y= getY();
       
        setLocation(x, y + yVelocity * yDirection);
        if(isAtEdge()) {
        yDirection = yDirection *+1;
        
        
       } 
       DañoPersonaje();
       
         xDirection = xDirection *-1;
         
       setImage(imagesF[numF]);
       indexCount++;
       if(indexCount>7){
                numF++;
                indexCount=0;
       }
       if(numF>=imagesF.length){
                 numF=0;
       }
        
        
       }
       
       private void DañoPersonaje(){
           Actor Player =(Actor) getOneObjectAtOffset(0,0, Player.class);
       if(isAtEdge()){
         getWorld().removeObject(this);
        }else
        
        if(Player != null)
        {
            MyWorld world= (MyWorld)getWorld();
            world.lifes.decrement();
            world.points.decrement();
            getWorld().removeObject(this);
            if(world.lifes.getValue()<=0){
               world.removeObject(Player);
               Greenfoot.setWorld(new GameOver());
            }
        }
        }
         
}   

