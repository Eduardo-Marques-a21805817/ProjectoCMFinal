package pt.ulusofona.deisi.cm2223.g21805817.adapters

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pt.ulusofona.deisi.cm2223.g21805817.R

import pt.ulusofona.deisi.cm2223.g21805817.data.room.entities.MovieEntity
import java.io.File

class MovieItemAdapter(private val context:Context, private val layout:Int  ,private val item:ArrayList<MovieEntity>):RecyclerView.Adapter<MovieItemAdapter.ViewHolder>()  {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        //val itemDetails: TextView = itemView.findViewById(R.id.tv_resultado)
        val NomeFilme: TextView = itemView.findViewById(R.id.tv_movieName)
        val Cinema: TextView = itemView.findViewById(R.id.tv_teatherLocation)
        val rating: TextView = itemView.findViewById(R.id.Rating)
        val image: ImageView = itemView.findViewById(R.id.iv_image)

        init {

            itemView.setOnClickListener { v: View ->
                val position: Int = adapterPosition
                //Toast.makeText(itemView.context, "you clicked on item # ${position + 1}", Toast.LENGTH_SHORT).show()
            }


        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.movie_item_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: MovieItemAdapter.ViewHolder, position: Int) {

        holder.NomeFilme.text = item[position].Name
        holder.Cinema.text = item[position].Cinema
        holder.rating.text = item[position].Avaliacao.toString()

        var myimagepth: File = File(item[position].Cartaz.toString())
        var myBitmap: Bitmap

        if (myimagepth.exists()) {
            myBitmap = BitmapFactory.decodeFile(myimagepth.absolutePath!!)
            Log.i("imagepath", "image exists")

            holder.image.setImageBitmap(myBitmap)
        }
    }

    override fun getItemCount(): Int {
        return item.size
    }
}