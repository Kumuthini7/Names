package com.example.myapplication.test.names

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.test.App
import com.example.myapplication.test.viewModel.MainViewModel
import com.example.myapplication.test.viewModel.MainViewModelFactory
import kotlinx.android.synthetic.main.fragment_main.view.*
import javax.inject.Inject


/**
 * Created by Kumuthini.N on 10-08-2020
 */

class MainFragment : Fragment() {

    @Inject
    lateinit var factory: MainViewModelFactory

    private lateinit var viewModel: MainViewModel
    private val adapter = NameListAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        App.component.inject(this)
        viewModel = ViewModelProviders.of(this, factory).get(MainViewModel::class.java)

        viewModel.response.observe(this, Observer { response ->
            response.message?.let {

                val alphabetList = viewModel.addAlphabets(it)
                adapter.update(this.requireContext(), alphabetList)
            }
        })

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val mLayoutManager = LinearLayoutManager(activity)
        mLayoutManager.orientation = RecyclerView.VERTICAL
        view.rView.layoutManager = mLayoutManager
        view.rView.adapter = adapter

        val dividerItemDecoration =
            androidx.recyclerview.widget.DividerItemDecoration(activity, mLayoutManager.orientation)
        view.rView.addItemDecoration(dividerItemDecoration)
        return view
    }

    override fun onResume() {
        super.onResume()
        viewModel.getResponse()
    }

}
