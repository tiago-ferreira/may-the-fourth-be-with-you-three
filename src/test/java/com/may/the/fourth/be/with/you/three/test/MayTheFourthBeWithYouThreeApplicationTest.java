package com.may.the.fourth.be.with.you.three.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.may.the.fourth.be.with.you.three.MayTheFourthBeWithYouThreeApplication;
import com.may.the.fourth.be.with.you.three.Stream;
import com.may.the.fourth.be.with.you.three.StreamImpl;

class MayTheFourthBeWithYouThreeApplicationTest {

	
	
	@Test
	void testPrincipalCase() {
		Stream stream = new StreamImpl("aAbBABacafe");
		assertTrue(MayTheFourthBeWithYouThreeApplication.firstChar(stream) == 'e');
	}

	@Test
	void testEmptyString() {
		Stream stream = new StreamImpl("");
		assertTrue(MayTheFourthBeWithYouThreeApplication.firstChar(stream) == ' ');
	}
	
	@Test
	void testStringSizeOne() {
		Stream stream = new StreamImpl("a");
		assertTrue(MayTheFourthBeWithYouThreeApplication.firstChar(stream) == ' ');
	}
	
	@Test
	void testTwoVogals() {
		Stream stream = new StreamImpl("ae");
		assertTrue(MayTheFourthBeWithYouThreeApplication.firstChar(stream) == ' ');
	}
	
	@Test
	void testNoVogals() {
		Stream stream = new StreamImpl("bbRRGJ");
		assertTrue(MayTheFourthBeWithYouThreeApplication.firstChar(stream) == ' ');
	}
	
	@Test
	void testCase01() {
		Stream stream = new StreamImpl("babebibobu");
		assertTrue(MayTheFourthBeWithYouThreeApplication.firstChar(stream) == 'a');
	}
	
	@Test
	void testCase02() {
		Stream stream = new StreamImpl("abecidofug");
		assertTrue(MayTheFourthBeWithYouThreeApplication.firstChar(stream) == 'e');
	}
}
