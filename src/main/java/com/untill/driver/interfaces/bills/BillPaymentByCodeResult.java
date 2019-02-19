package com.untill.driver.interfaces.bills;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a result of "Request Payment by Code" action in POS, handled by {@link IBillsHandler}}
 * 
 * @see IBillsHandler
 * @see BillsHandlerRequest
 */
public class BillPaymentByCodeResult extends BillsHandlerResult {

	Long paymentId;
	
	BigDecimal amount;
	
	BigDecimal tip;
	
	String displayText;
	
	List<BillDiscountedItem> discountedItems = new ArrayList<>();

	/**
	 * @return Returns the list of discounted items
	 */
	public List<BillDiscountedItem> getDiscountedItems() {
		return discountedItems;
	}

	/**
	 * Sets the list of discounted items
	 * @param discountedItems discounted items
	 */
	public void setDiscountedItems(List<BillDiscountedItem> discountedItems) {
		this.discountedItems = discountedItems;
	}

	/**
	 * @return Returns the ID of payment mode
	 */
	public Long getPaymentId() {
		return paymentId;
	}

	/**
	 * Sets the ID of payment mode
	 * @param paymentId Payment Id to set
	 */
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	/**
	 * @return The payment amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * Sets the payment amount
	 * @param amount 
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * @return The tip amount (optional)
	 */
	public BigDecimal getTip() {
		return tip;
	}

	/**
	 * Sets tip amount (optional)
	 * @param tip
	 */
	public void setTip(BigDecimal tip) {
		this.tip = tip;
	}

	/**
	 * @return Returns the text to display (optional)
	 */
	public String getDisplayText() {
		return displayText;
	}

	/**
	 * Sets the text to display (optional)
	 * @param displayText
	 */
	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}
	
}
