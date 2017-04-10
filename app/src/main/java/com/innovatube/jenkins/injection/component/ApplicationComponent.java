package com.innovatube.jenkins.injection.component;

import android.app.Application;
import android.content.Context;

import com.innovatube.jenkins.data.DataManager;
import com.innovatube.jenkins.data.remote.RetrofitService;
import com.innovatube.jenkins.injection.ApplicationContext;
import com.innovatube.jenkins.injection.module.ApplicationModule;
import com.innovatube.jenkins.ui.fcm.FirebaseMessagingService;

import javax.inject.Singleton;

import dagger.Component;
import io.realm.Realm;
import retrofit2.Retrofit;

/**
 * Created by TOIDV on 4/4/2016.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    @ApplicationContext
    Context context();

    Application application();

    Retrofit retrofit();

    RetrofitService inploiService();

    DataManager dataManager();

    Realm realm();

    void inject(FirebaseMessagingService firebaseMessagingService);
}
