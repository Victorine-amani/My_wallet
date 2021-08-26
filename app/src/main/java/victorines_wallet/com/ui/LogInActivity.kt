package victorines_wallet.com.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import victorines_wallet.com.R

class LogInActivity : AppCompatActivity() {
    lateinit var name:EditText
    lateinit var password:EditText
    lateinit var login:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        name=findViewById(R.id.etUserName)
        password=findViewById(R.id.etPassword)
        login=findViewById(R.id.btnLogIn)
      login.setOnClickListener {
          if (name.text.isEmpty()||password.text.isEmpty()){
              name.setError("fill in all fields")
              password.setError("fill in all fields")
          }
      var intent=Intent(baseContext,AccountActivity::class.java)
          intent.putExtra("name",name.text)
          startActivity(intent)
      }
    }
}