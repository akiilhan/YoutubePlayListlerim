package com.example.fragmentstickyeventbus

public class PositionEvent(var pozisyon:Int) {

    fun getposition(): Int {

        return pozisyon

    }

    fun setposition(pozisyon:Int) {
        this.pozisyon = pozisyon

    }
}