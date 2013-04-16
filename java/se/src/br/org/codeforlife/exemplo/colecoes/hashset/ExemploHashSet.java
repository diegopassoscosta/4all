/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.exemplo.colecoes.hashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author lab01
 */
public class ExemploHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> mhs = new HashSet(3);
        mhs.add("1");
        mhs.add("2");
        mhs.add("3");
        mhs.remove("2");
        Iterator i = mhs.iterator();
        for (String string : mhs) {
            System.out.println(string);
        }
        
        
        
    }
}
