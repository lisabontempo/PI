package psicobaby.psicobaby;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

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
        NomeUtil nomeUtil = new  NomeUtil();
        nome = nomeUtil.ConvertNome(recebeNome.getText().toString());
        telefone = nomeUtil.ConvertTelefone(recebeTelefone.getText().toString());
        email = nomeUtil.ConvertEmail(recebeEmail.getText().toString());
        idade = nomeUtil.ConvertIdade(recebeIdade.getText().toString());
        assunto = nomeUtil.ConvertAssunto(recebeAssunto.getText().toString());
        mes = nomeUtil.ConvertMes(recebeMes.getText().toString());


    }


}
