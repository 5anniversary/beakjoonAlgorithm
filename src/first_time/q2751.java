package first_time;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q2751 {

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void buildHeap(int[] a) {
        int end = a.length - 1;
        for (int i = (end - 1) / 2; i >= 0; --i) heapify(a, i, end);
    }

    static void heapify(int[] a, int k, int end) {
        int left = 2 * k + 1, right = 2 * k + 2;
        int lager;
        if (right <= end)
            lager = (a[left] > a[right]) ? left : right;
        else if (left <= end)
            lager = left;
        else return;
        if (a[lager] > a[k]) {
            swap(a, lager, k);
            heapify(a, lager, end);
        }
    }

    static void heapSort(int[] a) {
        buildHeap(a);
        for (int end = a.length - 1; end >= 1; --end) {
            swap(a, 0, end);
            heapify(a, 0, end - 1);
        }
    }

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int array[] = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        heapSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
