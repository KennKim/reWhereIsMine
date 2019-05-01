package tk.tkproject.whereismine

import android.app.Application
import com.crashlytics.android.Crashlytics
import com.google.firebase.firestore.FirebaseFirestore
import io.fabric.sdk.android.Fabric


class MyApp : Application() {

    init {
        instance = this
    }

    companion object {
        private var instance: MyApp? = null

        fun getAppContext() : MyApp {
            return instance as MyApp
        }
    }



/*
    companion object {

        private var instance: MyApp? = null

        val init: Context
            get() {
                if (instance == null) {
                    instance = MyApp()
                }
                return instance as MyApp
            }

    }

    init {
        instance = this
    }*/

    var db: FirebaseFirestore? = null


    override fun onCreate() {
        super.onCreate()


        Fabric.with(this, Crashlytics())


/*

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotiManager.createGroupChannel(applicationContext)     // NotiManager  setup
        }


        Sred.init(applicationContext)                              // Sred  setup

        val settings = FirebaseFirestoreSettings.Builder()         // FireStore Settings  setup
                .setPersistenceEnabled(true)
                .build()
        db = FirebaseFirestore.getInstance()                       // FireStore  setup
        db?.setFirestoreSettings(settings)

        initRemoteConfig()                                         // RemoteConfig  setup
*/

    }

/*

    fun initRemoteConfig() {

        val remoteConfig = FirebaseRemoteConfig.getInstance()
        val configSettings = FirebaseRemoteConfigSettings.Builder()
                .setDeveloperModeEnabled(BuildConfig.DEBUG)
                .build()

        */
/* long cacheExpiration = 3600; // 1 hour in seconds.
        // If your app is using developer mode, cacheExpiration is set id 0, so each fetch will
        // retrieve values from the service.
        if (remoteConfig.getInfo().getConfigSettings().isDeveloperModeEnabled()) {
            cacheExpiration = 0;
        }*//*

        remoteConfig.setConfigSettings(configSettings)
        remoteConfig.setDefaults(R.xml.remote_config_defaults)

        remoteConfig.fetch(if (BuildConfig.DEBUG) 0 else TimeUnit.MINUTES.toSeconds(10))
                .addOnCompleteListener { task ->

                    if (task.isSuccessful) {
                        remoteConfig.activateFetched()
                    } else {
                        TToast.showWarning( R.string.db_error_remote_config_get_data )
                    }

                    // --------------------remote data 정리-------------------------
//                    val lastestVersion = remoteConfig.getString("latest_version")

                }
                .addOnFailureListener({ e -> Log.w(Cons.TAG,e) })
    }
*/


}
