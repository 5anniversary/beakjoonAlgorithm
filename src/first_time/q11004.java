package first_time;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q11004 {
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void dualPivotPartition(int[] a, int start, int end, int[] pivot) {
        int size = end - start + 1;
        swap(a, start, start + size / 3);
        swap(a, end, end - size / 3);
        if (a[start] > a[end]) swap(a, start, end);
        int lt = start + 1, gt = end - 1;
        int i = start + 1;
        while (i <= gt) {
            if (a[i] < a[start]) swap(a, lt++, i++);
            else if (a[end] <= a[i]) swap(a, i, gt--);
            else i++;
        }
        swap(a, start, --lt);
        swap(a, end, ++gt);
        pivot[0] = lt;
        pivot[1] = gt;
    }

    static int select(int[] A, int start, int end, int nth) {
        int[] pivot = new int[2];
        while (start < end) {
            dualPivotPartition(A, start, end, pivot);
            int pivot1_nth = pivot[0] - start + 1;
            int pivot2_nth = pivot[1] - start + 1;
            if (nth < pivot1_nth) end = pivot[0] - 1;
            else if (nth == pivot1_nth) return A[pivot[0]];
            else if (nth > pivot1_nth && nth < pivot2_nth) {
                start = pivot[0] + 1;
                end = pivot[1] - 1;
                nth = nth - pivot1_nth;
            } else if (nth == pivot2_nth) return A[pivot[1]];
            else {
                start = pivot[1] + 1;
                nth = nth - pivot2_nth;
            }
        }
        return A[start];
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer t1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(t1.nextToken());
        int k = Integer.parseInt(t1.nextToken());
        t1 = new StringTokenizer(br.readLine());
        br.close();
        int array[] = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = Integer.parseInt(t1.nextToken());

//        System.out.println(select(array, 0, array.length - 1, k));
        Arrays.sort(array);
        System.out.println(array[k-1]);
    }
}
