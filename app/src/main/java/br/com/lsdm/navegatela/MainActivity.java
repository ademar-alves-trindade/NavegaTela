package br.com.lsdm.navegatela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTela2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTela2 =  findViewById(R.id.btnTela2);

        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //VAMOS CRIAR UMA INTENÇÃO - INTENT
                //INTENT --> Classe interna do Java
                //INTENT --> intenção de uma ação
                //INTENT --> permite uma ação de executar uma chamada de outra activity
                //INTENT --> permite passar valores de uma activity pra outra activity
                //INTENT --> passa valores de uma tela para outra

                Intent trocaTela = new Intent(MainActivity.this, Tela2Activity.class);
                MainActivity.this.startActivity(trocaTela);
                //MainActivity.this.finish();
            }
        });

    }
}