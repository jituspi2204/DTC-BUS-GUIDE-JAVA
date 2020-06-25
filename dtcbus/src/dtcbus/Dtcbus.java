package dtcbus;
import static dtcbus.trieData.*;
import java.util.*;
import java.io.*;
import static dtcbus.graphMaker.*;
public class Dtcbus {
    
     static trieData.Node root = new trieData.Node();
    public static void main(String[] args) {
         new mainScreen().setVisible(true); 
          
        Arrays.fill(aName,"");
        for(int i=0;i<aName.length;i++){
            cityMap.add(new ArrayList<Edge>());
        }
        
        try{
            
            File file = new File(".\\newi");
            Scanner scn = new Scanner(file);
            String choice = "1";
            while(scn.hasNextLine())
            {
            while(choice.equals("1")){
                totalBus++;
                DTC dtcObject = new DTC();
                ArrayList<Integer> arr = new ArrayList<>();  
                dtcObject.busRouteNo = scn.nextLine();
                dtcObject.start = scn.nextLine();
                dtcObject.end = scn.nextLine();
                String innerChoice = "1";
                dtcObject.intermediateStop.add(dtcObject.start);
                while(innerChoice.equals("1")){
                    String tempString = scn.nextLine();
                    dtcObject.intermediateStop.add(tempString);
                    innerChoice = scn.nextLine();
                }
                dtcObject.intermediateStop.add(dtcObject.end);
                dtcObject.direction = scn.nextLine();
                for(int i=0;i<dtcObject.intermediateStop.size();i++){
                    int rem = searchAreaIfExistOrNot(dtcObject.intermediateStop.get(i));
                        if(rem == -1){
                            totalArea++;
                            aName[totalArea] = dtcObject.intermediateStop.get(i);
                            
                            //added to trie
                            insert(aName[totalArea], root, totalArea);
                            
                            
                            dtcObject.imsI.add(totalArea);
                            Area area = new Area();
                            area.areaCode = totalArea;
                            area.areaName = dtcObject.intermediateStop.get(i);
                            if(dtcObject.direction.equals("2")){
                                area.busOut.add(totalBus);
                            }
                            else{
                                area.busOut.add(totalBus);
                                area.busIn.add(totalBus);
                            }
                            arr.add(totalArea);
                            areaDetails.add(area);
                            
                        }else{
                            arr.add(rem);
                            dtcObject.imsI.add(rem);
                            if(dtcObject.direction.equals("2")){
                                areaDetails.get(rem).busOut.add(totalBus);
                            }else{
                                areaDetails.get(rem).busOut.add(totalBus);
                                areaDetails.get(rem).busIn.add(totalBus);
                            }  
                        
                        }
                }
                //add current area list to city map
                for(int i=0;i<arr.size()-1;i++){
                        if(checkNbg(totalBus,arr.get(i), arr.get(i+1))==false){
                        if(dtcObject.direction.equals("2")){
                            Edge newEdge1 = new Edge();
                            newEdge1.busNo = dtcObject.busRouteNo;
                            newEdge1.busId = totalBus;
                            newEdge1.nb = arr.get(i+1);
                            cityMap.get(arr.get(i)).add(newEdge1);
                        }else{
                            Edge newEdge1 = new Edge();
                            newEdge1.busNo = dtcObject.busRouteNo;
                            newEdge1.busId = totalBus;
                            newEdge1.nb = arr.get(i+1);
                            cityMap.get(arr.get(i)).add(newEdge1);
                            Edge newEdge2 = new Edge();
                            newEdge2.busNo = dtcObject.busRouteNo;
                            newEdge2.busId = totalBus;
                            newEdge2.nb = arr.get(i);
                            cityMap.get(arr.get(i+1)).add(newEdge2);
                        }
                    }
                }
                dtcObject.code = totalBus;
                busDetails.add(dtcObject);
                bName[totalBus]=dtcObject.busRouteNo;
                choice = scn.nextLine();
                //add current bus to bus details array list   
            }
        }
       
    }
    catch(FileNotFoundException ex)
    {
        //error accepted
    }    
    }
    
}
