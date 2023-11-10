package org.texttechnologylab.project.helper.impl;

import org.texttechnologylab.project.data.*;
import org.texttechnologylab.project.helper.BundestagFactory;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class BundestagFactoryImpl implements BundestagFactory {

    protected Set<Abgeordneter> abgeordnetenSet= new HashSet<>(0);

    public BundestagFactoryImpl(Set<Abgeordneter> abgeordnetenSet){
            this.abgeordnetenSet = abgeordnetenSet;
    }

    @Override
    public Set<Abgeordneter> listAbgeordnete() {
        return this.abgeordnetenSet;
    }

    @Override
    public Set<Abstimmung> listAbstimmungen() {
        Set<Abstimmung> rSet = new HashSet<>(0);
        listAbgeordnete().stream().forEach(a->{
            rSet.addAll(a.listAbstimmungen());
        });
        return rSet;
    }

    @Override
    public Set<Ausschuss> listAusschuesse() {
        Set<Ausschuss> pSet = new HashSet<>(0);

            pSet.addAll((Collection<? extends Ausschuss>) listGruppen().stream().filter(g->{
                return g instanceof Ausschuss;
            }).collect(Collectors.toList()));

        return pSet;
    }

    @Override
    public Set<Fraktion> listFraktionen() {
        Set<Fraktion> rSet = new HashSet<>(0);
        listAbgeordnete().stream().forEach(a->{
            a.listMandate().stream().forEach(m->{
                rSet.addAll(m.getFraktionen());
            });

        });
        return rSet;
    }

    @Override
    public Set<Gruppe> listGruppen() {
        Set<Gruppe> pSet = new HashSet<>(0);

        listAbgeordnete().stream().forEach(a->{
            a.listMitgliedschaften().stream().forEach(m->{
                pSet.add(m.getGruppe());
            });
        });

        return pSet;
    }

    @Override
    public Set<Mandat> listMandate() {
        Set<Mandat> rSet = new HashSet<>(0);
            listAbgeordnete().forEach(a->{
                rSet.addAll(a.listMandate());
            });
        return rSet;
    }

    @Override
    public Set<Partei> listParteien() {
        Set<Partei> rSet = new HashSet<>(0);
        this.listMandate().forEach(m->{
            rSet.add(m.getAbgeordneter().getPartei());
        });
        return rSet;
    }

    @Override
    public Set<Wahlkreis> listWahlkreise() {
        Set<Wahlkreis> rSet = new HashSet<>(0);
        listMandate().stream().forEach(m->{
            if(m.getWahlkreis()!=null){
                rSet.add(m.getWahlkreis());
            }
        });
        return rSet;
    }

    @Override
    public Set<Wahlperiode> listWahlperiode() {
        return listMandate().stream().map(m->m.getWahlperiode()).collect(Collectors.toSet());
    }

    @Override
    public Set<Mitgliedschaft> listMitgliedschaften() {
        Set<Mitgliedschaft> rSet = new HashSet<>();
            this.abgeordnetenSet.stream().forEach(m->{
                rSet.addAll(m.listMitgliedschaften());
            });
        return rSet;
    }
}
