package psicobaby.psicobaby;

import junit.framework.Assert;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by Fernando on 06/11/2017.
 */

public class MainActivityTest {

    @Test

    public void deveriaRetornarQuandoIdadeIgual0(){

        String esperada = "Bebê com 0 anos de idade";
        MainActivity m = new MainActivity();
        String retornada = m.mensagemZeroAnos("0");

        assertEquals(retornada, esperada);

    }

    @Test
    public void deveriaRetornarQuandoIdadeIgual1(){

        String esperada = "Bebê com 1 ano de idade";
        MainActivity m = new MainActivity();
        String retornada = m.mensagemZeroAnos("1");

        assertEquals(retornada, esperada);

    }


}
