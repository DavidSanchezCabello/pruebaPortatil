package es.studium.tema1ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button boton;
    EditText texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = findViewById(R.id.btnBoton);
        boton.setOnClickListener(this);
        texto = findViewById(R.id.txtContraseña);
    }

    @Override
    public void onClick(View v) {

        if (texto.length()==0){
            Toast.makeText( this, R.string.mensajeError, Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, texto.getText(), Toast.LENGTH_SHORT).show();
            texto.setText("");
        }
    }
}