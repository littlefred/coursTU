package tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fonctions.Smileys;

public class TestsSmileys {
	@Test
	public void emptyTest() {
		assertEquals(0,Smileys.countSmileys(null));
	}
	
	@Test
	public void emptyListTest() {
		List<String> list = new ArrayList<String>();
		assertEquals(0,Smileys.countSmileys(list));
	}
	
	@Test
	public void oneGoodSmileyTest() {
		List<String> list = new ArrayList<String>();
		list.add(":-)");
		assertEquals(1,Smileys.countSmileys(list));
	}
	
	@Test
	public void oneBadSmileyTest() {
		List<String> list = new ArrayList<String>();
		list.add(":-(");
		assertEquals(0,Smileys.countSmileys(list));
	}

}
