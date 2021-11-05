package id.ac.uts_meyfandi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.laptop,"Alat Informasi","laptop","Laptop atau Notebook" +
                "laptop sebagai alat kerja yang mudah digunakan dimana saja. Sumber energi laptop berasal dari baterai layaknya baterai pada handphone, yang bisa diisi ulang dengan menggunakan listrik." +
                "hanya pada fisik laptop yang begitu ramping dan ringan."))

        data?.add(DataModel(R.drawable.radio,"Alat Komunikasi","Radio", "Radio merupakan alat mendengar informasi" +
                "Radio adalah teknologi yang digunakan untuk pengiriman sinyal dengan cara modulasi dan radiasi elektromagnetik (gelombang elektromagnetik)." +
                "Saat ini radio dapat didengarkan melalui ponsel pintar,"))

        data?.add(DataModel(R.drawable.telegraf,"Alat Komunikasi","telegraf", "alat yang memanfaatkan sandi morse" +
                "adalah alat yang memanfaatkan sandi morse. Pada tahun 1900-an telegraf berperan sangat vital sebagai sarana mengirimkan pesan. Bentuk pesan yang disampaikan adalah dalam bentuk sandi morse." +
                "berkembang di tahun 1900an."))

        data?.add(DataModel(R.drawable.kereta,"transportasi","Kereta", "transportasi darat yang sejak dulu sampai sekarang masih eksis" +
                "adalah sarana transportasi berupa kendaraan dengan tenaga gerak, baik berjalan sendiri maupun dirangkaikan dengan kendaraan lainnya, " +
                "kereta listrik yang mulai eksis"))

        data?.add(DataModel(R.drawable.kapal,"transportasi","Kapal", "transportasi air" +
                "adalah kendaraan pengangkut penumpang dan barang di laut (sungai dsb) seperti halnya sampan atau perahu yang lebih kecil" +
                " Kapal biasanya cukup besar untuk membawa perahu kecil seperti sekoci"))

        data?.add(DataModel(R.drawable.telepon,"Alat Komunikasi","telepon", "Alat Komunikasi jarak jauh yeng mengggunakan transmisi sinyal listrik " +
                "adalah pesawat dengan listrik dan kawat, untuk bercakap-cakap antara dua orang yang berjauhan tempatnya" +
                "yang merupakan perangkat modern"))


        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("jenis", item?.jenis)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }
        })
    }
}