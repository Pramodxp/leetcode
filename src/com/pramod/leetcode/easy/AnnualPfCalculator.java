package com.pramod.leetcode.easy;

import java.math.BigDecimal;

public class AnnualPfCalculator {

	static BigDecimal totalAmount = new BigDecimal(0);

	public static void main(String[] args) {
		System.out.println(calculatePfAmount(30, new BigDecimal(3600),new BigDecimal(0.08)));

	}

	public static BigDecimal calculatePfAmount(int numberNumberOfYearspf, BigDecimal pfAmountMonthly,BigDecimal interestRate) {
		BigDecimal annumPfAmount = new BigDecimal(12).multiply(pfAmountMonthly);

		for (int i = 0; i <= numberNumberOfYearspf; i++) {
			totalAmount = totalAmount.add(annumPfAmount);
			totalAmount = totalAmount.add(totalAmount.multiply(interestRate));
		}

		return totalAmount;
	}
}
