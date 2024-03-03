package com.angel.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button bc, bParentesis, bModulo, bDivision,
            b7, b8, b9, bMult, b4, b5, b6, bMenos,
            b1, b2, b3, bMas, bMasMenos, b0, bPunto, bIgual;
    public TextView r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bc = findViewById(R.id.bC);
        bParentesis = findViewById(R.id.bParentesis);
        bModulo = findViewById(R.id.bModulo);
        bDivision = findViewById(R.id.bDivision);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bMult = findViewById(R.id.bMult);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        bMenos = findViewById(R.id.bMenos);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        bMas = findViewById(R.id.bMas);
        bMasMenos = findViewById(R.id.bMasMenos);
        b0 = findViewById(R.id.b0);
        bPunto = findViewById(R.id.bPunto);
        bIgual = findViewById(R.id.bIgual);

        r=findViewById(R.id.resultado);

        final DataSet a=new DataSet() ;
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              r.setText(a.bC());
            }

        });

        bParentesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setB(bParentesis);
            }
        });

    }

}