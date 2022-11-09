import java.util.*;
import java.io.*;

public class Test {
    
    public static void reader(String input_folder) throws IOException{
        File theFiles = new File(input_folder);
        File[] list_of_files = theFiles.listFiles();
        //loop through the files
        for (File file : list_of_files) {
            if (file.isFile()){

                //if a file exists, get its name, find the extension, concat a "_output.txt" to it
                String filename = (file.getName());
                int position =  filename.indexOf(".");
                String output_name = filename.substring(0, position); 
                String output_file_name = output_name + "_output.txt";
                /////////System.out.println(output_file_name)

                //read in file
                Scanner input = new Scanner(input_folder + "\\" + filename);
                ArrayList<String> words = new ArrayList<>();
                while (input.hasNext()){
                    words.add(input.next());
                }
                input.close();

                //write file
                Iterator<String> iter = words.iterator();
                PrintWriter output = new PrintWriter(new FileWriter(output_file_name));
                while(iter.hasNext()){
		            output.print(iter.next()+" ");
	            }
                output.close();

                
                 
            }
        };
        
    }
    
    public static void main(String args[]) throws Exception {
        String input_folder = "C:\\Users\\jeffe\\Documents\\MSDS\\DS730\\Project 4\\Project 4\\src";
        reader(input_folder);

    }

}
