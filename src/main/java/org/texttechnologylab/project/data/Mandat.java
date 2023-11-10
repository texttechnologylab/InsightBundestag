package org.texttechnologylab.project.data;

import java.sql.Date;
import java.util.Set;

/**
 *
 * @author Giuseppe Abrami
 */
public interface Mandat extends BundestagObject{

    public Abgeordneter getAbgeordneter();

    public Date fromDate();

    public Date toDate();

    public Set<Fraktion> getFraktionen();

    public Set<Ausschuss> listAusschuesse();

    public Set<Mitgliedschaft> listMitgliedschaft();

    public Set<Mitgliedschaft> listMitgliedschaft(Gruppe pGruppe);

    public Types.MANDAT getTyp();

    public Wahlperiode getWahlperiode();


}
