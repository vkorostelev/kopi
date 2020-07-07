package com.qautomatron.kopi.library.element

import androidx.test.espresso.NoMatchingViewException
import androidx.test.espresso.PerformException

object ElementAssertionConfig {
        var timeout = 3_000L
        var interval: Long = 250
        var allowedExceptions = mutableListOf<Class<out Throwable>>(
            PerformException::class.java,
            NoMatchingViewException::class.java
        )
}