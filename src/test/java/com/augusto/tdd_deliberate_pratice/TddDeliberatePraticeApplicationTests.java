package com.augusto.tdd_deliberate_pratice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TddDeliberatePraticeApplicationTests {

    @Test
    @DisplayName("Testando numero 1")
    void teste1() {
        Integer numero = 1;
        Assertions.assertEquals(1, numero, "Numero não é 1");
    }
}
