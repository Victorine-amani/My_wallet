package victorines_wallet.com.models

import java.util.*

data class Transaction(
    var description:String,
    var reference:String,
    var date: String,
    var Amount:Int,
    var type:String
)
