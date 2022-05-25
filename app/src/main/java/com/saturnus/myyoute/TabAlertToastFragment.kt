package com.saturnus.myyoute

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import java.util.zip.Inflater

class TabAlertToastFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_tab_alert_toast, container, false)

        val btnShowAlert = view.findViewById<Button>(R.id.btnShowAlert)
        btnShowAlert.setOnClickListener {
            val alertBuilder = AlertDialog.Builder(view.context)
            alertBuilder.setTitle("Apakah Anda Ingin Unsubscribe Channel Deri Official")
            alertBuilder.setPositiveButton("UNSUSBSCRIBE") {
                    _, _ -> Toast.makeText(view.context, "Kamu Telah Unsubscribe Channel Deri Official", Toast.LENGTH_SHORT).show()
            }
            alertBuilder.show()
        }
        return view
    }
}