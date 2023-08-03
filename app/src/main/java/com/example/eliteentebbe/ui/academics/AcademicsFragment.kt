package com.example.eliteentebbe.ui.academics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.eliteentebbe.databinding.FragmentAcademicsBinding

class AcademicsFragment : Fragment() {

    private var _binding: FragmentAcademicsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
                ViewModelProvider(this).get(AcademicsViewModel::class.java)

        _binding = FragmentAcademicsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.academicsweb.apply {
            loadUrl("https://www.elitehighsch.com/academics/")
            settings.useWideViewPort=true
            settings.javaScriptEnabled=true
            settings.domStorageEnabled=true
            settings.allowContentAccess=true
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}