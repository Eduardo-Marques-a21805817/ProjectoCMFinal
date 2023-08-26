
package pt.ulusofona.deisi.cm2223.g21805817.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pt.ulusofona.deisi.cm2223.g21805817.R
import pt.ulusofona.deisi.cm2223.g21805817.viewModel.MovieSuggestionViewModel

class MovieSuggestionFragment : Fragment() {

    companion object {
        fun newInstance() = MovieSuggestionFragment()
    }

    private lateinit var viewModel: MovieSuggestionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.movie_suggestion_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MovieSuggestionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}