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
    private GreenfootImage[] imagesS = new GreenfootImage [2];
    private GreenfootImage[] imagesA = new GreenfootImage [2];
    private GreenfootImage[] imagesP = new GreenfootImage [2];
    private int numD=0;
    private int numI=0;
    private int numS;
    private int numA;
    private int numP;
    private int band;
    private boolean pressShot=false;
    
    public void addedToWorld(World Latar)
    {
        for(int i=0;i<imagesD.length && i<imagesI.length;i++)
        {
            imagesD[i]= new GreenfootImage("JD"+i+".png");
            imagesI[i]= new GreenfootImage("JI"+i+".png");
            imagesS[i]= new GreenfootImage("JS"+i+".png");
            imagesA[i]= new GreenfootImage("JA"+i+".png");
            imagesP[i]= new GreenfootImage("JP"+i+".png");
            setImage(imagesD[0]);
            setImage(imagesI[0]);
        }
    }
    
    public void act() 
    {
        // Add your action code here.
        
        int x= getX();
        int y= getY();
        int direction=0;
        int key;
        
        //derecha
        
        if(Greenfoot.isKeyDown("d"))
        {
        setImage(imagesD[numD]);
        band=0;
        direction=0;
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
         band=1;
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
        
        //Saltar
        if(Greenfoot.isKeyDown("space"))
        {
        if(band==0){
        numS=0;
        setImage(imagesS[numS]);
        }
        else if(band==1)
        {
         numS=1;
         setImage(imagesS[numS]);
        }
       }
       
       //Agacharse
        if(Greenfoot.isKeyDown("s"))
        {
        if(band==0){
        numA=0;
        setImage(imagesA[numA]);
        }
        else if(band==1)
        {
         numA=1;
         setImage(imagesA[numA]);
        }
       }
       
       //Apuntar hacia arriba
        if(Greenfoot.isKeyDown("w"))
        {
        if(band==0){
        numP=0;
        direction=2;
        setImage(imagesP[numP]);
        }
        else if(band==1)
        {
         numP=1;
         setImage(imagesP[numP]);
        }
       }
       shot(direction);
    } 
    public void shot(int direction){
           if (pressShot && Greenfoot.isKeyDown("g"))
           {
            Bullet bullet= new Bullet(direction);
            if(direction==0){
             getWorld().addObject(bullet,getX()+95,getY()-45);
            }
            if(direction==2)
            {
             getWorld().addObject(bullet,getX()+95,getY()-140);
            }
            pressShot=false;
            }
            if(!pressShot && !Greenfoot.isKeyDown("g"))
            {
             pressShot=true;
            }
    }
}
