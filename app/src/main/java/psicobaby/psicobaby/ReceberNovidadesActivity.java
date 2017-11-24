package psicobaby.psicobaby;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import org.junit.Ignore;

public class ReceberNovidadesActivity extends AppCompatActivity {

    public EditText recebeNome;
    public EditText recebeTelefone;
    public EditText recebeEmail;


    public String nome;
    public String telefone;
    public String email;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receber_novidades);
        recebeNome = (EditText) findViewById(R.id.recebeNome);
        recebeTelefone = (EditText) findViewById(R.id.recebeTelefone);
        recebeEmail = (EditText) findViewById(R.id.recebeEmail);
        NomeUtil nomeUtil = new  NomeUtil();
        nome = nomeUtil.ConvertNome(recebeNome.getText().toString());
        telefone = nomeUtil.ConvertTelefone(recebeTelefone.getText().toString());


    }


}
