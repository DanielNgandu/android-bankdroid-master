package com.liato.bankdroid.banking.banks.lansforsakringar.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TransactionsRequest {

    private int mRequestedPage;

    private String mLedger;

    private String mAccountNumber;


    public TransactionsRequest(int requestedPage, String ledger, String accountNumber) {
        mRequestedPage = requestedPage;
        mLedger = ledger;
        mAccountNumber = accountNumber;
    }

    @JsonProperty("requestedPage")
    public int getRequestedPage() {
        return mRequestedPage;
    }

    @JsonSetter("requestedPage")
    public void setRequestedPage(int r) {
        mRequestedPage = r;
    }

    @JsonProperty("ledger")
    public String getLedger() {
        return mLedger;
    }

    @JsonSetter("ledger")
    public void setLedger(String l) {
        mLedger = l;
    }

    @JsonProperty("accountNumber")
    public String getAccountNumber() {
        return mAccountNumber;
    }

    @JsonSetter("accountNumber")
    public void setAccountNumber(String a) {
        mAccountNumber = a;
    }

}