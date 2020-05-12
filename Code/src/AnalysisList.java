import java.util.ArrayList;

public class AnalysisList
{
   private ArrayList<Analysis> analysis;
   
   public AnalysisList()
   {
      analysis = new ArrayList<Analysis>();
   }
   
   public void add(Analysis analysis)
   {
      this.analysis.add(analysis);
   }
   
   public void remove(Analysis analysis)
   {
      this.analysis.remove(analysis);
   }
   
   public void remove(int index)
   {
      analysis.remove(index);
   }
   
   public Analysis get(int index)
   {
      return analysis.get(index);
   }
   
   public int getSize()
   {
      return analysis.size();
   }
}
