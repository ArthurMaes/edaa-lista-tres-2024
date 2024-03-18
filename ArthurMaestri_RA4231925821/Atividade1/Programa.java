import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Programa {
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<>();
        String[] nomes = { "Isadora Rodrigues", "Arthur Maestri", "Augusto Fabio",
                "Breno Vinicius", "Vinícius Raphael",
                "César Augusto", "Daniela Teixeira", "Eduardo Jose", "Emerson Vinicios",
                "Felipe dos Santos",
                "Gabriel Felipe", "Pedro Castro", "Pedro Rodrigues", "Gabriel Silva",
                "Henrique Cezar",
                "Isadora Ribeiro", "João Reberth", "Lucas Alves", "Lucas Ferreira",
                "Marcus Paulo",
                "Maria Clara", "André Luiz", "Diogo Freitas", "Matheus Felipe", "Nátali Isaltino",
                "Paulo Vítor", "Rogério Lopes", "Thiago Luis", "Víctor Henrique",
                "Vinicius Garcia",
                "Vinícius Paiva", "Wesley Carvalho", "Weslley Ferreira", "Caio Alves",
                "Lucas Marques",
                "Marcela Maria" };

        Random random = new Random();

        
        for(String nome : nomes) {
            int idade = random.nextInt(60); 
            listaPessoas.add(new Pessoa(nome, idade));
        }

        
        Collections.sort(listaPessoas);

        
        for(Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa);
        }
    }
}