package com.saturnus.myyoute

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class TabListViewFragment : Fragment() {
    private lateinit var lvtrending: ListView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_tab_list_view, container, false)
        lvtrending = view.findViewById(R.id.lv_trending)

        val mobil = listOf("Gamers", "Prank", "Video Blogging (Vlog)", "Reaction Video", "Tips dan Trik")
        lvtrending.adapter = ArrayAdapter(view.context, android.R.layout.simple_list_item_1, mobil)
        return view
    }
}