/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.orientado.over.lista01.classe.questao2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author lab01
 */
public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    /**
     * @return o dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @return o mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @return o mes por extenso
     */
    public String getMesPorExtenso() {
        String mesExtenso;
        switch (mes-1) {
            case Calendar.JANUARY:
                mesExtenso = "Janeiro";
                break;
            case Calendar.FEBRUARY:
                mesExtenso = "Fevereiro";
                break;
            case Calendar.MARCH:
                mesExtenso = "Março";
                break;
            case Calendar.APRIL:
                mesExtenso = "Abril";
                break;
            case Calendar.MAY:
                mesExtenso = "Maio";
                break;
            case Calendar.JUNE:
                mesExtenso = "Junho";
                break;
            case Calendar.JULY:
                mesExtenso = "Julho";
                break;
            case Calendar.AUGUST:
                mesExtenso = "Agosto";
                break;
            case Calendar.SEPTEMBER:
                mesExtenso = "Setembro";
                break;
            case Calendar.OCTOBER:
                mesExtenso = "Outubro";
                break;
            case Calendar.NOVEMBER:
                mesExtenso = "Novembro";
                break;
            case Calendar.DECEMBER:
                mesExtenso = "Dezembro";
                break;
            default:
                mesExtenso = "Mês Insexistente";

        }

        return mesExtenso;
    }

    public int compara(Data outraData) {

        int resultado = -66;

        if (this.ano > outraData.getAno()) {
            resultado = 1;
        } else if (this.ano < outraData.getAno()) {
            resultado = -1;
        } else if (this.ano == outraData.getAno()) {
            if (this.mes > outraData.getMes()) {
                resultado = 1;
            } else if (this.mes < outraData.getMes()) {
                resultado = -1;
            } else if (this.mes == outraData.getMes()) {
                if (this.dia > outraData.getDia()) {
                    resultado = 1;
                } else if (this.dia < outraData.getDia()) {
                    resultado = -1;
                } else {
                    resultado = 0;
                }
            }
        }
        return resultado;
    }

    public boolean isBissexto() {     
       return new GregorianCalendar().isLeapYear(ano);
    }

    /**
     * @return o ano
     */
    public int getAno() {
        return ano;
    }
}
