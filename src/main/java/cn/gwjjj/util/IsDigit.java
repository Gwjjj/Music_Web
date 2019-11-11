package cn.gwjjj.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsDigit { // �ж��ַ����Ƿ�Ϊ����
	public boolean isDigit(String strNum) {
		Pattern pattern = Pattern.compile("[0-9]{1,}");
		Matcher matcher = pattern.matcher((CharSequence) strNum);
		// System.out.println(matcher.matches());
		return matcher.matches();
	}

	public static void main(String args[]) {
		String str = "12345a6";
		IsDigit isdigit = new IsDigit();
		isdigit.isDigit(str);
	}
}
