package org.texttechnologylab.project.helper;

import org.texttechnologylab.project.data.*;

import java.util.Set;

public interface BundestagFactory {

    Set<Abgeordneter> listAbgeordnete();

    Set<Abstimmung> listAbstimmungen();

    Set<Ausschuss> listAusschuesse();

    Set<Fraktion> listFraktionen();

    Set<Gruppe> listGruppen();

    Set<Mandat> listMandate();

    Set<Partei> listParteien();

    Set<Wahlkreis> listWahlkreise();

    Set<Wahlperiode> listWahlperiode();

    Set<Mitgliedschaft> listMitgliedschaften();


}
