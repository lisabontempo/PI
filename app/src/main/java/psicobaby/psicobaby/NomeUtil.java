package psicobaby.psicobaby;

/**
 * Created by Fernando on 20/11/2017.
 */

public class NomeUtil {

    public static String ConvertNome(String nome)
    {
        String retornoNome = "Nome: "+nome;
        return retornoNome;
    }

    public static String ConvertTelefone (String telefone){
        String retornoTelefone;
        retornoTelefone = "Telefone: "+telefone;
        return retornoTelefone;
    }

    public static String ConvertEmail(String email){
        String retornoEmail;
        retornoEmail = "Email: "+email;
        return retornoEmail;
    }

    public static String ConvertIdade(String numero){
        String retornoIdade;
        retornoIdade = "Idade: "+numero;
        return retornoIdade;
    }
}
