/*
 * Testing reading from a file and writing its content to another file
 */
package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Testing reading from a file and writing its content to another file
 * @author gheor
 */
public class TestReadingAndWritingInFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
             // Create a FileReader to read from a given file
             FileReader fileReader = new FileReader("C:\\Users\\gheor\\OneDrive\\Desktop\\Files\\source.txt");
             // create a FileWriter to write the information in a file
            fileWriter = new FileWriter("C:\\Users\\gheor\\OneDrive\\Desktop\\Files\\destination.txt");
            // read content fron FileReader and write it to FileWriter
            BufferedReader reader = new BufferedReader(fileReader);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            String line = reader.readLine();
            if(null != line){
                writer.write(line);
                writer.flush();
            }
        } catch (IOException ex) {
            Logger.getLogger(TestReadingAndWritingInFiles.class.getName()).log(Level.SEVERE, null, ex);
            
        } 
        finally {
            try {
                fileWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(TestReadingAndWritingInFiles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
