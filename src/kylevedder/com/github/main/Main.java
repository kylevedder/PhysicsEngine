/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kylevedder.com.github.main;

import kylevedder.com.github.physics.ObjectRegister;
import kylevedder.com.github.physics.PhysicsBox;
import kylevedder.com.github.physics.RigidBox;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Kyle
 */
public class Main extends BasicGame
{

    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 600;
    public static AppGameContainer app;
    public static ObjectRegister register = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SlickException
    {
        app = initApp("Physics");        
    }

    /**
     * Initialization of the main game container
     *
     * @return New Game Container
     * @throws SlickException
     */
    private static AppGameContainer initApp(String title) throws SlickException
    {
        app = new AppGameContainer(new Main(title));
        app.setDisplayMode(SCREEN_WIDTH, SCREEN_HEIGHT, false);
        app.setTargetFrameRate(60);
        app.setAlwaysRender(true);
        app.start();
        return app;
    }

    public Main(String title)
    {
        super(title);
    }

    PhysicsBox box = null;
    RigidBox floor = null;

    @Override
    public void init(GameContainer container) throws SlickException
    {
        register = new ObjectRegister();
        box = new PhysicsBox(40, SCREEN_HEIGHT - 40, 40, 40, 0, 3, 90);
        floor = new RigidBox(40, 40, 40, 40, 0);        
        register.add(box);
        register.add(floor);        
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException
    {
        box.update(delta);
        floor.update(delta);        
    }

    @Override
    public void render(GameContainer container, Graphics g) throws SlickException
    {
        //clears
        g.clear();
//        g.rotate(SCREEN_WIDTH/2, SCREEN_HEIGHT/2, 180);
//        g.scale(-1, 1);        
        //backgrond
        g.setBackground(new Color(103, 194, 240));
        g.setColor(Color.black);
        box.render(g);
        floor.render(g);

    }

}
