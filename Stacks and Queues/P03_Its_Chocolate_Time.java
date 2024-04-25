import java.util.*;

public class P03_Its_Chocolate_Time {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] milkValues = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        double[] cacaoValues = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        Map<String, Integer> chocolates = new HashMap<>();
        chocolates.put("Milk Chocolate", 0);
        chocolates.put("Dark Chocolate", 0);
        chocolates.put("Baking Chocolate", 0);

        Deque<Double> milkValuesQueue = new ArrayDeque<>();
        for (double v : milkValues) {
            milkValuesQueue.offer(v);
        }
        Deque<Double> cacaoValuesStack = new ArrayDeque<>();
        for (double v : cacaoValues) {
            cacaoValuesStack.push(v);
        }
        while (!milkValuesQueue.isEmpty() && !cacaoValuesStack.isEmpty()) {
            double currentMilkValue = milkValuesQueue.peek();
            double currentCacao = cacaoValuesStack.peek();
            double cacaoPercentage = currentCacao / (currentMilkValue + currentCacao) * 100;

            if (cacaoPercentage == 30) {
                int currentNumOfMilkChocolates = chocolates.get("Milk Chocolate");
                chocolates.put("Milk Chocolate", currentNumOfMilkChocolates + 1);
                milkValuesQueue.poll();
                cacaoValuesStack.pop();

            } else if (cacaoPercentage == 50) {
                int currentNumOfDarkChocolates = chocolates.get("Dark Chocolate");
                chocolates.put("Dark Chocolate", currentNumOfDarkChocolates + 1);
                milkValuesQueue.poll();
                cacaoValuesStack.pop();

            } else if (cacaoPercentage == 100) {
                int currentNumOfBakingChocolates = chocolates.get("Baking Chocolate");
                chocolates.put("Baking Chocolate", currentNumOfBakingChocolates + 1);
                milkValuesQueue.poll();
                cacaoValuesStack.pop();

            } else {
                cacaoValuesStack.pop();
                currentMilkValue += 10;
                milkValuesQueue.poll();
                milkValuesQueue.offer(currentMilkValue);

            }
        }
        boolean isChocolateEmpty = false;
        for (Map.Entry<String, Integer> entry : chocolates.entrySet()) {
            if (entry.getValue() == 0) {
                System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
                isChocolateEmpty = true;
                break;
            }
        }
        if (!isChocolateEmpty) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        }

        chocolates.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(c -> {
                            if (c.getValue() > 0) {
                                System.out.printf("# %s --> %d%n", c.getKey(), c.getValue());
                            }
                        }
                );
    }

}
