/**
 * Method overloading is when you have multiple methods with the same name but different signature aka parameters
 *
 */
public class OverloadingMethods {

    public static void main(String[] args) {

    }
    public static String getMonth( int month){
        switch (month){
            case 1: return "Jan";
            case 2: return "Feb";
            case 3: return "Mar";
            case 4: return "Apr";
            case 5: return "May";
            case 6: return "Jun";
            case 7: return "Jul";
            case 8: return "Aug";
            case 9: return "Sep";
            case 10: return "Oct";
            case 11: return "Now";
            case 12: return "Dec";
            default: return  "Invalid month. Please enter 1 to 12.";
        }
    }
    public static int getMonth(String month){
        switch (month){
            case "Jan": return 1;
            case "Feb": return 2;
            case "Mar": return 3;
            case "Apr": return 4;
            case "May": return 5;
            case "Jun": return 6;
            case "Jul": return 7;
            case "Aug": return 8;
            case "Sep": return 9;
            case "Oct": return 10;
            case "Nov": return 11;
            case "Dec": return 12;
            default: return -1;
        }
    }

}
