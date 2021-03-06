package com.tagihanlistrik.ysn.views.base.mvp

/**
 * Created by yudisetiawan on 1/12/18.
 */

interface Presenter<V: BaseView> {

    fun attachView(view: V)

    fun detachView()

}