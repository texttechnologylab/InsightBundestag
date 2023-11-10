package org.texttechnologylab.project.data;

public interface Abstimmung extends BundestagObject{

    Abgeordneter getAbgeordneter();

    Types.ABSTIMMUNG getErgebnis();

    String getBeschreibung();

}
