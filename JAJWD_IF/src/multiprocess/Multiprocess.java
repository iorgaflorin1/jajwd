/*
 * This java program starts another java program with parameters.
    java SayHello 2 Gheorghe Florin
 */
package multiprocess;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * * This java program starts another java program with parameters.
    java SayHello 2 Gheorghe Florin
 * @author gheor
 */
public class Multiprocess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                try {
            ProcessBuilder pb;
            // Use process builder to start 2 processes multithreading.SayHello with parameter
            pb= new ProcessBuilder(
                    "java",
                    "-classpath",
                    "C:\\Users\\gheor\\OneDrive\\MyDocumen\\NetBeansProjects\\JAJWD_IF\\build\\classes",
                    "multiprocess.SayHello.class",
                    "2", "Gheorghe", "Florin");
            Map<String, String> env = pb.environment();
            env.put("TEXT_CONGRATS", "Felicitari pentru lansarea procesului! ");
            //env.remove("OTHERVAR");
            env.put("TEXT_HI", "Salut ");
            pb.directory(new File("C:\\Users\\gheor\\OneDrive\\MyDocumen\\NetBeansProjects\\JAJWD_IF\\build\\classes\\multiprocess"));
            Process p1 = pb.start();
        } catch (IOException ex) {
            Logger.getLogger(Multiprocess.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
        }
    }
}
