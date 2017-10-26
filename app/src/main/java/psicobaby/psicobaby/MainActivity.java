package psicobaby.psicobaby;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ok =    (Button) findViewById(R.id.exibirAlerta);
        ok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                alerta.setTitle("Vamos começar!");
                alerta.setIcon(R.mipmap.ic_launcher);
                alerta.setMessage("Digite a idade do seu bebê.");
                alerta.setCancelable(false);
                alerta.setNegativeButton("cancelar", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Cancelar escolhido", Toast.LENGTH_SHORT).show();
                    }
                });

                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "ok escolhido", Toast.LENGTH_SHORT).show();
                    }
                });

                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            }



        });
    }
}
