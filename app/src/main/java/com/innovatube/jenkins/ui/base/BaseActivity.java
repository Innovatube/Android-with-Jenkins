package com.innovatube.jenkins.ui.base;

import android.support.v7.app.AppCompatActivity;

import com.innovatube.jenkins.MyApplication;
import com.innovatube.jenkins.injection.component.ActivityComponent;
import com.innovatube.jenkins.injection.component.DaggerActivityComponent;
import com.innovatube.jenkins.injection.module.ActivityModule;


/**
 * Created by TOIDV on 4/4/2016.
 */
public class BaseActivity extends AppCompatActivity {
    ActivityComponent mActivityComponent;

    public ActivityComponent getActivityComponent() {
        if (mActivityComponent == null) {
            mActivityComponent = DaggerActivityComponent.builder()
                    .applicationComponent(MyApplication.get(this).getComponent())
                    .activityModule(new ActivityModule(this))
                    .build();
        }
        return mActivityComponent;
    }
}
