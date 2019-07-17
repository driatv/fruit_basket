package com.packt.driatv;

public class Fruit {
    private String name;
    private int quantity;
    private double price;
    private int total;
    private int numberToPay;

    public Fruit(String name, int quantity, double price, int total, int numberToPay) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.numberToPay = numberToPay;
    }

    public static Fruit build(String[] a) throws NumberFormatException, ArrayIndexOutOfBoundsException {
        try {
            return new Fruit(a[0],
                    Integer.parseInt(a[1]),
                    Double.parseDouble(a[2]),
                    Integer.parseInt(a[3]),
                    Integer.parseInt(a[4]));
        } catch (NumberFormatException e) {
            throw new NumberFormatException("One of the fruit arguments (quantity/price/total/number_to_pay) is not a valid number \n" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Number of arguments does not match for at least one of the line \n" + e);
        }
    }

    @Override
    public String toString() {
        return "Fruit name=" + name + ", quantity=" + quantity + ", price="
                + price + ", total=" + total + ", number to pay = " + numberToPay;
    }

    public Double getPriceWithReduction() {
        double priceReduc;
        if (total > 1) {
            priceReduc = (quantity - (quantity / total) * (total - numberToPay)) * price;
        } else {
            priceReduc = quantity * price;
        }
        // + this.quantity % total * this.price;
        return priceReduc;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
