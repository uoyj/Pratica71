import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.JogadorComparator;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica71 {
    public static void main(String[] args) {
        List<Jogador> lista = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int qtd, num;
        String nome;
        
        System.out.println("Quantos jogadores?");
        if(sc.hasNextInt()) qtd = sc.nextInt();
        else
        {
            qtd = 0;
            sc.next();
        }
        
        if(qtd == 0) lista.add(new Jogador(0, "Vazio"));
        
        for(Integer i=0; i<qtd; i++)
        {
            System.out.println("Num: ");
            if(sc.hasNextInt())
            {               
                num = sc.nextInt();
                System.out.println("Nome: ");
                nome = sc.next();
                lista.add(new Jogador(num, nome));
            }
            else
            {
                System.out.println("String");
                num = 0;
                nome = "Vazio";
                sc.next();
                lista.add(new Jogador(num, nome));
            }
            
        }      
        
        Collections.sort(lista, new JogadorComparator(true, true, true));

        for(Jogador j : lista)
            System.out.println(j.toString());
        
        Integer i = 0;

        while(true)
        {
            System.out.println("Num: ");
            if(sc.hasNextInt())
            {
                num = sc.nextInt();
                if(num == 0) break;
                else
                {
                    System.out.println("Nome: ");
                    nome = sc.next();
                    lista.add(new Jogador(num, nome));
                }
            }
            else
            {
                System.out.println("String");
                num = 0;
                nome = "Vazio";
                sc.next();
                lista.add(new Jogador(num, nome));
            }
            
            Collections.sort(lista, new JogadorComparator(true, true, true));
            
            for(Jogador j : lista)
                System.out.println(j.toString());
            
            i++;
        }
        
    }
        
 }

