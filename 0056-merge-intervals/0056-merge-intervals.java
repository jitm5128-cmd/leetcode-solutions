class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        
            int CurrentStart = intervals[0][0];
            int CurrentEnd = intervals[0][1];
            ArrayList<int[]> mergeinterval = new ArrayList<>();
            for(int i=1;i<intervals.length;++i){
                int NextStart = intervals[i][0];
                int NextEnd = intervals[i][1];

                if(CurrentEnd < NextStart){
                    mergeinterval.add(new int[]{CurrentStart,CurrentEnd});
                    CurrentStart = NextStart;
                    CurrentEnd = NextEnd;
                }else{
                    CurrentEnd = Math.max(CurrentEnd, NextEnd);
                }
            }

                mergeinterval.add(new int[]{CurrentStart,CurrentEnd});
        
        
        return mergeinterval.toArray(new int[mergeinterval.size()][]);
    }
}