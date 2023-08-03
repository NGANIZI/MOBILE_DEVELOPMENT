package com.example.eliteentebbe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.eliteentebbe.databinding.FragmentAboutusBinding
import com.example.eliteentebbe.databinding.FragmentFeesstructureBinding


class Feesstructure : Fragment() {
    private var _binding: FragmentFeesstructureBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feesstructure, container, false)

        _binding = FragmentFeesstructureBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.feesstructureweb.apply {
            loadUrl("https://www.elitehighsch.com/fees-structure/")
            settings.useWideViewPort=true
            settings.domStorageEnabled=true
            settings.allowContentAccess=true
            settings.javaScriptEnabled=true
        }
    }


}