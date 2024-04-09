import java.io.*;
import java.util.Scanner;

 public class Client {

    public static void main(String[] args) throws IOException {

        //identify data file
        File mycsv = new File("data.csv");

        //open file (read mode)
        Scanner file = new Scanner(mycsv);

        // read header info (line one)
        String header = file.nextLine();
        String[] labels = header.split(" , ");

        //for lines 2 and beyond (loop over whole file) read in data and create an object based
        file.hasNext(); // return true if there is more  data to scan in, otherwise false
        String line = file.nextLine();
        //add all objects to an arraylist at the end
        //newRecord(dataLine[i])

        //make objects of the code = file.nextLine();
        String[] dataLine = line.split(",");


        for(String data : dataLine){
            System.out.print(data + " ");
        }



    }






 }
