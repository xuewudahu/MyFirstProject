package com.example.contentprovider



import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val contactsList = ArrayList<String>()
    private lateinit var adapter: ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ListView标准写法
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, contactsList)
        contacts_view.adapter  = adapter
        //1.首先判断用户是不是已经授权过了，借助checkSelfPermission函数，第一个参数是context，第二个是权限名，然后该返回值与PERMISSION_GRANTED比较。
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED) {
            //未曾授权
            //ActivityCompat.requestPermissions申请授权，第一个参数是Activity实例，第二个String数组，申请的权限名放入数组即可；第三个参数是请求码，确保唯一即可。
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.READ_CONTACTS), 1)
        } else {
            //已经授权
            readContacts()
        }
    }

    //调用完requestPermissions自动弹出对话框申请权限，无论同意与否都会调用onRequestPermissionsResult方法
    //grantResults是授权结果
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            1 -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    readContacts()
                } else {
                    Toast.makeText(this, "You denied the permission", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun readContacts() {
        //首先通过contentResolver.query查询联系人数据，返回的是一个cursor对象。
        //uri对象并没有通过uri.parse去解析内容URI，这是因为Phone类已经做好封装，拿到的是Uri.parse解析后的结果
        contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null)?.apply {
            //通过移动游标来遍历Cursor的所有行，取出每一列中相应行的数据
            while (moveToNext()) {
                //获取联系人姓名
                val displayname = getString(getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME))
                //获取联系人号码
                val number =  getString(getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER))
                contactsList.add("$displayname\n$number")
            }
            //刷新一下ListView
            adapter.notifyDataSetChanged()
            //将Cursor对象关闭
            close()
        }
    }
}