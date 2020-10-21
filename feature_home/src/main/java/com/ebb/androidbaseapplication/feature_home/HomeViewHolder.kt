package com.ebb.androidbaseapplication.feature_home

import android.net.Uri
import android.view.View
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.ebb.androidbaseapplication.core.utils.navigateUriWithDefaultOptions
import kotlinx.android.synthetic.main.list_item.view.*

class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(item: String) {
        itemView.listItemTitle.text = item

        itemView.apply {
            setOnClickListener {
               findNavController().navigateUriWithDefaultOptions(
                    Uri.parse("androidbaseapplication://feature_0"),
                    null
                )
            }
        }
    }
}
