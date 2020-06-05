import greenfoot.*;  


public class InstructionsScreen extends World
{
    public InstructionsScreen()
    {    
        super(800, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ReturnToMenu returnToMenu = new ReturnToMenu();
        addObject(returnToMenu,661,436);
    }
}
