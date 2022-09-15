package com.enu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches2 {
	private static final String REGEX="\\bcat\\b";
	private static String INPUT="cat cat cat cattle cat";
	
	public static void main(String[] args) {
		Pattern p=Pattern.compile(REGEX)
;
		Matcher m=p.matcher(INPUT);//get  amatcher object
		int count=0;
		
		while(m.find()) {
			count++;
			System.out.println("Match number "+count);
			System.out.println("start():"+m.start());
			System.out.println("end():"+m.end());
		}
		
		
		
	}
}
