package pt.ulusofona.deisi.cm2223.g21805817.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pt.ulusofona.deisi.cm2223.g21805817.R
import pt.ulusofona.deisi.cm2223.g21805817.data.room.entities.MovieEntity

class CircularAdapter (val item: List<MovieEntity>): RecyclerView.Adapter<CircularAdapter.ViewHolder>(){

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        val Cartaz: ImageView = itemView.findViewById(R.id.iv_image)

        init {

            itemView.setOnClickListener { v: View ->
                val position: Int = adapterPosition
                //Toast.makeText(itemView.context, "you clicked on item # ${position + 1}", Toast.LENGTH_SHORT).show()
            }


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.movie_dashboard_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: CircularAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return item.size
    }
}