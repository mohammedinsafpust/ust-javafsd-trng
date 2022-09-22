package com.mokito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.Mock;

public class Mokito03 {
	@Mock
	List<String>mockList;
	//@BeforeEach
	public void setup() {
		//if we don't call below,we will get
		NullPointerException
		MockitoAnnotations.initMocks(this);
		
	}
	@SuppressWarnings("unchecked")
	@Test
	public void test() {
		System.out.println("Hi");
		
		when(mockList.get(0)).thenReturn("Sample");
		assertEquals("Sample",mockList.get(0));
		System.out.println("World");
	}

}
