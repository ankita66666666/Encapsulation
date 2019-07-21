package com.stackroute.printpages;

public class MainClass {
    Printer prntr = new Printer("mukul",50,20,true);

        System.out.println("Page count in initial = " + prntr.getPrintedPages());
    int pagesPrinted = prntr.print(5);
        System.out.println("Pages printed was " + pagesPrinted + ". New total print count = " + prntr.getPrintedPages());
    pagesPrinted = printer.print(3);
        System.out.println("Pages printed was " + pagesPrinted + ". New total print count = " + prntr.getPrintedPages());



}
