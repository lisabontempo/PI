package psicobaby.psicobaby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
    public EditText edtIdade;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {   super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtIdade = (EditText) findViewById(R.id.edtIdade);
        Button ok = (Button) findViewById(R.id.exibirAlerta);
        ok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {if((edtIdade.getText().toString().equals("0"))||(edtIdade.getText().toString().equals("1"))||
                    (edtIdade.getText().toString().equals("2")))
            ProximaTela(edtIdade.getText().toString());  }
        });    }




    public void ProximaTela(String idade){
        if (idade.equals("0"))
        {   Intent intent0 = new Intent(getApplicationContext(), ZeroAnos.class);
            startActivity(intent0);}
        if (idade.equals("1"))
        {   Intent intent0 = new Intent(getApplicationContext(), UmAno.class);
            startActivity(intent0);}
        if (idade.equals("2"))
        {   Intent intent0 = new Intent(getApplicationContext(), DoisAnos.class);
            startActivity(intent0);} }

    public String mensagemAnos(final int idade) {
        if (idade==0) {
            return "Bebê com 0 anos de idade";        }

        if (idade==1) {
            return "Bebê com 1 ano de idade";        }

        if (idade==2) {
            return "Bebê com 2 anos de idade";        }
        else
            return "Idade não permitida";
    }
    public void receberNovidades(View view){
        Intent intent0 = new Intent(getApplicationContext(), ReceberNovidadesActivity.class);
        startActivity(intent0);

    }
}






