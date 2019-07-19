package com.stackroute.printpages;


public class Printer {
    private String name;
    private int tonerLevel;
    private int amtOfPaper;
    private int numOfPagesPrinted;
    private boolean DoubleSided;

    public Printer(String name, int tonerLevel, int ammountOfPaper, boolean isDoubleSided) {
        this.name = name;
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.amtOfPaper = ammountOfPaper;
        this.DoubleSided = DoubleSided;
    }

    private boolean toner(int numToPrintPages) {
        if ((tonerLevel - (numOfPagesPrinted / 2) < 0)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean tonerlevel(int numToPrint) {
        if (((amtOfPaper - numToPrint) < 0)) {
            return true;
        } else {
            return false;
        }
    }
}











