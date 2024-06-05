package com.example.listwisatavictor.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listwisatavictor.R
import com.example.listwisatavictor.adapter.TouristAttractionAdapter
import com.example.listwisatavictor.databinding.ActivityMainBinding
import com.example.listwisatavictor.model.TouristAttraction

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val touristAttraction = arrayOf(
            TouristAttraction(
                R.drawable.saloka,
                "Saloka Theme Park",
                "Theme Park yang satu ini merupakan taman rekreasi keluarga yang mengusung " +
                        "konsep kearifan lokal berdasarkan legenda rakyat, Batu Klinting. Saloka Theme Park " +
                        "sendiri punya lima zona dengan berbagai macam wahana permainan seru, seperti Cakrawala, " +
                        "Teka Teko, Paku Bumi, Obat-Abit, Gonjang Ganjing, dan masih banyak lagi.",
            ),
            TouristAttraction(
                R.drawable.sampokong,
                "SAM POO KONG",
                "Di Klenteng Sam Poo Kong kamu bisa menikmati keunikan bangunan yang " +
                        "memadukan arsitektur tradisional Jawa dengan Tionghoa. Di sini kamu juga " +
                        "bisa sewa kostum ala kekaisaran Cina dan berfoto-foto, serta menonton pertunjukan " +
                        "budaya di wisata Semarang yang satu ini.",
            ),
            TouristAttraction(
                R.drawable.lawangsewu,
                "Lawang Sewu",
                "Lawang Sewu jadi tempat wisata Semarang paling pas buat kamu yang suka wisata sejarah. " +
                        "Soalnya, Lawang Sewu sendiri adalah bangunan peninggalan Belanda. Daya tarik dari tempat ini " +
                        "adalah keunikan arsitekturnya, adanya ruang bawah tanah, diorama dan barang-barang bersejarah " +
                        "kereta api Indonesia, sampai pintu yang sangat banyak.",
            ),
            TouristAttraction(
                R.drawable.kotalama,
                "Kota Lama Semarang",
                "Kota Lama Semarang dulunya merupakan pusat pemerintahan dan pusat perdagangan di zaman " +
                        "Belanda, sehingga masih banyak gedung-gedung tua bersejarah. Di sini kamu bisa berfoto-foto " +
                        "dengan latar bangunan tua bergaya Eropa dan bersantai di Taman Srigunting. Kamu juga bisa " +
                        "mengunjungi Gereja Blenduk, yang menjadi gereja kristen tertua di Jawa Tengah.",
            ),
            TouristAttraction(
                R.drawable.kampungpelangi,
                "Kampung Pelangi",
                "Kampung Pelangi adalah pemukiman warga yang dicat warna-warni, mulai dari " +
                        "tembok dan atap rumah, sampai jalanannya. Dulunya kampung ini sangat kumuh, " +
                        "sekarang terkesan lebih ceria dan unik. Nggak heran kalau Kampung Pelangi jadi " +
                        "destinasi wisata Semarang yang Instagramable.",
            ),
            TouristAttraction(
                R.drawable.ranggawarsita,
                "Museum Ranggawarsita",
                "Tempat ini merupakan museum yang menyimpan berbagai macam koleksi benda bersejarah, " +
                        "baik itu benda geologi maupun budaya. Museum ini merupakan museum yang paling terkenal " +
                        "di Jawa Tengah karena koleksinya yang lengkap. Di sini kamu bisa ke Ruang Emas, Outdoor " +
                        "Exhibition, Gedung Apresiasi, sampai perpustakaan.",
            ),
            TouristAttraction(
                R.drawable.browncanyon,
                "Brown Canyon Semarang",
                "Brown Canyon Semarang jadi tempat wisata Semarang yang sekarang lagi hits karena " +
                        "pemandangannya seperti di luar negeri. Di sini, kamu bisa lihat tebing-tebing yang" +
                        " menjulang tinggi. Pemandangan yang unik ini sebenarnya hasil dari penambangan pasir, " +
                        "tanah, dan juga bebatuan. Kamu bisa foto-foto dengan latar tebing batu tinggi.",
            ),
            TouristAttraction(
                R.drawable.dusunsemilir,
                "Dusun Semilir Eco Park",
                "Dusun Semilir Eco Park memiliki desain bangunan menyerupai stupa Candi Borobudur. " +
                        "Tempat ini menawarkan rekreasi dengan beragam spot foto yang Instagramable. " +
                        "Selain foto-foto, kamu juga bisa belanja oleh-oleh berupa kerajinan produksi lokal " +
                        "dan camilan khas Indonesia. Di sini juga ada wahana permainan yang seru.",
            ),
            TouristAttraction(
                R.drawable.umbulsidomukti,
                "Umbul Sidomukti",
                "Umbul Sidomukti terletak di lereng Gunung Ungaran, sehingga udara di sini sejuk dan" +
                        " hawanya dingin. Di sini, kamu bisa berenang di kolam renang mata air alami, lho!" +
                        " Nggak hanya itu aja, kamu juga bisa melakukan outbond dan naik wahana pacu adrenaline.",
            ),
            TouristAttraction(
                R.drawable.tamanwilis,
                "Taman Wilis",
                "Taman Wilis adalah wisata Semarang berupa taman di atas bukit yang menyajikan keindahan" +
                        " pemandangan Kota Semarang dari ketinggian. Tempat ini bisa jadi alternatif buat kamu" +
                        " yang cuma ingin cari angin segar atau bersantai. Kamu bisa melihat cantiknya matahari" +
                        " terbit dari salah satu spot yang ada di sini.",
            ),
            TouristAttraction(
                R.drawable.kampungbatik,
                "Kampung Batik Semarang",
                "Di Semarang, kamu juga bisa belanja batik asli di Kampung Batik Semarang. Di Kampung" +
                        " Batik, kamu bisa belajar banyak soal sejarah batik, belajar mengenal corak Batik Semarang," +
                        " coba membuat batik dengan menggunakan canting, sampai foto-foto di spot yang Instagramable. ",
            ),
        )

        // Mengatur layout manager dan adapter untuk RecyclerView.
        binding.rvTouristAttraction.layoutManager = LinearLayoutManager(this)
        binding.rvTouristAttraction.adapter = TouristAttractionAdapter(touristAttraction) { item ->
            // Mengarahkan pengguna ke DetailActivity saat item RecyclerView diklik.
            val touristAttractionIntent = Intent(this, DetailActivity::class.java).apply {
                putExtra(DetailActivity.KEY_TITLE, item.title)
                putExtra(DetailActivity.KEY_DESCRIPTION, item.description)
                putExtra(DetailActivity.KEY_IMAGE, item.image)
            }
            startActivity(touristAttractionIntent)
        }
    }
}