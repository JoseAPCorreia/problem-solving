https://hyperskill.org/learn/step/5012

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        int duration = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelCostPerNight = scanner.nextInt();

        int food = foodCostPerDay * duration;
        int flights = flightCost * 2;
        int hotel = hotelCostPerNight * (duration - 1);

        int result = food + flights + hotel;
        System.out.println(result);
    }
}