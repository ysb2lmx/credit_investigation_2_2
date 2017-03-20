/**
 * Array.java
 */
package test;

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

	}

}
