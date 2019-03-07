package Test_0307;

import java.util.ArrayList;
import java.util.List;

//public class LeetcodeTest {
//	public static void main(String[] args) {
//		testList1();
//	}
//	//ArrayList及List的常用方法
//	//List常用的方法： 增(add(Object ele))、删(remove(int index))、改(set(int fromIndex, Object ele))、
//	//查(get(int index))、插(add(int index,Object ele))、长度(size()
//	public static void testList1() {
//		List list = new ArrayList();
//		//void add(Object ele)
//		list.add(123);
//		list.add(456);
//		list.add(new String("AA"));
//		list.add(new String("BB"));
//		System.out.println(list);
//		//void add(int index,Object ele) :在指定索引位置index处添加元素ele
//		list.add(0, 888);
//		System.out.println(list);
//		//Object get(int index) :获取指定索引的元素
//		Object obj = list.get(1);
//		System.out.println(obj);
//		//boolean addAll(int index,Collection eles) :在指定索引位置index处添加多个元素
//		list.addAll(1, list);
//		System.out.println(list);
//		//Object remove(int index) : 删除指定索引位置的元素
//		list.remove(0);
//		System.out.println(list);
//		//Object set(int fromIndex, Object ele) :设置指定索引位置的元素为ele
//		list.set(0, "c");
//		System.out.println(list);
//		//int indexOf(Object obj) :返回obj在集合中首次出现的位置，没有的话，返回-1
//		//int lastindexOf(Object obj) :返回obj在集合中最后一次出现的位置，没有的话，返回-1
//		System.out.println(list.indexOf("AA") + "  " + list.lastIndexOf("AA"));
//		//List sublist(int fromIndex, int toIndex) : 返回从fromIndex到toIndex的一个子list(左闭右开）
//		System.out.println(list.subList(0, 2));
//	}
//}
/*
412. Fizz Buzz
 写一个程序，输出从 1 到 n 数字的字符串表示。
1. 如果 n 是3的倍数，输出“Fizz”；
2. 如果 n 是5的倍数，输出“Buzz”；
3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
示例：
n = 15,
返回:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]
 */
public class LeetcodeTest {
	public static void main(String[] args) {
		Solution So = new Solution();
		int n = 1;
		System.out.println(So.fizzBuzz(n));
	}
}
class Solution {
    public List<String> fizzBuzz(int n) {
    	List<String> res = new ArrayList<>();
        for(int i=1; i<=n; i++){
        	if(i % 15 == 0){
        		res.add("FizzBuzz");
        	}else if(i % 3 == 0){
        		res.add("Fizz");
        	}else if(i % 5 == 0){
        		res.add("Buzz");
        	}else{
        		res.add(String.valueOf(i));
        	}
        }
        return res;
    }
}
