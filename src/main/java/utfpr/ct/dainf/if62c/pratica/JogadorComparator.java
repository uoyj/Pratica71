/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.Comparator;

/**
 *
 * @author Jhonatan
 */
public class JogadorComparator implements Comparator<Jogador>{
    
    private final boolean num; //por numero
    private final boolean numasc; //numero ascendente
    private final boolean nomeasc; //nome ascendente
    
    public JogadorComparator() {
        num = true;
        numasc = true;
        nomeasc = true;
    }

    public JogadorComparator(boolean op1, boolean op2, boolean op3) {
        this.num = op1;
        this.numasc = op2;
        this.nomeasc = op3;
    }
    
    private int compNome(Jogador j1, Jogador j2)
    {
        if(j1.nome.compareTo(j2.nome) > 0)
        {
            if(nomeasc) return 1;
            else return -1;
        }
        else if (j1.nome.compareTo(j2.nome) < 0)
        {
            if(nomeasc) return -1;
            else return 1;
        }
        else return 0;
    }
    
    private int compNum(Jogador j1, Jogador j2)
    {
        if(j1.compareTo(j2) > 0)
        {
            if(numasc) return 1;
            else return -1;
        }
        else if (j1.compareTo(j2) < 0)
        {
            if(numasc) return -1;
            else return 1;
        }
        else return 0;
    }

    @Override
    public int compare(Jogador j1, Jogador j2) {
        if(j1.compareTo(j2) == 0 && j1.nome.equals(j2.nome)) return 0;
        else if(num)
        {
            if(j1.compareTo(j2) == 0) return compNome(j1, j2);
            else return compNum(j1, j2);
        }
        else
        {
            if(j1.nome.equals(j2.nome)) return compNum(j1, j2);
            else return compNome(j1, j2);
        }
    }
    
    
}
