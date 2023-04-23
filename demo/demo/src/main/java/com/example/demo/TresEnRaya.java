package com.example.demo;

import ch.qos.logback.core.net.SyslogOutputStream;

public class TresEnRaya
{
    private Character[][] tablero = {{'0', '0', '0'},
                                     {'0', '0', '0'},
                                     {'0', '0', '0'}};
    private  char ultimoJugador = '+';
    public String jugar(int x, int y) throws Exception
    {

        verificarEje(x);
        verificarEje(y);

        ultimoJugador=siguienteTurno();
        Asignar(x, y);
for (int i = 0; i<3 ; i++){
if (tablero[0][i] ==ultimoJugador && tablero[1][i] ==ultimoJugador && tablero[2][i] ==ultimoJugador ){

    return ultimoJugador + " es el ganador";
}


}
return "no hay ganador aun";


    }

    private void Asignar(int x, int y) throws Exception {
        if (tablero[x -1][y - 1] != '0')
        {
            throw new Exception(" esta ocupada");
        }
        else {
            tablero[x -1][y - 1] = ultimoJugador;
            System.out.println("Asignando posicion:" + x +"," + y);
            System.out.println("\n" +tablero[0][0]);
        }
    }

    public void verificarEje(int eje) throws Exception{
        if (eje>3||eje<1)
        {
            throw new Exception("La coordenada "+eje+" esta fuera");
        }
    }

    public char siguienteTurno(){
        if (ultimoJugador=='X'){
            return '+';
        }
        else {
            return 'X';
        }


    }







}
