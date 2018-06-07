package com.example.tatyana.bakingapp.di.modules;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.schedulers.Schedulers;
@Module
public class RetrofitModule {
    @Provides
    @Singleton
    public Retrofit provideRetrofit(Retrofit.Builder builder){
        return builder.baseUrl("https://d17h27t6h515a5.cloudfront.net/topher/2017/May/59121517_baking/").build();
    }
    @Provides
    @Singleton
    public Gson provideGson(){
        return new GsonBuilder().create();
    }
    @Provides
    @Singleton
    public Retrofit.Builder provideRetrofitBuilder(Converter.Factory factory){
        return new Retrofit.Builder()
                .addConverterFactory(factory)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.createWithScheduler(Schedulers.io()));
    }
    @Provides
    @Singleton
    public Converter.Factory provideConverterFactory(Gson gson){
        return GsonConverterFactory.create(gson);
    }
}
