import greenfoot.*; 

public class Fire extends Actor
{
    private int yVelocity=3;
    private int yDirection=1;
    private int dir;
    private int xVelocity=2;
    private int xDirection=1;
    private int indexCount;
    private GreenfootImage[] imagesF = new GreenfootImage [6];
    private int numF=0;
    
    {
        for(int contador=0;contador<imagesF.length;contador++)
        {
            imagesF[contador]= new GreenfootImage("f"+contador+".png");
            setImage(imagesF[0]);
        }
    }
   
    public Fire (int dir){
        this.dir = dir;
        if(dir == 1)
        turn(0);
        else
        turn(0);
    }
    
    public void act() {
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
            Nivel1 nivel1= (Nivel1)getWorld();
            nivel1.lifes.decrement();
            nivel1.points.decrement();
            getWorld().removeObject(this);
            if(nivel1.lifes.getValue()<=0){
               nivel1.removeObject(Player);
               Greenfoot.setWorld(new GameOver());
            }
        }
    }
}   

