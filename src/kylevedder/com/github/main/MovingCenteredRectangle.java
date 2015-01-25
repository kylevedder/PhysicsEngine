/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kylevedder.com.github.main;

import kylevedder.com.github.physics.Vector;

/**
 *
 * @author Kyle
 */
public class MovingCenteredRectangle
{
    private Vector vector;
    private CenteredRectangle rect;

    public MovingCenteredRectangle(Vector vector, CenteredRectangle rect)
    {
        this.vector = vector;
        this.rect = rect;
    }

    public CenteredRectangle getRect()
    {
        return rect;
    }

    public Vector getVector()
    {
        return vector;
    }

    public void setRect(CenteredRectangle rect)
    {
        this.rect = rect;
    }

    public void setVector(Vector vector)
    {
        this.vector = vector;
    }
    
      
    
}
