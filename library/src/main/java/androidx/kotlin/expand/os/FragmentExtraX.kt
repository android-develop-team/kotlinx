@file:JvmName("FragmentExtraUtils")
@file:Suppress("HasPlatformType")

package androidx.kotlin.expand.os

import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import android.util.Size
import android.util.SizeF
import android.util.SparseArray
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import androidx.kotlin.expand.util.sparseArrayOf
import java.io.Serializable

@Version(VersionLog(Version.NONE))
val Fragment?.bundleExpand: Bundle?
    get() = this?.arguments

@JvmName("getArgsOrEmpty")
@Version(VersionLog(Version.NONE))
fun Fragment?.bundleOrEmptyExpand(): Bundle = this?.arguments.orEmptyExpand()

@JvmName("get")
@Version(VersionLog(Version.NONE))
fun Fragment?.getExpand(key: String): Any =
    bundleExpand.getExpand(key)

@JvmName("getBoolean")
@Version(VersionLog(Version.NONE))
fun Fragment?.getBooleanExpand(key: String): Boolean =
    bundleExpand.getBooleanExpand(key)

@JvmName("getByte")
@Version(VersionLog(Version.NONE))
fun Fragment?.getByteExpand(key: String): Byte =
    bundleExpand.getByteExpand(key)

@JvmName("getChar")
@Version(VersionLog(Version.NONE))
fun Fragment?.getCharExpand(key: String): Char =
    bundleExpand.getCharExpand(key)

@JvmName("getShort")
@Version(VersionLog(Version.NONE))
fun Fragment?.getShortExpand(key: String): Short =
    bundleExpand.getShortExpand(key)

@JvmName("getInt")
@Version(VersionLog(Version.NONE))
fun Fragment?.getIntExpand(key: String): Int =
    bundleExpand.getIntExpand(key)

@JvmName("getLong")
@Version(VersionLog(Version.NONE))
fun Fragment?.getLongExpand(key: String): Long =
    bundleExpand.getLongExpand(key)

@JvmName("getFloat")
@Version(VersionLog(Version.NONE))
fun Fragment?.getFloatExpand(key: String): Float =
    bundleExpand.getFloatExpand(key)

@JvmName("getDouble")
@Version(VersionLog(Version.NONE))
fun Fragment?.getDoubleExpand(key: String): Double =
    bundleExpand.getDoubleExpand(key)

@JvmName("getString")
@Version(VersionLog(Version.NONE))
fun Fragment?.getStringExpand(key: String): String =
    bundleExpand.getStringExpand(key)

@JvmName("getCharSequence")
@Version(VersionLog(Version.NONE))
fun Fragment?.getCharSequenceExpand(key: String): CharSequence =
    bundleExpand.getCharSequenceExpand(key)

@JvmName("getSize")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@Version(VersionLog(Version.NONE))
fun Fragment?.getSizeExpand(key: String): Size =
    bundleExpand.getSizeExpand(key)

@JvmName("getSizeF")
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@Version(VersionLog(Version.NONE))
fun Fragment?.getSizeFExpand(key: String): SizeF =
    bundleExpand.getSizeFExpand(key)

@JvmName("getIntArrayList")
@Version(VersionLog(Version.NONE))
fun Fragment?.getIntArrayListExpand(key: String): ArrayList<Int> =
    bundleExpand.getIntArrayListExpand(key)

@JvmName("getStringArrayList")
@Version(VersionLog(Version.NONE))
fun Fragment?.getStringArrayListExpand(key: String): ArrayList<String> =
    bundleExpand.getStringArrayListExpand(key)

@JvmName("getCharSequenceArrayList")
@Version(VersionLog(Version.NONE))
fun Fragment?.getCharSequenceArrayListExpand(key: String): ArrayList<CharSequence> =
    bundleExpand.getCharSequenceArrayListExpand(key)

@JvmName("getSerializable")
@Version(VersionLog(Version.NONE))
fun Fragment?.getSerializableExpand(key: String): Serializable =
    bundleExpand.getSerializableExpand(key)

@JvmName("getBooleanArray")
@Version(VersionLog(Version.NONE))
fun Fragment?.getBooleanArrayExpand(key: String): BooleanArray =
    bundleExpand.getBooleanArrayExpand(key)

@JvmName("getByteArray")
@Version(VersionLog(Version.NONE))
fun Fragment?.getByteArrayExpand(key: String): ByteArray =
    bundleExpand.getByteArrayExpand(key)

@JvmName("getShortArray")
@Version(VersionLog(Version.NONE))
fun Fragment?.getShortArrayExpand(key: String): ShortArray =
    bundleExpand.getShortArrayExpand(key)

@JvmName("getCharArray")
@Version(VersionLog(Version.NONE))
fun Fragment?.getCharArrayExpand(key: String): CharArray =
    bundleExpand.getCharArrayExpand(key)

@JvmName("getIntArray")
@Version(VersionLog(Version.NONE))
fun Fragment?.getIntArrayExpand(key: String): IntArray =
    bundleExpand.getIntArrayExpand(key)

@JvmName("getLongArray")
@Version(VersionLog(Version.NONE))
fun Fragment?.getLongArrayExpand(key: String): LongArray =
    bundleExpand.getLongArrayExpand(key)

@JvmName("getFloatArray")
@Version(VersionLog(Version.NONE))
fun Fragment?.getFloatArrayExpand(key: String): FloatArray =
    bundleExpand.getFloatArrayExpand(key)

@JvmName("getDoubleArray")
@Version(VersionLog(Version.NONE))
fun Fragment?.getDoubleArrayExpand(key: String): DoubleArray =
    bundleExpand.getDoubleArrayExpand(key)

@JvmName("getStringArray")
@Version(VersionLog(Version.NONE))
fun Fragment?.getStringArrayExpand(key: String): Array<String> =
    bundleExpand.getStringArrayExpand(key)

@JvmName("getCharSequenceArray")
@Version(VersionLog(Version.NONE))
fun Fragment?.getCharSequenceArrayExpand(key: String): Array<CharSequence> =
    bundleExpand.getCharSequenceArrayExpand(key)

@JvmName("getParcelable")
@Version(VersionLog(Version.NONE))
fun <T : Parcelable> Fragment?.getParcelableExpand(key: String): T =
    bundleExpand.getParcelableExpand(key)

@JvmName("getParcelableArray")
@Version(VersionLog(Version.NONE))
fun <T : Parcelable> Fragment?.getParcelableArrayExpand(key: String): Array<T> =
    bundleExpand.getParcelableArrayExpand(key)

@JvmName("getParcelableArrayList")
@Version(VersionLog(Version.NONE))
fun <T : Parcelable> Fragment?.getParcelableArrayListExpand(key: String): ArrayList<T> =
    bundleExpand.getParcelableArrayListExpand(key)

@JvmName("getSparseParcelableArray")
@Version(VersionLog(Version.NONE))
fun <T : Parcelable> Fragment?.getSparseParcelableArrayExpand(key: String): SparseArray<T> =
    bundleExpand.getSparseParcelableArrayExpand(key)

@JvmName("getBundle")
@Version(VersionLog(Version.NONE))
fun Fragment?.getBundleExpand(key: String): Bundle =
    bundleExpand.getBundleExpand(key)

@Version(VersionLog(Version.NONE))
fun Fragment?.getOrDefault(key: String, defaultValue: Any = Any()): Any =
    bundleExpand.getOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getBooleanOrDefault(key: String, defaultValue: Boolean = false): Boolean =
    bundleExpand.getBooleanOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getByteOrDefault(key: String, defaultValue: Byte = 0.toByte()): Byte =
    bundleExpand.getByteOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getCharOrDefault(key: String, defaultValue: Char = 0.toChar()): Char =
    bundleExpand.getCharOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getShortOrDefault(key: String, defaultValue: Short = 0.toShort()): Short =
    bundleExpand.getShortOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getIntOrDefault(key: String, defaultValue: Int = 0): Int =
    bundleExpand.getIntOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getLongOrDefault(key: String, defaultValue: Long = 0.toLong()): Long =
    bundleExpand.getLongOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getFloatOrDefault(key: String, defaultValue: Float = 0.toFloat()): Float =
    bundleExpand.getFloatOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getDoubleOrDefault(key: String, defaultValue: Double = 0.toDouble()): Double =
    bundleExpand.getDoubleOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getStringOrDefault(key: String, defaultValue: String = ""): String =
    bundleExpand.getStringOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getCharSequenceOrDefault(key: String, defaultValue: CharSequence = ""): CharSequence =
    bundleExpand.getCharSequenceOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun <T : Parcelable> Fragment?.getParcelableOrDefault(
    key: String,
    defaultValue: Parcelable = this?.arguments?.getParcelable<T>(key)!!
): T = bundleExpand.getParcelableOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun <T : Parcelable> Fragment?.getParcelableArrayOrDefault(
    key: String,
    defaultValue: Array<Parcelable> = emptyArray()
): Array<T> = bundleExpand.getParcelableArrayOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun <T : Parcelable> Fragment?.getParcelableArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<T> = arrayListOf()
): ArrayList<T> = bundleExpand.getParcelableArrayListOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun <T : Parcelable> Fragment?.getSparseParcelableArrayOrDefault(
    key: String,
    defaultValue: SparseArray<T> = sparseArrayOf()
): SparseArray<T> = bundleExpand.getSparseParcelableArrayOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getBundleOrDefault(
    key: String,
    defaultValue: Bundle = Bundle.EMPTY
): Bundle = bundleExpand.getBundleOrDefault(key, defaultValue)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@Version(VersionLog(Version.NONE))
fun Fragment?.getSizeOrDefault(
    key: String,
    defaultValue: Size = Size(0, 0)
): Size = bundleExpand.getSizeOrDefault(key, defaultValue)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@Version(VersionLog(Version.NONE))
fun Fragment?.getSizeFOrDefault(
    key: String,
    defaultValue: SizeF = SizeF(0.toFloat(), 0.toFloat())
): SizeF = bundleExpand.getSizeFOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getIntArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<Int> = arrayListOf()
): ArrayList<Int> = bundleExpand.getIntArrayListOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getStringArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<String> = arrayListOf()
): ArrayList<String> = bundleExpand.getStringArrayListOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getCharSequenceArrayListOrDefault(
    key: String,
    defaultValue: ArrayList<CharSequence> = arrayListOf()
): ArrayList<CharSequence> = bundleExpand.getCharSequenceArrayListOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getSerializableOrDefault(
    key: String,
    defaultValue: Serializable = this?.arguments?.getSerializable(key)!!
): Serializable = bundleExpand.getSerializableOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getBooleanArrayOrDefault(
    key: String,
    defaultValue: BooleanArray = booleanArrayOf()
): BooleanArray = bundleExpand.getBooleanArrayOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getByteArrayOrDefault(
    key: String,
    defaultValue: ByteArray = byteArrayOf()
): ByteArray = bundleExpand.getByteArrayOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getShortArrayOrDefault(
    key: String,
    defaultValue: ShortArray = shortArrayOf()
): ShortArray = bundleExpand.getShortArrayOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getCharArrayOrDefault(
    key: String,
    defaultValue: CharArray = charArrayOf()
): CharArray = bundleExpand.getCharArrayOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getIntArrayOrDefault(
    key: String,
    defaultValue: IntArray = intArrayOf()
): IntArray = bundleExpand.getIntArrayOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getLongArrayOrDefault(
    key: String,
    defaultValue: LongArray = longArrayOf()
): LongArray = bundleExpand.getLongArrayOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getFloatArrayOrDefault(
    key: String,
    defaultValue: FloatArray = floatArrayOf()
): FloatArray = bundleExpand.getFloatArrayOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getDoubleArrayOrDefault(
    key: String,
    defaultValue: DoubleArray = doubleArrayOf()
): DoubleArray = bundleExpand.getDoubleArrayOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getStringArrayOrDefault(
    key: String,
    defaultValue: Array<String> = emptyArray()
): Array<String> = bundleExpand.getStringArrayOrDefault(key, defaultValue)

@Version(VersionLog(Version.NONE))
fun Fragment?.getCharSequenceArrayOrDefault(
    key: String,
    defaultValue: Array<CharSequence> = emptyArray()
): Array<CharSequence> = bundleExpand.getCharSequenceArrayOrDefault(key, defaultValue)

//ifNone
@Version(VersionLog(Version.NONE))
fun Fragment?.getOrDefault(key: String, ifNone: () -> Any): Any =
    bundleExpand.getOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getBooleanOrDefault(key: String, ifNone: () -> Boolean): Boolean =
    bundleExpand.getBooleanOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getByteOrDefault(key: String, ifNone: () -> Byte): Byte =
    bundleExpand.getByteOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getCharOrDefault(key: String, ifNone: () -> Char): Char =
    bundleExpand.getCharOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getShortOrDefault(key: String, ifNone: () -> Short): Short =
    bundleExpand.getShortOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getIntOrDefault(key: String, ifNone: () -> Int): Int =
    bundleExpand.getIntOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getLongOrDefault(key: String, ifNone: () -> Long): Long =
    bundleExpand.getLongOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getFloatOrDefault(key: String, ifNone: () -> Float): Float =
    bundleExpand.getFloatOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getDoubleOrDefault(key: String, ifNone: () -> Double): Double =
    bundleExpand.getDoubleOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getStringOrDefault(key: String, ifNone: () -> String): String =
    bundleExpand.getStringOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getCharSequenceOrDefault(key: String, ifNone: () -> CharSequence): CharSequence =
    bundleExpand.getCharSequenceOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun <T : Parcelable> Fragment?.getParcelableOrDefault(
    key: String,
    ifNone: () -> T
): T = bundleExpand.getParcelableOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun <T : Parcelable> Fragment?.getParcelableArrayOrDefault(
    key: String,
    ifNone: () -> Array<T>
): Array<T> = bundleExpand.getParcelableArrayOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun <T : Parcelable> Fragment?.getParcelableArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<T>
): ArrayList<T> = bundleExpand.getParcelableArrayListOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun <T : Parcelable> Fragment?.getSparseParcelableArrayOrDefault(
    key: String,
    ifNone: () -> SparseArray<T>
): SparseArray<T> = bundleExpand.getSparseParcelableArrayOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getBundleOrDefault(key: String, ifNone: () -> Bundle): Bundle =
    bundleExpand.getBundleOrDefault(key, ifNone)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@Version(VersionLog(Version.NONE))
fun Fragment?.getSizeOrDefault(key: String, ifNone: () -> Size): Size =
    bundleExpand.getSizeOrDefault(key, ifNone)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@Version(VersionLog(Version.NONE))
fun Fragment?.getSizeFOrDefault(key: String, ifNone: () -> SizeF): SizeF =
    bundleExpand.getSizeFOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getIntArrayListOrDefault(key: String, ifNone: () -> ArrayList<Int>): ArrayList<Int> =
    bundleExpand.getIntArrayListOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getStringArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<String>
): ArrayList<String> = bundleExpand.getStringArrayListOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getCharSequenceArrayListOrDefault(
    key: String,
    ifNone: () -> ArrayList<CharSequence>
): ArrayList<CharSequence> = bundleExpand.getCharSequenceArrayListOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getSerializableOrDefault(key: String, ifNone: () -> Serializable): Serializable =
    bundleExpand.getSerializableOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getBooleanArrayOrDefault(key: String, ifNone: () -> BooleanArray): BooleanArray =
    bundleExpand.getBooleanArrayOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getByteArrayOrDefault(key: String, ifNone: () -> ByteArray): ByteArray =
    bundleExpand.getByteArrayOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getShortArrayOrDefault(key: String, ifNone: () -> ShortArray): ShortArray =
    bundleExpand.getShortArrayOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getCharArrayOrDefault(key: String, ifNone: () -> CharArray): CharArray =
    bundleExpand.getCharArrayOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getIntArrayOrDefault(key: String, ifNone: () -> IntArray): IntArray =
    bundleExpand.getIntArrayOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getLongArrayOrDefault(key: String, ifNone: () -> LongArray): LongArray =
    bundleExpand.getLongArrayOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getFloatArrayOrDefault(key: String, ifNone: () -> FloatArray): FloatArray =
    bundleExpand.getFloatArrayOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getDoubleArrayOrDefault(key: String, ifNone: () -> DoubleArray): DoubleArray =
    bundleExpand.getDoubleArrayOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getStringArrayOrDefault(key: String, ifNone: () -> Array<String>): Array<String> =
    bundleExpand.getStringArrayOrDefault(key, ifNone)

@Version(VersionLog(Version.NONE))
fun Fragment?.getCharSequenceArrayOrDefault(
    key: String,
    ifNone: () -> Array<CharSequence>
): Array<CharSequence> = bundleExpand.getCharSequenceArrayOrDefault(key, ifNone)