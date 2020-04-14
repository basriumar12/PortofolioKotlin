package id.bas.portofolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val list = ArrayList<ModelPortofolio>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //set recylerview layoutmanager
        rv_main?.layoutManager = LinearLayoutManager(this)
        list.addAll(DataPortofolio.listData)
        Log.e("TAG","data list ${list.get(0).namaPorfolio}")
        var adapter = AdapterPortofolio(list)
        rv_main?.adapter = adapter



    }
}
