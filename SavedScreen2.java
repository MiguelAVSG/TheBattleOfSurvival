import greenfoot.*;  

public class SavedScreen2 extends World
{
    PointsAndLife life;
    PointsAndLife points;
    
    public SavedScreen2(PointsAndLife life, PointsAndLife points)
    {    
        super(870, 550, 1);
        this.points = points;
        this.life = life;
        prepare();
    }
    
    private void prepare()
    {int nivel3 = 3;
        SaveButton saveButton = new SaveButton(life.getValue(), points.getValue(), nivel3);
        addObject(saveButton,225,477);
        NextLevel3 nextLevel3 = new NextLevel3(life.getValue(), points.getValue());
        addObject(nextLevel3,554,488);
        Play play = new Play();
        addObject(play,439,487);
        play.setLocation(471,485);
        removeObject(play);
    }
}
