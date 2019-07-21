package com.stackroute.printpages;


public class Printer {
    private String name;
    private int tonerLevel;
    private int printedPages;
    private boolean isDoubleSided;

    public Printer(String name, int tonerLevel, int printedPages, boolean isDoubleSided) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.isDoubleSided = isDoubleSided;
        this.printedPages = printedPages;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int print(int pages) {
        int pagesToPrint = pages;
        if (this.isDoubleSided) {
            pagesToPrint = pagesToPrint / 2;
            System.out.println("Printer is printing Both side");
        }
        this.printedPages += pagesToPrint;
        return pagesToPrint;
    }

    public int getPrintedPages() {
        return printedPages;
    }

}











