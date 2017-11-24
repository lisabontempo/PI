package psicobaby.psicobaby;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class ReceberNovidades extends AppCompatActivity {

    public EditText recebeNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receber_novidades);
        recebeNome = (EditText) findViewById(R.id.recebeNome);
        ConvertNome(recebeNome.getText().toString());
    }

    public String ConvertNome(String nome)
    {
        String retornoNome = "Nome: "+nome;
        return retornoNome;

    }
}
