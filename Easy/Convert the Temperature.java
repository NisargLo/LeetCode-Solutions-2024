class Solution {
     public double[] convertTemperature(double celsius) {
          double[] kf = { celsius + 273.15, 1.8 * celsius + 32 };
          return kf;
     }
}