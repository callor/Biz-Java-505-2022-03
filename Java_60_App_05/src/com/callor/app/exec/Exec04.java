package com.callor.app.exec;

public class Exec04 {
	
	public static void main(String[] args) {
		
		String str1 = "A";
		String str2 = "B";
		
		int comp = str1.compareTo(str2);
		System.out.println(comp);
		
		comp = str2.compareTo(str1);
		System.out.println(comp);
		
		comp = str1.compareTo(str1);
		System.out.println(comp);
		
		String[] strs = {"F","A","C","B","D"};
		for(String str : strs) {
			System.out.printf("%s\t",str);
		}
		
		for(int i = 0 ; i < strs.length ; i++) {
			for(int j = i + 1; j < strs.length ; j++) {
				
				// 문자열의 알파벳 순서를 비교하는 method
				// strs[i] 에 저장된 문자열이 strs[j] 에 저장된 문자열보다
				// 	알파벳 순서상 뒤에 나오면 결과는 0보다 크다
				//	반대이면 결과는 0보다 작다
				if(strs[i].compareTo(strs[j]) > 0) {
					String _str = strs[i];
					strs[i] = strs[j];
					strs[j] = _str;
				}
			}
		}
		System.out.println();
		for(String str : strs) {
			System.out.printf("%s\t",str);
		}

		
		
		
		
	}
}
