package org.texttechnologylab.project.data;

import java.util.Set;

/**
 * Interface einer Gruppe
 *
 * @author Giuseppe Abrami
 */
public interface Gruppe extends BundestagObject{

    Set<Abgeordneter> getMembers();


}
