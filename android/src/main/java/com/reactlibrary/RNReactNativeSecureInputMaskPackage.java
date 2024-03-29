
package com.reactlibrary;

import android.app.Activity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

public class RNReactNativeSecureInputMaskPackage implements ReactPackage {
    private Activity mActivity = null;

    public RNReactNativeSecureInputMaskPackage(Activity activity) {
        mActivity = activity;
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
      return Arrays.<NativeModule>asList(new RNReactNativeSecureInputMaskModule(reactContext));
    }

    // Deprecated from RN 0.47
     public List<Class<? extends JavaScriptModule>> createJSModules() {
       return Collections.emptyList();
     }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
      return Arrays.<ViewManager>asList(
              new RNReactNativeSecureInputMaskManager(mActivity)
      );
    }
}