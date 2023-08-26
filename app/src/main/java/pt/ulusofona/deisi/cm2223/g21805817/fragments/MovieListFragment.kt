package pt.ulusofona.deisi.cm2223.g21805817.fragments

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pt.ulusofona.deisi.cm2223.g21805817.R
import pt.ulusofona.deisi.cm2223.g21805817.adapters.MovieItemAdapter
import pt.ulusofona.deisi.cm2223.g21805817.data.room.entities.MovieEntity
import pt.ulusofona.deisi.cm2223.g21805817.viewModel.MovieListViewModel
import java.util.ArrayList

class MovieListFragment : Fragment(),View.OnClickListener,MenuItem.OnMenuItemClickListener {


    private  var movieItemAdapter: MovieItemAdapter?=null
    private lateinit var recicladorFilmes: RecyclerView
    private lateinit var viewModel: MovieListViewModel
    private var list = mutableListOf<MovieEntity>()
    companion object {
        fun newInstance() = MovieListFragment()
    }





    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.movie_list_fragment, container, false)
        recicladorFilmes= view.findViewById(R.id.recyclerView)

        movieItemAdapter = MovieItemAdapter(
            activity as Context,
            R.layout.movie_list_fragment,
            list as ArrayList<MovieEntity>
        )
        recicladorFilmes.adapter = movieItemAdapter
        return inflater.inflate(R.layout.movie_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MovieListViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

    override fun onMenuItemClick(p0: MenuItem): Boolean {
        TODO("Not yet implemented")
    }


    override fun onStart() {
        super.onStart()
        //recycler
    }

}