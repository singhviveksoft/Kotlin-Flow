package com.demoexample.observer

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.demoexample.observer.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.launch


class HomeFragment : Fragment() {

private val viewModel:MainViewModel by viewModels()
   // private lateinit var viewModel:MainViewModel
    private lateinit var binding: FragmentHomeBinding

    private var check=true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // Toast.makeText(activity, "onCreate", Toast.LENGTH_SHORT).show()

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentHomeBinding.inflate(inflater, container, false)
    var button=binding.button.findViewById<Button>(R.id.button)
        binding.button.setOnClickListener {
               findNavController().navigate(R.id.action_homeFragment_to_detailFragment)
            viewModel.increaseCount()

        }
      //  Toast.makeText(activity, "onCreateView", Toast.LENGTH_SHORT).show()

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
      //  Toast.makeText(activity, "onActivityCreated", Toast.LENGTH_SHORT).show()

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    //    Toast.makeText(activity, "onViewCreated", Toast.LENGTH_SHORT).show()


        lifecycleScope.launchWhenStarted {
           if (check)
            viewModel.count
                .collect {
                Log.d("maim","${it.toString()}")
                 //   viewModel._count.value=+3

            }

        }

/*
viewLifecycleOwner.lifecycleScope.launchWhenStarted {
  delay(10000)
    Toast.makeText(activity, "viewLifecycleOwnerviewLifecycleOwner", Toast.LENGTH_SHORT).show()
    viewModel.count.observe(viewLifecycleOwner,{
        Log.d("maim","${it.toString()}")
    })

}
*/
/*
    viewModel.count.asLiveData().observe(viewLifecycleOwner,{
        Log.d("maim","${it.toString()}")
    })
*/

    }



    override fun onStart() {
        super.onStart()
       // Toast.makeText(activity, "onStart", Toast.LENGTH_SHORT).show()

    }

    override fun onResume() {
        super.onResume()
      //  Toast.makeText(activity, "onResume", Toast.LENGTH_SHORT).show()

    }

    override fun onPause() {
        super.onPause()
     //   Toast.makeText(activity, "onPause", Toast.LENGTH_SHORT).show()

    }

    override fun onStop() {
        super.onStop()
    //    Toast.makeText(activity, "onStop", Toast.LENGTH_SHORT).show()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        check=false
      //  Toast.makeText(activity, "onDestroyView", Toast.LENGTH_SHORT).show()
    }


    override fun onDestroy() {
        super.onDestroy()
     //   Toast.makeText(activity, "onDestroy", Toast.LENGTH_SHORT).show()

    }

}