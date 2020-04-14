package id.bas.portofolio

object DataPortofolio {

    val namaPortofolio = arrayOf(
        "Membuat Aplikasi Arimatika",
        "Membuat Aplikasi Portofolio",
        "Membuat Aplikasi Portofolio",
        "Membuat Aplikasi News",
        "Membuat Aplikasi Sehat"
    )

    val imageortofolio = intArrayOf(
        R.drawable.ic_launcher_background,
        R.drawable.gambar1,
        R.drawable.gambar1,
        R.drawable.gambar2,
        R.drawable.gambar1
    )

    val detailPortofolio = arrayOf(
        "Membuat Aplikasi Arimatika perhitungan matematika dll",
        "Membuat Aplikasi Portofolio untuk menampung portofolio pernah dibuat",
        "Membuat Aplikasi Portofolio untuk menampung portofolio pernah dibuat",
        "Membuat Aplikasi News, menampilkan data-data berita",
        "Membuat Aplikasi News, menampilkan data-data sehat"
    )

    val listData : ArrayList<ModelPortofolio>
            get() {
                val list = ArrayList<ModelPortofolio>()
                for (posisi in namaPortofolio.indices){

                    val modelPortofolio = ModelPortofolio()
                    modelPortofolio.namaPorfolio = namaPortofolio[posisi]
                    modelPortofolio.detail = detailPortofolio[posisi]
                    modelPortofolio.imagePortofolio = imageortofolio[posisi]
                    list.add(modelPortofolio)


                }
                return list
            }


}