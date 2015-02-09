
import java.util.List;
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
public class Pratica62 {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time();
        
        
        time1.addJogador("Lateral", new Jogador(4, "Ciclano"));
        time1.addJogador("Goleiro", new Jogador(1, "Fulano"));
        time1.addJogador("Atacante", new Jogador(10, "Beltrano"));

        time2.addJogador("Atacante", new Jogador(15, "Mário"));
        time2.addJogador("Goleiro", new Jogador(1, "João"));
        time2.addJogador("Lateral", new Jogador(7, "José"));

        String format = "%-20s %-20s %-20s";
        System.out.println(String.format(format, "Posição", "Time 1", "Time 2"));
        for (String posicao: time1.getJogadores().keySet()) {
            Jogador j1 = time1.getJogadores().get(posicao);
            Jogador j2 = time2.getJogadores().get(posicao);
            System.out.println(String.format(format, posicao, j1, j2));
        }
        
        List<Jogador> lista = time1.ordena(new JogadorComparator(true, true, false));
        
        for(Jogador j : lista)
        {
            System.out.println(j.toString());
        }
            
        
    }
        
 }

