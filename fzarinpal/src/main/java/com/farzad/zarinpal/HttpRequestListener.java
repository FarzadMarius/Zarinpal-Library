package com.farzad.zarinpal;

import org.json.JSONObject;

/**
 * Created by Farzad Zare on 18/01/12.
 * Email = farzad.zare@live.com
 * My Custom ZarinPal Library
 */

interface HttpRequestListener {
    void onSuccessResponse(JSONObject jsonObject, String contentResponse);
    void onFailureResponse(int httpStatusCode, String dataError);
}
