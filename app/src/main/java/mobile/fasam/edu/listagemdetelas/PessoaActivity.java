package mobile.fasam.edu.listagemdetelas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PessoaActivity extends AppCompatActivity {

    EditText txtNome;
    EditText txtSobrenome;
    EditText txtTelefone;
    EditText txtIdade;
    EditText txtEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pessoa);
    }

    public void enviarPessoa(View view) {
        //Passo 1 capturar dados da tela
        txtNome = findViewById(R.id.txtNome);
        txtTelefone = findViewById(R.id.txtTelefone);
        txtIdade = findViewById(R.id.txtIdade);
        txtEmail = findViewById(R.id.txtEmail);

        //Pegar o texto que o usuario digitou
        String nome, sobrenome, telefone, idade, email;

        nome = txtNome.getText().toString();
        telefone = txtIdade.getText().toString();
        idade = txtIdade.getText().toString();
        email = txtEmail.getText().toString();

        // Formatado os dados de saida
        String dadosDeSaida = String.format("O %s tem %s anos, seu telefone e: %s e seu email e: %s", nome, idade, telefone, email );

        // Exibindo os dados de saida
        Toast.makeText(getApplicationContext(),dadosDeSaida, Toast.LENGTH_LONG).show();
    }
}
