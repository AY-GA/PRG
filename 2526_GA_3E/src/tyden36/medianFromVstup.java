import tyden37.SelectSort;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

void main() throws IOException {
    File file = new File("vstup.txt");
    Scanner sc = new Scanner(file);

    List<Integer> tempList = new ArrayList<>();
    BufferedReader br = new BufferedReader(new FileReader(file));
    String st;
    while ((st = br.readLine()) != null)
        tempList.add(Integer.parseInt(st));
//    Collections.sort(tempList);
    SelectSort.sort(tempList);

    double idxMedian = getIdxMedian(tempList);
    double median = getMedian(idxMedian, tempList);
    System.out.println("Median: " + median);
    System.out.println("Median index: " + idxMedian);
}

private static double getIdxMedian(List<Integer> tempList) {
    return (tempList.size() + 1) / 2.0;
}

private static double getMedian(double idxMedian, List<Integer> tempList) {
    double median;
    if (idxMedian % 1 == 0) median = tempList.get((int) idxMedian);
    else {
        int sum = tempList.get((int) (idxMedian - 0.5)) + tempList.get((int) (idxMedian + 0.5));
        median = sum / 2.0;
    }
    return median;
}