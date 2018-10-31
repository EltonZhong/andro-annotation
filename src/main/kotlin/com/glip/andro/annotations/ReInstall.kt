package com.glip.andro.annotations

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
annotation class ReInstall(val value: String = "")
