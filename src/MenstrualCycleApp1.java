public class MenstrualCycleApp1 {

    private int cycleLength;
    private int periodDuration;



    public void setCycleLength(){
        this.cycleLength = cycleLength;

    }

    public int getCycleLength(){
        return cycleLength;
    }

    public void setPeriodDuration(){
        this.periodDuration = periodDuration;

    }

    public int getPeriodDuration(){
        return periodDuration;
    }





    public int ovulationPeriod(){
        int ovulationPeriod = cycleLength - 14;
        return ovulationPeriod;

    }

}
