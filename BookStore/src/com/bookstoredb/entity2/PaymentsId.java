package com.bookstoredb.entity2;
// Generated Apr 1, 2021, 10:12:38 AM by Hibernate Tools 5.4.27.Final

/**
 * PaymentsId generated by hbm2java
 */
public class PaymentsId implements java.io.Serializable {

	private int customerNumber;
	private String checkNumber;

	public PaymentsId() {
	}

	public PaymentsId(int customerNumber, String checkNumber) {
		this.customerNumber = customerNumber;
		this.checkNumber = checkNumber;
	}

	public int getCustomerNumber() {
		return this.customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCheckNumber() {
		return this.checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PaymentsId))
			return false;
		PaymentsId castOther = (PaymentsId) other;

		return (this.getCustomerNumber() == castOther.getCustomerNumber())
				&& ((this.getCheckNumber() == castOther.getCheckNumber())
						|| (this.getCheckNumber() != null && castOther.getCheckNumber() != null
								&& this.getCheckNumber().equals(castOther.getCheckNumber())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCustomerNumber();
		result = 37 * result + (getCheckNumber() == null ? 0 : this.getCheckNumber().hashCode());
		return result;
	}

}
