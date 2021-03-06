package com.untill.driver.interfaces.cashmachine;

import com.untill.driver.interfaces.DriverResult;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents result of {@link ICashMachine} operation
 */
public class CashMachineResult extends DriverResult {
	/**
	 * Operation result data
	 */
	private Map<String, String> data = new HashMap<>();
	/**
	 * Transaction Result, use constants declared in {@link CashMachineTransactionResult}
	 */
	private int transactionResult;

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	public int getTransactionResult() {
		return transactionResult;
	}

	public void setTransactionResult(int transactionResult) {
		this.transactionResult = transactionResult;
	}
}
