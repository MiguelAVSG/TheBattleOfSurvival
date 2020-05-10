import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador1 extends Actor
{
    /**
     * Act - do whatever the Jugador1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage[] imagesD = new GreenfootImage [2];
    private GreenfootImage[] imagesI = new GreenfootImage [2];
    private int numD=0;
    private int numI=0;
    
    public void addedToWorld(World Latar)
    {
        for(int i=0;i<imagesD.length && i<imagesI.length;i++)
        {
            imagesD[i]= new GreenfootImage("JD"+i+".png");
            imagesI[i]= new GreenfootImage("JI"+i+".png");
            setImage(imagesD[0]);
            setImage(imagesI[0]);
        }
    }
    
    public void act() 
    {
        // Add your action code here.
        
        int x= getX();
        int y= getY();
        int key;
        
        //derecha
        
        if(Greenfoot.isKeyDown("d"))
        {
        setImage(imagesD[numD]);
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(100);
            numD++;
         } catch (Exception e) {
            System.out.println(e);
         }
         
        if(numD>=imagesD.length)numD=0;
        setLocation(x+10,y);
        }
        
        
        //izquierda
      
        if(Greenfoot.isKeyDown("a"))
        {
         setImage(imagesI[numI]);
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(100);
            numI++;
         } catch (Exception e) {
            System.out.println(e);
         }
        if(numI>=imagesI.length)numI=0;
        setLocation(x-10,y);
        }
       
    }    
}
