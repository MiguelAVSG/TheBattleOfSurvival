import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.lang.*;
import java.util.*;
/**buffered
 * Write a description of class SaveGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SaveGame
{
    private static SaveGame save;
    
    public SaveGame(){
    }
    
    public static SaveGame getSaveGame(){
       
        if (save == null){
            save = new SaveGame();
            
        }
        return save;
    }
    
    public void setFile(int vida, int puntaje, int nivel){
        String vidaActual = String.valueOf(vida);
        String puntajeActual = String.valueOf(puntaje);
        String nivelActual = String.valueOf(nivel);
        
        try {
            
            String contenido = vidaActual + puntajeActual + nivelActual;
            File file = new File("Saves.txt");
            
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(vidaActual + "\n");
            bw.write(puntajeActual + "\n");
            bw.write(nivelActual + "\n");
            
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public int [] readFile(String nameFile){
        Scanner archivo = null;
        int datos[];
        datos = new int[3];
        
        try{
            archivo = new Scanner(new File(nameFile));
            
        }catch(Exception e){
            System.err.println("no hay archivo");
        }
        
        int num = 0, i = 1;
        
        while (archivo.hasNext()){
            num = archivo.nextInt();
            
            if (i == 1){
                datos[0] = num;
                
            }
            if (i == 2){
                datos[1] = num;
                
            }
            if (i == 3){
                datos[2] = num;
                
            }
            i++;
        }
        return datos;
    }
    
}
