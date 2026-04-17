
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] arr={0, 2, 5, 3, 7, 8, 4};
        return arr;  
    }

    public int getToday() {
        int n=birdsPerDay.length;
        return birdsPerDay[n-1];
    }

    public void incrementTodaysCount() {
        int n=birdsPerDay.length;
        birdsPerDay[n-1]++;
        return;
    }

    public boolean hasDayWithoutBirds() {
        for (int i=0;i<birdsPerDay.length;i++) {
            if(birdsPerDay[i]==0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int c=0;
        int n=Math.min(numberOfDays,birdsPerDay.length);
        for (int i=0;i<n;i++) {
            c+=birdsPerDay[i];
        }
        return c;
    }

    public int getBusyDays() {
        int b=0;
        for (int i=0;i<birdsPerDay.length;i++) {
            if(birdsPerDay[i]>=5) b++;
        }
        return b;
    }
}
