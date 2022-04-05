package org.pacotorrado.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RichestCustomerWealthTest {

    RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();

    @Test
    void shouldReturnValidAmount_6() {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        assertEquals(6, richestCustomerWealth.maximumWealth(accounts));
    }

    @Test
    void shouldReturnValidAmount_10() {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        assertEquals(10, richestCustomerWealth.maximumWealth(accounts));
    }


    @Test
    void shouldReturnValidAmount_17() {
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        assertEquals(17, richestCustomerWealth.maximumWealth(accounts));
    }

}
