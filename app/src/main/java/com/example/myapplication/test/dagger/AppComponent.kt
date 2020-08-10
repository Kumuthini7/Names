package com.example.myapplication.test.dagger

import com.example.myapplication.test.names.MainFragment
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Kumuthini.N on 10-08-2020
 */
@Singleton
@Component(
  modules = [
    AppModule::class,
    ViewModelModule::class,
    RepositoryModule::class
  ]
)
interface AppComponent {
  fun inject(mainFragment: MainFragment)
}

