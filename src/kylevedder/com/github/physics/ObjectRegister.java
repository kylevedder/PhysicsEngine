/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kylevedder.com.github.physics;

import java.util.ArrayList;
import kylevedder.com.github.main.CenteredRectangleNew;

/**
 *
 * @author Kyle
 */
public class ObjectRegister
{

    ArrayList<PhysicsObject> objectsList = null;

    /**
     * Object Physics Registration.
     */
    public ObjectRegister()
    {
        objectsList = new ArrayList<>();
    }

    /**
     * Adds an object to the PhysicsObject register.
     *
     * @param o
     */
    public void add(PhysicsObject o)
    {
        this.objectsList.add(o);
    }

    /**
     * Checks to see if an object collides.
     *
     * @param objectChecking
     * @return
     */
    public boolean checkCollision(PhysicsObject objectChecking)
    {
        for (PhysicsObject objectItem : objectsList)
        {
            if (objectChecking != objectItem && objectChecking.hitBox.collides(objectItem.hitBox))
            {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Checks to see if an object collides.
     *
     * @param objectChecking
     * @return
     */
    public boolean checkCollision(CenteredRectangleNew rect)
    {
        for (PhysicsObject objectItem : objectsList)
        {
            if (rect != objectItem.hitBox && rect.collides(objectItem.hitBox))
            {
                return true;
            }
        }
        return false;
    }
}
