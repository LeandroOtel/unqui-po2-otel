package ar.edu.unq.po2.tp3.counter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.counter.Counter;

class CounterTestCaseTest {

	private Counter counter;

	@BeforeEach
	void setUp() throws Exception{
		this.counter=new Counter();
		//Se crea el contador
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
}
	
	@Test
	public void testEvenNumbers() {
	// Getting the even occurrences
	int amount = counter.getEvenOcurrences();
	// I check the amount is the expected one
	assertEquals(amount, 1);
	}
	
	@Test
	public void testOddNumbers() {
	// Getting the even occurrences
	int amount = counter.getOddOcurrences();
	// I check the amount is the expected one
	assertEquals(amount, 9);
	}
	
	@Test
	public void testMultiplosDe() {
	// Getting the even occurrences
	int amount = counter.multiplosDe(3);
	// I check the amount is the expected one
	assertEquals(amount, 2);
	}

}
