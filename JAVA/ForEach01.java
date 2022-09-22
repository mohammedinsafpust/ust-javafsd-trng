package com.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEach01 {
	public static void main(String[] args) {
		List<String>gamesList=new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hocky");
		System.out.println(".............iterating by passing lambda expression...");
		gamesList.forEach(games->System.out.println(games));
	}

}
