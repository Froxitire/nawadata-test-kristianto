import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberTwo {
    public static void run() {
        int busCount = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of families : ");
        int n = scanner.nextInt();

        System.out.print("Input the number of members in the family : ");
        List<Integer> familySizes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            familySizes.add(input);
            if (input > 4) {
                System.out.println("family must less than 4");
                return;
            }
        }

        if (familySizes.size() != n) {
            System.out.println("Input must be equal with count of family");
            return;
        }

        List<Integer> familyAll = new ArrayList<>();
        for (int i = 0; i < familySizes.size(); i++) {
            if (familyAll.contains(i)) continue;

            int firstFamilySize = familySizes.get(i);
            int busCapacity = 4;
            familyAll.add(i);

            for (int j = i + 1; j < familySizes.size(); j++) {
                if (!familyAll.contains(j) && (firstFamilySize + familySizes.get(j) <= busCapacity)) {
                    busCapacity -= familySizes.get(j);
                    familyAll.add(j);
                    break;
                }
            }
            busCount++;
        }
        System.out.println("Minimum bus required is: " + busCount);
    }
}
