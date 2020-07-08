package com.example.myproject

import android.app.Activity
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.FileProvider
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import android.provider.MediaStore
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Bitmap
import android.graphics.Matrix
import android.media.ExifInterface

class MainActivity : AppCompatActivity() {
    val takePhoto =1
    lateinit var imageUri:Uri
    lateinit var outputImage: File
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        takePhotoBtn.setOnClickListener {
            outputImage=File(externalCacheDir,"output_image.jpg")
            if (outputImage.exists()) {
                outputImage.delete()
            }
            outputImage.createNewFile()
            imageUri = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                FileProvider.getUriForFile(
                    this,
                    "com.example.cameraalbumtest.fileprovider",
                    outputImage
                )
            } else {
                Uri.fromFile(outputImage)
            }
            val intent=Intent("android.media.action.IMAGE_CAPTURE")
            intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri)
            startActivityForResult(intent,takePhoto)
        }
    }
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        when (requestCode) {
//            takePhoto -> {
//                if (resultCode == Activity.RESULT_OK) {
//                    // 将拍摄的照片显示出来
//                    val bitmap = BitmapFactory.decodeStream(contentResolver.openInputStream(imageUri))
//                    imageView.setImageBitmap(rotateIfRequired(bitmap))
//                }
//            }
//
//        }
//    }
//
//
//
//    private fun rotateIfRequired(bitmap: Bitmap): Bitmap {
//        val exif = ExifInterface(outputImage.path)
//        val orientation = exif.getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_NORMAL)
//        return when (orientation) {
//            ExifInterface.ORIENTATION_ROTATE_90 -> rotateBitmap(bitmap, 90)
//            ExifInterface.ORIENTATION_ROTATE_180 -> rotateBitmap(bitmap, 180)
//            ExifInterface.ORIENTATION_ROTATE_270 -> rotateBitmap(bitmap, 270)
//            else -> bitmap
//        }
//    }
//
//    private fun rotateBitmap(bitmap: Bitmap, degree: Int): Bitmap {
//        val matrix = Matrix()
//        matrix.postRotate(degree.toFloat())
//        val rotatedBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.width, bitmap.height, matrix, true)
//        bitmap.recycle()
//        return rotatedBitmap
//    }
}