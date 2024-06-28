/*
 * Task
 * Make an interface Media
 * make the following functions
 * void play()
 * void pause()
 * void next()
 * void previous()
 * String nowPlaying()
 * 
 * Make an interface DigitalMedia extending Media
 * make the following functions
 * double size()
 * double remaining(double current)
 * 
 * Make an interface OnlineAsset
 * make the following functions
 * void download()
 * 
 * Make a class Spotify and implement DigitalMedia and OnlineAsset
 * Make a class AppleMusic and implement DigitalMedia and OnlineAsset
 * Make one object of Spotify and one object of AppleMusic
 */ 
interface Media {
    void play();
    void pause();
    void next();
    void previous();
    String nowPlaying();
}

interface DigitalMedia extends Media {
    double size();
    double remaining(double current);
}

interface OnlineAsset {
    void download();
}

class Spotify implements DigitalMedia, OnlineAsset {
    private String currentTrack;
    private double trackSize;

    public Spotify(String currentTrack, double trackSize) {
        this.currentTrack = currentTrack;
        this.trackSize = trackSize;
    }

    @Override
    public void play() {
        System.out.println("Spotify is playing.");
    }

    @Override
    public void pause() {
        System.out.println("Spotify is paused.");
    }

    @Override
    public void next() {
        System.out.println("Spotify next track.");
    }

    @Override
    public void previous() {
        System.out.println("Spotify previous track.");
    }

    @Override
    public String nowPlaying() {
        return "Spotify is now playing: " + currentTrack;
    }

    @Override
    public double size() {
        return trackSize;
    }

    @Override
    public double remaining(double current) {
        return trackSize - current;
    }

    @Override
    public void download() {
        System.out.println("Spotify track is being downloaded.");
    }
}

class AppleMusic implements DigitalMedia, OnlineAsset {
    private String currentTrack;
    private double trackSize;

    public AppleMusic(String currentTrack, double trackSize) {
        this.currentTrack = currentTrack;
        this.trackSize = trackSize;
    }

    @Override
    public void play() {
        System.out.println("AppleMusic is playing.");
    }

    @Override
    public void pause() {
        System.out.println("AppleMusic is paused.");
    }

    @Override
    public void next() {
        System.out.println("AppleMusic next track.");
    }

    @Override
    public void previous() {
        System.out.println("AppleMusic previous track.");
    }

    @Override
    public String nowPlaying() {
        return "AppleMusic is now playing: " + currentTrack;
    }

    @Override
    public double size() {
        return trackSize;
    }

    @Override
    public double remaining(double current) {
        return trackSize - current;
    }

    @Override
    public void download() {
        System.out.println("AppleMusic track is being downloaded.");
    }
}

public class Task12 {
    public static void main(String[] args) {
        Spotify spotifyTrack = new Spotify("Track 1", 3.5);

        AppleMusic appleMusicTrack = new AppleMusic("Track A", 4.0);

        spotifyTrack.play();
        System.out.println(spotifyTrack.nowPlaying());
        spotifyTrack.pause();
        System.out.println("Track size: " + spotifyTrack.size() + " MB");
        System.out.println("Remaining size: " + spotifyTrack.remaining(1.5) + " MB");
        spotifyTrack.download();

        appleMusicTrack.play();
        System.out.println(appleMusicTrack.nowPlaying());
        appleMusicTrack.pause();
        System.out.println("Track size: " + appleMusicTrack.size() + " MB");
        System.out.println("Remaining size: " + appleMusicTrack.remaining(2.0) + " MB");
        appleMusicTrack.download();
    }
}
