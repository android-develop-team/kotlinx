@file:JvmName("Md5Utils")

package androidx.kotlin.expand.util

import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import java.io.File
import java.io.FileInputStream
import java.math.BigInteger
import java.security.MessageDigest
import kotlin.experimental.and

internal const val MD5 = "MD5"

@JvmName("encodeMD5")
@Version(VersionLog(Version.NONE))
fun String.encodeMD5Expand(): String {
    return runCatching {
        val digest: MessageDigest = MessageDigest.getInstance(MD5)
        digest.update(toByteArray())
        digest.digest().toHexStringExpand()
    }.getOrElse { "" }
}

@JvmName("toHexString")
@Version(VersionLog(Version.NONE))
fun ByteArray.toHexStringExpand(): String {
    val expectedStringLen: Int = size * 2
    val sb = StringBuilder(expectedStringLen)
    for (i: Int in indices) {
        var hexStr: String = (this[i] and 0x00FF.toByte()).toString(16)
        if (hexStr.length == 1) {
            hexStr = "0$hexStr"
        }
        sb.append(hexStr)
    }
    return sb.toString()
}

@JvmName("encodeMD5")
@Version(VersionLog(Version.NONE))
fun File.encodeMD5Expand(): String? {
    val digest: MessageDigest?
    val buffer = ByteArray(1024)
    var len: Int
    try {
        digest = MessageDigest.getInstance(MD5)
        val fileInputStream = FileInputStream(this)
        while (fileInputStream.read(buffer, 0, 1024).also { len = it } != -1) {
            digest.update(buffer, 0, len)
        }
        fileInputStream.close()
    } catch (e: Exception) {
        e.printStackTrace()
        return null
    }
    return BigInteger(1, digest.digest()).toString(16)
}