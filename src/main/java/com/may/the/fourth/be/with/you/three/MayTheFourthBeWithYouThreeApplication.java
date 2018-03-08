package com.may.the.fourth.be.with.you.three;

import java.util.HashMap;
import java.util.Map;

public class MayTheFourthBeWithYouThreeApplication {

	public static void main(String[] args) {
		Stream stream = new StreamImpl("aAbBABacafe");
		System.out.println(firstChar(stream));
	}
	
	public static Character firstChar(Stream input) {
		Map<Character,Character> map = new HashMap<>();
		if(input.size() < 2) {
			return ' ';
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
