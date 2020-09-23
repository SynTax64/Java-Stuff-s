package S7_Composition_Encapsulation_Polymorphism.Encapsulation.Challenge10_Printer;

public class Printer {
    private int tonerLevel;
    private int printedPages;
    private int duplexPage;

    public Printer(int tonerLevel, int printedPages, int duplexPage) {
        if (this.tonerLevel > -1 && this.tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.printedPages = printedPages;
        this.duplexPage = duplexPage;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public int getDuplexPage() {
        return duplexPage;
    }

    public void fillUpToner(int fill) {
        if (this.tonerLevel + fill >= 100) {
            this.tonerLevel = 100;
        } else {
            this.tonerLevel += fill;
        }
    }

    public void printedPages() {
        System.out.println(this.printedPages);
    }

    public void printPage() {
        if (this.tonerLevel <= 0) {
            System.out.println("Can't print a page, toner is empty, please fill it up");
        } else {
            System.out.println("I printing a page");
            this.printedPages += 1;
            this.tonerLevel -= 1;
        }
    }

    public void printDuplexPage() {
        if (this.tonerLevel <= 0) {
            System.out.println("Can't print a page, toner is empty, please fill it up");

        } else {
            System.out.println("I printing a duplex page");
            if (this.tonerLevel < 0) {
                System.out.println("Can't print a page, toner is empty, please fill it up");
            } else {
                this.tonerLevel -= 2;
            }
        }
    }
}
