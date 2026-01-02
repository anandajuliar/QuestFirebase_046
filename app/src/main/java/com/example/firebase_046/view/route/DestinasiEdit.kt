package com.example.firebase_046.view.route

import com.example.firebase_046.R
import com.example.firebase_046.view.route.DestinasiNavigasi

object DestinasiEdit: DestinasiNavigasi {
    override val route = "item_edit"
    override val titleRes = R.string.edit_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}
