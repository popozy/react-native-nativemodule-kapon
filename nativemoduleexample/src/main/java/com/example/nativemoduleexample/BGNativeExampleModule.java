package com.example.nativemoduleexample;

/**
 * Created by kapon2016 on 16/6/13.
 */
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.lang.String;
public class BGNativeExampleModule extends ReactContextBaseJavaModule{
    public BGNativeExampleModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }
    @Override
    public String getName() {
        return "BGNativeModuleExample";
    }
}
