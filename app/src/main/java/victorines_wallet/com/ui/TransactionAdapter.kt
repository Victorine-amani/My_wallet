package victorines_wallet.com.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.R
import androidx.recyclerview.widget.RecyclerView
import victorines_wallet.com.models.Transaction

class TransactionAdapter(var transactionList:List<Transaction>):RecyclerView.Adapter<TransactionViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(victorines_wallet.com.R.layout.transaction_list, parent,false)
        return TransactionViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
       var currentTransaction=transactionList[position]
        holder.description.text=currentTransaction.description
        holder.reference.text=currentTransaction.reference
        holder.date.text= currentTransaction.date.toString()
        holder.amount.text=currentTransaction.Amount.toString()
        holder.type.text=currentTransaction.type
    }

    override fun getItemCount(): Int {
       return transactionList.size
    }

}


class TransactionViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var description=itemView.findViewById<TextView>(victorines_wallet.com.R.id.tvDescription)
    var reference=itemView.findViewById<TextView>(victorines_wallet.com.R.id.tvReference)
    var date=itemView.findViewById<TextView>(victorines_wallet.com.R.id.tvDate)
    var amount=itemView.findViewById<TextView>(victorines_wallet.com.R.id.tvAmount)
    var type=itemView.findViewById<TextView>(victorines_wallet.com.R.id.tvType)

}