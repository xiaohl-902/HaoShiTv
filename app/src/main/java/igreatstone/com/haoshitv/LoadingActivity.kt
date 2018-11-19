package igreatstone.com.haoshitv

import android.app.Activity
import android.os.Bundle

class LoadingActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)
        initView()
    }

    private fun initView() {
        checkVersion()
    }

    private fun checkVersion() {

    }
}
