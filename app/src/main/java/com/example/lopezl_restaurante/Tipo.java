package com.example.lopezl_restaurante;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Tipo extends Activity {

    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tipo);

        boton = (Button) findViewById(R.id.button1);
        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                irloginm(null);
            }
        });

        boton = (Button) findViewById(R.id.button2);
        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                irlogina(null);
            }
        });

    }

    public void irloginm(View view) {
        Intent i = new Intent(this, Login.class);
        startActivity(i);
    }

    public void irlogina(View view) {

        Intent i = new Intent(this, Login1.class);
        startActivity(i);
    }

}