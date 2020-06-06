import greenfoot.*;  

public class Nivel2 extends Niveles
{
    PointsAndLife points;
    PointsAndLife lifes;
    PointsAndLife vidasenemigo;
    DragonFront dragonFront = new DragonFront();

    public Nivel2(int lifes, int points)
    {    
        prepare();
        this.points = new PointsAndLife (points , "Puntaje: ");
        this.lifes = new PointsAndLife(lifes, "Vidas: ");
        vidasenemigo = new PointsAndLife(200, "Enemigo: ");
        addObject(this.points,150,85);
        addObject(this.lifes,150,115);
        addObject(vidasenemigo, 500, 85);
        PasarNivel();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(dragonFront,910,400);
    }

    public void act(){
        PasarNivel();
    }

    public void PasarNivel(){
        if(vidasenemigo.getValue() == 100){
            removeObject(dragonFront);
            lifes.incrementLife();
            Greenfoot.setWorld(new SavedScreen2(lifes, points));
        }

    }
}
