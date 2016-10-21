package com.ibeifeng.mylist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyMap {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("1", "zhangsan1");
		map.put("2", "zhangsan2");
		map.put("3", "zhangsan3");
		map.put("4", "zhangsan4");
		map.put("5", "zhangsan5");
		//方法一：遍歷map集合
		System.out.println("--------------111111-----------------");
		Set<Entry<String,String>> entrySet = map.entrySet();
		for(Entry<String,String> entry:entrySet){
			System.out.println(entry.getKey()+":::"+entry.getValue());
		}
		System.out.println("--------------222222-----------------");
		//方法二：
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()){
			String key = it.next();
			System.out.println(key+":::"+map.get(key));
		}
		System.out.println("----------3333333------------------");
		for (String str : keySet) {
			System.out.println(str+":::"+map.get(str));
		}
	}
}
