package com.karim.exercises.oop.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RationalNumberTest {

    /**
     * Creo i due numeri razionali, poi uso assertEquals per verificare se il numero razionale expected, che io so essere
     * la somma, è effettivamente uguale alla somma fatta tramite l'apposito metodo add.
     */
    @Test
    void add() {
        RationalNumber rN1 = new RationalNumber(1, 2);
        RationalNumber rN2 = new RationalNumber(1, 2);
        assertEquals(new RationalNumber(2, 2), rN1.add(rN2));
    }

    /**
     * Creo i due numeri razionali, poi uso assertEquals per verificare se il numero razionale expected, che io so essere
     * la moltiplicazione, è effettivamente uguale alla moltipicazione fatta tramite l'apposito metodo multiply.
     */
    @Test
    void multiply() {
        RationalNumber rN1 = new RationalNumber(4, 3);
        RationalNumber rN2 = new RationalNumber(3, 2);
        assertEquals(new RationalNumber(12, 6), rN1.multiply(rN2));
    }
}