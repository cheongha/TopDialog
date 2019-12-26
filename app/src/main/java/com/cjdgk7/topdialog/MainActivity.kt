package com.cjdgk7.topdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import com.orhanobut.dialogplus.DialogPlus
import com.orhanobut.dialogplus.Holder
import com.orhanobut.dialogplus.OnItemClickListener
import com.orhanobut.dialogplus.ViewHolder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val holder:Holder = ViewHolder(R.layout.top_dialog)

        val dialog = DialogPlus.newDialog(this)
            .apply { setContentHolder(holder) }
            .setGravity(Gravity.TOP)
            .setExpanded(true)  // This will enable the expand feature, (similar to android L share dialog)
            .create()

        button.setOnClickListener {
            dialog.show()
        }
    }
}
