/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmemorama.Hilo;

import javax.swing.JLabel;

/**
 *
 * @author victor
 */
public class Cronometro extends Thread{
    private JLabel cronometro;
    public Cronometro(JLabel cronometro){
        this.cronometro = cronometro;
    }
    public void run(){
        Integer minutos = 0 , segundos = 0, milesimas = 0;
        String min="", seg="", mil="";
        try{
            while(true) {
                Thread.sleep( 4 );
                milesimas += 4;
                if( milesimas == 1000 )  {
                    milesimas = 0;
                    segundos += 1;
                    if( segundos == 60 ) {
                        segundos = 0;
                        minutos++;
                    }
                }
                if( minutos < 10 ) min = "0" + minutos;
                else min = minutos.toString();
                if( segundos < 10 ) seg = "0" + segundos;
                else seg = segundos.toString();

                if( milesimas < 10 ) mil = "00" + milesimas;
                else if( milesimas < 100 ) mil = "0" + milesimas;
                else mil = milesimas.toString();
                cronometro.setText( min + ":" + seg + ":" + mil );
            }
        }catch(Exception e){}
        cronometro.setText( "00:00:00" );
    }
}
