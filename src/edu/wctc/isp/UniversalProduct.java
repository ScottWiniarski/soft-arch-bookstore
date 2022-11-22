package edu.wctc.isp;

import java.time.LocalDate;

public interface UniversalProduct {
    double getCost();
    String getFormattedReleaseDate();
    int getQuantityOnHand();
    LocalDate getReleaseDate();

    String getTitle();

    void order(int quantity);
}
