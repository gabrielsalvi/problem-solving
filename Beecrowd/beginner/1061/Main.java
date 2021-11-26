import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine().replace("Dia ", ""));
        String[] time = scanner.nextLine().replaceAll(" : ", " ").split(" ");

        EventTime start = new EventTime(day, time);

        day = Integer.parseInt(scanner.nextLine().replace("Dia ", ""));
        time = scanner.nextLine().replaceAll(" : ", " ").split(" ");

        EventTime end = new EventTime(day, time);

        EventTime eventDuration = new EventTime();
        eventDuration.calculateEventDuration(start, end);

        System.out.println(eventDuration.getDay() + " dia(s)");
        System.out.println(eventDuration.getHour() + " hora(s)");
        System.out.println(eventDuration.getMinute() + " minuto(s)");
        System.out.println(eventDuration.getSecond() + " segundo(s)");

        scanner.close();
    }
}

class EventTime {

    private int day;
    private int hour;
    private int minute;
    private int second;

    public EventTime(int day, String[] time) {

        this.setDay(day);
        this.setHour(time[0]);
        this.setMinute(time[1]);
        this.setSecond(time[2]);

    }

    public EventTime() {}

    public void calculateEventDuration(EventTime start, EventTime end) {

        this.day = end.day - start.day;
        this.hour = end.hour - start.hour;
        this.minute = end.minute - start.minute;
        this.second = end.second - start.second;

        if (this.second < 0) {
            this.second += 60;
            this.minute--;
        }

        if (this.minute < 0) {
            this.minute += 60;
            this.hour--;
        }

        if (this.hour < 0) {
            this.hour += 24;
            this.day--;
        }
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(String hour) {
        this.hour = Integer.parseInt(hour);
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(String minute) {
        this.minute = Integer.parseInt(minute);
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(String second) {
        this.second = Integer.parseInt(second);
    }
}