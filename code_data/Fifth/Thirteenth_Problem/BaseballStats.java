package code_data.Fifth.Thirteenth_Problem;
// ****************************************************************
//   BaseballStats.java
//
//   Reads baseball data in from a comma delimited file. Each line
//   of the file contains a name followed by a list of symbols
//   indicating the result of each at bat: h for hit, o for out,
//   w for walk, s for sacrifice.  Statistics are computed and
//   printed for each player.
// ****************************************************************

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import java.io.*;

public class BaseballStats
{
    //-------------------------------------------------
    //  Reads baseball stats from a file and counts
    //  total hits, outs, walks, and sacrifice flies
    //  for each player.
    //-------------------------------------------------
    public static void main (String[] args) throws IOException {
        DecimalFormat fmt = new DecimalFormat();
        Scanner fileScan, lineScan;
        String fileName,data;
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter the name of the input file: ");
        fileName = scan.nextLine();
        fileName = "C:\\Users\\Admin\\IdeaProjects\\untitled\\src\\code_data\\Fifth\\Thirteenth_Problem\\" + fileName;
        fileScan = new Scanner(new File(fileName));
        fmt.applyPattern("#.##");
        while(fileScan.hasNext())
        {
            int flag = 0, hits = 0, outs = 0, walks = 0, sacrifices = 0;
            data = fileScan.nextLine();
            lineScan = new Scanner(data);
            lineScan.useDelimiter(",");
            while(lineScan.hasNext())
            {
                String c = lineScan.next();
                if(c.equals("o"))outs++;
                else if(c.equals("h"))hits++;
                else if(c.equals("w"))walks++;
                else if(c.equals("s"))sacrifices++;
                System.out.print(" " + c);
            }
            System.out.println();
            System.out.println("This player's data:  (1).outs:  " + outs +
                    "  (2).hits:  " + hits +
                    "  (3).walks:  " + walks +
                    "  (4):sacrifices:  " + sacrifices +
                    "  (5):hitting rate:  " + fmt.format((((double)hits/outs)*100.0)) + "%");
        }
        // Read and process each line of the file

    }
}
