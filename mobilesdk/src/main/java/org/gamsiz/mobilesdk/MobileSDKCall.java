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
        Log.i("MobileSDKCall v2", "MobileSDKCall-v2 established");
    }

    public void endCall() {
        webRTCCall.endCall();
        Log.i("MobileSDKCall v2", "MobileSDKCall-v2 ended");
    }
}
