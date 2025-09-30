public class AppointmentBook {
    private boolean[][] schedule;

    public AppointmentBook(boolean[][]schedule){
        this.schedule = schedule;
    }
    private boolean isMinitureFree(int period, int minture){
        return schedule[period-1][minture];
    }
    public int findFreeBlock(int period, int duration) {
        int block = 0;

        for(int i = 0; i < 60; i++)
            if (isMinitureFree(period, i)){
                block++;
                if(block == duration){
                    return i - duration + 1;
                }
                else block = 0;
            }
        return -1;
    }
    public boolean makeAppointment(int startPeriod, int endPeriod, int duration){
        return false;
    }
    public void printPeriod(int period){
        for (int i = 0; i < schedule[period-1].length; i++)
         System.out.println(i + " " + schedule[period-1][i]);

    }

}

