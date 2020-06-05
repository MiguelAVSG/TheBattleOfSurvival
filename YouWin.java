import greenfoot.*; 


public class YouWin extends World
{
    public YouWin()
    {    
        
        super(800, 500, 1); 
        prepare();
    }

    private void prepare()
    {
        ReturnToMenu returnToMenu = new ReturnToMenu();
        addObject(returnToMenu,671,463);
    }
}
