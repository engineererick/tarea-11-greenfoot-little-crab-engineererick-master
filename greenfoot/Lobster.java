import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    @Override
    public void act() 
    {
        if(super.isTouching(Crab.class)){
            super.removeTouching(Crab.class);
            Greenfoot.playSound("au.wav");
        }
        
        if(super.isAtEdge()){
            super.turn(15);
        }
        
        int aleatorio = Greenfoot.getRandomNumber(100);
        if(aleatorio<10){
            int grados = Greenfoot.getRandomNumber(90);
            int negativo = Greenfoot.getRandomNumber(40);
            super.turn(grados-negativo);
        }
        super.move(12);
    }    
}
