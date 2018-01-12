package com.farzad.zarinpal;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Farzad Zare on 18/01/12.
 * Email = farzad.zare@live.com
 * My Custom ZarinPal Library
 */

class HttpQueue {
    private static HttpQueue    instance;
    private static RequestQueue queue;

    public static HttpQueue getInstance(Context context) {
        if (instance == null) {
            instance = new HttpQueue();
            queue = Volley.newRequestQueue(context);
        }
        return instance;
    }

    public void addToRequest(Request request) {
        queue.add(request);
    }
}
