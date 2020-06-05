import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CargarPartida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoadGame extends Actor
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            int datos[];
            datos = new int[3];
            System.out.println("Loading Game Files...");
            game(datos);
        }
        
    }
    
    public void game(int[] datos){
        
        if(datos[2] == 2){
            Greenfoot.setWorld(new Nivel2(datos[0],datos[1]));
        }
        if(datos[2] == 3){
             Greenfoot.setWorld(new Nivel3(datos[0],datos[1]));
        }
    }
}
