package com.farzad.zarinpal;

import android.content.Intent;
import android.net.Uri;

/**
 * Created by Farzad Zare on 18/01/12.
 * Email = farzad.zare@live.com
 * My Custom ZarinPal Library
 */

public interface OnCallbackRequestPaymentListener {
    void onCallbackResultPaymentRequest(int status, String authority, Uri paymentGatewayUri, Intent intent);
}
