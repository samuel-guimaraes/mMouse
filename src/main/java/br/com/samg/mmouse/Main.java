package br.com.samg.mmouse;

import br.com.samg.mmouse.gui.Application;
import java.net.UnknownHostException;

/**
 * Classe de execução da aplicação.
 */
public class Main {

    public static void main(String[] args) throws UnknownHostException {
        Application mainFrame = new Application();
        mainFrame.setVisible(true);
    }
}
