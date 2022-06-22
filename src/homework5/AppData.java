package homework5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppData {

    public static void main(String[] args) {
        String[] headers = {"value1", "value2", "value3"};
        int[][] data = {
                {100,200,123},
                {300,400,500},
                {500,1000,1504}
        };
        write(headers, data, ';', new File("src/homework5/data.csv"));

        List<String[]>dataArray = read(new File("src/homework5/data.csv"),';');
        print(dataArray);
    }

    private static void write(String[] headers, int[][] data, char separator, File file) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))){
            writerStr(headers, separator, out);
            for (int[] intStr : data) {
                String[] str = Arrays.stream(intStr).mapToObj(Integer::toString).toArray(String[]::new);
                writerStr(str, separator, out);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writerStr(String[] str, char separator, Writer writer) throws IOException {
        for (int i = 0; i < str.length; i++) {
            writer.write(str[i]);
            if(i != str.length - 1) {
                writer.write(separator);
            }
        }
        writer.write("\n");
    }

    public static List<String[]> read(File file, char separator) {
        ArrayList<String[]> dataArray = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(file))){
            String str;
            while ((str = in.readLine()) != null) {
                dataArray.add(str.split(((Character) separator).toString()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataArray;
    }
    public static void print(List<String[]> array) {
        for (String[] str : array) {
            for (String cell : str) {
                System.out.printf("[%s]",cell);
            }
            System.out.println();
        }
    }
}
