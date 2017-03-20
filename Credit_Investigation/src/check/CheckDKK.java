/**
 * CheckDKK.java
 */
package check;

/**
 * @author 杨少博
 *  2017-3-20下午3:44:44
 *  校验贷款卡
 */
public class CheckDKK {

	/**
	 * @param args
	 */
	public static boolean checkDKK(byte[] financecode) {
		int[] weightValue = new int[14];
		int[] checkValue = new int[14];
		int totalValue = 0;
		int c = 0;

		weightValue[0] = 1;
		weightValue[1] = 3;
		weightValue[2] = 5;
		weightValue[3] = 7;
		weightValue[4] = 11;
		weightValue[5] = 2;
		weightValue[6] = 13;
		weightValue[7] = 1;
		weightValue[8] = 1;
		weightValue[9] = 17;
		weightValue[10] = 19;
		weightValue[11] = 97;
		weightValue[12] = 23;
		weightValue[13] = 29;
		for (int j = 0; j < 14; j++) {
			if ((financecode[j] >= 65) && (financecode[j] <= 90)) {
				checkValue[j] = (financecode[j] - 65 + 10);
			} else if ((financecode[j] >= 48) && (financecode[j] <= 57)) {
				financecode[j] -= 48;
			} else {
				return false;
			}
			totalValue += weightValue[j] * checkValue[j];
		}
		c = 1 + totalValue % 97;
		int val = (financecode[14] - 48) * 10 + (financecode[15] - 48);
		if (val == c) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String code="1503020000065221";
		byte DKK[] = code.getBytes();
		System.out.println(checkDKK(DKK));
		if(checkDKK(DKK)==false){
			System.out.println("贷款卡编码校验不通过");
		}else{
			System.out.println("贷款卡编码校验通过");
		}
	}

}
