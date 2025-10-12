class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] i:image){
            int a=0;
            int b=i.length-1;
            while(a<b){
                int temp = i[a];
                i[a] = i[b];
                i[b] = temp;
                a++;
                b--;
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image.length;j++){
                if(image[i][j]==0){
                    image[i][j] =1;
                }
                else{
                    image[i][j] =0;
                }
            }
        }
        return image;
    }
}