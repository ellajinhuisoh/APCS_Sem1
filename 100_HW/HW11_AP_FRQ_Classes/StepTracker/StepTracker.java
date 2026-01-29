public class StepTracker{
    int minsteps;
    int totalSteps;
    int days;
    int activeDays;
    
    public StepTracker(int min){
        minsteps=min;
        totalSteps=0;
        days=0;
        activeDays = 0;
    }
    public void addDailySteps(int steps){
         totalSteps += steps;
        days++;
        if (steps >= minsteps){
            activeDays++;
        }
    }
    public int activeDays(){
        return activeDays;
    }
    public double averageSteps(){
        if (days ==0){
            return (double)totalSteps/days;
        }
    }
    
}