package com.example.tatyana.bakingapp.app;

import android.app.Application;

import com.example.tatyana.bakingapp.di.AppComponent;
import com.example.tatyana.bakingapp.di.DaggerAppComponent;
import com.example.tatyana.bakingapp.di.modules.ContextModule;

import dagger.BindsInstance;

public class App extends Application{

    public static AppComponent appComponent;
    private static boolean isSynced;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .contextModule(new ContextModule(this))
                .build();
    }
    public static boolean isSynced() {
        return isSynced;
    }

    public static void setSynced(boolean synced) {
        isSynced = synced;
    }
    public static AppComponent getAppComponent() {
        return appComponent;
    }
}
