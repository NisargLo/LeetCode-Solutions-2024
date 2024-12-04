class Solution {
     public boolean canBeEqual(int[] target, int[] arr) {
          // -> better memory

          short l = (short) target.length;
          for (short i = 0; i < l; i++) {
               for (short j = 0; j < l; j++) {
                    if (target[i] == arr[j]) {
                         arr[j] = -1;
                         break;
                    }
               }
          }
          for (short i = 0; i < l; i++) {
               if (arr[i] != -1) {
                    return false;
               }
          }
          return true;
     }

     /*
          -> faster runtime

          short l = (short)target.length;
          short[] map=new short[1001];
          for (short i=0;i<l;i++) {
               map[target[i]]++;
               map[arr[i]]--;
          }
          for(short i=0;i<l;i++){
               if(map[target[i]]!=0){
                    return false;
               }
          }
          return true;     
      */
}