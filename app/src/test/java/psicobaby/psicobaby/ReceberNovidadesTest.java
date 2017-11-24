package psicobaby.psicobaby;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Fernando on 20/11/2017.
 */
public class ReceberNovidadesTest {
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




}