package com.bookstoredb.entity2;
// Generated Apr 1, 2021, 10:12:38 AM by Hibernate Tools 5.4.27.Final


import java.math.BigInteger;

/**
 * X.memoryGlobalTotal generated by hbm2java
 */
public class X.memoryGlobalTotal  implements java.io.Serializable {


     private BigInteger totalAllocated;

    public X.memoryGlobalTotal() {
    }

    public X.memoryGlobalTotal(BigInteger totalAllocated) {
       this.totalAllocated = totalAllocated;
    }
   
    public BigInteger getTotalAllocated() {
        return this.totalAllocated;
    }
    
    public void setTotalAllocated(BigInteger totalAllocated) {
        this.totalAllocated = totalAllocated;
    }




}


