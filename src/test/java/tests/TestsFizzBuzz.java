package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fonctions.FizzBuzz;

public class TestsFizzBuzz {
	@Test
	public void emptyTest() {
		assertEquals(null, FizzBuzz.fizzBuzz(0, 0));
	}

	@Test
	public void oneNegativeNumberTest() {
		assertEquals(null, FizzBuzz.fizzBuzz(-3, 0));
	}

	@Test
	public void twoNegativeNumberTest() {
		assertEquals(null, FizzBuzz.fizzBuzz(-3, -8));
	}

	@Test
	public void oneNegativeNumberInverseTest() {
		assertEquals(null, FizzBuzz.fizzBuzz(0, -3));
	}

	@Test
	public void twoNegativeNumberInverseTest() {
		assertEquals(null, FizzBuzz.fizzBuzz(-8, -3));
	}

	@Test
	public void firstNegatifSecondPositiveTest() {
		assertEquals("12", FizzBuzz.fizzBuzz(-8, 2));
	}

	@Test
	public void firstPositiveSecondNegativeTest() {
		assertEquals("12", FizzBuzz.fizzBuzz(2, -2));
	}

	@Test
	public void numberSequenceWithMultipleOfThirdTest() {
		assertEquals("12Fizz4", FizzBuzz.fizzBuzz(1, 4));
	}

	@Test
	public void numberSequenceWithMultipleOfFiveTest() {
		assertEquals("12Fizz4Buzz", FizzBuzz.fizzBuzz(1, 5));
	}

	@Test
	public void numberSequenceWithMultipleOffifteen() {
		assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz", FizzBuzz.fizzBuzz(1, 15));
	}

	@Test
	public void numbersPositivesInversedWithMultiplesTest() {
		assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz", FizzBuzz.fizzBuzz(20, 1));
	}

}
