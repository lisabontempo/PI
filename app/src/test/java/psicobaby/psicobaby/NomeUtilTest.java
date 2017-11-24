package psicobaby.psicobaby;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Fernando on 20/11/2017.
 */
public class NomeUtilTest {
    @Test
    public void retornaNome(){

        String enviada = "Fernando";
        String esperada = "Nome: Fernando";
        NomeUtil nomeUtil = new NomeUtil();
        assertEquals(NomeUtil.ConvertNome(enviada), esperada);
    }

    @Test
    public void retornaTelefone(){
        String enviada = "9999-9999";
        String esperada = "Telefone: 9999-9999";
        NomeUtil nomeUtil = new NomeUtil();
        assertEquals(NomeUtil.ConvertTelefone(enviada), esperada);
    }

    @Test
    public void retornaEmail(){
        String enviada = "teste@teste.com";
        String esperada = "Email: teste@teste.com";
        NomeUtil nomeUtil = new NomeUtil();
        assertEquals(NomeUtil.ConvertEmail(enviada), esperada);
    }

    @Test
    public void retornaIdade(){
        String enviada = "1";
        String esperada = "Idade: 1";
        NomeUtil nomeUtil = new NomeUtil();
        assertEquals(NomeUtil.ConvertIdade(enviada), esperada);
    }

    @Test
    public void retornaAssunto(){
        String enviada = "birras";
        String esperada = "Assunto do interesse: birras";
        NomeUtil nomeUtil = new NomeUtil();
        assertEquals(NomeUtil.ConvertAssunto(enviada), esperada);
    }

    @Test
    public  void retornaMes(){
        String enviada = "Janeiro";
        String esperada = "Mês do aniversário: Janeiro";
        NomeUtil nomeUtil = new NomeUtil();
        assertEquals(nomeUtil.ConvertMes(enviada), esperada);
    }

}