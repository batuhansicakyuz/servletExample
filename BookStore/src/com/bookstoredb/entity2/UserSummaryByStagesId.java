package com.bookstoredb.entity2;
// Generated Apr 1, 2021, 10:12:38 AM by Hibernate Tools 5.4.27.Final

/**
 * UserSummaryByStagesId generated by hbm2java
 */
public class UserSummaryByStagesId implements java.io.Serializable {

	private String user;
	private String eventName;
	private long total;
	private String totalLatency;
	private String avgLatency;

	public UserSummaryByStagesId() {
	}

	public UserSummaryByStagesId(String eventName, long total) {
		this.eventName = eventName;
		this.total = total;
	}

	public UserSummaryByStagesId(String user, String eventName, long total, String totalLatency, String avgLatency) {
		this.user = user;
		this.eventName = eventName;
		this.total = total;
		this.totalLatency = totalLatency;
		this.avgLatency = avgLatency;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public long getTotal() {
		return this.total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public String getTotalLatency() {
		return this.totalLatency;
	}

	public void setTotalLatency(String totalLatency) {
		this.totalLatency = totalLatency;
	}

	public String getAvgLatency() {
		return this.avgLatency;
	}

	public void setAvgLatency(String avgLatency) {
		this.avgLatency = avgLatency;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserSummaryByStagesId))
			return false;
		UserSummaryByStagesId castOther = (UserSummaryByStagesId) other;

		return ((this.getUser() == castOther.getUser()) || (this.getUser() != null && castOther.getUser() != null
				&& this.getUser().equals(castOther.getUser())))
				&& ((this.getEventName() == castOther.getEventName()) || (this.getEventName() != null
						&& castOther.getEventName() != null && this.getEventName().equals(castOther.getEventName())))
				&& (this.getTotal() == castOther.getTotal())
				&& ((this.getTotalLatency() == castOther.getTotalLatency())
						|| (this.getTotalLatency() != null && castOther.getTotalLatency() != null
								&& this.getTotalLatency().equals(castOther.getTotalLatency())))
				&& ((this.getAvgLatency() == castOther.getAvgLatency())
						|| (this.getAvgLatency() != null && castOther.getAvgLatency() != null
								&& this.getAvgLatency().equals(castOther.getAvgLatency())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUser() == null ? 0 : this.getUser().hashCode());
		result = 37 * result + (getEventName() == null ? 0 : this.getEventName().hashCode());
		result = 37 * result + (int) this.getTotal();
		result = 37 * result + (getTotalLatency() == null ? 0 : this.getTotalLatency().hashCode());
		result = 37 * result + (getAvgLatency() == null ? 0 : this.getAvgLatency().hashCode());
		return result;
	}

}
