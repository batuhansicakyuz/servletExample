package com.bookstoredb.entity2;
// Generated Apr 1, 2021, 10:12:38 AM by Hibernate Tools 5.4.27.Final

import java.math.BigInteger;
import java.util.Date;

/**
 * StatementAnalysisId generated by hbm2java
 */
public class StatementAnalysisId implements java.io.Serializable {

	private String query;
	private String db;
	private String fullScan;
	private long execCount;
	private long errCount;
	private long warnCount;
	private String totalLatency;
	private String maxLatency;
	private String avgLatency;
	private String lockLatency;
	private long rowsSent;
	private BigInteger rowsSentAvg;
	private long rowsExamined;
	private BigInteger rowsExaminedAvg;
	private long rowsAffected;
	private BigInteger rowsAffectedAvg;
	private long tmpTables;
	private long tmpDiskTables;
	private long rowsSorted;
	private long sortMergePasses;
	private String digest;
	private Date firstSeen;
	private Date lastSeen;

	public StatementAnalysisId() {
	}

	public StatementAnalysisId(String fullScan, long execCount, long errCount, long warnCount, long rowsSent,
			BigInteger rowsSentAvg, long rowsExamined, BigInteger rowsExaminedAvg, long rowsAffected,
			BigInteger rowsAffectedAvg, long tmpTables, long tmpDiskTables, long rowsSorted, long sortMergePasses,
			Date firstSeen, Date lastSeen) {
		this.fullScan = fullScan;
		this.execCount = execCount;
		this.errCount = errCount;
		this.warnCount = warnCount;
		this.rowsSent = rowsSent;
		this.rowsSentAvg = rowsSentAvg;
		this.rowsExamined = rowsExamined;
		this.rowsExaminedAvg = rowsExaminedAvg;
		this.rowsAffected = rowsAffected;
		this.rowsAffectedAvg = rowsAffectedAvg;
		this.tmpTables = tmpTables;
		this.tmpDiskTables = tmpDiskTables;
		this.rowsSorted = rowsSorted;
		this.sortMergePasses = sortMergePasses;
		this.firstSeen = firstSeen;
		this.lastSeen = lastSeen;
	}

	public StatementAnalysisId(String query, String db, String fullScan, long execCount, long errCount, long warnCount,
			String totalLatency, String maxLatency, String avgLatency, String lockLatency, long rowsSent,
			BigInteger rowsSentAvg, long rowsExamined, BigInteger rowsExaminedAvg, long rowsAffected,
			BigInteger rowsAffectedAvg, long tmpTables, long tmpDiskTables, long rowsSorted, long sortMergePasses,
			String digest, Date firstSeen, Date lastSeen) {
		this.query = query;
		this.db = db;
		this.fullScan = fullScan;
		this.execCount = execCount;
		this.errCount = errCount;
		this.warnCount = warnCount;
		this.totalLatency = totalLatency;
		this.maxLatency = maxLatency;
		this.avgLatency = avgLatency;
		this.lockLatency = lockLatency;
		this.rowsSent = rowsSent;
		this.rowsSentAvg = rowsSentAvg;
		this.rowsExamined = rowsExamined;
		this.rowsExaminedAvg = rowsExaminedAvg;
		this.rowsAffected = rowsAffected;
		this.rowsAffectedAvg = rowsAffectedAvg;
		this.tmpTables = tmpTables;
		this.tmpDiskTables = tmpDiskTables;
		this.rowsSorted = rowsSorted;
		this.sortMergePasses = sortMergePasses;
		this.digest = digest;
		this.firstSeen = firstSeen;
		this.lastSeen = lastSeen;
	}

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getDb() {
		return this.db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public String getFullScan() {
		return this.fullScan;
	}

	public void setFullScan(String fullScan) {
		this.fullScan = fullScan;
	}

	public long getExecCount() {
		return this.execCount;
	}

	public void setExecCount(long execCount) {
		this.execCount = execCount;
	}

	public long getErrCount() {
		return this.errCount;
	}

	public void setErrCount(long errCount) {
		this.errCount = errCount;
	}

	public long getWarnCount() {
		return this.warnCount;
	}

	public void setWarnCount(long warnCount) {
		this.warnCount = warnCount;
	}

	public String getTotalLatency() {
		return this.totalLatency;
	}

	public void setTotalLatency(String totalLatency) {
		this.totalLatency = totalLatency;
	}

	public String getMaxLatency() {
		return this.maxLatency;
	}

	public void setMaxLatency(String maxLatency) {
		this.maxLatency = maxLatency;
	}

	public String getAvgLatency() {
		return this.avgLatency;
	}

	public void setAvgLatency(String avgLatency) {
		this.avgLatency = avgLatency;
	}

	public String getLockLatency() {
		return this.lockLatency;
	}

	public void setLockLatency(String lockLatency) {
		this.lockLatency = lockLatency;
	}

	public long getRowsSent() {
		return this.rowsSent;
	}

	public void setRowsSent(long rowsSent) {
		this.rowsSent = rowsSent;
	}

	public BigInteger getRowsSentAvg() {
		return this.rowsSentAvg;
	}

	public void setRowsSentAvg(BigInteger rowsSentAvg) {
		this.rowsSentAvg = rowsSentAvg;
	}

	public long getRowsExamined() {
		return this.rowsExamined;
	}

	public void setRowsExamined(long rowsExamined) {
		this.rowsExamined = rowsExamined;
	}

	public BigInteger getRowsExaminedAvg() {
		return this.rowsExaminedAvg;
	}

	public void setRowsExaminedAvg(BigInteger rowsExaminedAvg) {
		this.rowsExaminedAvg = rowsExaminedAvg;
	}

	public long getRowsAffected() {
		return this.rowsAffected;
	}

	public void setRowsAffected(long rowsAffected) {
		this.rowsAffected = rowsAffected;
	}

	public BigInteger getRowsAffectedAvg() {
		return this.rowsAffectedAvg;
	}

	public void setRowsAffectedAvg(BigInteger rowsAffectedAvg) {
		this.rowsAffectedAvg = rowsAffectedAvg;
	}

	public long getTmpTables() {
		return this.tmpTables;
	}

	public void setTmpTables(long tmpTables) {
		this.tmpTables = tmpTables;
	}

	public long getTmpDiskTables() {
		return this.tmpDiskTables;
	}

	public void setTmpDiskTables(long tmpDiskTables) {
		this.tmpDiskTables = tmpDiskTables;
	}

	public long getRowsSorted() {
		return this.rowsSorted;
	}

	public void setRowsSorted(long rowsSorted) {
		this.rowsSorted = rowsSorted;
	}

	public long getSortMergePasses() {
		return this.sortMergePasses;
	}

	public void setSortMergePasses(long sortMergePasses) {
		this.sortMergePasses = sortMergePasses;
	}

	public String getDigest() {
		return this.digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public Date getFirstSeen() {
		return this.firstSeen;
	}

	public void setFirstSeen(Date firstSeen) {
		this.firstSeen = firstSeen;
	}

	public Date getLastSeen() {
		return this.lastSeen;
	}

	public void setLastSeen(Date lastSeen) {
		this.lastSeen = lastSeen;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StatementAnalysisId))
			return false;
		StatementAnalysisId castOther = (StatementAnalysisId) other;

		return ((this.getQuery() == castOther.getQuery()) || (this.getQuery() != null && castOther.getQuery() != null
				&& this.getQuery().equals(castOther.getQuery())))
				&& ((this.getDb() == castOther.getDb()) || (this.getDb() != null && castOther.getDb() != null
						&& this.getDb().equals(castOther.getDb())))
				&& ((this.getFullScan() == castOther.getFullScan()) || (this.getFullScan() != null
						&& castOther.getFullScan() != null && this.getFullScan().equals(castOther.getFullScan())))
				&& (this.getExecCount() == castOther.getExecCount()) && (this.getErrCount() == castOther.getErrCount())
				&& (this.getWarnCount() == castOther.getWarnCount())
				&& ((this.getTotalLatency() == castOther.getTotalLatency())
						|| (this.getTotalLatency() != null && castOther.getTotalLatency() != null
								&& this.getTotalLatency().equals(castOther.getTotalLatency())))
				&& ((this.getMaxLatency() == castOther.getMaxLatency()) || (this.getMaxLatency() != null
						&& castOther.getMaxLatency() != null && this.getMaxLatency().equals(castOther.getMaxLatency())))
				&& ((this.getAvgLatency() == castOther.getAvgLatency()) || (this.getAvgLatency() != null
						&& castOther.getAvgLatency() != null && this.getAvgLatency().equals(castOther.getAvgLatency())))
				&& ((this.getLockLatency() == castOther.getLockLatency())
						|| (this.getLockLatency() != null && castOther.getLockLatency() != null
								&& this.getLockLatency().equals(castOther.getLockLatency())))
				&& (this.getRowsSent() == castOther.getRowsSent())
				&& ((this.getRowsSentAvg() == castOther.getRowsSentAvg())
						|| (this.getRowsSentAvg() != null && castOther.getRowsSentAvg() != null
								&& this.getRowsSentAvg().equals(castOther.getRowsSentAvg())))
				&& (this.getRowsExamined() == castOther.getRowsExamined())
				&& ((this.getRowsExaminedAvg() == castOther.getRowsExaminedAvg())
						|| (this.getRowsExaminedAvg() != null && castOther.getRowsExaminedAvg() != null
								&& this.getRowsExaminedAvg().equals(castOther.getRowsExaminedAvg())))
				&& (this.getRowsAffected() == castOther.getRowsAffected())
				&& ((this.getRowsAffectedAvg() == castOther.getRowsAffectedAvg())
						|| (this.getRowsAffectedAvg() != null && castOther.getRowsAffectedAvg() != null
								&& this.getRowsAffectedAvg().equals(castOther.getRowsAffectedAvg())))
				&& (this.getTmpTables() == castOther.getTmpTables())
				&& (this.getTmpDiskTables() == castOther.getTmpDiskTables())
				&& (this.getRowsSorted() == castOther.getRowsSorted())
				&& (this.getSortMergePasses() == castOther.getSortMergePasses())
				&& ((this.getDigest() == castOther.getDigest()) || (this.getDigest() != null
						&& castOther.getDigest() != null && this.getDigest().equals(castOther.getDigest())))
				&& ((this.getFirstSeen() == castOther.getFirstSeen()) || (this.getFirstSeen() != null
						&& castOther.getFirstSeen() != null && this.getFirstSeen().equals(castOther.getFirstSeen())))
				&& ((this.getLastSeen() == castOther.getLastSeen()) || (this.getLastSeen() != null
						&& castOther.getLastSeen() != null && this.getLastSeen().equals(castOther.getLastSeen())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getQuery() == null ? 0 : this.getQuery().hashCode());
		result = 37 * result + (getDb() == null ? 0 : this.getDb().hashCode());
		result = 37 * result + (getFullScan() == null ? 0 : this.getFullScan().hashCode());
		result = 37 * result + (int) this.getExecCount();
		result = 37 * result + (int) this.getErrCount();
		result = 37 * result + (int) this.getWarnCount();
		result = 37 * result + (getTotalLatency() == null ? 0 : this.getTotalLatency().hashCode());
		result = 37 * result + (getMaxLatency() == null ? 0 : this.getMaxLatency().hashCode());
		result = 37 * result + (getAvgLatency() == null ? 0 : this.getAvgLatency().hashCode());
		result = 37 * result + (getLockLatency() == null ? 0 : this.getLockLatency().hashCode());
		result = 37 * result + (int) this.getRowsSent();
		result = 37 * result + (getRowsSentAvg() == null ? 0 : this.getRowsSentAvg().hashCode());
		result = 37 * result + (int) this.getRowsExamined();
		result = 37 * result + (getRowsExaminedAvg() == null ? 0 : this.getRowsExaminedAvg().hashCode());
		result = 37 * result + (int) this.getRowsAffected();
		result = 37 * result + (getRowsAffectedAvg() == null ? 0 : this.getRowsAffectedAvg().hashCode());
		result = 37 * result + (int) this.getTmpTables();
		result = 37 * result + (int) this.getTmpDiskTables();
		result = 37 * result + (int) this.getRowsSorted();
		result = 37 * result + (int) this.getSortMergePasses();
		result = 37 * result + (getDigest() == null ? 0 : this.getDigest().hashCode());
		result = 37 * result + (getFirstSeen() == null ? 0 : this.getFirstSeen().hashCode());
		result = 37 * result + (getLastSeen() == null ? 0 : this.getLastSeen().hashCode());
		return result;
	}

}
