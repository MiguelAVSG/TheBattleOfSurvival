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

        BulletPotition();
        DañosDragones();
        
        }   
        
        private void DañosDragones(){
            Actor dragonHead = getOneObjectAtOffset(0,0, DragonHead.class);
            Actor dragonFront = getOneObjectAtOffset(-4,-7, DragonFront.class);
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
       int derecha=0, izquierda=1, arribaDerecha=2, arribaIzquierda=3,agachadoDerecha=4,agachadoIzquierda=5;
        switch(position)
        {
           case 0: numBu=derecha;
                   setLocation(getX()+12,getY());
                   break;
           case 1: numBu=izquierda;
                   setLocation(getX()-12,getY());
                   break;
           case 2: numBu=arribaDerecha;
                   setLocation(getX()+12,getY()-8);
                   break;
           case 3: numBu=arribaIzquierda;
                   setLocation(getX()-12,getY()-8);
                   break;
           case 4: numBu=agachadoDerecha;
                   setLocation(getX()+12,getY());
                   break;
           case 5: numBu=agachadoIzquierda;
                   setLocation(getX()-12,getY());
                   break;
        }
    }
}
    