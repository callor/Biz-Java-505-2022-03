package com.callor.app.exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();
		for(int i = 0 ; i < 45 ; i++) {
			intList.add(i+1);
		}
		System.out.println(intList);

		Collections.shuffle(intList);
		System.out.println(intList);

		for(int i = 0 ; i < 6 ; i++) {
			System.out.printf("%d, ", intList.get(i));
		}


	}


}
