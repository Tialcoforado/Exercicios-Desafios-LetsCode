package desafio2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Feriados {
    public Set<LocalDate> getFeriadosMoveis(int year) {
        Set<LocalDate> dates = new HashSet<>();
    
        LocalDate pascoa;
        LocalDate carnaval;
        LocalDate corpusChristi;
        LocalDate sextaFeiraSanta;
    
        int a = year % 19;
        int b = year / 100;
        int c = year % 100;
        int d = b / 4;
        int e = b % 4;
        int f = (b + 8) / 25;
        int g = (b - f + 1) / 3;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * l) / 451;
        int month = (h + l - 7 * m + 114) / 31;
        int day = ((h + l - 7 * m + 114) % 31) + 1;
    
        pascoa = LocalDate.of(year, month, day);
    
        // Carnaval 47 dias antes da pascoa (sempre cai na terça)
        carnaval = pascoa.minusDays(47);
    
        // CorpusChristi 60 dias apos a pascoa
        corpusChristi = pascoa.plusDays(60);
    
        sextaFeiraSanta = pascoa.minusDays(2);
    
        // páscoa cai sempre no domingo, entao não precisaria adicionar como feriado
        // dates.add(pascoa);
    
        // carnaval: adicionar um dia antes e depois (emenda de segunda e quarta-feira de cinzas)
        dates.add(carnaval);
        dates.add(carnaval.minusDays(1)); // emenda a segunda-feira
        dates.add(carnaval.plusDays(1)); // quarta-feira de cinzas
    
        // corpus christi, emendar (adicionar a sexta)
        dates.add(corpusChristi);
        // if apenas para confirmar se é quinta-feira
        if (corpusChristi.getDayOfWeek() == DayOfWeek.THURSDAY) {
            dates.add(corpusChristi.plusDays(1)); // adicionar a sexta-feira
        }
    
        dates.add(sextaFeiraSanta);
    
        return dates;
    }
}
