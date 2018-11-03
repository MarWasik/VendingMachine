package pl.sdaacademy.vending.model;

import pl.sdaacademy.vending.util.Configuration;

public class VendingMachine {

    private final Configuration configuration;

    public VendingMachine() {
        configuration = new Configuration();
    }

    public Long rowsCount() {
        return configuration.getLongProperties("machine.size.rows", 6L);
    }

    public Long colsCount() {
        return configuration.getLongProperties("machine.size.cols", 4L);
    }


}
