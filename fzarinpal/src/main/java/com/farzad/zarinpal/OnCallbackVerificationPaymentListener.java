package com.farzad.zarinpal;

/**
 * Created by Farzad Zare on 18/01/12.
 * Email = farzad.zare@live.com
 * My Custom ZarinPal Library
 */
public interface OnCallbackVerificationPaymentListener {
    void onCallbackResultVerificationPayment(boolean isPaymentSuccess, String refID, PaymentRequest paymentRequest);
}
