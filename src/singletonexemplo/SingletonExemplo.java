/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonexemplo;

/**
 *
 * @author werve
 */
public class SingletonExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configuracao configuracao = Configuracao.getInstance();//chama o método getinstance q recupera a instancia e armazena sua referencia na variavel configuração
        System.out.println(configuracao.getTimezone());//imprime os valores
        System.out.println(configuracao.getCurrencycode());
    }
    
}
