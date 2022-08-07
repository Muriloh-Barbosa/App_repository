package desktop.murilo.repository

import android.app.Application
import desktop.murilo.repository.data.di.DataModule
import desktop.murilo.repository.domain.di.DomainModule
import desktop.murilo.repository.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}