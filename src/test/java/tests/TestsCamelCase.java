package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fonctions.CamelCase;

public class TestsCamelCase {
	@Test
	public void emptyTest() {
		assertEquals(null,CamelCase.camelCase(null));
	}
	
	@Test
	public void emptyStringTest() {
		String str = "";
		assertEquals("",CamelCase.camelCase(str));
	}
	
	@Test
	public void stringWithSpaceTest() {
		String str = "camel test";
		assertEquals("CamelTest",CamelCase.camelCase(str));
	}
	
	@Test
	public void stringWithHyphenTest() {
		String str = "camel-test";
		assertEquals("CamelTest",CamelCase.camelCase(str));
	}
	
	@Test
	public void stringWithUnderscoreTest() {
		String str = "camel_test";
		assertEquals("CamelTest",CamelCase.camelCase(str));
	}
	
	@Test
	public void stringWithUpperCharacterTest() {
		String str = "cAMel tESt";
		assertEquals("CamelTest",CamelCase.camelCase(str));
	}
	
	@Test
	public void stringWithUpperCharacterAndHyphenTest() {
		String str = "cAMel-tESt";
		assertEquals("CamelTest",CamelCase.camelCase(str));
	}
	
	@Test
	public void stringWithUpperCharacterAndUnderscoreTest() {
		String str = "cAMel_tESt";
		assertEquals("CamelTest",CamelCase.camelCase(str));
	}
	
	@Test
	public void stringWithMoreWordsWithSpaceTest() {
		String str = "camel test more words";
		assertEquals("CamelTestMoreWords",CamelCase.camelCase(str));
	}

}
