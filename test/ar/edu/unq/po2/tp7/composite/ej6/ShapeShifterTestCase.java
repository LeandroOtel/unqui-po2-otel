package ar.edu.unq.po2.tp7.composite.ej6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapeShifterTestCase {

	private ShapeShifterLeaf a;
	private ShapeShifterLeaf b;
	private ShapeShifterComposite c; 
	private ShapeShifterLeaf d;
	private ShapeShifterComposite e;
	private ShapeShifterComposite f;
	private ShapeShifterLeaf x;
	private ShapeShifterLeaf y;


	
	@BeforeEach
	void setUp() throws Exception{
		this.a= new ShapeShifterLeaf(1);
		this.b= new ShapeShifterLeaf(2);
		this.c= new ShapeShifterComposite();
		this.d= new ShapeShifterLeaf(3);
		this.e= new ShapeShifterComposite();
		this.f= new ShapeShifterComposite();
		this.x= new ShapeShifterLeaf(5);
		this.y= new ShapeShifterLeaf(6);
		
	}
	
	@Test
	void aComposeB() {
		assertTrue(a.compose(b).values().contains(1));
		assertTrue(a.compose(b).values().contains(2));
		assertTrue(a.compose(b).values().size()==2);
	}
	
	@Test
	void dComposeC() {
		this.c.addShapeShifter(a);
		this.c.addShapeShifter(b);
		
		assertTrue(this.d.compose(c).values().contains(1));
		assertTrue(this.d.compose(c).values().contains(2));
		assertTrue(this.d.compose(c).values().contains(3));
		
	}
	
	@Test 
	void deepestA(){
		assertTrue(this.a.deepest()==0);
	}
	
	@Test 
	void deepestC(){
		this.c.addShapeShifter(a);
		this.c.addShapeShifter(b);
		assertTrue(this.c.deepest()==1);
	}
	
}
