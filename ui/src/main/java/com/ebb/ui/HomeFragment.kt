package com.ebb.ui

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.ebb.ui.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    /*override fun onAttach(context: Context) {
        super.onAttach(context)
        (activity?.applicationContext as BaseApp?)
            ?.appComponent
            ?.inject(this)
    }*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentHomeBinding.bind(view)
    }

}
