package com.ebb.androidbaseapplication.feature_home

import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.ebb.androidbaseapplication.core.utils.navigateUriWithDefaultOptions

class HomeAdapter(
    private val data: List<String>
) : RecyclerView.Adapter<HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val layoutId = R.layout.list_item
        val view = LayoutInflater
            .from(parent.context)
            .inflate(layoutId, parent, false)
        return HomeViewHolder(view)
    }

    override fun getItemCount() = data.size

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        return holder.bind(data[position])
    }
}
