package pt.ulusofona.deisi.cm2223.g21805817.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import pt.ulusofona.deisi.cm2223.g21805817.R
import pt.ulusofona.deisi.cm2223.g21805817.viewModel.RegisterMovieViewModel

class RegisterMovieFragment : Fragment() {

    companion object {
        fun newInstance() = RegisterMovieFragment()
    }

    private lateinit var viewModel: RegisterMovieViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.register_movie_fragment, container, false)
    }

    override fun onStart() {
        super.onStart()


        val adapterListaCinemas = context?.let{ArrayAdapter.createFromResource(it,R.array.distritos,android.R.layout.simple_spinner_item)}
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RegisterMovieViewModel::class.java)
        // TODO: Use the ViewModel
    }

}