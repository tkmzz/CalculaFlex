package br.com.luiz.calculaflex.extensions

fun Double.format(digits: Int) = String.format("%.${digits}f", this)