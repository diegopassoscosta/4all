/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.exemplo.folhadeponto;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lab01
 */
public class FolhaDePonto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
       
            File f1 = new File("teste.html");    
            URL url = FolhaDePonto.class.getResource("teste.html");
            System.out.println("URL: " + f1.toURI().toURL());
            System.out.println("URI: " + f1.toURI());
            System.out.println("existe?: " + f1.exists());
            System.out.println();
            System.out.println("URL: " + url);
            System.out.println();
            File f2 = new File(url.toURI()); 
            System.out.println("URL: " + f2.toURI().toURL());
            System.out.println("URI: " + f2.toURI());
            System.out.println("existe?: " + f2.exists());
            System.out.println();
    }
}
