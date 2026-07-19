package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(),25.0);
    }
    @Test
    public void testArea2(){
        Square s = new Square(0);
        Assert.assertEquals(s.area(), 0.0);
    }
    @Test
    public void testArea3(){
        Square s = new Square(-1);
        Assert.assertEquals(s.area(), 1.0);
    }

}
