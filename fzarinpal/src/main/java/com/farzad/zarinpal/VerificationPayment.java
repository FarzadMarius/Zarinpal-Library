package com.farzad.zarinpal;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Farzad Zare on 18/01/12.
 * Email = farzad.zare@live.com
 * My Custom ZarinPal Library
 */
class VerificationPayment extends Payment {

    private long   amount;
    private String authority;
    private String merchantID;

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(String merchantID) {
        this.merchantID = merchantID;
    }


    public JSONObject getVerificationPaymentAsJson() throws JSONException {
        JSONObject object = new JSONObject();
        object.put(AUTHORITY_PARAMS, getAuthority());
        object.put(AMOUNT_PARAMS, getAmount());
        object.put(MERCHANT_ID_PARAMS, getMerchantID());
        return object;
    }

}
