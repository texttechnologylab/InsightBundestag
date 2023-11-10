package org.texttechnologylab.project.data;

import java.sql.Date;
import java.util.Set;

public interface Abgeordneter extends BundestagObject{

    public String getName();
    public String getVorname();
    public String getOrtszusatz();
    public String getAdelssuffix();
    public String getAnrede();
    public String getAkadTitel();
    public Date getGeburtsDatum();
    public String getGeburtsOrt();
    public Date getSterbeDatum() throws NullPointerException;
    public Types.GESCHLECHT getGeschlecht();
    public String getReligion();
    public String getBeruf();
    public String getVita() throws NullPointerException;

    public Set<Mandat> listMandate();

    public Set<Mandat> listMandate(Wahlperiode pValue);

    boolean hasMandat(Wahlperiode pValue);

    public Set<Mitgliedschaft> listMitgliedschaften();
    public Set<Mitgliedschaft> listMitgliedschaften(Wahlperiode pValue);

    public Set<Abstimmung> listAbstimmungen();

    public Set<Abstimmung> listAbstimmungen(Wahlperiode pValue);

    public Set<Abstimmung> listAbstimmungen(Wahlperiode pValue, Types.ABSTIMMUNG pType);

    public Partei getPartei();
}
