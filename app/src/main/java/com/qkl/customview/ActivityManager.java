package com.qkl.customview;

import android.app.Activity;

import java.lang.ref.WeakReference;

/**
 * 作者：kelingqiu on 16/9/8 15:34
 * 邮箱：42747487@qq.com
 */

public class ActivityManager {
    private static ActivityManager sInstance;
    private WeakReference<Activity> sCurrentActivityWeakRef;
    public ActivityManager(){

    }

    public static ActivityManager getsInstance(){
        if (sInstance == null){
            sInstance = new ActivityManager();
        }
        return sInstance;
    }

    public Activity getCurrentActivity(){
        Activity currentActivity = null;
        if (sCurrentActivityWeakRef != null){
            currentActivity = sCurrentActivityWeakRef.get();
        }
        return currentActivity;
    }

    public void setCurrentActivity(Activity activity){
        sCurrentActivityWeakRef = new WeakReference<Activity>(activity);
    }
}
