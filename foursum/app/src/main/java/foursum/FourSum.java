package foursum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FourSum {

    public static int[] readData() {
        Scanner s = new Scanner(System.in);
        int[] x = null;
        try {
            int n = s.nextInt();
            x = new int[n];
            for (int i = 0; i < n; ++i) {
                x[i] = s.nextInt();
            }
        } finally {
            s.close();
        }
        return x;
    }

    // Quartic solution for foursum
    public static int[] fourSumQuartic(int[] x) {
        int n = x.length;
        for (int i = 0; i < n; ++i) {
            int a = x[i];
            for (int j = i + 1; j < n; ++j) {
                int b = x[j];
                for (int k = j + 1; k < n; ++k) {
                    int c = x[k];
                    for (int l = k + 1; l < n; ++l) {
                        int d = x[l];
                        if (a + b + c + d == 0) {
                            return new int[] { a, b, c, d };
                        }
                    }
                }
            }
        }
        return null;
    }

    // Cubic solution for Foursum
    public static int[] fourSumCubic(int[] x) {
        int n = x.length;
        int[] y = x.clone();
        Arrays.sort(y);
        for (int i = 0; i < n; ++i) {
            int a = y[i];
            for (int j = i + 1; j < n; ++j) {
                int b = y[j];
                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    int c = y[left];
                    int d = y[right];
                    if (a + b + c + d == 0) {
                        return new int[] { a, b, c, d };
                    } else if (a + b + c + d < 0) {
                        ++left;
                    } else {
                        --right;
                    }
                }
            }
        }
        return null;
    }

    // HashMap solution for Foursum
    public static int[] fourSumHashMap(int[] x) {
        int n = x.length;
        HashMap<Integer, int[]> H = new HashMap<Integer, int[]>();
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                H.put(x[i] + x[j], new int[] { i, j });
            }
        }
        for (int i = 0; i < n; ++i) {
            int a = x[i];
            for (int j = i + 1; j < n; ++j) {
                int b = x[j];
                int[] k = H.get(-a - b);
                if ((k != null) && j < k[0]) {
                    int c = x[k[0]];
                    int d = x[k[1]];
                    return new int[] { a, b, c, d };
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] x = readData();
        int[] y = null;
        if ("fourSum_quartic".equals(args[0])) {
            y = fourSumQuartic(x);
        } else if ("fourSum_cubic".equals(args[0])) {
            y = fourSumCubic(x);
        } else if ("fourSum_hashmap".equals(args[0])) {
            y = fourSumHashMap(x);
        }
        if (y == null) {
            System.out.println(" null ");
        } else {
            System.out.println(String.format("%d %d %d", y[0], y[1], y[2], y[3]));
        }
    }
}
