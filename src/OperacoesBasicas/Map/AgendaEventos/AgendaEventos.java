package OperacoesBasicas.Map.AgendaEventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap = new HashMap<>();

    public void adicionarEvento(LocalDate data, String nomeEvento, String atracao){
        eventosMap.put(data, new Evento(nomeEvento, atracao)); // data = key
    }

    public void exibirAgenda (){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
        //quando eu uso o LocalDate isso implementa uma interface comparable/
        // o TreeMap organiza a lista usando o Localdate como parametro de organizacao para o TreeMap
    }
    public void obterProximoEvento(){
        //Set<LocalDate> dataSet = eventosMap.keySet(); // um set com todas as keys
        //Collection<Evento>  values = eventosMap.values(); // um set com todas as valores
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);//organizando de forma crescente basedo no LocalDate
        for (Map.Entry<LocalDate, Evento> entry:eventosTreeMap.entrySet()){//entry = conjunto de chave e valor. entrySet = organiza de forma cronologica. Map.Entry = cria um map
            proximaData = entry.getKey();
            proximoEvento = entry.getValue();
            if (entry.getKey().isEqual(dataAtual)||entry.getKey().isAfter(dataAtual)){ //se a data da foi passada na chave for igual o dia de hoje ou se a data for maior que o dia de hoje
                System.out.println("O proximo "+proximoEvento+"acontecera na data "+ proximaData);
                break;
            }

        }

    }
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY, 11), "Evento 2", "Geladeira Tsunami");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JANUARY, 15), "Evento 1", "Tiringa");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 27), "Evento 3", "Charles Henriquepedia");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();

    }
    /*
    * Quando você usa Map.Entry<LocalDate, Evento> entry, está criando uma "caixa" que pode conter duas coisas: uma data (LocalDate) e um evento (Evento).
    * Cada vez que você cria uma dessas caixas, está combinando uma data com um evento específico.E quando você usa eventosTreeMap.entrySet(), está organizando todas essas caixas criadas em uma estrutura chamada
    * TreeMap. O método entrySet() pega todas essas caixas (ou entradas) do TreeMap e as coloca em uma ordem especial com base nas datas (chaves), permitindo que você as acesse em ordem cronológica.
    * Então, ao combinar Map.Entry<LocalDate, Evento> entry com eventosTreeMap.entrySet(), você está criando essas caixas especiais com datas e eventos e depois as organizando em uma linha especial,
    *  prontas para serem exploradas e descobertas!
    * */
        // Se a data passada for igual o dia de hoje o progrma vai retornar a data de hoje mesmo se tiver uma data maior do que a de hoje
}
