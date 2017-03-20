/**
 * Array.java
 */
package test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 杨少博
 *2017-3-20下午8:10:21
 *java中数组的使用
 */
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * 数组的声明
		 */
		String[] aArray = new String[5];
		String[] bArray = {"a","b","c","d","e"};
		String[] cArray=new String[]{"a","b","c","d","e"};
		
		
		/*
		 * 输出一个数组
		 */
		int[] intArray={1,2,3,4,5,6};
		String intArrayString=Arrays.toString(intArray);
		System.out.println(intArray);
		System.out.println(intArrayString);
		
		/*
		 * 从一个数组创建数组列表
		 */
		String[] stringArray={"a","b","c","d","e"};
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
		System.out.println(arrayList);
		
		/*
		 * 检查一个数组是否包含某个值
		 */
		String[] stringArray_1={"a","b","c","d","e"};
		boolean b = Arrays.asList(stringArray_1).contains("a");
		System.out.println(b);
		
		/*
		 * 连接两个数组
		 */
		int[] intArray_1={1,2,3,4,5};
		int[] intArray_2={6,7,8,9,10};
		
//		int[] combinedIntArray=ArrayUtils.addAll(intArry_a,intArray_2);
//		int[] combinedIntArray = ArrayUtils.addAll(intArray, intArray2);  
		
		/*
		 * 声明一个内敛数组 Array inline
		 */
//		method(new String[]){"a","b","c","d","e","f"};
		
		
		/*
		 * 把提供的数组元素放入一个字符串
		 */
//		String j = StringUtils.join(new String[]{"a","b","c","d","e"});
		
		
		

	}

}
