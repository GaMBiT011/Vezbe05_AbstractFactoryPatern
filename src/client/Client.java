/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.swing.JFrame;
import javax.swing.JPanel;
import view.FrmPersonView;
import view.factory.PersonViewFactory;

/**
 *
 * @author Nikola
 */
public class Client {

    PersonViewFactory personViewFactory;
    JFrame main;
    JPanel panel;

    public Client(PersonViewFactory personViewFactory) {
        this.personViewFactory = personViewFactory;
    }

    public void kreiraj() {
        main = new JFrame();
        panel = new FrmPersonView();
        main.add(panel);
        main.pack();
        main.setVisible(true);
    }
}
