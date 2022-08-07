package com.zrcoding.indatacore.ui.cart

import androidx.lifecycle.ViewModel
import com.zrcoding.indatacore.R
import com.zrcoding.indatacore.ui.shared.Product

class CartViewModel : ViewModel() {
    fun getCartProductList() = listOf(
        Product(
            name = "PACK REFLEX 25",
            description = ".Retraits et paiements au Maroc et à l’étranger \n.E-paiement sur les sites nationaux et internationaux",
            type = "CARTE VISA",
            image = R.drawable.card1
        ),
        Product(
            name = "PACK ENERGY 35",
            description = ".Retraits et paiements au Maroc et à l’étranger \n.E-paiement sur les sites nationaux et internationaux",
            type = "CARTE VISA",
            image = R.drawable.card2
        ),
        Product(
            name = "PACK REFLEX 25",
            description = ".Retraits et paiements au Maroc et à l’étranger \n.E-paiement sur les sites nationaux et internationaux",
            type = "CARTE VISA",
            image = R.drawable.card1
        ),
        Product(
            name = "PACK ENERGY 35",
            description = ".Retraits et paiements au Maroc et à l’étranger \n.E-paiement sur les sites nationaux et internationaux",
            type = "CARTE VISA",
            image = R.drawable.card2
        ),
        Product(
            name = "PACK REFLEX 25",
            description = ".Retraits et paiements au Maroc et à l’étranger \n.E-paiement sur les sites nationaux et internationaux",
            type = "CARTE VISA",
            image = R.drawable.card1
        ),
        Product(
            name = "PACK ENERGY 35",
            description = ".Retraits et paiements au Maroc et à l’étranger \n.E-paiement sur les sites nationaux et internationaux",
            type = "CARTE VISA",
            image = R.drawable.card2
        ),
    )
}