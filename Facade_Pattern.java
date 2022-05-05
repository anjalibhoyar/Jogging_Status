# Jogging_Status

class GPS{
    public void ON(){
        System.out.println("Turn on GPS");
    }
    public void OFF(){
        System.out.println("Turn off GPS");
    }
}
class MobileData{
    public void ON(){
        System.out.println("Turn on Mobile data");
    }
    public void OFF(){
        System.out.println("Turn off mobile data");
    }
}
class Wifi{
    public void ON(){
        System.out.println("Turn on Wifi");
    }
    public void OFF(){
        System.out.println("Turn off wifi");
    }
}
class Music{
    public void ON(){
        System.out.println("Turn on Music");
    }
    public void OFF(){
        System.out.println("Turn off Music");
    }
}
class SportsTracker{
    public void ON(){
        System.out.println("Turn on Sports Tracker");
    }
    public void OFF(){
        System.out.println("Turn off Sports Tracker");
    }
    public void ShareStatus(){
        System.out.println("Share Sports tracker status on fb and twitter");
    }
}

class MobilePhone{
    GPS gps;
    MobileData mobile_data;
    Wifi wifi;
    SportsTracker sports_tracker;
    Music music;

    MobilePhone(GPS gps,MobileData mobile_data,Wifi wifi,SportsTracker sports_tracker,Music music){
        this.gps=gps;
        this.mobile_data=mobile_data;
        this.wifi=wifi;
        this.sports_tracker=sports_tracker;
        this.music=music;
    }

    public void GoingToJog(){
        gps.ON();
        mobile_data.ON();
        wifi.OFF();
        music.ON();
        sports_tracker.ON();
    }
    public void cumBack(){
        gps.OFF();
        mobile_data.OFF();
        wifi.ON();
        music.OFF();
        sports_tracker.ShareStatus();
        sports_tracker.OFF();
    }
}

class Test{
    public static void main(String[] args) {
        GPS gps=new GPS();
        MobileData mobile_data=new MobileData();
        SportsTracker sports_tracker=new SportsTracker();
        Wifi wifi=new Wifi();
        Music music=new Music();
        MobilePhone _mobile_phone=new MobilePhone(gps, mobile_data, wifi, sports_tracker, music);
        _mobile_phone.GoingToJog();
        _mobile_phone.cumBack();
    }
}
