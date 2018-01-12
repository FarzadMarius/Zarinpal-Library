package com.farzad.zarinpal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Farzad Zare on 18/01/12.
 * Email = farzad.zare@live.com
 * My Custom ZarinPal Library
 */

public class PaymentRequest extends Payment {

    public static final String ASAN_PARDAKHT = "Asan";
    public static final String SAMAN_BANK    = "Sep";
    public static final String BMI_SADAD     = "Sad";
    public static final String PARSIAN_BANK  = "Pec";
    public static final String FANAVA_CARD   = "Fan";

    private String merchantID;
    private long   amount;
    private String mobile;
    private String email;
    private String description;
    private String callBackURL;
    private String authority;
    private boolean isZarinGate = false;
    private String portType = null;


    @NonNull
    public void setMerchantID(String merchantID) {
        this.merchantID = merchantID;
    }

    @NonNull
    public void setCallbackURL(String callBackURL) {
        this.callBackURL = callBackURL;
    }

    @NonNull
    public void setAmount(long amount) {
        this.amount = amount;
    }

    @NonNull
    public void setDescription(String description) {
        this.description = description;
    }

    @Nullable
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Nullable
    public void setEmail(String email) {
        this.email = email;
    }

    public String getCallBackURL() {
        return callBackURL;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public long getAmount() {
        return amount;
    }


    public String getDescription() {
        return description;
    }


    public String getMobile() {
        return mobile;
    }


    public String getMerchantID() {
        return merchantID;
    }

    public String getEmail() {
        return email;
    }

    public String getAuthority() {
        return authority;
    }

    public boolean isZarinGate() {
        return isZarinGate;
    }

    public void setZarinGate(boolean zarinGate) {
        isZarinGate = zarinGate;
    }

    public String getPortType() {
        return "/" + portType;
    }

    public void setPortType(String portType) {
        this.portType = portType;
    }

    public JSONObject getPaymentRequestAsJson() throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(MERCHANT_ID_PARAMS, getMerchantID());
        jsonObject.put(AMOUNT_PARAMS, getAmount());
        jsonObject.put(DESCRIPTION_PARAMS, getDescription());
        jsonObject.put(CALLBACK_URL_PARAMS, getCallBackURL());
        jsonObject.put(MOBILE_PARAMS, getMobile());
        jsonObject.put(EMAIL_PARAMS, getEmail());
        return jsonObject;
    }

}
