package com.devfrota.iphonedio.controller.architecture.data;

import com.devfrota.iphonedio.controller.architecture.model.pacplayer.Media;
import lombok.Getter;

import java.util.*;

/**
 * @author Dev Frota
 */
public class DataMusic {
    @Getter
    private List<Media> playList;
    private static final String[] songs = {
            "Codinome Beija-Flor", "Quando Bate Aquela Saudade", "Ainda Bem", "Construção",
            "Sangue Latino", "Pra Você Guardei o Amor", "Monte Castelo", "Telegrama",
            "Como Nossos Pais", "Pra Você Dar o Nome"
    };

    private static final String[] artists = {
            "Cazuza", "Rubel", "Marisa Monte", "Chico Buarque",
            "Secos & Molhados", "Nando Reis", "Legião Urbana", "Zeca Baleiro",
            "Elis Regina", "5 a Seco"
    };

    private static final int numMusics = songs.length;
    private static final int[] ids = new int[numMusics];
    private static final int[] durations = new int[numMusics];
    Random random = new Random();

    public DataMusic() {
        this.playList = new ArrayList<>();
        setAll();
    }


    void setAll() {
        setPlaylist();
    }

    void setPlaylist() {
        for (int i = 0; i < numMusics; i++) {
            ids[i] = i + 1;
            durations[i] = 150 + random.nextInt(151);
            playList.add(new Media(ids[i], songs[i], artists[i], durations[i]));
        }
    }

}
