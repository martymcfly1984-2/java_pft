package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.homework.Point;

public class PointTests {
    @Test
    public void testPoint(){
        Point p1 = new Point(1.0, 2.0);
        Point p2 = new Point(4.0, 8.0);
        Assert.assertEquals(p2.distance(p1), 6.708203932499369);
    }

    @Test
    public void testPoint2(){
        Point p1 = new Point(1.0, 3.0);
        Point p2 = new Point(4.0, 5.0);
        Assert.assertEquals(p2.distance(p1), 3.605551275463989);
    }
}
