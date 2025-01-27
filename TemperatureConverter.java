
public class TemperatureConverter {
    

    private static void convertToCelsius(double degreesInFahrenheit) {

        // #### Assignment Starts Here ####

        /**
         * 
         * Please write an "algorithm" below taking the "input parameter" degreesInFarenheit
         * and converting it to the variable "degreesInCelsius" which will be printed below
         *  
         */

            double degreesInCelsius = (degreesInFahrenheit - 32) / 1.8;
         /*
          * So I tried to go off the equation normally used for F vs C, which was C = (F - 32) * (5/9) 
            This didn't work so I used the above method.
          */



        // #### Assignment Ends Here ####


        System.out.println(degreesInFahrenheit + " to Celsius is: " + degreesInCelsius);

    }

    public static void main(String[] args) {

        double degreesInFahrenheit = 25;
        

        convertToCelsius(degreesInFahrenheit);


    }
}
