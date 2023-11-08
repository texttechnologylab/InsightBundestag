package org.texttechnologylab.project.data;

import java.sql.Date;

/**
 *
 * @author Giuseppe Abrami
 */
public interface Mandat extends BundestagObject{

    public Abgeordneter getAbgeordneter();
    public Date fromDate();
    public Date toDate();

    public Fraktion getFraktion();

    public Types.MANDAT getTyp();



}
