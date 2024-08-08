package com.example.navigationkotlin

import android.database.DatabaseUtils
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.navigationkotlin.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var firstFragmentBinding: FragmentFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        firstFragmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)
        return firstFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        firstFragmentBinding.firstFragmentButton.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(40)
            //action.age = 5
            Navigation.findNavController(it).navigate(action)
        }
    }

}