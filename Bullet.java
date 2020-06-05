import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bullet extends Actor
{
    int position;
    int numBu;
    
    public Bullet(int direction){
        position=direction;
    }
    
    public void act() 
    {
        
        setImage("bullet"+numBu+".png");
        switch(position)
        {
           case 0: numBu=0;
                   setLocation(getX()+12,getY());
                   break;
           case 1: numBu=1;
                   setLocation(getX()-12,getY());
                   break;
           case 2: numBu=2;
                   setLocation(getX()+12,getY()-8);
                   break;
           case 3: numBu=3;
                   setLocation(getX()-12,getY()-8);
                   break;
           case 4: numBu=0;
                   setLocation(getX()+12,getY());
                   break;
           case 5: numBu=1;
                   setLocation(getX()-12,getY());
                   break;
        }
            Actor DragonHead = getOneObjectAtOffset(0,0, DragonHead.class);
            Actor DragonFront = getOneObjectAtOffset(-4,-7, DragonFront.class);
            Actor DragonBody = getOneObjectAtOffset(0,0, DragonBody.class);
            
        if(getX()>=getWorld().getWidth()-3 || (getX())<=3){
           getWorld().removeObject(this);
        }
        else if(DragonHead != null )
        {
            MyWorld world= (MyWorld)getWorld();
            
            world.vidasenemigo.decrement();
            world.points.increment();
            getWorld().removeObject(this);
        }else if(DragonFront != null )
        {
            Nivel2 nivel2= (Nivel2)getWorld();
            
            nivel2.vidasenemigo.decrement();
            nivel2.points.increment();
            getWorld().removeObject(this);
        }
       
       
       
        
        }   
   }

    