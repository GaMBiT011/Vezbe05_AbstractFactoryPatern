/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import client.Client;
import javax.swing.JFrame;
import javax.swing.JPanel;
import view.FrmPerson;
import view.FrmPersonView;
import view.FrmPersonv2;
import view.FrmPersonv4;
import view.factory.PersonViewFactory;
import view.factory.impl.AdvancedPersonViewFactory;
import view.formPersonv3;

/**
 *
 * @author student1
 */
public class Main {

    public static void main(String[] args) {
        Client client;
        PersonViewFactory personViewFactory = new AdvancedPersonViewFactory();
        client = new Client(personViewFactory);
        client.kreiraj();
    }
}
