//*************************************************************
// Firm.java Author: Lewis/Loftus
//
// Demonstrates polymorphism via inheritance.
//*************************************************************

import com.*;

public class Firm {
    // ----------------------------------------------------------
    // Creates a staff of employees for a firm and pays them.
    // ----------------------------------------------------------
    public static void main(String[] args) {
        Staff personnel = new Staff();
        personnel.payday();
    }
}