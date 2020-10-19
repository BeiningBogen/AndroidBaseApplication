package com.ebb.androidbaseapplication.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.ebb.androidbaseapplication.R
import com.ebb.androidbaseapplication.databinding.FragmentMainBinding
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.InternalCoroutinesApi

@InternalCoroutinesApi
@ExperimentalCoroutinesApi
class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentMainBinding.bind(view)
    }

}
