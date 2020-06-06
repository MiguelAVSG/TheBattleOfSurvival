import greenfoot.*;  
public class Nivel1 extends Niveles
{

    PointsAndLife points;
    PointsAndLife lifes;
    PointsAndLife vidasenemigo;
    DragonHead dragonHead = new DragonHead();

    public Nivel1()
    {    
        prepare();
        points = new PointsAndLife (0, "Puntaje: ");
        lifes = new PointsAndLife(5, "Vidas: ");
        vidasenemigo = new PointsAndLife(300, "Enemigo: ");
        addObject(points,150,85);
        addObject(lifes,150,115);
        addObject(vidasenemigo, 500, 85);
        PasarNivel();
    }

    private void prepare()
    {
        addObject(dragonHead,490,78);
    }

    public void act(){
        PasarNivel();
        mainMusic.playLoop();
    }

    public void PasarNivel(){

        if(vidasenemigo.getValue()==200){
            removeObject(dragonHead);
            lifes.incrementLife();
            Greenfoot.setWorld(new SaveScreen(lifes, points));
        } 
    }

}
