package org.texttechnologylab.project.data;

import java.util.Set;

/**
 *
 */
public interface Wahlkreis extends BundestagObject {

    int getNumber();

    Set<Mandat> getMandate();

}
