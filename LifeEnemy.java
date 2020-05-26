import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LifeEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeEnemy extends Actor
{
    /**
     * Act - do whatever the LifeEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage imagen;
    int contador;
    String mensaje;
    int x, y, height, contenedor;
    
    
    
    
    public LifeEnemy (int disminuirvida, int x, int y,int height) 
    {
        this.contador = disminuirvida;
        imagen = new GreenfootImage(250,150);
        imagen.setColor(new greenfoot.Color(200,0,0,255));
        imagen.setFont(new greenfoot.Font ("Verdana", 24));
        this.x = x;
        this.y = y;
        this.height = height;
        dibuja();
    }    
    
    public void dibuja()
    {
        imagen.clear();
        imagen.setColor(new Color(200,200,0,255));
        imagen.drawRect(x,y,contenedor, height);
        imagen.setColor(new Color (255,255,255,255));
        imagen.drawString(String.valueOf(contador),25,19);
        setImage(imagen);
    }
    
    public void incrementar()
    {
        contador++;
        dibuja();
    }
        
    public void decrementar()
    {
        contador--;
        dibuja();
    }
    
    public int ObtenerValor()
    {
        return contador;
    }  
}
