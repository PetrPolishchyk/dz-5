public class Main {

    public static void main(String[] args) {

        //the average weight of animals
        int avgDogWeight = 32;
        int avgCatWeight = 4;
        int avgRacoonWeight = 22;
        int avgPenguinWeight = 16;

        //the couples
        int firstCouple = avgDogWeight + avgCatWeight;
        int secondCouple = avgRacoonWeight + avgPenguinWeight;

        //print the comparison of the sums
        System.out.println("Is the first sum bigger than second sum?");
        String comparison = String.valueOf(firstCouple > secondCouple);
        System.out.println(comparison);

        //changing of sums
        firstCouple++;
        secondCouple-=2;

        //print the comparison again
        System.out.println("Is the first sum bigger than second sum after changing?");
        comparison = String.valueOf(firstCouple > secondCouple);
        System.out.println(comparison);

        //print true if one of the sums %2
        System.out.println("Is any of the sums multiple 2?");
        String result = String.valueOf(firstCouple % 2 == 0 || secondCouple % 2 == 0 ? true : false);
        System.out.println(result);

    }
}
