package com.rahul.myapplication.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.rahul.myapplication.R
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {

//    lateinit var supportFragmentManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_main, container, false)



        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

////        setSupportActionBar(toolbar)

        val adapter = ViewPagerAdapter(requireFragmentManager())
        adapter.addFragment(OneFragment(), "One")
        adapter.addFragment(TwoFragment(), "Two")
        adapter.addFragment(ThreeFragment(), "Three")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)


    }


}