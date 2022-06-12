package com.mobile.mvpsimple1805

class MainPresenter (private val mainView: MainView){
    fun hitungLuasPersegiPanjang(panjang: Float, lebar: Float){

        if(panjang == 0F) {
            mainView.showError("Panjang tidak boleh 0")
            return
        }
        if(lebar == 0F) {
            mainView.showError("Lebar tidak boleh 0")
            return
        }

        val luas= panjang * lebar
        mainView.updateLuas(luas)
    }
    fun hitungkelilingpersegiPanjang(panjang: Float,lebar: Float) {
        if (panjang == 0F) {
            mainView.showError("Panjang tidak boleh 0")
            return
        }
        if (lebar==0F) {
            mainView.showError("Lebar tidak boleh 0")
            return
        }
        val keliling =2* (panjang+lebar)
        mainView.updateKeliling(keliling)
    }
}