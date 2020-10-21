package com.ebb.androidbaseapplication.feature_0

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.ebb.androidbaseapplication.feature_0.databinding.FragmentFeature0Binding

class Feature0Fragment : Fragment(R.layout.fragment_feature_0) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentFeature0Binding.bind(view)
    }
}
