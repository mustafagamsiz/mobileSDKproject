package org.gamsiz.mobilesdkproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.gamsiz.mobilesdk.MobileSDKCall;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileSDKCall mobileSDKCall = new MobileSDKCall();
        mobileSDKCall.establishCall();

        mobileSDKCall.endCall();
    }
}
