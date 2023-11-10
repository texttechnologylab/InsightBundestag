package org.texttechnologylab.project.data;

import java.sql.Date;
import java.util.Set;

public interface Wahlperiode extends BundestagObject {

    int getNumber();
    Date getStartDate();
    Date getEndDate();
    Set<Mandat> listMandate();
    Set<Mandat> listMandate(Types.MANDAT pType);

}
