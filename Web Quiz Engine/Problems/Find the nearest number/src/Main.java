import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        ArrayList<String> strings = new ArrayList<String>(Arrays.asList(data.split(" ")));

        for (String s : strings) {
            numbers.add(Integer.parseInt(s));
        }

        Integer number = scanner.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();

        Integer max = Collections.max(numbers);

        if (max < number) {
            //number greater than max item of array

            for (Integer i : numbers) {
                if (i.equals(max)) {
                    nums.add(i);
                }
            }
        } else if (numbers.contains(number)) {
            //number equal to item of array

            for (Integer i : numbers) {
                if ((i.equals(number))) {
                    nums.add(i);
                }
            }
        } else {
            ArrayList<Integer> mins = new ArrayList<>();
            ArrayList<Integer> maxs = new ArrayList<>();

            for (Integer i : numbers) {
                if (i < number) {
                    mins.add(i);
                }
                if (i > number) {
                    maxs.add(i);
                }
            }

            Integer maxMin = Collections.max(mins);
            Integer minMax = Collections.min(maxs);

            Integer distanceMin = number - maxMin;
            Integer distanceMax = minMax - number;

            Integer distance = Math.min(distanceMin, distanceMax);

            for (Integer i : numbers) {
                if (distance.equals(distanceMin)) {
                    if (i.equals(maxMin)) {
                        nums.add(i);
                    }
                }
                if (distance.equals(distanceMax)) {
                    if (i.equals(minMax)) {
                        nums.add(i);
                    }
                }
            }
        }

        Collections.sort(nums);
        for (Integer i : nums) {
            System.out.print(i + " ");
        }
    }
}