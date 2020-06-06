import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bullet extends Actor
{
    private int position;
    private int numBu;

    public Bullet(int direction){
        position=direction;
    }

    public void act() 
    {
        setImage("bullet"+numBu+".png");
        BulletPotition();
        DañosDragones();

    }   

    private void DañosDragones(){
        Actor dragonHead = getOneObjectAtOffset(0,0, DragonHead.class);
        Actor dragonFront = getOneObjectAtOffset(0,0, DragonFront.class);
        Actor dragonBody = getOneObjectAtOffset(0,0, DragonBody.class);
        if(getX()>=getWorld().getWidth()-3 || (getX())<=3){
            getWorld().removeObject(this);
        }
        else if(dragonHead != null )
        {
            Nivel1 nivel1= (Nivel1)getWorld();
            nivel1.vidasenemigo.decrement();
            nivel1.points.increment();
            getWorld().removeObject(this);
        }else if(dragonFront != null )
        {
            Nivel2 nivel2= (Nivel2)getWorld();
            nivel2.vidasenemigo.decrement();
            nivel2.points.increment();
            getWorld().removeObject(this);
        }else if(dragonBody != null )
        {
            Nivel3 nivel3= (Nivel3)getWorld();
            nivel3.vidasenemigo.decrement();
            nivel3.points.increment();
            getWorld().removeObject(this);
        }
    }

    public void BulletPotition(){
        setImage("bullet"+numBu+".png");
        int right=0, left=1, topRight=2, topLeft=3,bendRight=0, bendLeft=1; 
        switch(position)
        {
            case 0: numBu=right;
            setLocation(getX()+12,getY());
            break;
            case 1: numBu=left;
            setLocation(getX()-12,getY());
            break;
            case 2: numBu=topRight;
            setLocation(getX()+12,getY()-8);
            break;
            case 3: numBu=topLeft;
            setLocation(getX()-12,getY()-8);
            break;
            case 4: numBu=bendRight;
            setLocation(getX()+12,getY());
            break;
            case 5: numBu=bendLeft;
            setLocation(getX()-12,getY());
            break;
        }
    }
}
 