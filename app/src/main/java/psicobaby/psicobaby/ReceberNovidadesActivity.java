package psicobaby.psicobaby;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.junit.Ignore;

public class ReceberNovidadesActivity extends AppCompatActivity {

    public EditText recebeNome;
    public EditText recebeTelefone;
    public EditText recebeEmail;
    public EditText recebeIdade;
    public EditText recebeAssunto;
    public EditText recebeMes;


    public String nome;
    public String telefone;
    public String email;
    public String idade;
    public String assunto;
    public String mes;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receber_novidades);
        recebeNome = (EditText) findViewById(R.id.recebeNome);
        recebeTelefone = (EditText) findViewById(R.id.recebeTelefone);
        recebeEmail = (EditText) findViewById(R.id.recebeEmail);
        recebeIdade = (EditText) findViewById(R.id.recebeIdade);
        recebeAssunto = (EditText) findViewById(R.id.recebeAssunto);
        recebeMes = (EditText) findViewById(R.id.recebeAssunto);

       final Button button = (Button) findViewById(R.id.buttonReceberNovidades);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                alertaCadastro();
            }
        });

       }


    private void alertaCadastro() {
        AlertDialog.Builder alerta = new AlertDialog.Builder(ReceberNovidadesActivity.this);
        alerta.setTitle("Cadastro realizado com sucesso!");
        alerta.setIcon(R.mipmap.ic_launcher);
        NomeUtil nomeUtil = new NomeUtil();
        alerta.setMessage(nomeUtil.ConvertNome(recebeNome.getText().toString())+"\n"+nomeUtil.ConvertTelefone(recebeTelefone.getText().toString())
        +"\n"+nomeUtil.ConvertEmail(recebeEmail.getText().toString())+"\n"+nomeUtil.ConvertIdade(recebeIdade.getText().toString()+"\n")+
        nomeUtil.ConvertMes(recebeMes.getText().toString())+"\n"+nomeUtil.ConvertAssunto(recebeAssunto.getText().toString()));
        alerta.setCancelable(false);
        alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent0 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent0);

            }
        });
        AlertDialog alertDialog = alerta.create();
        alertDialog.show();
    }
}

