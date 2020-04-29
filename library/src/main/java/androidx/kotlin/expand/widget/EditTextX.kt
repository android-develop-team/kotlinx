@file:JvmName("EditTextUtils")

package androidx.kotlin.expand.widget

import android.content.Context
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import androidx.kotlin.expand.version.hasLExpand
import java.lang.reflect.Method

@JvmName("offKeyboard")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun EditText.offKeyboardExpand() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?
    imm?.hideSoftInputFromWindow(windowToken, InputMethodManager.HIDE_IMPLICIT_ONLY)
}

@JvmName("openKeyboard")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun EditText.openKeyboardExpand() {
    isFocusable = true
    isFocusableInTouchMode = true
    requestFocus()
    val inputManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?
    inputManager?.showSoftInput(this, 0)
}

@JvmName("forceOpenKeyBoard")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun EditText.forceOpenKeyBoardExpand() {
    isFocusable = true
    isFocusableInTouchMode = true
    requestFocus()
    findFocus()
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS)
}

@JvmName("disableShowSoftInput")
@Version(
    version = [Version.BANANA],
    log = [
        VersionLog(Version.BANANA, "init submit")
    ]
)
fun EditText.disableShowSoftInputExpand() {
    if (hasLExpand()) {
        showSoftInputOnFocus = false
        return
    }
    val cls = EditText::class.java
    var method: Method
    try {
        method = cls.getMethod("setShowSoftInputOnFocus", Boolean::class.javaPrimitiveType)
        method.isAccessible = true
        method.invoke(this, false)
    } catch (ignored: Exception) {
    }
    try {
        method = cls.getMethod("setSoftInputShownOnFocus", Boolean::class.javaPrimitiveType)
        method.isAccessible = true
        method.invoke(this, false)
    } catch (ignored: Exception) {
    }
}