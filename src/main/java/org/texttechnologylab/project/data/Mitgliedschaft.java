package org.texttechnologylab.project.data;

import java.sql.Date;

public interface Mitgliedschaft {

    Abgeordneter getAbgeordneter();
    String getFunktion();

    Date getFromDate();
    Date getToDate();

    boolean isActive();

    Gruppe getGruppe();

}
