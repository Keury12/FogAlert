package com.example.fogalert.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fogalert.R
import com.example.fogalert.databinding.FragmentLoginBinding
import com.example.fogalert.databinding.FragmentSplashBinding

class Login : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initListener(){
        binding.btnLogin.setOnClickListener(){
            validacao()
        }

        //falta tela de criar conta e recuperar senha

    }

    private fun validacao(){
        val email = binding.emailEditText.text.toString().trim()
        val senha = binding.passwordEditText.text.toString().trim()

        if (email.isNotBlank()){
            if (senha.isNotBlank()){
                findNavController().navigate(R.id.action_login_to_home2)
            }
        }
    }

}
