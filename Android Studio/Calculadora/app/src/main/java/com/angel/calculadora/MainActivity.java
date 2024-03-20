package com.angel.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button bc, bParentesis, bModulo, bDivision,
            b7, b8, b9, bMult, b4, b5, b6, bMenos,
            b1, b2, b3, bMas, bMasMenos, b0, bPunto, bIgual;
    public TextView r,tvR;


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
        tvR=findViewById(R.id.tvResult);
        r=findViewById(R.id.tvOperation);
      /*  String n= (String) r.getText();
        SpannableString spannableString=new SpannableString(n);
        ForegroundColorSpan foregroundColorSpan= new ForegroundColorSpan(Color.GREEN);
        spannableString.setSpan(foregroundColorSpan,r.getText().length()-1,r.getText().length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);*/
        final DataSet a=new DataSet() ;


        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              r.setText(a.bC());
                tvR.setText(a.bC());
            }

        });

        bParentesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(a.bParentesis(r));
                change();
            }
        });


        bModulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText().toString()+a.bModulo());
                change();

            }
        });

        bDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText().toString()+a.bDivision());
                change();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                r.setText(r.getText().toString()+a.b7());
                change();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText().toString()+a.b8());
                change();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText().toString()+a.b9());
                change();
            }
        });
        bMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText().toString()+a.bMult());
                change();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText().toString()+a.b4());
                change();
            }

        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText().toString()+a.b5());
                change();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText().toString()+a.b6());
                change();
            }
        });

        bMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText().toString()+a.bMenos());
                change();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText().toString()+a.b1());
                change();
            }


        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText().toString()+a.b2());
                change();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText().toString()+a.b3());
                change();
            }
        });

        bMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText().toString()+a.bMas());
                change();
            }
        });
        bMasMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText().toString()+a.bMasMenos());
                change();
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText().toString()+a.b0());
                change();
            }
        });
        bPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText(r.getText().toString()+a.bPunto());
                change();
            }
        });



    }


    public void change(){

        DiscreteMaths operacion= new DiscreteMaths();

        tvR.setText(operacion.operation(r));

        Toast.makeText(this,operacion.operation(r),Toast.LENGTH_SHORT).show();
    }
}