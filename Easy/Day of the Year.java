class Solution {
     public int dayOfYear(String date) {
          String month = date.substring(5, 7);
          String day = date.substring(8, 10);
          int Month = Integer.parseInt(month);
          int Day = Integer.parseInt(day);
          for (int i = 1; i < Integer.parseInt(month); i++) {
               if (i == 4 || i == 6 || i == 9 || i == 11) {
                    Day += 30;
               } else if (i == 2 && java.time.Year.isLeap(Integer.parseInt(date.substring(0, 4)))) {
                    Day += 29;
               } else if (i == 2 && !java.time.Year.isLeap(Integer.parseInt(date.substring(0, 4)))) {
                    Day += 28;
               } else {
                    Day += 31;
               }
          }
          return Day;
     }
}