package pt.ulusofona.deisi.cm2223.g21805817.fragments

import android.annotation.SuppressLint
import android.location.Geocoder
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pt.ulusofona.deisi.cm2223.g21805817.R
import pt.ulusofona.deisi.cm2223.g21805817.activities.MainActivity
import pt.ulusofona.deisi.cm2223.g21805817.viewModel.DashBoardViewModel
import java.util.Locale

class DashBoardFragment : Fragment() {

    companion object {
        fun newInstance() = DashBoardFragment()
    }

    private lateinit var viewModel: DashBoardViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.dashboard_fragment, container, false)
    }

    @SuppressLint("MissingPermission")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DashBoardViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onStart() {

        super.onStart()
        //var tv =
    }


    override fun onResume() {


        //////////////////////////obter distrito/////////////////////////////////////////////



        ////////////////////////////////////////////////////////////////////////////////////


        super.onResume()
    }

}