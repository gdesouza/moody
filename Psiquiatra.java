package com.company;

/**
 * Created by UniCesumar on 14/03/2017.
 */
public class Psiquiatra {

    public void examinar( MoodyObject paciente ) {
        System.out.println("Como você se sente hoje?\n");
        paciente.queryMood();
    }

    public void observar( HappyObject sujeitoFeliz ){
        sujeitoFeliz.laugh();
    }

    public void observar( SadObject sujeitoTriste ){
        sujeitoTriste.cry();
    }


}
