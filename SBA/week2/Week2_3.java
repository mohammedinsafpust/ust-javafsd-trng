package com.sbv;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Week2_3 {

		public static void main(String[] args) {
			List lst=new ArrayList();
			for(int i=1;i<=20;i++) {
				lst.add(i);
			}
			Iterator itr=lst.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
}
