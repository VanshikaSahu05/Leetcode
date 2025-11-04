class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int A= capacityA;
        int B = capacityB;
        int count=0;
        int a=0;
        int b=plants.length-1;
        while(a<=b){
            if(a==b){
                if (Math.max(capacityA, capacityB) < plants[a]) {
                    count++;
                }
                break;
            }
            else{
                if(capacityA>=plants[a] && capacityB>=plants[b]){
                    capacityA -=plants[a];
                    capacityB -=plants[b];
                    a++;
                    b--;
                }
                else if(capacityA<plants[a] && capacityB>=plants[b]){
                    capacityA = A-plants[a];
                    capacityB -=plants[b];
                    count++;
                    a++;
                    b--;
                }
                else if(capacityA>=plants[a] && capacityB<plants[b]){
                    capacityB = B-plants[b];
                    capacityA -=plants[a];
                    count++;
                    a++;
                    b--;
                }
                else {
                    capacityA = A-plants[a];
                     capacityB = B-plants[b];
                     a++;
                     b--;
                     count+=2;
                }
            }

        }
        return count;
    }
}