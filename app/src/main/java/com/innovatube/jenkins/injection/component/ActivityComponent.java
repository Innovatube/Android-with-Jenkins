package com.innovatube.jenkins.injection.component;

import com.innovatube.jenkins.injection.PerActivity;
import com.innovatube.jenkins.injection.module.ActivityModule;

import dagger.Component;

/**
 * Created by TOIDV on 4/4/2016.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)

public interface ActivityComponent {



}
