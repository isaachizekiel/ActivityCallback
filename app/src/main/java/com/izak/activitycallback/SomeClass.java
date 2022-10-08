package com.izak.activitycallback;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SomeClass implements Application.ActivityLifecycleCallbacks {
    private static final String TAG = "SomeClass";

    public SomeClass(Activity activity) {
        activity.getApplication().registerActivityLifecycleCallbacks(this);
    }

    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        Log.e(TAG, "onActivityCreated: " );
    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {
        Log.e(TAG, "onActivityStarted: " );
    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {
        Log.e(TAG, "onActivityResumed: " );
    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {
        Log.e(TAG, "onActivityPaused: " );
    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {
        Log.e(TAG, "onActivityStopped: " );
    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        Log.e(TAG, "onActivitySaveInstanceState: " );
    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {
        Log.e(TAG, "onActivityDestroyed: " );
    }
}
