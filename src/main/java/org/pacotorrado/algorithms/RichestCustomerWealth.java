package org.pacotorrado.algorithms;

public class RichestCustomerWealth {

    int maximumWealth(final int[][] accounts) {
        int maximum = 0;
        int accountsNumber = accounts[0].length;
        for (int i = 0; i < accounts.length; i++) {
            int amount = 0;
            for (int j = 0; j < accountsNumber; j++) {
                amount += accounts[i][j];
            }
            if (amount > maximum) {
                maximum = amount;
            }
        }
        return maximum;
    }
}
