/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle field;
    private Person juan;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        field = new Circle();
        field.changeColor("green");
        field.changeSize(1125);
        field.moveHorizontal(-520);
        field.moveVertical(150);
        field.makeVisible();
        
    }
    
    /**
     * Change this picture to move sun and change picture color to black and white
     */
    public void movesun()
    {
        if (wall != null)   // only if it's painted already...
        {
            
           sun.slowMoveVertical(120);
           wall.changeColor("black");
           window.changeColor("white");
           roof.changeColor("black");
           sun.changeColor("black");
           field.changeColor("black");
        }
    }
    
     /**
     * Change this picture to make a person apear and go near the house
     */
    public void moveperson()
    {
        if (wall != null)   // only if it's painted already...
        {
           juan = new Person();
           juan.moveVertical(10);
           juan.moveHorizontal(200);
           juan.moveVertical(20);
           juan.makeVisible();
           juan.slowMoveVertical(-20);
           juan.slowMoveHorizontal(-170);
        }
    }
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
