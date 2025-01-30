package Day02.stack_and_queue.circular_tour;

import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {


    public static int findStartingPoint(PetrolPump[] pumps) {
        int n = pumps.length;
        Queue<Integer> queue = new LinkedList<>();
        int start = 0;
        int surplus = 0;
        int totalPetrol = 0, totalDistance = 0;

        // Calculate total petrol and total distance
        for (PetrolPump pump : pumps) {
            totalPetrol += pump.petrol;
            totalDistance += pump.distance;
        }

        if (totalPetrol < totalDistance) {
            return -1; // No solution possible
        }

        for (int i = 0; i < n; i++) {
            surplus += pumps[i].petrol - pumps[i].distance;
            queue.add(i);

            while (surplus < 0 && !queue.isEmpty()) {
                start = queue.poll(); // Remove the bad start point
                surplus -= pumps[start].petrol - pumps[start].distance;
                start++; // Move to the next valid starting point
            }
        }

        return start % n;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(4, 6),
                new PetrolPump(6, 5),
                new PetrolPump(7, 3),
                new PetrolPump(4, 5)
        };

        int startPoint = findStartingPoint(pumps);

        if (startPoint == -1) {
            System.out.println("No solution exists for the circular tour.");
        } else {
            System.out.println("Start the tour at petrol pump index: " + startPoint);
        }
    }
}