/**
 * Array.java
 */
package test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ���ٲ�
 *2017-3-20����8:10:21
 *java�������ʹ��
 */
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		/*
		 * ���������
		 */
		String[] aArray = new String[5];
		String[] bArray = {"a","b","c","d","e"};
		String[] cArray=new String[]{"a","b","c","d","e"};
		
		
		/*
		 * ���һ������
		 */
		int[] intArray={1,2,3,4,5,6};
		String intArrayString=Arrays.toString(intArray);
		System.out.println(intArray);
		System.out.println(intArrayString);
		
		/*
		 * ��һ�����鴴�������б�
		 */
		String[] stringArray={"a","b","c","d","e"};
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
		System.out.println(arrayList);
		
		/*
		 * ���һ�������Ƿ����ĳ��ֵ
		 */
		String[] stringArray_1={"a","b","c","d","e"};
		boolean b = Arrays.asList(stringArray_1).contains("a");
		System.out.println(b);
		
		/*
		 * ������������
		 */
		int[] intArray_1={1,2,3,4,5};
		int[] intArray_2={6,7,8,9,10};
		
//		int[] combinedIntArray=ArrayUtils.addAll(intArry_a,intArray_2);
//		int[] combinedIntArray = ArrayUtils.addAll(intArray, intArray2);  
		
		/*
		 * ����һ���������� Array inline
		 */
//		method(new String[]){"a","b","c","d","e","f"};
		
		
		/*
		 * ���ṩ������Ԫ�ط���һ���ַ���
		 */
//		String j = StringUtils.join(new String[]{"a","b","c","d","e"});
		
		
		

	}

}
