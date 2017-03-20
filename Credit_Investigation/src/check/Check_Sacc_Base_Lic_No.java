/**
 * Check_Sacc_Base_Lic_No.java
 */
package check;

import java.util.regex.Pattern;

/**
 * @author 杨少博
 *2017-3-20下午5:01:04
 *校验开户许可证核准证号
 *已完善
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
		// TODO 自动生成的方法存根
//		String code="J2055000097006";//正确
//		String code="J1930001908901";//正确
//		String code="J2080000616604";//正确
		String code="T2055000097007";//错误
		byte base_no[]=code.getBytes();
		if(checkSaccBaseLicNO(base_no)==false){
			System.out.println("开户许可证核准证号有误:"+base_no);
		}else{
			System.out.println("开户许可证核准证号正确:"+base_no);
		}
	}

}
