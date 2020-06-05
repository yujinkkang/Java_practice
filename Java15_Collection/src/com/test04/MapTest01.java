package com.test04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest01 {
	
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i =111; i<116; i++) {
			map.put(i, i+1000);
		}
		
		map.put(112, 1113);
	
		
		System.out.println(map);
		System.out.println(map.get(112));
		System.out.println(map.get(115));
		System.out.println();
		
		prn(map);
	}

	private static void prn(Map<Integer, Integer> map) {
		Set<Map.Entry<Integer, Integer>> entrySet= map.entrySet();
		/*
		for(Entry<Integer, Integer>entry : entrySet) {
			if(entry.getValue() == 1113) {
				System.out.println(entry.getKey());
			}
		}
		*/
		
		//iterator를 사용해서 위의 forEach문과 같은 결과를 출력하자.
		
		Iterator<Entry<Integer,Integer>> ir = entrySet.iterator();
		
		while(ir.hasNext()) {
			
			Entry<Integer, Integer> tmp = ir.next();
			if(tmp.getValue() == 1113) {
				System.out.println(tmp.getKey());
			}
			
		}
		
	}

}
