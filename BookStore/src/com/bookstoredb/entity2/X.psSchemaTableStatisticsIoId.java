package com.bookstoredb.entity2;
// Generated Apr 1, 2021, 10:12:38 AM by Hibernate Tools 5.4.27.Final


import java.math.BigInteger;

/**
 * X.psSchemaTableStatisticsIoId generated by hbm2java
 */
public class X.psSchemaTableStatisticsIoId  implements java.io.Serializable {


     private String tableSchema;
     private String tableName;
     private BigInteger countRead;
     private BigInteger sumNumberOfBytesRead;
     private BigInteger sumTimerRead;
     private BigInteger countWrite;
     private BigInteger sumNumberOfBytesWrite;
     private BigInteger sumTimerWrite;
     private BigInteger countMisc;
     private BigInteger sumTimerMisc;

    public X.psSchemaTableStatisticsIoId() {
    }

    public X.psSchemaTableStatisticsIoId(String tableSchema, String tableName, BigInteger countRead, BigInteger sumNumberOfBytesRead, BigInteger sumTimerRead, BigInteger countWrite, BigInteger sumNumberOfBytesWrite, BigInteger sumTimerWrite, BigInteger countMisc, BigInteger sumTimerMisc) {
       this.tableSchema = tableSchema;
       this.tableName = tableName;
       this.countRead = countRead;
       this.sumNumberOfBytesRead = sumNumberOfBytesRead;
       this.sumTimerRead = sumTimerRead;
       this.countWrite = countWrite;
       this.sumNumberOfBytesWrite = sumNumberOfBytesWrite;
       this.sumTimerWrite = sumTimerWrite;
       this.countMisc = countMisc;
       this.sumTimerMisc = sumTimerMisc;
    }
   
    public String getTableSchema() {
        return this.tableSchema;
    }
    
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }
    public String getTableName() {
        return this.tableName;
    }
    
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    public BigInteger getCountRead() {
        return this.countRead;
    }
    
    public void setCountRead(BigInteger countRead) {
        this.countRead = countRead;
    }
    public BigInteger getSumNumberOfBytesRead() {
        return this.sumNumberOfBytesRead;
    }
    
    public void setSumNumberOfBytesRead(BigInteger sumNumberOfBytesRead) {
        this.sumNumberOfBytesRead = sumNumberOfBytesRead;
    }
    public BigInteger getSumTimerRead() {
        return this.sumTimerRead;
    }
    
    public void setSumTimerRead(BigInteger sumTimerRead) {
        this.sumTimerRead = sumTimerRead;
    }
    public BigInteger getCountWrite() {
        return this.countWrite;
    }
    
    public void setCountWrite(BigInteger countWrite) {
        this.countWrite = countWrite;
    }
    public BigInteger getSumNumberOfBytesWrite() {
        return this.sumNumberOfBytesWrite;
    }
    
    public void setSumNumberOfBytesWrite(BigInteger sumNumberOfBytesWrite) {
        this.sumNumberOfBytesWrite = sumNumberOfBytesWrite;
    }
    public BigInteger getSumTimerWrite() {
        return this.sumTimerWrite;
    }
    
    public void setSumTimerWrite(BigInteger sumTimerWrite) {
        this.sumTimerWrite = sumTimerWrite;
    }
    public BigInteger getCountMisc() {
        return this.countMisc;
    }
    
    public void setCountMisc(BigInteger countMisc) {
        this.countMisc = countMisc;
    }
    public BigInteger getSumTimerMisc() {
        return this.sumTimerMisc;
    }
    
    public void setSumTimerMisc(BigInteger sumTimerMisc) {
        this.sumTimerMisc = sumTimerMisc;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.psSchemaTableStatisticsIoId) ) return false;
		 X.psSchemaTableStatisticsIoId castOther = ( X.psSchemaTableStatisticsIoId ) other; 
         
		 return ( (this.getTableSchema()==castOther.getTableSchema()) || ( this.getTableSchema()!=null && castOther.getTableSchema()!=null && this.getTableSchema().equals(castOther.getTableSchema()) ) )
 && ( (this.getTableName()==castOther.getTableName()) || ( this.getTableName()!=null && castOther.getTableName()!=null && this.getTableName().equals(castOther.getTableName()) ) )
 && ( (this.getCountRead()==castOther.getCountRead()) || ( this.getCountRead()!=null && castOther.getCountRead()!=null && this.getCountRead().equals(castOther.getCountRead()) ) )
 && ( (this.getSumNumberOfBytesRead()==castOther.getSumNumberOfBytesRead()) || ( this.getSumNumberOfBytesRead()!=null && castOther.getSumNumberOfBytesRead()!=null && this.getSumNumberOfBytesRead().equals(castOther.getSumNumberOfBytesRead()) ) )
 && ( (this.getSumTimerRead()==castOther.getSumTimerRead()) || ( this.getSumTimerRead()!=null && castOther.getSumTimerRead()!=null && this.getSumTimerRead().equals(castOther.getSumTimerRead()) ) )
 && ( (this.getCountWrite()==castOther.getCountWrite()) || ( this.getCountWrite()!=null && castOther.getCountWrite()!=null && this.getCountWrite().equals(castOther.getCountWrite()) ) )
 && ( (this.getSumNumberOfBytesWrite()==castOther.getSumNumberOfBytesWrite()) || ( this.getSumNumberOfBytesWrite()!=null && castOther.getSumNumberOfBytesWrite()!=null && this.getSumNumberOfBytesWrite().equals(castOther.getSumNumberOfBytesWrite()) ) )
 && ( (this.getSumTimerWrite()==castOther.getSumTimerWrite()) || ( this.getSumTimerWrite()!=null && castOther.getSumTimerWrite()!=null && this.getSumTimerWrite().equals(castOther.getSumTimerWrite()) ) )
 && ( (this.getCountMisc()==castOther.getCountMisc()) || ( this.getCountMisc()!=null && castOther.getCountMisc()!=null && this.getCountMisc().equals(castOther.getCountMisc()) ) )
 && ( (this.getSumTimerMisc()==castOther.getSumTimerMisc()) || ( this.getSumTimerMisc()!=null && castOther.getSumTimerMisc()!=null && this.getSumTimerMisc().equals(castOther.getSumTimerMisc()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTableSchema() == null ? 0 : this.getTableSchema().hashCode() );
         result = 37 * result + ( getTableName() == null ? 0 : this.getTableName().hashCode() );
         result = 37 * result + ( getCountRead() == null ? 0 : this.getCountRead().hashCode() );
         result = 37 * result + ( getSumNumberOfBytesRead() == null ? 0 : this.getSumNumberOfBytesRead().hashCode() );
         result = 37 * result + ( getSumTimerRead() == null ? 0 : this.getSumTimerRead().hashCode() );
         result = 37 * result + ( getCountWrite() == null ? 0 : this.getCountWrite().hashCode() );
         result = 37 * result + ( getSumNumberOfBytesWrite() == null ? 0 : this.getSumNumberOfBytesWrite().hashCode() );
         result = 37 * result + ( getSumTimerWrite() == null ? 0 : this.getSumTimerWrite().hashCode() );
         result = 37 * result + ( getCountMisc() == null ? 0 : this.getCountMisc().hashCode() );
         result = 37 * result + ( getSumTimerMisc() == null ? 0 : this.getSumTimerMisc().hashCode() );
         return result;
   }   


}


