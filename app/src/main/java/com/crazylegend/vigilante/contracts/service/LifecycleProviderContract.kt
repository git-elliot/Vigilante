package com.crazylegend.vigilante.contracts.service

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent

/**
 * Created by crazy on 10/16/20 to long live and prosper !
 */
interface LifecycleProviderContract {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun initVars()

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun registerCallbacks()

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun disposeResources()

    fun eventActionByPackageName(eventPackageName: CharSequence)
}