package alta.step;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Scanner;

public class Stepdefinition {
    int Length, Width, Height, NetWeight, VolWeight, Postage;

    @When("I want count {int} with {int} with {int} and {int}")
    public void iWantCountWithWithAnd(int arg0, int arg1, int arg2, int arg3) {
        Length = arg0;
        Width = arg1;
        Height = arg2;
        NetWeight = arg3;
    }

    @Then("I get total weight {int} and get total pay {int}")
    public void iGetTotalWeightAndGetTotalPay(int arg0, int arg1) {

        VolWeight = (Length * Width * Height) / 5000;
        Postage = NetWeight * 5000;
        if (VolWeight == arg0 && Postage == arg1) {
            System.out.println("Berat Volume \t Kg =  " + Math.round(VolWeight));
            System.out.println("Ongkos Kirim \t Rp =  " + Math.round(Postage));
        }
    }
}

