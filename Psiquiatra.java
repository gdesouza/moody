package com.company;

/**
 * Created by UniCesumar on 14/03/2017.
 */
public class Psiquiatra {

    /**
     * Este método implementa o polimorfismo de inclusão.
     * Recebe como parâmetro um objeto da classe MoodyObject, que é 
     * a classe base. Também pode ser chamado usando classes derivadas,
     * e nesse caso o método vai adotar o comportamento da classe derivada.
     */
    public void examinar( MoodyObject paciente ) {
        System.out.println("Como você se sente hoje?\n");
        paciente.queryMood();
    }

    
    /**
     * 
     */
    public void observar( HappyObject sujeitoFeliz ){
        sujeitoFeliz.laugh();
    }

    public void observar( SadObject sujeitoTriste ){
        sujeitoTriste.cry();
    }


}
