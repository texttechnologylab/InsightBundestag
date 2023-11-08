package org.texttechnologylab.project.data;

import java.util.Set;

public interface Fraktion extends BundestagObject{

    public Set<Abgeordneter> getMembers();
    public void addMember(Abgeordneter pObject);
    public void addMembers(Set<Abgeordneter> pObjects);
    public void addMembers(Abgeordneter... pObjects);

    public void removeMember(Abgeordneter pObject);
    public void removeMembers(Set<Abgeordneter> pObjects);
    public void removeMembers(Abgeordneter... pObjects);

}
