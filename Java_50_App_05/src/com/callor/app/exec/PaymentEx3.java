package com.callor.app.exec;

public class PaymentEx3 {

	public static void main(String[] args) {
		int pay = 3_829_980;
		int money = 50_000;
		boolean sw = true;

		while (pay > 0) {
			int paper = pay / money;
			System.out.printf("%7d 권: %5d 매\n", money, paper);
			pay -= paper * money;
			if (sw) {
				money = money / 5;
			} else {
				money = money / 2;
			}
			sw = !sw;
		}

	}

}
