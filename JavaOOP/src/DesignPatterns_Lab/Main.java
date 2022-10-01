package DesignPatterns_Lab;

import DesignPatterns_Lab.template.LocalStorePurchase;
import DesignPatterns_Lab.template.OnlinePurchase;
import DesignPatterns_Lab.template.TemplatePurchase;

public class Main {
    public static void main(String[] args) {
        TemplatePurchase purchase1 = new OnlinePurchase();
        TemplatePurchase purchase2 = new LocalStorePurchase();

        purchase1.purchaseOrder();

        System.out.println();

        purchase2.purchaseOrder();
    }
}
