/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.exemplo.sintaxe.arraylist1;

import java.util.ArrayList;

/**
 *
 * @author Diego Passos Costa
 */
public class ArrayListItens {

    public static void main(String args[]) {
        Item i1 = new Item(12, "espada");
        Item i2 = new Item(11, "cajado");
        Item i3 = new Item(9, "vaca");

        ArrayList<Item> al = new ArrayList();

        al.add(i1);
        al.add(i2);
        al.add(i3);
        for (Item item : al) {
            System.out.println(item.getNome());
        }
    }
}
