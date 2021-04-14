package com.bookstoredb.entity2;
// Generated Apr 1, 2021, 10:12:38 AM by Hibernate Tools 5.4.27.Final

/**
 * MemoryGlobalByCurrentBytesId generated by hbm2java
 */
public class MemoryGlobalByCurrentBytesId implements java.io.Serializable {

	private String eventName;
	private long currentCount;
	private String currentAlloc;
	private String currentAvgAlloc;
	private long highCount;
	private String highAlloc;
	private String highAvgAlloc;

	public MemoryGlobalByCurrentBytesId() {
	}

	public MemoryGlobalByCurrentBytesId(String eventName, long currentCount, long highCount) {
		this.eventName = eventName;
		this.currentCount = currentCount;
		this.highCount = highCount;
	}

	public MemoryGlobalByCurrentBytesId(String eventName, long currentCount, String currentAlloc,
			String currentAvgAlloc, long highCount, String highAlloc, String highAvgAlloc) {
		this.eventName = eventName;
		this.currentCount = currentCount;
		this.currentAlloc = currentAlloc;
		this.currentAvgAlloc = currentAvgAlloc;
		this.highCount = highCount;
		this.highAlloc = highAlloc;
		this.highAvgAlloc = highAvgAlloc;
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public long getCurrentCount() {
		return this.currentCount;
	}

	public void setCurrentCount(long currentCount) {
		this.currentCount = currentCount;
	}

	public String getCurrentAlloc() {
		return this.currentAlloc;
	}

	public void setCurrentAlloc(String currentAlloc) {
		this.currentAlloc = currentAlloc;
	}

	public String getCurrentAvgAlloc() {
		return this.currentAvgAlloc;
	}

	public void setCurrentAvgAlloc(String currentAvgAlloc) {
		this.currentAvgAlloc = currentAvgAlloc;
	}

	public long getHighCount() {
		return this.highCount;
	}

	public void setHighCount(long highCount) {
		this.highCount = highCount;
	}

	public String getHighAlloc() {
		return this.highAlloc;
	}

	public void setHighAlloc(String highAlloc) {
		this.highAlloc = highAlloc;
	}

	public String getHighAvgAlloc() {
		return this.highAvgAlloc;
	}

	public void setHighAvgAlloc(String highAvgAlloc) {
		this.highAvgAlloc = highAvgAlloc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MemoryGlobalByCurrentBytesId))
			return false;
		MemoryGlobalByCurrentBytesId castOther = (MemoryGlobalByCurrentBytesId) other;

		return ((this.getEventName() == castOther.getEventName()) || (this.getEventName() != null
				&& castOther.getEventName() != null && this.getEventName().equals(castOther.getEventName())))
				&& (this.getCurrentCount() == castOther.getCurrentCount())
				&& ((this.getCurrentAlloc() == castOther.getCurrentAlloc())
						|| (this.getCurrentAlloc() != null && castOther.getCurrentAlloc() != null
								&& this.getCurrentAlloc().equals(castOther.getCurrentAlloc())))
				&& ((this.getCurrentAvgAlloc() == castOther.getCurrentAvgAlloc())
						|| (this.getCurrentAvgAlloc() != null && castOther.getCurrentAvgAlloc() != null
								&& this.getCurrentAvgAlloc().equals(castOther.getCurrentAvgAlloc())))
				&& (this.getHighCount() == castOther.getHighCount())
				&& ((this.getHighAlloc() == castOther.getHighAlloc()) || (this.getHighAlloc() != null
						&& castOther.getHighAlloc() != null && this.getHighAlloc().equals(castOther.getHighAlloc())))
				&& ((this.getHighAvgAlloc() == castOther.getHighAvgAlloc())
						|| (this.getHighAvgAlloc() != null && castOther.getHighAvgAlloc() != null
								&& this.getHighAvgAlloc().equals(castOther.getHighAvgAlloc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEventName() == null ? 0 : this.getEventName().hashCode());
		result = 37 * result + (int) this.getCurrentCount();
		result = 37 * result + (getCurrentAlloc() == null ? 0 : this.getCurrentAlloc().hashCode());
		result = 37 * result + (getCurrentAvgAlloc() == null ? 0 : this.getCurrentAvgAlloc().hashCode());
		result = 37 * result + (int) this.getHighCount();
		result = 37 * result + (getHighAlloc() == null ? 0 : this.getHighAlloc().hashCode());
		result = 37 * result + (getHighAvgAlloc() == null ? 0 : this.getHighAvgAlloc().hashCode());
		return result;
	}

}
