package com.teamproject.doodlz;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.print.PrintHelper;

import com.teamproject.doodlz.drawing.DrawingView;

import java.util.Objects;
public class MainActivity5 extends AppCompatActivity {

    private EditText editTextUsuario;
    private EditText editTextClave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingreso);

        editTextUsuario = findViewById(R.id.editTextUsuario);
        editTextClave  = findViewById(R.id.editTextClave);
    }

    public void  onClickIngresar(View view)
    {
        String usuario = editTextUsuario.getText().toString();
        String clave = editTextClave.getText().toString();


        if (usuario.equals("marco") && clave.equals("marco") || usuario.equals("orlando") && clave.equals("orlando") )
        {

            Intent intent = new Intent(MainActivity5.this, MainActivity.class);


            intent.putExtra("variable_usuario", usuario);
            intent.putExtra("variable_clave", clave);

            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Usuario/Clave incorrectos", Toast.LENGTH_SHORT).show();


        }
    }
}