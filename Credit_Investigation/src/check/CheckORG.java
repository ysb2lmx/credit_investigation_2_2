/**
 * 
 */
package check;

import java.util.regex.Pattern;

/**
 * @author 杨少博
 *2017-3-20下午2:17:54
 *校验组织机构代码的程序
 */
public class CheckORG {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String code="74794680-6";
		if(code.equals("00000000-0")){
			System.out.println("组织机构代码有问题");
			return;
		}
		if(!Pattern.matches("[A-Za-z0-9]{8}-[A-Za-z0-9]",code)){
			System.out.println("组织机构代码不符合规范");
			return;
		}
		System.out.println("组织机构代码符合校验规则");

	}

}
