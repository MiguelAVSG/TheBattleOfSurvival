import greenfoot.*;  

public class NextLevel2 extends Actor
{
    private int vidas;
    private int puntaje;
    /**
     * Act - do whatever the NextLevel2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public NextLevel2(int vidas,int puntaje) 
    {
        this.vidas = vidas;
        this.puntaje = puntaje;
    }
    
    public void act(){
        if (Greenfoot.mouseClicked(this)){
             Greenfoot.setWorld(new Nivel2(vidas, puntaje));
        }
    }
}
