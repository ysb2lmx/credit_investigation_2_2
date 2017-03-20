/**
 * 
 */
package check;

import java.util.regex.Pattern;

/**
 * @author ���ٲ�
 * 2017-3-20
 * ������У����ǻ������ô���
 * ������
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
		// TODO �Զ����ɵķ������
//		String code="11015030200208910G";//����
//		String code="G1015030200074450T";
//		String code="G7015030400124900X";//��ȷ
		String code="G1015030200123580I";//��ȷ
//		String code="G7015030200123690L";//��ȷ
//		String code="G70150302002239002";//��ȷ
		byte creditCode[]=code.getBytes();
		if(creditCode.length != 18){
			System.out.println("�������ô��볤�Ȳ�Ϊ18λ"+":"+code);
			return;
		}
		if(!Pattern.matches("[A-Z]{1}[0-9]{16}[0-9A-Z\\*]{1}", new String(creditCode))){
			System.out.println("�������ô��벻����������ʽ�Ĺ淶"+":"+code);
		}
		int m=36;
		int s=m;
		for(int i=0;i<=creditCode.length-2;i++)
		{
			//System.out.println(code.substring(i,i+1));//�ַ���
			//System.out.println(creditCode[i]);		//�ַ���תʮ����
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
			System.out.println("�������ô��벻����У��λ��У��"+":"+code);
		}else{
			System.out.println("�������ô���У��ͨ��"+":"+code);
		}
		
	}

}
