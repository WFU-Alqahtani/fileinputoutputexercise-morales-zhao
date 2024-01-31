import java.io.*;
import java.util.Scanner;

public class FileInputOutput {

    public static void main(String[] args) throws FileNotFoundException {
        /*FileInputStream myfile = null;
        try{
            myfile = new FileInputStream("src/moviesDataset.csv");
        }catch(FileNotFoundException e){
            System.out.println("Could not open file");
            System.exit(1);
        }
        Scanner fileReader = new Scanner(myfile);
        while(fileReader.hasNextLine()){
            String data = fileReader.nextLine();
            System.out.println(data);
        }
        fileReader.close();
        FileInputStream myfile2 = null;
        try{
            myfile2 = new FileInputStream("src/moviesDataset.csv");
        }catch(FileNotFoundException e){
            System.out.println("Could not open file");
            System.exit(1);
        }
        fileReader = new Scanner(myfile2);
        while (fileReader.hasNextLine()) {
            String data = fileReader.nextLine();
            String[] arr = data.split(",");
            System.out.println(arr[2]);
        }
        fileReader.close();
         */
        FileInputStream myfileRead = null;
        FileOutputStream myFile = new FileOutputStream("YearMade.txt");
        PrintWriter fileWriter = new PrintWriter(myFile);
        try {
            myfileRead = new FileInputStream("src/moviesDataset.csv");
        } catch (FileNotFoundException e) {
            System.out.println("Could not open file");
            System.exit(1);
        }
        Scanner fileReader = new Scanner(myfileRead);
        int year;
        if (fileReader.hasNextLine()) {
            fileReader.nextLine();
        }//set the scanner to read from a file
        while (fileReader.hasNextLine()) {
            String data = fileReader.nextLine(); //reading lines line by line in data
            String[] arr = data.split(",");
            try{
                    year = Integer.parseInt(arr[4]);
                    fileWriter.println(year);

            } catch (NumberFormatException e) {
                fileWriter.println("N/A");
            }
        }
        fileWriter.close();
        }

    }
//       1) Open the given file inside src called moviesDataSet.csv
        FileInputStream myFile = null;
        try {
            myFile = new FileInputStream("src/moviesDataset.csv");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
            System.exit(1);
        }
        Scanner fileReader = new Scanner(myFile);

        while(fileReader.hasNextLine()) {
            String data = fileReader.nextLine();
            System.out.println(data);
        }

        // 2nd file read
        FileInputStream myFile2 = null;
        try {
            myFile2 = new FileInputStream("src/moviesDataset.csv");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
            System.exit(1);
        }

        fileReader = new Scanner(myFile2);

        while(fileReader.hasNextLine()) {
            String data = fileReader.nextLine();
            String[] arr = data.split(",");
            System.out.println(arr[2]);
        }

        fileReader.close();
//       2) Read each row in the dataset
//       3) Print each row to the screen
//       4) Print only the name of the movie
//       5) Add exception handling (try & catch) when needed
//       6) Close the files after finishing the processing
//       7) Commit your code and push it to the GitHub


