package arrays;

class Arrays {

      public static void main(String a[]){

            int nums[][] = new int[2][4];

            for(int i = 0; i < 2; i++){
                  for(int j = 0; j < 4; j++){
                        nums[i][j] = (int) (Math.random() * 10);
                  }

            }
            
            for(int i = 0; i < 2; i++){
                  for(int j = 0; j < 4; j++){
                        System.out.print(nums[i][j] + " ");
                  }
                  System.out.println();
            }

            // enhance for loops 
            for(int n[]: nums){
                  for(int m: n){
                        System.out.print(m + " ");
                  }
                  System.out.println();
            }
      }
      
}
