package ar.edu.unq.po2.wallpost;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.wallpost.Wallpost;

class WallPostTestCase {
	
	private Wallpost wallpost;
	
	@BeforeEach
	void setUp() throws Exception{
		this.wallpost=new Wallpost();
	}
	
	@Test
	void testConstructor() {
		assertEquals("Undefined post", this.wallpost.getText());
		assertEquals(0, this.wallpost.getLikes());
		assertFalse(this.wallpost.isFeatured());
	}
	
	@Test
	public void testSetText() {
		this.wallpost.setText("Nuevo Texto");
		assertEquals("Nuevo Texto", this.wallpost.getText());
	}
	
	@Test
	public void testLikes() {
		this.wallpost.like();
		assertEquals(1, this.wallpost.getLikes());
		this.wallpost.like();
		assertEquals(2, this.wallpost.getLikes());
		
	}
	
	@Test
	public void dislike() {
		this.wallpost.like();
		this.wallpost.like();
		this.wallpost.dislike();
		assertEquals(1, this.wallpost.getLikes());
		this.wallpost.dislike();
		this.wallpost.dislike();
		assertEquals(0, this.wallpost.getLikes());
	}
	
	@Test
	public void toggleFeatured() {
		this.wallpost.toggleFeatured();
		assertTrue(this.wallpost.isFeatured());
		this.wallpost.toggleFeatured();
		assertFalse(this.wallpost.isFeatured());
	}
	
	

}
