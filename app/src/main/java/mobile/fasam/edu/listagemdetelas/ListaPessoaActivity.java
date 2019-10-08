package mobile.fasam.edu.listagemdetelas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ListaPessoaActivity extends AppCompatActivity {

    EditText pessoaNome;
    EditText pessoaIdade;
    EditText pessoaTelefone;
    ListView pessoaListagem;

    List<HashMap<String,String>> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pessoa);
    }

    public void addPssoa(View view) {

        pessoaNome = findViewById(R.id.pessoaNome);
        pessoaIdade = findViewById(R.id.pessoaIdade);
        pessoaTelefone = findViewById(R.id.pessoaTelefone);

        String nome, idade, telefone;
        nome = pessoaNome.getText().toString();
        idade = pessoaIdade.getText().toString();
        telefone = pessoaTelefone.getText().toString();

        String dadosSaida = String.format("Pessoa adicionada foi: %s %s %s", nome, idade, telefone);


        HashMap<String,String> map = new HashMap<>();
        map.put("nome", nome);
        map.put("idade", idade);
        map.put("telefone", telefone);

        lista.add(map);


        String[] de ={"nome","idade","telefone"};
        int[] para = {R.id.labelNome, R.id.labrelIdade, R.id.labelTelefone};

        SimpleAdapter adapter = new SimpleAdapter(
            getApplicationContext(),
            lista,
            R.layout.item,
            de,
            para
        );


        pessoaListagem = findViewById(R.id.pessoaListagem);
        pessoaListagem.setAdapter(adapter);



    }
}
