import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.gl4.ttp1.R
import com.gl4.ttp1.WelcomeActivity

class  MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonConnect = findViewById<Button>(R.id.buttonConnect)

        buttonConnect.setOnClickListener {
            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()

            if (email == "gl4@insat.tn" && password == "insat2022") {
                val intent = Intent(this@MainActivity, WelcomeActivity::class.java)
                intent.putExtra("email", email)
                startActivity(intent)
                Toast.makeText(this@MainActivity, "Connexion réussie !", Toast.LENGTH_SHORT).show()
            } else {
                val errorMessage = "Email : $email ou mot de passe: $password sont incorrects"
                Toast.makeText(this@MainActivity, errorMessage, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
