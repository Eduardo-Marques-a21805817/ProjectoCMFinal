package pt.ulusofona.deisi.cm2223.g21805817.data.room.entities

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.util.*

@Entity(tableName = "List_Fires")
data class MovieEntity (

    @SerializedName("id")
    @PrimaryKey
    var uuid: String= UUID.randomUUID().toString(),

    var Name: String?,

    var Cartaz: Bitmap?,

    var Genero: String?,

    var Sinopse: String?,

    var DataLancamento: Date?,

    var AvaliacaoIMDB: Float?,

    var LinkIMDB: String?,

    var Cinema: String?,

    var Avaliacao: Float?,

    var DataVisualizacao: Date?,

    var Fotografias: List<Bitmap>,

    var observacoes: String?,




){

}