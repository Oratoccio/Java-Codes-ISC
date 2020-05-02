
/**
 * Write a description of class efaf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class efaf
{
    void output()
    {
        String str=" Sky is blue";
        String arr[]=new String[3];
        for(int i=0;i<str.length()-1;i++)
        {
            arr[i]=str.substring(i,str.indexOf(" "));
            i=str.indexOf(" ")+1;
        }
    }
}
