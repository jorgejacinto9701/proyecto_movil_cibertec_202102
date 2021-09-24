package com.example.proyecto_cibertec;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AlumnoActivity extends AppCompatActivity {

    EditText txtNombre,txtApellido, txtDNI, txtCelular, txtCorreo;
    Button btnRegistra;

    public static final String TEXTO = "[a-zA-ZáéíóúñüÁÉÍÓÚÑÜ\\s]{2,20}";
    public static final String DNI = "[0-9]{8}";
    public static final String CELULAR = "(9)[0-9]{8}";
    public static final String CORREO = "[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})";
    public static final String FECHA = "((19|20)\\d\\d)-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumno);

        txtNombre = findViewById(R.id.id_alumno_nombre);
        txtApellido = findViewById(R.id.id_alumno_apellido);
        txtDNI = findViewById(R.id.id_alumno_dni);
        txtCelular = findViewById(R.id.id_alumno_telefono);
        txtCorreo = findViewById(R.id.id_alumno_correo);
        btnRegistra = findViewById(R.id.id_alumno_registrar);

        btnRegistra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (!txtNombre.getText().toString().matches(TEXTO)){
                        mensajeToast("El nombre es 2 a 20 caracteres");
                        return;
                    }
                    if (!txtApellido.getText().toString().matches(TEXTO)){
                        mensajeToast("El apellido es 2 a 20 caracteres");
                        return;
                    }
                    if (!txtDNI.getText().toString().matches(DNI)){
                        mensajeToast("El dni es de 8 dígitos");
                        return;
                    }
                    if (!txtCelular.getText().toString().matches(CELULAR)){
                        mensajeToast("El celular empieza con 9 y tiene en total 9 dígitos");
                        return;
                    }
                    if (!txtCorreo.getText().toString().matches(CORREO)){
                        mensajeToast("No tiene formato de correo");
                        return;
                    }

                    String msg = "Los datos ingresados son \n\n";
                    msg += "Nombre : "+ txtNombre.getText().toString() + "\n";
                    msg += "Apellido : "+ txtApellido.getText().toString() + "\n";
                    msg += "DNI : "+ txtDNI.getText().toString() + "\n";
                    msg += "Celular : "+ txtCelular.getText().toString() + "\n";
                    msg += "Correo : "+ txtCorreo.getText().toString() + "\n";
                    mensajeAlert(msg);
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity, menu);
        return true;
    }

    public void mensajeToast(String mensaje){
        Toast toast = Toast.makeText(getApplicationContext(),mensaje, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void mensajeAlert(String msg){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage(msg);
        alert.setCancelable(true);
        alert.show();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.idAlumno){
            Intent intent = new Intent(this,AlumnoActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.idAutor){
            Intent intent = new Intent(this,AutorActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.idLibro){
            Intent intent = new Intent(this,LibroActivity.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.idProveedor){
            Intent intent = new Intent(this,ProveedorActivity.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.idSala){
            Intent intent = new Intent(this,SalaActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.idUsuario){
            Intent intent = new Intent(this,UsuarioActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.idEditorial){
            Intent intent = new Intent(this,EditorialActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}