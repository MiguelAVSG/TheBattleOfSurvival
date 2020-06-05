import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Player extends Actor
{
    GreenfootSound shotSound = new GreenfootSound("SoundPistolFN.mp3");
    private GreenfootImage[] imagesR = new GreenfootImage [2];
    private GreenfootImage[] imagesL = new GreenfootImage [2];
    
    private GreenfootImage[] imagesS = new GreenfootImage [2];
    private GreenfootImage[] imagesA = new GreenfootImage [2];
    private GreenfootImage[] imagesP = new GreenfootImage [2];
    
    private int numR=0;
    private int numL=0;
    private int numS;
    private int numA;
    private int numP;
    private int band;
    private int indexCount;
    
    public int direction;
    
    private boolean pressShot=false;
    private boolean pressJump=false;
    
    public void addedToWorld(World Latar)
    {
        for(int i=0;i<imagesR.length && i<imagesL.length;i++)
        {
            imagesR[i]= new GreenfootImage("JD"+i+".png");
            imagesL[i]= new GreenfootImage("JI"+i+".png");
            imagesS[i]= new GreenfootImage("JS"+i+".png");
            imagesA[i]= new GreenfootImage("JA"+i+".png");
            imagesP[i]= new GreenfootImage("JP"+i+".png");
            setImage(imagesR[0]);
            setImage(imagesL[0]);
        }
    }
    
    public void act() 
    {
        int x= getX();
        int y= 455;
        int key;
            
        if(Greenfoot.isKeyDown("d"))
        {
           Right();
        }
        else if(Greenfoot.isKeyDown("a"))
        {
            Left();
        }
        else if(pressJump && Greenfoot.isKeyDown("space"))
        {
           Jump();
        }
        else if(!pressJump && !Greenfoot.isKeyDown("space")){
           pressJump=true;
        }
        else if(Greenfoot.isKeyDown("s"))
        {
             Bend();
        }
        else if(Greenfoot.isKeyDown("w"))
        {
            AimUp();
       }
       Shot(direction);
    } 
    
    public void Shot(int direction){
           if (pressShot && Greenfoot.isKeyDown("k"))
           {
               Bullet bullet= new Bullet(direction);
               shotSound.play();
                 switch(direction){
                     case 0: getWorld().addObject(bullet,getX()+95,getY()-45);
                             break;
                     case 1: getWorld().addObject(bullet,getX()-95,getY()-45);
                             break;
                     case 2: getWorld().addObject(bullet,getX()+95,getY()-140);
                            break;
                     case 3: getWorld().addObject(bullet,getX()-90,getY()-155);
                             break;
                     case 4: getWorld().addObject(bullet,getX()+90,getY()-15);
                            break;
                     case 5: getWorld().addObject(bullet,getX()-90,getY()-15);
                             break;
                 }
               pressShot=false;
            }
           if(!pressShot && !Greenfoot.isKeyDown("k")){
                 pressShot=true;
            }
    }
    
    public void Right(){
           setImage(imagesR[numR]);
           band=0;
           direction=0;
           indexCount++;
             if(indexCount>7){
                numR++;
                indexCount=0;
                setLocation(getX()+15,getY());
             }
             if(numR>=imagesR.length){
                 numR=0;
             }
    }
    
    public void Left(){
            setImage(imagesL[numL]);
            band=1;
            direction=1;
            indexCount++;
               if(indexCount>7){
                numL++;
                indexCount=0;
                setLocation(getX()-15,getY());
               }
               if(numL>=imagesL.length){
                 numL=0;
               }
    }
    
    public void Jump(){
        if(band==0){
                numS=0;
                direction=0;
                setLocation(getX(), getY());
                setImage(imagesS[numS]);
                
           }
           
           else if(band==1)
           {
               numS=1;
               direction=1;
               setLocation(getX(),getY());
               setImage(imagesS[numS]);
           }      
           pressJump=false;
    }
    
    public void Bend(){
        int ybend=485;
        if(band==0){
                numA=0;
                direction=4;
                
                setLocation(getX(),ybend);
                setImage(imagesA[numA]);
                
                }
              
              else if(band==1)
              {
                numA=1;
                direction=5;
                setLocation(getX(),ybend);
                setImage(imagesA[numA]);
              }
    }
    
    public void AimUp(){
        if(band==0){
               numP=0;
               direction=2;
               setLocation(getX(),getY());
               setImage(imagesP[numP]);
             }
             else if(band==1)
             {
               numP=1;
               direction=3;
               setLocation(getX(),getY());
               setImage(imagesP[numP]);
            
              }
    }
}