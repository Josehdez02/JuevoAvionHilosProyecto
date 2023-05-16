package Main;

import controlador.ControladorJuego;
import modelo.BalaEnemiga;
import modelo.BalaNave;
import vista.VentanaJuego;

public class Main {
    public static void main(String[] args) {
        VentanaJuego v1=new VentanaJuego();
        ControladorJuego c1=new ControladorJuego(v1);
        c1.balaEne();

    }
}
