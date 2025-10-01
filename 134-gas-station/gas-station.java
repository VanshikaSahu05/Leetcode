class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalEarn = 0;
        int totalCost = 0;
        int n = gas.length;
        for(int i=0;i<n;i++){
            totalEarn += gas[i];
            totalCost += cost[i];
        }
        if(totalCost>totalEarn){
            return -1;
        }
        int total = 0;
        int result = 0;
        for(int i=0;i<n;i++){
            int earn  = total - cost[i] + gas[i];
            if(earn<0){
                total = 0;
                result = i+1;
            }
            else{
                total = earn;
            }
        }
        return result;
    }
}

/**
 int n = gas.length;
        for(int i=0;i<n;i++){
            if(gas[i]>=cost[i]){
                int j=(i+1)%n;
                int costForMovingNextStation = cost[i];
                int gasForNextStation = gas[j];
                int currentGas = gas[i] - costForMovingNextStation + gasForNextStation;
                while(i!=j){
                    if(currentGas<cost[j]){
                        break;
                    }
                    int costForMovingNextFromJ = cost[j];
                    j = (j+1)%n;
                    int gasForNextStationJ = gas[j];
                    currentGas = currentGas - costForMovingNextFromJ + gasForNextStationJ;
                }
                if(i == j){
                    return i;
                }
            }
        }
        return -1;
 */