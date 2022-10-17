package com.example.familyapp.ui.myfamily

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

import com.example.familyapp.databinding.FragmentMyfamilyBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentMyfamilyBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val myfamilyViewModel =
            ViewModelProvider(this).get(myfamilyViewModel::class.java)

        _binding = FragmentMyfamilyBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        myfamilyViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }


}