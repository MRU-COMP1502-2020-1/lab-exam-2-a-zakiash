package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class AllTests {
	
	@Test
	public void testA_A() {
		A_A aa = new A_A();
		
		assertEquals(aa.getMatch(), 'A'); 
	}
	
	@Test
	public void testA_A2() {
		A_A aa = new A_A();
		char[] aaArray = new char[] {'A'};
		assertEquals(aa.getBody(), aaArray); 
	}
	//A_AA
	@Test
	public void testA_AA() {
		A_AA aa = new A_AA();
		
		assertEquals(aa.getMatch(), 'A'); 
	}
	
	@Test
	public void testA_AA2() {
		A_AA aa = new A_AA();
		char[] aaArray = new char[] {'A', 'A'};
		assertEquals(aa.getBody(), aaArray); 
	}
	//A_BC
	@Test
	public void testA_BC() {
		A_BC aa = new A_BC();
		
		assertEquals(aa.getMatch(), 'A'); 
	}
	
	@Test
	public void testA_BC2() {
		A_BC aa = new A_BC();
		char[] aaArray = new char[] {'B', 'C'};
		assertEquals(aa.getBody(), aaArray); 
	}
	//A_Q
	@Test
	public void testA_Q() {
		A_Q aa = new A_Q();
		
		assertEquals(aa.getMatch(), 'A'); 
	}
	
	@Test
	public void testA_Q2() {
		A_Q aa = new A_Q();
		char[] aaArray = new char[] {'Q'};
		assertEquals(aa.getBody(), aaArray); 
	}
	//A_X
	@Test
	public void testA_X() {
		A_X aa = new A_X();
		
		assertEquals(aa.getMatch(), 'A'); 
	}
	
	@Test
	public void testA_X2() {
		A_X aa = new A_X();
		char[] aaArray = new char[] { };
		assertEquals(aa.getBody(), aaArray); 
	}
	//B_A
	@Test
	public void testB_A() {
		B_A aa = new B_A();
		
		assertEquals(aa.getMatch(), 'B'); 
	}
	
	@Test
	public void testB_A2() {
		B_A aa = new B_A();
		char[] aaArray = new char[] {'A'};
		assertEquals(aa.getBody(), aaArray); 
	}
	
	//C_B
	
	@Test
	public void testC_B() {
		C_B aa = new C_B();
		
		assertEquals(aa.getMatch(), 'C'); 
	}
	
	@Test
	public void testC_B2() {
		C_B aa = new C_B();
		char[] aaArray = new char[] {'B'};
		assertEquals(aa.getBody(), aaArray); 
	}

}
