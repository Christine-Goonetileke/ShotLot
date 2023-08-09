package com.example.shotlot.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.content.Intent
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ImageButton
import com.example.shotlot.databinding.FragmentHomeBinding
import com.example.shotlot.ui.home.HomeViewModel
import kotlinx.android.synthetic.main.fragment_home.*

import android.widget.ImageView
import android.widget.LinearLayout
import com.example.shotlot.*
import kotlinx.android.synthetic.main.activity_main.*


class HomeFragment : Fragment() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>? = null

    private var hlayoutManager: RecyclerView.LayoutManager? = null
    private var hadapter: RecyclerView.Adapter<HorizontalRecyclerViewAdapter.HViewHolder>? = null
    ///////







    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            ).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root










        //Below code will show the navigation title in the title bar
        val textView : TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root







    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }






    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        MyNewrecyclerview.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = RecyclerViewAdapter()
        }


        MyHorizrecyclerview.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity?.applicationContext, LinearLayout.HORIZONTAL, false )
            // set the custom adapter to the RecyclerView
            adapter = HorizontalRecyclerViewAdapter()
        }
    }

    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        container

        val fragmentHome = HomeFragment()
        val fm: FragmentManager = supportFragmentManager
        fm.beginTransaction().add(R.id.mai,)*/
        /*rofileActivities.setOnClickListener {
            val intent = Intent(base MyActivites::class.java)
            startActivity(intent)
        }
    }*/



    }