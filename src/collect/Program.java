package collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		
		// collection 3종
		
		// Set 형 collection : 중복 안됨. 알아서 같은건 정리함. 식별자 원하는 값을 쳐야 나옴.
		Set s = new HashSet();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(2);
		s.add(3);
		
		System.out.printf("개수 :%d\n", s.size());
		
		for(Object o : s)    //for-which 문
			System.out.println(o);
		
		// List 형 collection : 순서대로 받음. 식별자 순번으로 불러냄.
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(3);
		
		System.out.printf("개수 :%d\n", list.size());
		
		for(Object o :list)
			System.out.println(o);
		
		list.get(2); // 순번기반
		

		
		// Map 형 collection : 내가 기입한 식별자로 사용. 
		Map map = new HashMap();
		map.put("나이", 19);
		map.put("연세", 20);
		map.put("방년", 30);
		
		System.out.printf("개수 :%d\n", map.size());
		
		map.get("나이");
		
		for(Object o :map.keySet())
			System.out.println(o);
		for(Object o :map.keySet())
			System.out.println(map.get(o));
		
		
	}

}
