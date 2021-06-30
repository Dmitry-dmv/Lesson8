package chernyh.company;



    public class Truck extends Car {
        public int numberWheels;
        public double weightLimit;

        public static void main(String[] args) {
            Truck truck = new Truck(2000, "Scania", 'p', 55, 6, 7000);
            truck.newWheels(12);

            System.out.println(truck);
        }

        public Truck(int weight, String model, char color, float speed, int numberWheels, double weightLimit) {
            super(weight, model, color, speed);
            this.numberWheels = numberWheels;
            this.weightLimit = weightLimit;
        }

        public void newWheels(int number) {
            numberWheels = number;
            System.out.println(numberWheels);
        }

        @Override
        public String toString() {
            return "Truck{" +
                    "weight=" + weight +
                    ", model='" + model + '\'' +
                    ", color=" + color +
                    ", speed=" + speed +
                    ", numberWheels=" + numberWheels +
                    ", weightLimit=" + weightLimit +
                    '}';
        }
    }
}
