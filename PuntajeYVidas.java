import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class PuntajeYVidas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PuntajeYVidas extends Actor
{
    /**
     * Act - do whatever the PuntajeYVidas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage imagen;
    int contador;
    String mensaje;
    
    
    
    public PuntajeYVidas (int contador, String mensaje) 
    {
        this.contador = contador;
        this.mensaje = mensaje;
        imagen = new GreenfootImage(250,150);
        imagen.setColor(new greenfoot.Color(200,0,0,255));
        imagen.setFont(new greenfoot.Font ("Verdana", 24));
        dibuja();
    }    
    
    public void dibuja()
    {
        imagen.clear();
        imagen.drawString(mensaje+contador,20,20);
        setImage(imagen);
    }
    
    public void incrementar()
    {
        contador = contador+10;
        dibuja();
    }
    
    public void incrementarvida(){
        contador++;
        dibuja();
    }
        
    public void decrementar()
    {
        contador--;
        dibuja();
    }
    
    public void decrementardoble(){
        contador = contador - 2;
        dibuja();
    }
    
    public int ObtenerValor()
    {
        return contador;
    }
}
