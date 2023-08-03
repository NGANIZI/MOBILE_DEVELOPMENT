package com.example.eliteentebbe.ui.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.eliteentebbe.databinding.FragmentAboutusBinding

class AboutusFragment : Fragment() {

    private var _binding: FragmentAboutusBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
                ViewModelProvider(this).get(AboutViewModel::class.java)

        _binding = FragmentAboutusBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.webaboutus.apply {
            loadUrl("https://www.elitehighsch.com/about-us/")
            settings.useWideViewPort=true
            settings.domStorageEnabled=true
            settings.allowContentAccess=true
            settings.javaScriptEnabled=true
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}