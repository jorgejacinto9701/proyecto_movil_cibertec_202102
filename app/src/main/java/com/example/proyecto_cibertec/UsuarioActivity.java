package com.example.proyecto_cibertec;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class UsuarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity, menu);
        return true;
    }


    public void mensaje(String mensaje){
        Toast toast = Toast.makeText(getApplicationContext(),mensaje, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void mostrarMensaje(String msg){
        androidx.appcompat.app.AlertDialog.Builder alert = new AlertDialog.Builder(this);
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