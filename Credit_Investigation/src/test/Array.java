/**
 * Array.java
 */
package test;

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

	}

}
