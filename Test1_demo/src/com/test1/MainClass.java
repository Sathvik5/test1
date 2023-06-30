package com.test1;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("1", 001);
		hashMap.put("2", 051);
		hashMap.put("13", 001);
		hashMap.put("4", 05601);
		hashMap.put("15", 001);
		System.out.println(hashMap);
		for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
			System.out.println(map);
		}
	}
}
