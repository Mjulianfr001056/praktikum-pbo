package meet2.Tugas.Time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public int getSecond(){
        return this.second;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    @Override
    public String toString(){
        String formatted = String.format("%02d:%02d:%02d",hour,minute,second);
        return formatted;
    }

    public Time nextSecond(){
        second++;
        if(second > 59){
            minute++;
            second = 0;

            if(minute > 59){
                hour++;
                minute = 0;

                if(hour > 23){
                hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond(){
        second--;
        if(second < 0){
            minute--;
            second = 59;

            if(minute <0){
                hour--;
                minute = 59;

                if(hour < 0){
                hour = 23;
                }
            }
        }
        return this;
    }
}
