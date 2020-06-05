import greenfoot.*; 

public class NextLevel3 extends Actor
{
    private int vidas;
    private int puntaje;
    public NextLevel3(int vidas,int puntaje) 
    {
        this.vidas = vidas;
        this.puntaje = puntaje;
        
        
    }
    
    public void act(){
        if (Greenfoot.mouseClicked(this)){
             Greenfoot.setWorld(new Nivel3(vidas, puntaje));
        }
    }   
}
