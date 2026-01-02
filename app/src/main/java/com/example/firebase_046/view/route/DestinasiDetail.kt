package com.example.firebase_046.view.route

import com.example.firebase_046.R
import com.example.firebase_046.view.route.DestinasiNavigasi

object DestinasiDetail: DestinasiNavigasi {
    override val route = "detail_siswa"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}
