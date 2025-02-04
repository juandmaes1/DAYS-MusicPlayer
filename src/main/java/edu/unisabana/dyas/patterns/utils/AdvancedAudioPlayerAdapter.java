package edu.unisabana.dyas.patterns.utils;

public class AdvancedAudioPlayerAdapter implements AudioPlayer {
    private AdvancedAudioPlayer advancedPlayer;

    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedPlayer) {
        this.advancedPlayer = advancedPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        // Dependiendo del tipo de audio, delegamos al método correspondiente
        if(audioType.equalsIgnoreCase("mp4")) {
            advancedPlayer.playMp4(fileName);
        } else if(audioType.equalsIgnoreCase("vlc")) {
            advancedPlayer.playVlc(fileName);
        } else {
            System.out.println("Formato no soportado: " + audioType);
        }
    }

    @Override
    public void stop() {
        advancedPlayer.stop();
    }
}
