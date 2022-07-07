/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucasmarins.aberturadearquivo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author lucas
 */
public class AberturadeArquivo {
    public static void main(String[] args) {
        Path path = Paths.get("doc.txt");
        byte[] bytes = "Jongas".getBytes(StandardCharsets.UTF_8);
 
        try {
            Files.write(path, bytes);    // Java 7+ only
            System.out.println("Successfully written data to the file");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
