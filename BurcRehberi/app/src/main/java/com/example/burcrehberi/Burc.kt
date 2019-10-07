package com.example.burcrehberi

import java.io.Serializable

data class Burc(var burcAdi: String, var burcTarihi: String, var burcResmi: Int,var buyukburcresim:Int, var burcGenel:String):Serializable {

    // Class'ı serializable türünde yapmamızın nedeni;Maain activiyde oluşturudğum TumBurc arraylisti topluca detay activity'ye taşımak için yaptık.


}

