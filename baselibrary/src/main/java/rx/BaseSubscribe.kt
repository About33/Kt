package rx

/**
 * 处理相同回调
 * */
open class BaseSubscribe<T> : Subscriber<T>() {
    override fun onNext(t: T) {

    }

    override fun onCompleted() {

    }

    override fun onError(e: Throwable?) {

    }
}