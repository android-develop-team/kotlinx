@file:JvmName("FileUtils")

package androidx.kotlin.expand.util

import android.content.ContentValues
import android.content.Context
import android.net.Uri
import android.os.Environment
import android.provider.MediaStore
import androidx.kotlin.expand.annotation.Version
import androidx.kotlin.expand.annotation.VersionLog
import androidx.kotlin.expand.content.insertImageUriExpand
import androidx.kotlin.expand.version.hasQExpand
import java.io.File
import java.io.InputStream
import java.io.OutputStream

@JvmName("mkdirsFile")
@Version(
    version = [Version.WATERMELON],
    log = [
        VersionLog(Version.WATERMELON, "init submit")
    ]
)
fun String.mkdirsFileExpand(child: String): File {
    val pathFile = File(this, child)
    if (!pathFile.exists()) {
        pathFile.mkdirs()
    }
    return pathFile
}

@JvmName("lowerVersionFile")
@Version(
    version = [Version.WATERMELON],
    log = [
        VersionLog(Version.WATERMELON, "init submit")
    ]
)
fun Context.lowerVersionFileExpand(
    fileName: String,
    relativePath: String = Environment.DIRECTORY_DCIM
): File = File(
    if (Environment.MEDIA_MOUNTED == Environment.getExternalStorageState() || !Environment.isExternalStorageRemovable()) {
        Environment.getExternalStoragePublicDirectory(relativePath).path
    } else {
        externalCacheDir?.path ?: cacheDir.path
    }, fileName
)

@JvmName("copyFile")
@Version(
    version = [Version.WATERMELON],
    log = [
        VersionLog(Version.WATERMELON, "init submit")
    ]
)
fun Context.copyFileExpand(
    inputUri: Uri,
    displayName: String,
    relativePath: String = Environment.DIRECTORY_DCIM
): Uri? {
    if (!hasQExpand()) {
        return null
    }
    val contentValues = ContentValues()
    contentValues.put(MediaStore.MediaColumns.DISPLAY_NAME, displayName)
    contentValues.put(MediaStore.MediaColumns.RELATIVE_PATH, relativePath)
    val outPutUri: Uri? = insertImageUriExpand(contentValues)
    outPutUri ?: return null
    return copyFileExpand(inputUri, outPutUri)
}

@JvmName("copyFile")
@Version(
    version = [Version.WATERMELON],
    log = [
        VersionLog(Version.WATERMELON, "init submit")
    ]
)
fun Context.copyFileExpand(inputUri: Uri, outPutUri: Uri): Uri? {
    val outStream: OutputStream = contentResolver.openOutputStream(outPutUri) ?: return null
    val inStream: InputStream = contentResolver.openInputStream(inputUri) ?: return null
    outStream.use { out -> inStream.use { input -> input.copyTo(out) } }
    return outPutUri
}
