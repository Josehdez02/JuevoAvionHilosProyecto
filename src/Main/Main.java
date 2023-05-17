package Main;

import controlador.ControladorJuego;
import modelo.BalaEnemiga;
import modelo.BalaNave;
import vista.VentanaJuego;

public class Main {
    public static void main(String[] args) {
        VentanaJuego v1=new VentanaJuego();
        BalaEnemiga bE = new BalaEnemiga(v1);
        bE.start();
        ControladorJuego c1=new ControladorJuego(v1);


    }
}
