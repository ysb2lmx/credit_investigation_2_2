/**
 * 
 */
package check;

import java.util.regex.Pattern;

/**
 * @author ���ٲ�
 *2017-3-20����2:17:54
 *У����֯��������ĳ���
 */
public class CheckORG {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String code="74794680-6";
		if(code.equals("00000000-0")){
			System.out.println("��֯��������������");
			return;
		}
		if(!Pattern.matches("[A-Za-z0-9]{8}-[A-Za-z0-9]",code)){
			System.out.println("��֯�������벻���Ϲ淶");
			return;
		}
		System.out.println("��֯�����������У�����");

	}

}
