package com.jalian.viewmodelactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.jalian.viewmodelactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Menyambungkan ke Layout
    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    //ViewModel
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setUpAction()
        setObservable()
    }

    private fun setObservable() {
        viewModel.getCounter().observe(this){
            binding.tvHasil.text = it.toString()
        }
    }

    private fun setUpAction() {
        binding.apply {
            btnMin.setOnClickListener{
                viewModel.countDown()
            }

            btnPlus.setOnClickListener {
                viewModel.countUp()
            }
        }
    }
}