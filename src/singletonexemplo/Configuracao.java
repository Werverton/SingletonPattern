package singletonexemplo;


import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author werve
 */
public class Configuracao {
    
    private static Configuracao instance;//declara variável estática Configuração
    private final String timezone;
    private final String currencycode;
    
    private Configuracao(){//cria o construtor privado e nesse construtor as configurações são carregadas
        
        
        this.timezone = "America/Sao_Paulo";
        this.currencycode = "BRL";
    }
    
    public static Configuracao getInstance(){//cria o método estático que vai retornar uma instancia da classe.
        if(Configuracao.instance == null){//se instance for null 
            Configuracao.instance = new Configuracao();//uma nova instance é criada
        }
        return Configuracao.instance;//retorna a instance
    }
    
   
    public String getTimezone() {
        return timezone;
    }

    public String getCurrencycode() {
        return currencycode;
    }
    
    
}
