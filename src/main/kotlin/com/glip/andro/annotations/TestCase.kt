package com.glip.andro.annotations

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
annotation class TestCase(
        val id: String,
        val url: String = "",
        val desc: String = "")