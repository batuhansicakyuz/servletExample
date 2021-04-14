package com.bookstoredb.entity2;
// Generated Apr 1, 2021, 10:12:38 AM by Hibernate Tools 5.4.27.Final



/**
 * X.ioGlobalByFileByLatencyId generated by hbm2java
 */
public class X.ioGlobalByFileByLatencyId  implements java.io.Serializable {


     private String file;
     private long total;
     private long totalLatency;
     private long countRead;
     private long readLatency;
     private long countWrite;
     private long writeLatency;
     private long countMisc;
     private long miscLatency;

    public X.ioGlobalByFileByLatencyId() {
    }

    public X.ioGlobalByFileByLatencyId(String file, long total, long totalLatency, long countRead, long readLatency, long countWrite, long writeLatency, long countMisc, long miscLatency) {
       this.file = file;
       this.total = total;
       this.totalLatency = totalLatency;
       this.countRead = countRead;
       this.readLatency = readLatency;
       this.countWrite = countWrite;
       this.writeLatency = writeLatency;
       this.countMisc = countMisc;
       this.miscLatency = miscLatency;
    }
   
    public String getFile() {
        return this.file;
    }
    
    public void setFile(String file) {
        this.file = file;
    }
    public long getTotal() {
        return this.total;
    }
    
    public void setTotal(long total) {
        this.total = total;
    }
    public long getTotalLatency() {
        return this.totalLatency;
    }
    
    public void setTotalLatency(long totalLatency) {
        this.totalLatency = totalLatency;
    }
    public long getCountRead() {
        return this.countRead;
    }
    
    public void setCountRead(long countRead) {
        this.countRead = countRead;
    }
    public long getReadLatency() {
        return this.readLatency;
    }
    
    public void setReadLatency(long readLatency) {
        this.readLatency = readLatency;
    }
    public long getCountWrite() {
        return this.countWrite;
    }
    
    public void setCountWrite(long countWrite) {
        this.countWrite = countWrite;
    }
    public long getWriteLatency() {
        return this.writeLatency;
    }
    
    public void setWriteLatency(long writeLatency) {
        this.writeLatency = writeLatency;
    }
    public long getCountMisc() {
        return this.countMisc;
    }
    
    public void setCountMisc(long countMisc) {
        this.countMisc = countMisc;
    }
    public long getMiscLatency() {
        return this.miscLatency;
    }
    
    public void setMiscLatency(long miscLatency) {
        this.miscLatency = miscLatency;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.ioGlobalByFileByLatencyId) ) return false;
		 X.ioGlobalByFileByLatencyId castOther = ( X.ioGlobalByFileByLatencyId ) other; 
         
		 return ( (this.getFile()==castOther.getFile()) || ( this.getFile()!=null && castOther.getFile()!=null && this.getFile().equals(castOther.getFile()) ) )
 && (this.getTotal()==castOther.getTotal())
 && (this.getTotalLatency()==castOther.getTotalLatency())
 && (this.getCountRead()==castOther.getCountRead())
 && (this.getReadLatency()==castOther.getReadLatency())
 && (this.getCountWrite()==castOther.getCountWrite())
 && (this.getWriteLatency()==castOther.getWriteLatency())
 && (this.getCountMisc()==castOther.getCountMisc())
 && (this.getMiscLatency()==castOther.getMiscLatency());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getFile() == null ? 0 : this.getFile().hashCode() );
         result = 37 * result + (int) this.getTotal();
         result = 37 * result + (int) this.getTotalLatency();
         result = 37 * result + (int) this.getCountRead();
         result = 37 * result + (int) this.getReadLatency();
         result = 37 * result + (int) this.getCountWrite();
         result = 37 * result + (int) this.getWriteLatency();
         result = 37 * result + (int) this.getCountMisc();
         result = 37 * result + (int) this.getMiscLatency();
         return result;
   }   


}


