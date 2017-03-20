/**
 * 
 */
package check;

import java.util.regex.Pattern;

/**
 * @author ���ٲ�
 * 2017-3-20
 * ������У����ǻ������ô���
 */
public class TypeChecker {

	private static int char2num(byte a){
		if (a ==42){
			return 36;
		}
		if((a>=48)&&(a<=57)){
			return a-48;
		}		
		return a-55;
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String code="G10150303000542400";//����
//		String code="G7015030200123690L";//��ȷ
//		String code="G70150302002239002";//��ȷ
		byte creditCode[]=code.getBytes();
		if(creditCode.length != 18){
			System.out.println("�������ô��볤�Ȳ�Ϊ18λ");
			return;
		}
		if(!Pattern.matches("[A-Z]{1}[0-9]{16}[0-9A-Z\\*{1}", new String(creditCode))){
			System.out.println("������������ʽ�Ĺ淶");
		}
		int m=36;
		int s=m;
		for(int i=0;i<=creditCode.length-2;i++)
		{
			s = (s+char2num(creditCode[i]))%m;
			if(s==0){
				s=m;
			}
			s=s*2%(m+1);
			System.out.println((s+char2num(creditCode[(creditCode.length-1)]))%m==1);
		}
	}

}
