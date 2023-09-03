/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication.HelloJar;

/**
 *
 * @author admin
 */

import view.InvoiceView;
import vn.edu.ptit.Invoice;

public class Main
{
    public static void main(String[] args)
    {
        PaymentController pc = new PaymentController();
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}

