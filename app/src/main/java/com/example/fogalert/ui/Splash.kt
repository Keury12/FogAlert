package com.example.fogalert.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.navigation.fragment.findNavController
import com.example.fogalert.R
import com.example.fogalert.databinding.FragmentHistoricoBinding
import com.example.fogalert.databinding.FragmentSplashBinding

class Splash : Fragment() {

    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSplashBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Inicia a animação
        val rotateAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.rotate1)
        binding.imageLoading.startAnimation(rotateAnimation)

        // Espera 2 segundos e para a animação
        view.postDelayed({
            binding.imageLoading.clearAnimation()
            // aqui você pode executar alguma ação, exibir conteúdo final, etc.
        }, 2000)
    }

    private fun checagemAuth() {
        findNavController().navigate(R.id.action_splash_to_login)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
