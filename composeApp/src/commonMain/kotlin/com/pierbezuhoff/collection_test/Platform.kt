package com.pierbezuhoff.collection_test

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform