class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int cc = 0;
        int sc = 0;

        for (int stud : students) {
            if (stud == 0) {
                cc++;
            } else {
                sc++;
            }
        }

        for (int sand : sandwiches) {
            if (sand == 0 && cc == 0) {
                return sc;
            }
            if (sand == 1 && sc == 0) {
                return cc;
            }
            if (sand == 0) {
                cc--;
            } else {
                sc--;
            }
        }
        return 0;
    }
}