
public class Analysis {
   private String typeOfAnalysis;
   private String color;
   private double[] shortWeek;
   private double[] allWeek;
   private double[] longWeek;
   
   public Analysis(String typeOfAnalysis, String color,
         double allMonday, double allTuesday, double allWednesday, double allThursday, double allFriday, double allSaturday,
         double shortMonday, double shortTuesday, double shortWednesday, double shortThursday, double shortFriday, double shortSaturday,
         double longMonday, double longTuesday, double longWednesday, double longThursday, double longFriday, double longSaturday)
   {
      this.typeOfAnalysis = typeOfAnalysis;
      this.color = color;
      allWeek = new double[6];
      shortWeek = new double[6];
      longWeek = new double[6];
      
      allWeek[0] = allMonday;
      allWeek[1] = allTuesday;
      allWeek[2] = allWednesday;
      allWeek[3] = allThursday;
      allWeek[4] = allFriday;
      allWeek[5] = allSaturday;
      
      shortWeek[0] = shortMonday;
      shortWeek[1] = shortTuesday;
      shortWeek[2] = shortWednesday;
      shortWeek[3] = shortThursday;
      shortWeek[4] = shortFriday;
      shortWeek[5] = shortSaturday;
      
      longWeek[0] = longMonday;
      longWeek[1] = longTuesday;
      longWeek[2] = longWednesday;
      longWeek[3] = longThursday;
      longWeek[4] = longFriday;
      longWeek[5] = longSaturday;
   }
   
   public String toString()
   {
      String text = "";
      text += typeOfAnalysis + "\n" + color + "\nAll week:\nMonday - " + allWeek[0] + "\nTuesday - " + allWeek[1] + "\nWednesday - " + 
            allWeek[2] + "\nThursday - " + allWeek[3] + "\nFriday - " + allWeek[4] + "\nSaturday - " + allWeek[5];
      return text;
   }
}
