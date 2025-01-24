
public class TemperatureConverter {
    

    private static void convertToCelsius(double degreesInFahrenheit) {

        // #### Assignment Starts Here ####

        /**
         * 
         * Please write an "algorithm" below taking the "input parameter" degreesInFarenheit
         * and converting it to the variable "degreesInCelsius" which will be printed below
         *  
         */

        
            double degreesInCelsius = (degreesInFahrenheit - 32) * (5/9);
         



        // #### Assignment Ends Here ####


        System.out.println(degreesInFahrenheit + " to Celsius is: " + degreesInCelsius);

    }

    public static void main(String[] args) {

        double degreesInFahrenheit = 25;
        

        convertToCelsius(degreesInFahrenheit);


    }
}
