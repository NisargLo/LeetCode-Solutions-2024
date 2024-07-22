class Solution {
     public String[] sortPeople(String[] names, int[] heights) {
          String temp;
          int tempHeight;
          for (int i = 0; i < heights.length; i++) {
               for (int j = i + 1; j < heights.length; j++) {
                    if (heights[i] < heights[j]) {
                         temp = names[i];
                         names[i] = names[j];
                         names[j] = temp;

                         tempHeight = heights[i];
                         heights[i] = heights[j];
                         heights[j] = tempHeight;
                    }
               }
          }
          return names;
     }
}
