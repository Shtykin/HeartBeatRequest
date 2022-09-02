package eSh.heartbeatrequest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import eSh.heartbeatrequest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickGetRssi(view: View) {
        binding.tView.text="123"
    }
}