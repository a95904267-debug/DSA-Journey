class BusyStudent {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int n = startTime.length;
        int attime = 0;
        for (int i = 0; i < n; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                attime++;
            }
        }
        return attime;
    }
}
