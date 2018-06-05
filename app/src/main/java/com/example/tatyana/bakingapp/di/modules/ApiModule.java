package com.example.tatyana.bakingapp.di.modules;


import com.example.tatyana.bakingapp.api.Api;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
@Module
public class ApiModule {
    @Provides
    @Singleton
    public Api provideApi(Retrofit retrofit){return retrofit.create(Api.class);}
}
