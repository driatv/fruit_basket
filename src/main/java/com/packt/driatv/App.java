package com.packt.driatv;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) throws Exception {
        List<String> fileLines = getFileContent("input.txt");

        if (fileLines.size() > 1) {
            List<Fruit> listFruits = mapFile(fileLines);
            sendDataToUser(listFruits);
        } else {
            throw new Exception("File must contains at least a line with column definitions and another with a fruit description !");
        }
    }

    public static void sendDataToUser(List<Fruit> listFruits) {
        double totalPrice = 0;
        System.out.println("\n");
        for (Fruit fruit : listFruits) {
            totalPrice += fruit.getPriceWithReduction();
            System.out.println(fruit.toString() + "\n--> Total price after offers = " + fruit.getPriceWithReduction() + " euros\n");
        }
        System.out.println("--> Total price for all the differents fruits = " + totalPrice + " euros");
    }

    public static List<Fruit> mapFile(List<String> fileLines) {
        fileLines.remove(0);
        return fileLines.stream()
                .map(line -> line.replaceAll(" ", "").split("\\|"))
                .map(Fruit::build)
                .collect(Collectors.toList());
    }

    public static List<String> getFileContent(String fileName) throws Exception {
        InputStream in = App.class.getResourceAsStream("/input.txt");

        //URL resource = classLoader.getResource(fileName);
        if (in == null) {
            throw new IllegalArgumentException("File not found!");
        } else {
             return new ArrayList(Arrays.asList(readString(in).split("\r\n")));
        }
    }

    public static String readString(InputStream inputStream) throws IOException {
        ByteArrayOutputStream into = new ByteArrayOutputStream();
        byte[] buf = new byte[4096];
        for (int n; 0 < (n = inputStream.read(buf));) {
            into.write(buf, 0, n);
        }
        into.close();
        return new String(into.toByteArray(), "UTF-8"); // Or whatever encoding
    }
}
