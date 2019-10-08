package mobile.fasam.edu.listagemdetelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void mudarTela(View view) {
        int opcao = view.getId();
        Intent intent;

        switch (opcao){
            case R.id.btnMudar:
                intent = new Intent(this,PessoaActivity.class);
                startActivity(intent);
            break;

            case R.id.btnAdd:
                intent = new Intent(this,ListaPessoaActivity.class);
                startActivity(intent);
            break;
        }
    }
}
