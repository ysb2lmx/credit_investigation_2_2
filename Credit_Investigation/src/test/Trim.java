/**
 * Trim.java
 */
package test;

/**
 * @author ���ٲ�
 *2017-3-20����7:15:35
 *�ַ�����ȥ���ո�ķ���
 */
public class Trim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String code_a="Hello Word";
		String code_b="Hello Word ";
		System.out.println("code_a:["+code_a+"]");
		System.out.println("code_b:["+code_b+"]");
		
		code_a=code_a.trim();
		code_b=code_b.trim();
		System.out.println("code_a:["+code_a+"]");
		System.out.println("code_b:["+code_b+"]");
		
		String code_c="Hello Word";
		String code_d="Hello Word ";
		code_c=code_c.replace(" ", "");
		code_d=code_d.replace(" ", "");
		System.out.println("code_c:["+code_c+"]");
		System.out.println("code_d:["+code_d+"]");
		
		String code_e=" Hello Word ";
		String code_f="Hello Word ";
		code_e=code_e.replaceAll("\\s*", "");
		code_f=code_f.replace(" ", "");
		System.out.println("code_f:["+code_f+"]");
		System.out.println("code_f:["+code_f+"]");
	}

}
