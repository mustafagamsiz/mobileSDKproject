package org.gamsiz.mobilesdk;

import android.util.Log;

import org.gamsiz.webrtc.WebRTCCall;

/**
 * Created by mgamsiz on 02/03/2018.
 */

public class MobileSDKCall {
    private WebRTCCall webRTCCall;

    public MobileSDKCall() {
        this.webRTCCall = new WebRTCCall();
    }

    public void establishCall() {
        webRTCCall.establishCall();
        Log.i("MobileSDKCall v1", "MobileSDKCall-v1 established");
    }
}
