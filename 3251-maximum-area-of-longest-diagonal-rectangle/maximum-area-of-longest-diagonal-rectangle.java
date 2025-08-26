class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int MaxDia = Integer.MIN_VALUE;
        int MaxArea = Integer.MIN_VALUE;
        for(int i=0;i<dimensions.length;i++){
            int[] rec = dimensions[i];
            int l = rec[0];
            int b = rec[1];
            int area = l*b;
            int dia =((l*l) + (b*b));
            
            if(dia > MaxDia){
                MaxDia = dia;
                MaxArea = area;
            }
            else if(dia == MaxDia){
                MaxArea = Math.max(MaxArea,area);
            }
        }
        return MaxArea;
    }
}