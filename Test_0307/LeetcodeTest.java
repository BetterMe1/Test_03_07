package Test_0307;

import java.util.ArrayList;
import java.util.List;

//public class LeetcodeTest {
//	public static void main(String[] args) {
//		testList1();
//	}
//	//ArrayList��List�ĳ��÷���
//	//List���õķ����� ��(add(Object ele))��ɾ(remove(int index))����(set(int fromIndex, Object ele))��
//	//��(get(int index))����(add(int index,Object ele))������(size()
//	public static void testList1() {
//		List list = new ArrayList();
//		//void add(Object ele)
//		list.add(123);
//		list.add(456);
//		list.add(new String("AA"));
//		list.add(new String("BB"));
//		System.out.println(list);
//		//void add(int index,Object ele) :��ָ������λ��index�����Ԫ��ele
//		list.add(0, 888);
//		System.out.println(list);
//		//Object get(int index) :��ȡָ��������Ԫ��
//		Object obj = list.get(1);
//		System.out.println(obj);
//		//boolean addAll(int index,Collection eles) :��ָ������λ��index����Ӷ��Ԫ��
//		list.addAll(1, list);
//		System.out.println(list);
//		//Object remove(int index) : ɾ��ָ������λ�õ�Ԫ��
//		list.remove(0);
//		System.out.println(list);
//		//Object set(int fromIndex, Object ele) :����ָ������λ�õ�Ԫ��Ϊele
//		list.set(0, "c");
//		System.out.println(list);
//		//int indexOf(Object obj) :����obj�ڼ������״γ��ֵ�λ�ã�û�еĻ�������-1
//		//int lastindexOf(Object obj) :����obj�ڼ��������һ�γ��ֵ�λ�ã�û�еĻ�������-1
//		System.out.println(list.indexOf("AA") + "  " + list.lastIndexOf("AA"));
//		//List sublist(int fromIndex, int toIndex) : ���ش�fromIndex��toIndex��һ����list(����ҿ���
//		System.out.println(list.subList(0, 2));
//	}
//}
/*
412. Fizz Buzz
 дһ����������� 1 �� n ���ֵ��ַ�����ʾ��
1. ��� n ��3�ı����������Fizz����
2. ��� n ��5�ı����������Buzz����
3.��� n ͬʱ��3��5�ı�������� ��FizzBuzz����
ʾ����
n = 15,
����:
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
