package br.com.etecia.menuappetecia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    Toolbar toolBar; Dá para fazer global também para todos os métodos verem.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Toolbar toolbar=(Toolbar)findViewById(R.id.TollBar);
         setSupportActionBar(toolbar);

         getSupportActionBar().setTitle("  Maowss");
         getSupportActionBar().setIcon(R.drawable.ic_arrow_back);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mCompartilhar:
                Toast.makeText(getApplicationContext(), "Você clicou na tela de COMPARTILHAR", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mConfigurações:
                Toast.makeText(getApplicationContext(), "Você clicou na tela de CONFIGURAÇÕES", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mFavoritos:
                Toast.makeText(getApplicationContext(), "Você clicou na tela de FAVORITOS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mPesquisar:
                Toast.makeText(getApplicationContext(), "Você clicou na tela de PESQUISAR", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSalvos:
                Toast.makeText(getApplicationContext(), "Você clicou na tela de SALVOS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSobre:
                Toast.makeText(getApplicationContext(), "Você clicou na tela de SOBRE", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    
}
