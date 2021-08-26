package victorines_wallet.com.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Button
import victorines_wallet.com.R

class MainActivity : AppCompatActivity() {
  lateinit var enter:Button
  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      enter=findViewById(R.id.btnEnter)
      enter.setOnClickListener {
    startActivity(Intent(baseContext,LogInActivity::class.java))
}

    }
}