package com.untill.driver.interfaces.eft;

/**
 * 
 * Returns {@link EftResult}
 *
 */
public class EftGiftCardReadRequest extends EftRequest {

	private String cardId;

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

}
