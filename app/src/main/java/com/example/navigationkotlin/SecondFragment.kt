package com.example.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.navigationkotlin.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private var myAge = 0
    private lateinit var secondFragmentBinding: FragmentSecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        secondFragmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)
        return secondFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            myAge = SecondFragmentArgs.fromBundle(it).age
            println(myAge)
        }

        secondFragmentBinding.secondFragmentButton.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }
}