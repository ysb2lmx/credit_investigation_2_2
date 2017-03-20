/**
 * Check_Sacc_Base_Lic_No.java
 */
package check;

import java.util.regex.Pattern;

/**
 * @author ���ٲ�
 *2017-3-20����5:01:04
 *У�鿪�����֤��׼֤��
 *������
 */
public class Check_Sacc_Base_Lic_No {

	/**
	 * @param args
	 */
	public static boolean checkSaccBaseLicNO(byte[] saccBaseLicNO) {
		String tmp = new String(saccBaseLicNO).trim();
		if (tmp.length() != 14) {
			return false;
		}
		String orgCode = tmp.substring(0, 1);
		if (!"J".equals(orgCode)) {
			return false;
		}
		Pattern p = Pattern.compile("[0-9]*");
		boolean isNum = p.matcher(tmp.substring(1, 14)).matches();
		if (!isNum) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		String code="J2055000097006";//��ȷ
//		String code="J1930001908901";//��ȷ
//		String code="J2080000616604";//��ȷ
		String code="T2055000097007";//����
		byte base_no[]=code.getBytes();
		if(checkSaccBaseLicNO(base_no)==false){
			System.out.println("�������֤��׼֤������:"+base_no);
		}else{
			System.out.println("�������֤��׼֤����ȷ:"+base_no);
		}
	}

}
