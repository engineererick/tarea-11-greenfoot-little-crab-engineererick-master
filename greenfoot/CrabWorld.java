import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Worm worm = new Worm();
        addObject(worm,239,212);
        Worm worm2 = new Worm();
        addObject(worm2,456,449);
        Worm worm3 = new Worm();
        addObject(worm3,96,467);
        Worm worm4 = new Worm();
        addObject(worm4,61,89);
        Worm worm5 = new Worm();
        addObject(worm5,463,65);
        Worm worm6 = new Worm();
        addObject(worm6,98,344);
        Worm worm7 = new Worm();
        addObject(worm7,418,362);
        Worm worm8 = new Worm();
        addObject(worm8,352,77);
        Worm worm9 = new Worm();
        addObject(worm9,252,514);
        Worm worm10 = new Worm();
        addObject(worm10,37,189);
        removeObject(worm);
        removeObject(worm10);
        removeObject(worm8);
        removeObject(worm7);
        Worm worm11 = new Worm();
        addObject(worm11,518,305);
        Worm worm12 = new Worm();
        addObject(worm12,175,172);
        Worm worm13 = new Worm();
        addObject(worm13,435,219);
        Worm worm14 = new Worm();
        addObject(worm14,325,374);
        Worm worm15 = new Worm();
        addObject(worm15,31,257);
        Worm worm16 = new Worm();
        addObject(worm16,282,41);
        Crab crab = new Crab();
        addObject(crab,283,266);
        removeObject(crab);
        worm11.setLocation(500,327);
        Crab crab2 = new Crab();
        addObject(crab2,284,266);
        Worm worm17 = new Worm();
        addObject(worm17,201,415);
        Worm worm18 = new Worm();
        addObject(worm18,338,138);
        Worm worm19 = new Worm();
        addObject(worm19,176,56);
        Worm worm20 = new Worm();
        addObject(worm20,59,174);
        Worm worm21 = new Worm();
        addObject(worm21,355,485);
        Worm worm22 = new Worm();
        addObject(worm22,400,313);
        Worm worm23 = new Worm();
        addObject(worm23,486,156);
        Worm worm24 = new Worm();
        addObject(worm24,379,47);
        Lobster lobster = new Lobster();
        addObject(lobster,493,518);
    }
}