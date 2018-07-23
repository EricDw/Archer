package com.publicmethod.archer

import arrow.core.Id

fun <A> A.toId() = Id.just(this)

