package br.com.etecia.menuappetecia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Compartilhar_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compartilhar_layout);
    }

    public void Sair(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
