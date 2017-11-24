package psicobaby.psicobaby;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class DoisAnosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int idade = 2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dois_anos);
        CaixaMensagem(idade);
    }
    public void CaixaMensagem(final int idade){
        AlertDialog.Builder alerta = new AlertDialog.Builder(DoisAnosActivity.this);
        alerta.setTitle("Vamos começar!");
        alerta.setIcon(R.mipmap.ic_launcher);
        alerta.setMessage("Agora você terá acesso a dicas desenvolvidas para a idade do seu bebê");
        alerta.setCancelable(false);
        alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                MainActivity m = new MainActivity();
                Toast.makeText(getApplicationContext(), m.mensagemAnos(idade), Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog alertDialog = alerta.create();
        alertDialog.show();
    }
}
