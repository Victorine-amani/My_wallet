package victorines_wallet.com.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import victorines_wallet.com.R
import victorines_wallet.com.models.Transaction

class AccountActivity : AppCompatActivity() {
    lateinit var name:TextView
    lateinit var balance:TextView
    lateinit var transaction:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        name=findViewById(R.id.tvName)
        balance=findViewById(R.id.tvBalance)
        transaction=findViewById(R.id.rvTransaction)

        var transactions= listOf(Transaction("Payed for my salon","1234abcd","12/09/2021",12000,"DEBIT"),
            Transaction("Payed for my salon","1234abcd","12/09/2021",12000,"DEBIT"),
            Transaction("Payed for my salon","1234abcd","12/09/2021",12000,"CREDIT"),
            Transaction("Payed for my salon","1234abcd","12/09/2021",12000,"DEBIT"),
            Transaction("Payed for my salon","1234abcd","12/09/2021",12000,"CREDIT"),
            Transaction("Payed for my salon","1234abcd","12/09/2021",12000,"DEBIT"))

        transaction.layoutManager=LinearLayoutManager(baseContext)
        var adapter=TransactionAdapter(transactions)
        transaction.adapter=adapter

    }
}