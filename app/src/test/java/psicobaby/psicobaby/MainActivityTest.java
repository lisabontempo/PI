package psicobaby.psicobaby;

import junit.framework.Assert;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by Fernando on 06/11/2017.
 */

public class MainActivityTest {

    @Test
    public void deveriaRetornarBemVindoBebeQuandoIdadeIgual1(){

        String esperada = "Bem vindo bebe";
        String naoEsperada = "erro";
        MainActivity m = new MainActivity();
        String retornada = m.mensagemBebe("1");
        String erro = m.mensagemBebe("0");


        assertEquals(retornada, esperada);

        assertEquals(erro, naoEsperada);
    }
}
