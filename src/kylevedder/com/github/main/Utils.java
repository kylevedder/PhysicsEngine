/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kylevedder.com.github.main;

import org.newdawn.slick.geom.Line;
import org.newdawn.slick.geom.Point;

/**
 *
 * @author Kyle
 */
public class Utils
{

    /**
     *
     * If val greater than high, wraps val to # above high to low (inclusive)
     * <p>
     * If val lower than low, wraps val to # below low to high (inclusive)
     * </p>
     *
     * @param val
     * @param low
     * @param high
     * @return
     */
    public static int wrapInt(int val, int low, int high)
    {
        int newVal = val % high;
        return (newVal < 0) ? high + newVal : newVal;
    }

    /**
     *
     * If val greater than high, wraps val to # above high to low (inclusive)
     * <p>
     * If val lower than low, wraps val to # below low to high (inclusive)
     * </p>
     *
     * @param val
     * @param low
     * @param high
     * @return
     */
    public static float wrapFloat(float val, float low, float high)
    {
        float newVal = val % high;
        return (newVal < 0f) ? high + newVal : newVal;
    }

    /**
     *
     * If val greater than high, sets val to high (inclusive)
     * <p>
     * If val lower than low, sets val to low (inclusive)
     * </p>
     *
     * @param val
     * @param low
     * @param high
     * @return
     */
    public static int clampInt(int val, int low, int high)
    {
        if (val > high)
        {
            return high;
        }
        if (val < low)
        {
            return low;
        }
        return val;
    }    
    
     /**
     * Translates an array of x,y floats into an array of points.
     * @param pointValsArray
     * @return 
     */
    public static Point[] getPoints(float[] pointValsArray)
    {
        Point[] points = new Point[pointValsArray.length/2];
        for(int i = 0; i < pointValsArray.length/2; i++)
        {
            points[i] = new Point(pointValsArray[2*i], pointValsArray[2*i+1]);
        }
        return points;
    }
    
    /**
     * Translates two Points into a Line
     * @param p1
     * @param p2
     * @return 
     */
    public static Line getLine(Point p1, Point p2)
    {
        return new Line(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}
