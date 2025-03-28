package com.untill.driver.untillapi.users;

public class User {
	private Long id;
	private String name;
	private String firstName;
	private String lastName;
	private String operatorId;
	private Long creationDate;
	private Integer number;
	/**
	 * Role restaurant
	 * <ul>
	 * <li>{@link RoleRestaurant#WAITER Waiter}</li>
	 * <li>{@link RoleRestaurant#WAITER_PLUS Waiter+}</li>
	 * <li>{@link RoleRestaurant#RESPONSIBLE Responsible}</li>
	 * <li>{@link RoleRestaurant#RESPONSIBLE_PLUS Responsible+}</li>
	 * <li>{@link RoleRestaurant#MANAGER Manager}</li>
	 * <li>{@link RoleRestaurant#SUPERVISOR Supervisor}</li>
	 * </ul>
	 *
	 * @see RoleRestaurant
	 */
	private Integer roleRestaurant;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public Long getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Long creationDate) {
		this.creationDate = creationDate;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getRoleRestaurant() {
		return roleRestaurant;
	}

	public void setRoleRestaurant(Integer roleRestaurant) {
		this.roleRestaurant = roleRestaurant;
	}

	@Override
	public String toString() {
		return "User{"
				+ "id=" + id
				+ ", name='" + name + '\''
				+ ", firstName='" + firstName + '\''
				+ ", lastName='" + lastName + '\''
				+ ", operatorId='" + operatorId + '\''
				+ ", creationDate=" + creationDate
				+ ", number=" + number
				+ ", roleRestaurant=" + roleRestaurant
				+ '}';
	}
}
