package com.bookstoredb.entity2;
// Generated Apr 1, 2021, 10:12:38 AM by Hibernate Tools 5.4.27.Final

/**
 * MemoryGlobalTotal generated by hbm2java
 */
public class MemoryGlobalTotal implements java.io.Serializable {

	private String totalAllocated;

	public MemoryGlobalTotal() {
	}

	public MemoryGlobalTotal(String totalAllocated) {
		this.totalAllocated = totalAllocated;
	}

	public String getTotalAllocated() {
		return this.totalAllocated;
	}

	public void setTotalAllocated(String totalAllocated) {
		this.totalAllocated = totalAllocated;
	}

}