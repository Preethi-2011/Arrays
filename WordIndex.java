package com.mic;

import java.util.Arrays;

public class WordIndex {
public static void main(String[] args) {
	String[] words={"abc","bcd","aaaa","cbc"};
	char x='a';
	int[] indices=FindCharacters(words,x);
	System.out.println("Index of words:"+Arrays.toString(indices));
}


public static int[] FindCharacters(String[] words,char x) {
	int[] indices= new int[words.length];
	int count=0;
	for(int i=0;i<words.length;i++) {
		String word=words[i];
		for(char targetChar:x) {
			if(word.indexOf(targetChar)!=-1) {
				indices[count++]=i;
				break;
			}
		}
	}
	return Arrays.copyOf(indices, count);
}
}