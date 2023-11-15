package com.example.a04_saludotruman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saludo(View vista) {

        TextView txt = findViewById(R.id.textView);
        CheckBox dia = findViewById(R.id.dia);
        CheckBox tarde = findViewById(R.id.tarde);
        CheckBox noche = findViewById(R.id.noche);
        EditText txt1 = findViewById(R.id.editTextText);
        String apellido = txt1.getText().toString();

        String saludo = "";

        if (dia.isChecked()) {
            Toast.makeText(getApplicationContext(), "¡Buenos dias, buenas tardes y buenas noches!", Toast.LENGTH_LONG).show();
            saludo += "Buenos dias";
        }
        if (tarde.isChecked()) {
            Toast.makeText(getApplicationContext(), "¡Buenos dias, buenas tardes y buenas noches!", Toast.LENGTH_LONG).show();
            saludo += "Buenas tardes";
        }
        if (noche.isChecked()) {
            Toast.makeText(getApplicationContext(), "¡Buenos dias, buenas tardes y buenas noches!", Toast.LENGTH_LONG).show();
            saludo += "Buenas noches";
        }

        saludo += f() + "" + apellido;
        txt.setText(saludo);
        txt.setVisibility(View.VISIBLE);
    }

    public String f() {

        RadioGroup r = findViewById(R.id.radiogroup);
        RadioButton h = findViewById(r.getCheckedRadioButtonId());

        if (h != null) {
            Toast.makeText(getApplicationContext(), "¡Buenos dias, buenas tardes y buenas noches!", Toast.LENGTH_LONG).show();
            return h.getText().toString();

        }
        //hhhhh

        return "";
    }


}

