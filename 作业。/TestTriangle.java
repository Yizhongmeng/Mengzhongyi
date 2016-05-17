package WSSKY;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class M44 {

	private int A;
	private int B;
	private int C;

	public M44(int AA, int BB, int CC) {
		this.A = AA;
		this.B = BB;
		this.C = CC;
	}

	@Parameters
	public static Collection addedNumbers() {
		return Arrays.asList(new Integer[][] { {4,5,6}, {4,4,5 },
				                               {4,5,5 }, {4,5,4 },
				                               {4,4,4},{3,4,5} });
	}

	@Test
    public void testIsTriangle(){
        M00 t = new M00( A,B,C);
        assertTrue(t.isTriangle(t));
    }
	@Test
    public void testIsTriangle2(){
        M00 t = new M00(A,B,C);
        assertEquals("Regular",t.getType(t));
    }
	@Test
    public void testIsTriangle3(){
       M00 t = new M00(A,B,C);
     assertEquals("Right",t.getType(t));
     }
	@Test
    public void testIsTriangle4(){
        M00 t = new M00(4,5,4);
        assertEquals("Isoceles",t.getType(t));
    }
	
	
}
