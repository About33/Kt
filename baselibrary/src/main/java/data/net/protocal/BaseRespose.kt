package data.net.protocal

class BaseRespose<out T>(val status: Int, val messag: String, val dat: T)