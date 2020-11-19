package com.example.retrofitproject

import androidx.lifecycle.MutableLiveData
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainViewModel {
    private val userPostIterator = UserPostInteractor()
    val userPostLiveData = MutableLiveData<UserPost>()

    fun getNewUserPost() {
        userPostIterator.getUserPost()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe( {
                    userPostLiveData.postValue(it)
                }, {
                it.printStackTrace()
            }
            )
    }
}