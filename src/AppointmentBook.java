public class AppointmentBook {
    private boolean[][] schedule;

    public AppointmentBook(boolean[][]schedule){
        this.schedule = schedule;
    }
    private boolean isMinitureFree(int period, int minture){
        return schedule[period-1][minture];
    }
    public int findFreeBlock(int period, int duration) {
        return 0;
    }
    public boolean makeAppointment(int startPeriod, int endPeriod, int duration){
        return false;
    }
}

