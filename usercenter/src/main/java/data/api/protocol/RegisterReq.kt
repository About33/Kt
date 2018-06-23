package data.api.protocol

/**
 * 需要传入的参数
 * */
data class RegisterReq(val mobile: String, val pwd: String, val verifyCode: String) {
}