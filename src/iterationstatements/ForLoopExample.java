package iterationstatements;

public class ForLoopExample {

    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May"};

        String [] cars ={"BMW", "AUDI"};

        for (int i = 0; i < months.length; i++) {
           // for(int i =0; i < months.length(); i++){
            System.out.println(months[i]);
        }
            for( String monthName:months){
                System.out.println(monthName);
                System.out.println(monthName.length());
            }
        for (int j = 0; j < cars.length; j++) {
            // for(int i =0; i < months.length(); i++){
            System.out.println(months[j]);
        }
        for( String carsName:cars){
            System.out.println(carsName);
            System.out.println(carsName.length());
        }
    }
}
