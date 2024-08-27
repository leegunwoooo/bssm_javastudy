package homework;
class MyTv{
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOff(){
        if(isPowerOn == true){
            isPowerOn = false;
        }else{
            isPowerOn = true;
        }
    }

    void volumeUp(){
        if(volume < MAX_VOLUME){
            volume++;
        }
    }

    void volumeDown(){
        if(volume > MIN_VOLUME){
            volume--;
        }
    }

    void channelUp(){
        channel++;
        if(channel > MAX_CHANNEL){
            channel = MIN_CHANNEL;
        }
    }


    void channelDown(){
        channel--;
        if(channel == MIN_CHANNEL){
            channel = MAX_CHANNEL;
        }
    }
}

public class Exercise6_19 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);

        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);

    }
}
