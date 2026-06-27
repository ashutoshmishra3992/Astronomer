package com.appsnweb.astronomer.data

import android.util.Log
import com.appsnweb.astronomer.domain.Logger
import javax.inject.Inject

class AndroidLogger @Inject constructor() : Logger {
    override fun log(message: String) {
        Log.d("Astronomer", message)
    }
}
