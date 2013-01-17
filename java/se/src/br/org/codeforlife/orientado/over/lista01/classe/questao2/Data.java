/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.orientado.over.lista01.classe.questao2;

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
        switch (mes) {
            case 1:
                mesExtenso = "Janeiro";
                break;
            case 2:
                mesExtenso = "Fevereiro";
                break;
            case 3:
                mesExtenso = "Março";
                break;
            case 4:
                mesExtenso = "Abril";
                break;
            case 5:
                mesExtenso = "Maio";
                break;
            case 6:
                mesExtenso = "Junho";
                break;
            case 7:
                mesExtenso = "Julho";
                break;
            case 8:
                mesExtenso = "Agosto";
                break;
            case 9:
                mesExtenso = "Setembro";
                break;
            case 10:
                mesExtenso = "Outubro";
                break;
            case 11:
                mesExtenso = "Novembro";
                break;
            case 12:
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
        boolean retorno = false;
        
        if (this.ano % 4 != 0) {
            retorno = false;
        }
        return true;
    }

    /**
     * @return o ano
     */
    public int getAno() {
        return ano;
    }
}
