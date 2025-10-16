/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lekce10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author ali.yunussov.s
 */
public class Mnozina {
    public static void main(String[] args) {
        Zak a = new Zak("Alice");
        Zak a2 = new Zak("Alice");
        Zak b = new Zak("Bob");
        Zak c = new Zak("Charlie");
        Zak d = new Zak("Demeter");
        Zak e = new Zak("Emil");
        
//        List<Zak> vylet = new ArrayList<>();
        Set<Zak> vylet = new HashSet<>();
        Collection<Zak> vsichni = Arrays.asList(a,a2,b,c,d,e);
        Set<Zak> nevylet = new HashSet<>(vsichni);
        
        List<Zak> ostrava = new ArrayList<>();
        ostrava.add(a);
        ostrava.add(b);
        ostrava.add(c);
        
        List<Zak> kladno = Arrays.asList(a, d);
        
        for (Zak z : ostrava) {
            vylet.add(z);
            nevylet.remove(z);
        }
        for (Zak z : kladno) {
            vylet.add(z);
            nevylet.remove(z);
        }
        System.out.println(vylet);
        System.out.println(nevylet);
        System.out.println(vylet.contains(a));
        System.out.println(vylet.contains(e));
        
//        for (Zak z :vylet) {
//            if (z.toString().length() > 3) {
//                vylet.remove(z);
//            }
//        }
        
        Iterator<Zak> it = vylet.iterator();
        while (it.hasNext()) {
            Zak z = it.next();
            if (z.toString().length() > 3) {
                it.remove();
            }
            System.out.println(z);
        }
    }
}

class Zak {
    private final String jmeno;

    public Zak(String jmeno) {
        this.jmeno = jmeno;
    }

    @Override
    public String toString() {
        return jmeno;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.jmeno);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Zak other = (Zak) obj;
        if (!Objects.equals(this.jmeno, other.jmeno)) {
            return false;
        }
        return true;
    }
} 