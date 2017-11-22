package psicobaby.psicobaby;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    public EditText edtIdade;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtIdade = (EditText) findViewById(R.id.edtIdade);


        Button ok = (Button) findViewById(R.id.exibirAlerta);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                alerta.setTitle("Vamos começar!" + edtIdade.getText());
                alerta.setIcon(R.mipmap.ic_launcher);
                alerta.setMessage("Agora você terá acesso a dicas desenvolvidas para a idade do seu bebê");
                alerta.setCancelable(false);


                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), mensagemBebe(edtIdade.getText().toString()), Toast.LENGTH_LONG).show();

                    }
                });


                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            }


        });
    }



    public String mensagemBebe(String idade) {



        if (idade.equals("1")) {
            return "Bem vindo bebe";

        }

        else
            return "erro";


    }
}






