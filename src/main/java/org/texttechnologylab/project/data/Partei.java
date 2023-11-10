package org.texttechnologylab.project.data;

import java.util.Set;

public interface Partei extends BundestagObject{

    Set<Abgeordneter> listMitglieder();

}
