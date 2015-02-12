import java.util.List;
import java.util.Scanner;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.JogadorComparator;
import utfpr.ct.dainf.if62c.pratica.Time;

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
        Time time = new Time();
        Scanner sc = new Scanner(System.in);
        int qtd, num;
        String nome;
        
        System.out.println("Quantos jogadores?");
        if(sc.hasNextInt()) qtd = sc.nextInt();
        else qtd = 0;
        
        for(Integer i=0; i<qtd; i++)
        {
            if(sc.hasNextInt())
            {
                num = sc.nextInt();
                nome = sc.next();
            }
            else
            {
                num = 0;
                nome = "Vazio";
            }
            time.addJogador(i.toString(), new Jogador(num, nome));
        }
        
        /*String format = "%-20s %-20s";
        System.out.println(String.format(format, "Posição", "Time 1"));
        for (String posicao: time.getJogadores().keySet()) {
            Jogador j1 = time.getJogadores().get(posicao);
            System.out.println(String.format(format, posicao, j1));
        }*/
        
        List<Jogador> lista = time.ordena(new JogadorComparator(true, true, false));
        
        for(Jogador j : lista)
        {
            System.out.println(j.toString());
        }
            
        
    }
        
 }

