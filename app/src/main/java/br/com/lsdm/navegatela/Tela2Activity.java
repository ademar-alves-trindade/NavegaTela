package br.com.lsdm.navegatela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela2Activity extends AppCompatActivity {
    Button btnTela1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        btnTela1 =  findViewById(R.id.btnTela2);
    }
}