package com.untill.driver.interfaces.hotel;

import java.math.BigDecimal;

/**
 * A turnover item in a "End of Day" operation request handled by {@link IHotelSupportsEndOfDay}
 */
public class EndOfDayTurnoverItem {

	private long articleId;

	private int articleNumber;

	private String articleName;

	private long departmentId;

	private int departmentNumber;

	private String departmentName;

	private String departmentThirdPartyId;

	private long foodGroupId;

	private int foodGroupNumber;

	private String foodGroupName;

	private long salesAreaId;

	private int salesAreaNumber;

	private String salesAreaName;

	private BigDecimal vatPercent;

	private BigDecimal totalPrice;

	private BigDecimal totalVat;

	private String vatSign;

	private int totalQuantity;



	public String getDepartmentThirdPartyId() {
		return departmentThirdPartyId;
	}

	public void setDepartmentThirdPartyId(String departmentThirdPartyId) {
		this.departmentThirdPartyId = departmentThirdPartyId;
	}

	public long getArticleId() {
		return articleId;
	}

	public void setArticleId(long articleId) {
		this.articleId = articleId;
	}

	public int getArticleNumber() {
		return articleNumber;
	}

	public void setArticleNumber(int articleNumber) {
		this.articleNumber = articleNumber;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public long getFoodGroupId() {
		return foodGroupId;
	}

	public void setFoodGroupId(long foodGroupId) {
		this.foodGroupId = foodGroupId;
	}

	public int getFoodGroupNumber() {
		return foodGroupNumber;
	}

	public void setFoodGroupNumber(int foodGroupNumber) {
		this.foodGroupNumber = foodGroupNumber;
	}

	public String getFoodGroupName() {
		return foodGroupName;
	}

	public void setFoodGroupName(String foodGroupName) {
		this.foodGroupName = foodGroupName;
	}

	public long getSalesAreaId() {
		return salesAreaId;
	}

	public void setSalesAreaId(long salesAreaId) {
		this.salesAreaId = salesAreaId;
	}

	public int getSalesAreaNumber() {
		return salesAreaNumber;
	}

	public void setSalesAreaNumber(int salesAreaNumber) {
		this.salesAreaNumber = salesAreaNumber;
	}

	public String getSalesAreaName() {
		return salesAreaName;
	}

	public void setSalesAreaName(String salesAreaName) {
		this.salesAreaName = salesAreaName;
	}

	public BigDecimal getVatPercent() {
		return vatPercent;
	}

	public void setVatPercent(BigDecimal vatPercent) {
		this.vatPercent = vatPercent;
	}

	public String getVatSign() {
		return vatSign;
	}

	public void setVatSign(String vatSign) {
		this.vatSign = vatSign;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public BigDecimal getTotalVat() {
		return totalVat;
	}

	public void setTotalVat(BigDecimal totalVat) {
		this.totalVat = totalVat;
	}

	@Override
	public String toString() {
		return "EndOfDayTurnoverItem{"
				+ "articleId=" + articleId
				+ ", articleNumber=" + articleNumber
				+ ", articleName='" + articleName + '\''
				+ ", departmentId=" + departmentId
				+ ", departmentNumber=" + departmentNumber
				+ ", departmentName='" + departmentName + '\''
				+ ", foodGroupId=" + foodGroupId
				+ ", foodGroupNumber=" + foodGroupNumber
				+ ", foodGroupName='" + foodGroupName + '\''
				+ ", salesAreaId=" + salesAreaId
				+ ", salesAreaNumber=" + salesAreaNumber
				+ ", salesAreaName='" + salesAreaName + '\''
				+ ", vatPercent=" + vatPercent
				+ ", totalPrice=" + totalPrice
				+ ", totalVat=" + totalVat
				+ ", vatSign='" + vatSign + '\''
				+ ", totalQuantity=" + totalQuantity
				+ '}';
	}
}
