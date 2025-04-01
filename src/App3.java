
public class App3 {

    public String convertMeasure(float numberMeasure, String metricIdentity) {

            float convertedNumber = 0;
            String measurementUnit = "";

            switch (metricIdentity) {
                case "C":
                convertedNumber = (float)(numberMeasure*1.8)+32;
                measurementUnit = " °F";
                break;

                case "cm":
                convertedNumber = (float)(numberMeasure / 2.54);
                measurementUnit = " inches";
                break;

                case "kg":
                convertedNumber = (float)(numberMeasure * 35.274);
                measurementUnit = " ounces";
                break;

                case "km":
                convertedNumber = (float)(numberMeasure * 1093.61);
                measurementUnit = " yards";
                break;

                case "kl":
                convertedNumber = (float)(numberMeasure * 1000);
                measurementUnit = " liters";
                break;

                default:
                convertedNumber = (float)(000000);
                
            }

            return String.format("%.2f %s", convertedNumber, measurementUnit);
        
           
        }
    }

    


