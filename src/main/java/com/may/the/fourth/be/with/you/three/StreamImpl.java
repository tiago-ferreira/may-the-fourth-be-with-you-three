package com.may.the.fourth.be.with.you.three;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamImpl implements Stream {

	private Iterator<Character> characteres;
	private int size = 0;
	List<Character> li = new ArrayList<>();
	
	
	public StreamImpl(String str) {
		for(char c : str.toLowerCase().toCharArray()) {
			li.add(Character.valueOf(c));
		}
		characteres = li.iterator();
		size = str.length();
	}
	
	@Override
	public Character getNext() {
		return characteres.next();
	}

	@Override
	public Boolean hasNext() {
		return characteres.hasNext();
	}
	@Override
	public Integer size() {
		return size;
	}

	
}
