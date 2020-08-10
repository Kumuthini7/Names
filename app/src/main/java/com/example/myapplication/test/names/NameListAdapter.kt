package com.example.myapplication.test.names

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.test.model.NameList
import kotlinx.android.synthetic.main.fragment_main_item.view.*
import kotlinx.android.synthetic.main.fragment_main_item_letter.view.*

/**
 * Created by Kumuthini.N on 10-08-2020
 */

class NameListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var list: List<NameList?>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            1 -> HeaderViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.fragment_main_item_letter, parent, false
                )
            )
            else -> FooterViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.fragment_main_item, parent, false)
            )
        }
    }

    fun update(
        context: Context,
        it1: ArrayList<NameList>?
    ) {
        this.list = it1
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = list?.size ?: 0 + 2

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (getItemViewType(position)) {
            1 -> {
                val headerViewHolder = holder as HeaderViewHolder
                headerViewHolder.bindView(position)
            }
            else -> {
                val footerViewHolder = holder as FooterViewHolder
                footerViewHolder.bindView(position)
            }
        }
    }


    /***
     * This method will return cell type base on position
     */

    override fun getItemViewType(position: Int): Int {
        var viewType = 0
        if (list?.get(position)?.type === 1) {
            viewType = 1
        } else if (list?.get(position)?.type === 2) {
            viewType = 2
        }
        return viewType
    }

    inner class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(position: Int) {
            itemView.letter.text = list?.get(position)?.name?.substring(0, 1)?.toUpperCase() ?: ""
        }
    }

    inner class FooterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(position: Int) {
            itemView.type.text = list?.get(position)?.name?.substring(0, 1)?.toUpperCase() + list?.get(position)?.name?.substring(1) ?: ""
        }
    }
}