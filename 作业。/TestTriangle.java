package Mzy;
import static org.junit.Assert.*;
import org.junit.Test;


public class TestTriangle {
	@Test
    public void testIsTriangle1(){
        Triangle t = new Triangle(4,5,6);
        assertTrue(t.isTriangle(t));
       
    }

    @Test
    public void testIsTriangle2(){
        Triangle t = new Triangle(4,4,5);
        assertEquals("Isoceles",t.getType(t));
    }

    @Test
    public void testIsTriangle3(){
        Triangle t = new Triangle(4,5,5);
        assertEquals("Isoceles",t.getType(t));
    }
   
    @Test
    public void testIsTriangle4(){
        Triangle t = new Triangle(4,5,4);
        assertEquals("Isoceles",t.getType(t));
    }
    @Test
    public void testIsTriangle5(){
        Triangle t = new Triangle(4,4,4);
        assertEquals("Regular",t.getType(t));
    }
    @Test
    public void testIsTriangle6(){
        Triangle t = new Triangle(3,4,5);
        assertEquals("Right",t.getType(t));
    }
    @Test
    public void testIsTriangle7(){
        Triangle t = new Triangle(4,5.1,6);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle8(){
        Triangle t = new Triangle(4,5,6.1);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle9(){
        Triangle t = new Triangle(4.1,5.1,6);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle10(){
        Triangle t = new Triangle(4.1,5,6.1);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle11(){
        Triangle t = new Triangle(4.1,5.1,6.1);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle12(){
        Triangle t = new Triangle(4, , );
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle13(){
        Triangle t = new Triangle( ,5, );
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle14(){
        Triangle t = new Triangle(4,5,);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle15(){
        Triangle t = new Triangle(4,,6);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle16(){
        Triangle t = new Triangle(, 5,6);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle17(){
        Triangle t = new Triangle( , 5,6);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle18(){
        Triangle t = new Triangle(-4,5,6);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle19(){
        Triangle t = new Triangle(4,-5,6);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle20(){
        Triangle t = new Triangle(4,5,-6);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle21(){
        Triangle t = new Triangle(-4,-5,6);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle22(){
        Triangle t = new Triangle(-4,5,-6);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle23(){
        Triangle t = new Triangle(4,-5,-6);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle24(){
        Triangle t = new Triangle(-4,-5,-6);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle25(){
        Triangle t = new Triangle(1,5,7);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle26(){
        Triangle t = new Triangle(2,5,7);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle27(){
        Triangle t = new Triangle(4,1,7);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle28(){
        Triangle t = new Triangle(4,3,7);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle29(){
        Triangle t = new Triangle(7,5,1);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle30(){
        Triangle t = new Triangle(7,5,2);
        assertTrue(t.isTriangle(t));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	


