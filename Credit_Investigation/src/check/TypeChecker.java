/**
 * 
 */
package check;

import java.util.regex.Pattern;

/**
 * @author 杨少博
 * 2017-3-20
 * 本程序校验的是机构信用代码
 * 已完善
 */
public class TypeChecker {

	private static int char2num(byte a){
		//System.out.println(a);
		if (a ==42){
			return 36;
		}
		if((a>=48)&&(a<=57)){
			return a-48;
		}		
		return a-55;
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		String code="11015030200208910G";//错误
//		String code="G1015030200074450T";
//		String code="G7015030400124900X";//正确
		String code="G1015030200123580I";//正确
//		String code="G7015030200123690L";//正确
//		String code="G70150302002239002";//正确
		byte creditCode[]=code.getBytes();
		if(creditCode.length != 18){
			System.out.println("机构信用代码长度不为18位"+":"+code);
			return;
		}
		if(!Pattern.matches("[A-Z]{1}[0-9]{16}[0-9A-Z\\*]{1}", new String(creditCode))){
			System.out.println("机构信用代码不符合正则表达式的规范"+":"+code);
		}
		int m=36;
		int s=m;
		for(int i=0;i<=creditCode.length-2;i++)
		{
			//System.out.println(code.substring(i,i+1));//字符串
			//System.out.println(creditCode[i]);		//字符串转十进制
			s = (s+char2num(creditCode[i]))%m;
			if(s==0){
				s=m;
			}
			s=s*2%(m+1);
		}
		/*
		System.out.println("----------------------------");
		System.out.println(s);
		System.out.println(creditCode[(creditCode.length-1)]);
		System.out.println(char2num(creditCode[(creditCode.length-1)]));
		System.out.println((s+char2num(creditCode[(creditCode.length-1)])));
		System.out.println((s+char2num(creditCode[(creditCode.length-1)]))%m);
		*/
		if (((s+char2num(creditCode[(creditCode.length-1)]))%m==1) == false){
			System.out.println("机构信用代码不符合校验位的校验"+":"+code);
		}else{
			System.out.println("机构信用代码校验通过"+":"+code);
		}
		
	}

}
