package com.may.the.fourth.be.with.you.three;

import java.util.HashMap;
import java.util.Map;

public class MayTheFourthBeWithYouThreeApplication {

	public static void main(String[] args) throws Exception {
		Stream stream = new StreamImpl("aAbBABacafe");
		System.out.println(firstChar(stream));
		Stream s  = new StreamImpl("aa");
		System.out.println(firstChar(s));
		Stream s1  = new StreamImpl("aba");
		System.out.println(firstChar(s1));
		Stream s2  = new StreamImpl("ababe");
		System.out.println(firstChar(s2));
		Stream s3  = new StreamImpl("aebabe");
		System.out.println(firstChar(s3));
	}
	
	public static Character firstChar(Stream input) throws Exception {
		Map<Character,Character> map = new HashMap<>();
		if(input.size() < 2) {
			throw new Exception("First Char not found!");
		}
		Character old = input.getNext();
		while(input.hasNext()) {
			if(isVogal(old)) {
				map.put(old, old);
			}
			Character c = input.getNext();
			if(!isVogal(old) && isVogal(c) && !map.containsKey(c)) {
				return c;
			}
			old = c;
		}
		return ' ';
	}
	
	public static Boolean isVogal(Character c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
}
