import greenfoot.*; 

public class LoadGame extends Actor
{
    SaveGame saveGame = SaveGame.getSaveGame();
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            int datos[];
            datos = new int[3];
            
            datos = saveGame.readFile("Saves.txt");
            game(datos);
        }
    }
    
    public void game(int[] datos){
        int mision2=2, mision3=3;
        if(datos[2] == mision2){
            Greenfoot.setWorld(new Nivel2(datos[0],datos[1]));
        }
        if(datos[2] == mision3){
            Greenfoot.setWorld(new Nivel3(datos[0],datos[1]));
        }
    }
}
