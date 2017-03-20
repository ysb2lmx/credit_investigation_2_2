/**
 * CheckJRJG.java
 */
package check;

/**
 * @author ���ٲ�
 *2017-3-20����3:57:17
 *У����ڻ�������
 */
public class CheckJRJG {

	/**
	 * @param args
	 */
	public static boolean checkJRJG(byte[] financecode) {
		int M = 10;
		int s = M;
		int k = 9;
		for (int i = k; i >= 0; i--) {
			int temp = financecode[(k - i)];
			if ((temp >= 48) && (temp <= 57)) {
				temp -= 48;
			} else if (((temp >= 65) && (temp <= 90))
					|| ((temp >= 97) && (temp <= 122))) {
				temp = 0;
			} else {
				return false;
			}
			if ((s + temp) % M == 0) {
				s = 9;
			} else {
				s = (s + temp) % M * 2 % (M + 1);
			}
		}
		s = M + 1 - s;
		if (s == 10) {
			s = 0;
		}
		if (((s == 11) && (financecode[10] == 88))
				|| (s == financecode[10] - 48)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String code="2050401n013";
		byte jrjg_code[]=code.getBytes();
		if(checkJRJG(jrjg_code)==false){
			System.out.println("���ڻ�����������");
		}else{
			System.out.println("���ڻ���������ȷ");
		}
	}

}
