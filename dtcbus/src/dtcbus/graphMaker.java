package dtcbus;
import java.util.*;
public class graphMaker {
    
    static String[] aName = new String[4000];
    static String[] bName = new String[600];
    static int totalArea = -1;
    static int totalBus = -1;
    static int minCount = Integer.MAX_VALUE;
    static int totalMinStop = Integer.MAX_VALUE;
    static ArrayList<ArrayList<Edge>> cityMap = new ArrayList<>();
    static ArrayList<DTC> busDetails = new ArrayList<>();
    static ArrayList<Area> areaDetails = new ArrayList<>();

    public static class Area{
        String areaName;
        int areaCode;
        ArrayList<Integer> busIn = new ArrayList<>();
        ArrayList<Integer> busOut = new ArrayList<>();
        
    }
    public static class DTC{
        int code;
        String busRouteNo;
        String start;
        String end;
        String direction;
        ArrayList<String> intermediateStop = new ArrayList<>();
        ArrayList<Integer> imsI = new ArrayList<>();
    }

    public static class Edge{
        int nb;
        String busNo;
        int busId;
        double distance;
    }
    
    
    public static class pp{
        int code;
        int count;
        int totalStop;
        int prevBus;

        ArrayList<Integer> busStop = new ArrayList<>();
        ArrayList<Integer> busNo = new ArrayList<>();
    }
    
    public static String convertString(String input){
        
        String output = "";
        
        for(int i = 0;i < input.length() - 1;i++){
             output += input.charAt(i);
               if((int)(input.charAt(i)) <= 122 && (int)(input.charAt(i)) >= 97){
                   if((int)(input.charAt(i + 1)) < 97 || (int)(input.charAt(i + 1)) > 122){
                       output += " ";
                   }
               }
        }
        output += input.charAt(input.length() - 1);
        return output;
    }
    
    public static int searchAreaIfExistOrNot(String input){
        int returnValue = -1;
        for(int i=0;i<=totalArea;i++){
            if(aName[i].equals(input)){
                return i;
            }
        }
        return returnValue;
    }
    public static int searchDtcBus(String input){
        for(int i=0;i<busDetails.size();i++){
            if(bName[i].equals(input)){
                return i;
            }
        }
        return -1;
    }
    public static int interBusStop(int id,int start,int end){
        int startIndex = -1;
        int endIndex  = -1;
        for(int i=0;i<busDetails.get(id).imsI.size();i++){
            if(busDetails.get(id).imsI.get(i) == start){
                startIndex = i;
                break;
            }
        }
        for(int i=0;i<busDetails.get(id).imsI.size();i++){
            if(busDetails.get(id).imsI.get(i) == end){
                endIndex = i;
                break;
            }
        }
        return endIndex > startIndex ? endIndex - startIndex : startIndex - endIndex;
    }
    
    public static void displayDTC(String busNo){
        for(DTC bsNo : busDetails){
            if(bsNo.busRouteNo.equals(busNo)){
                System.out.println("Source & destination : " + bsNo.start + " , " + bsNo.end 
                + " via " + bsNo.intermediateStop.size() + " bus stop : ");
                for(String stop : bsNo.intermediateStop){
                    System.out.println(stop);
                }
                return;
            }
        }
    }

    public static void display(){
        for(int i=0;i<=totalArea;i++){
            System.out.print(areaDetails.get(i).areaName);
            for(int j=0;j<cityMap.get(i).size();j++){
                System.out.print(" [" +areaDetails.get(cityMap.get(i).get(j).nb).areaName + "-" +cityMap.get(i).get(j).busNo + " ] " ); 
            }
            System.out.println();
        }
    }
    

    public static boolean checkNbg(int id,int start,int nb){
        for(int i=0;i<cityMap.get(start).size();i++){
            if(cityMap.get(start).get(i).nb==nb && cityMap.get(start).get(i).busId == id){
                return true;
            }
        }
        return false;
    }
    

    public static boolean checkResult(int id,String input){
        for(int i=0;i<busDetails.get(id).intermediateStop.size();i++){
            if(busDetails.get(id).intermediateStop.get(i).equals(input)){
                return true;
            }
        }
        return false;
    }
    public static class resultPair{
        
        ArrayList<Integer> stop = new ArrayList<>();
        ArrayList<Integer> bus = new ArrayList<>();
        int minStop;
        int totalChange;
         
    }
    public static String displayIntermediate(int id,int start,int end){
        int startIndex = -1;
        int endIndex  = -1;
        String output = "";
        for(int i=0;i<busDetails.get(id).imsI.size();i++){
            if(busDetails.get(id).imsI.get(i) == start){
                startIndex = i;
                break;
            }
        }
        for(int i=0;i<busDetails.get(id).imsI.size();i++){
            if(busDetails.get(id).imsI.get(i) == end){
                endIndex = i;
                break;
            }   
        }
        if(busDetails.get(id).direction.equals("2")){
            for(int i=startIndex + 1;i<endIndex;i++){
                output +="          "+ convertString((aName[busDetails.get(id).imsI.get(i)]))+"\n";
            }
        }
        else{
            if(startIndex <= endIndex){
                for(int i=startIndex + 1;i<endIndex;i++){
                   output += "          "+convertString((aName[busDetails.get(id).imsI.get(i)])) +"\n";
                }
            }else{
                for(int i=startIndex-1;i> endIndex;i--){
                    output+="          "+convertString((aName[busDetails.get(id).imsI.get(i)]))+"\n";
                }

            }
        }
        return output;
        
    }
    
    
        public static resultPair bfsMinStop(int start,int end){
        
        minCount = Integer.MAX_VALUE;
        totalMinStop = Integer.MAX_VALUE;
        boolean[] visited = new boolean[totalArea + 1];
        ArrayDeque<pp> q =new ArrayDeque<>();
        ArrayList<Integer> ansStop = new ArrayList<>();
        ArrayList<Integer> ansNo = new ArrayList<>();
        pp st = new pp();
        st.code = start;
        st.count = 1;
        st.prevBus = totalBus;
        st.totalStop = 1;
        q.addLast(st);
        while(q.size() > 0){
            pp rem = q.getFirst();
            q.removeFirst();
            if(visited[rem.code] == true){
                continue;
            }
            
            for(int i=0;i<areaDetails.get(rem.code).busOut.size();i++){
                for(int j=0;j<areaDetails.get(end).busIn.size();j++){
  
                    if(areaDetails.get(rem.code).busOut.get(i).equals(areaDetails.get(end).busIn.get(j))){
                       
                        int tstop = rem.totalStop + interBusStop(areaDetails.get(rem.code).busOut.get(i), rem.code, end);
                          //Changeeee
                        if(tstop < totalMinStop){
                            ansNo.clear();
                            ansStop.clear();
                            for(int str : rem.busNo){
                                ansNo.add(str);
                            }
                            ansNo.add(areaDetails.get(rem.code).busOut.get(i));
                            for(int str : rem.busStop){
                                ansStop.add(str);
                            }
                            ansStop.add(areaDetails.get(rem.code).areaCode);
                            if(rem.prevBus == areaDetails.get(rem.code).busOut.get(i)){
                                minCount  = rem.count;
                            }else{
                                minCount = rem.count + 1;
                            }
                            if(minCount == 1){
                                break;
                            }
                            totalMinStop = tstop;
                    }
                    
                }
                    
                }
            }

        visited[rem.code] = true;
        for(int i =0 ;i<areaDetails.get(rem.code).busOut.size();i++){
            for(int j = 0;j<busDetails.get(areaDetails.get(rem.code).busOut.get(i)).imsI.size();j++){
                if(visited[busDetails.get(areaDetails.get(rem.code).busOut.get(i)).imsI.get(j)] == false){
                    pp np = new pp();
                    np.code = busDetails.get(areaDetails.get(rem.code).busOut.get(i)).imsI.get(j);
                    np.prevBus =  areaDetails.get(rem.code).busOut.get(i);
                    for(int input : rem.busNo){
                        np.busNo.add(input);
                    }
                    np.busNo.add(areaDetails.get(rem.code).busOut.get(i));
                    for(int input : rem.busStop){
                        np.busStop.add(input);
                    }
                    np.busStop.add(rem.code);
                    if(rem.prevBus == areaDetails.get(rem.code).busOut.get(i)){
                        np.count = rem.count;
                    }else{
                        np.count = rem.count  + 1;
                    }
                    np.totalStop = rem.totalStop + 
                                   interBusStop(areaDetails.get(rem.code).busOut.get(i), 
                                                rem.code,
                                                busDetails.get(areaDetails.get(rem.code).busOut.get(i)).imsI.get(j));
                    q.addLast(np);

                }
            }
        }
        
    }
       
     resultPair rs = new resultPair();
     rs.bus = ansNo;
     rs.stop = ansStop;
     rs.minStop = totalMinStop;
     rs.totalChange = minCount;

    
        return rs;
    }
    public static resultPair bfsMinChange(int start,int end){
        minCount = Integer.MAX_VALUE;
        totalMinStop = Integer.MAX_VALUE;
        boolean[] visited = new boolean[totalArea + 1];
        ArrayDeque<pp> q =new ArrayDeque<>();
        ArrayList<Integer> ansStop = new ArrayList<>();
        ArrayList<Integer> ansNo = new ArrayList<>();
        pp st = new pp();
        st.code = start;
        st.count = 1;
        st.prevBus = totalBus;
        st.totalStop = 1;
        q.addLast(st);
        while(q.size() > 0){
            pp rem = q.getFirst();
            q.removeFirst();
            if(visited[rem.code] == true){
                continue;
            }
            
            for(int i=0;i<areaDetails.get(rem.code).busOut.size();i++){
                for(int j=0;j<areaDetails.get(end).busIn.size();j++){
                    // int busId = searchDtcBus(areaDetails.get(end).busIn.get(j));
                    if(areaDetails.get(rem.code).busOut.get(i).equals(areaDetails.get(end).busIn.get(j))){
                       
                        int tstop = rem.totalStop + interBusStop(areaDetails.get(rem.code).busOut.get(i), rem.code, end);
                        // if(tstop < totalMinStop){
                           // chanhgadjksdv
                        if(minCount > rem.count && totalMinStop > tstop){
                            ansNo.clear();
                            ansStop.clear();
                            for(int str : rem.busNo){
                                ansNo.add(str);
                            }
                            ansNo.add(areaDetails.get(rem.code).busOut.get(i));
                            for(int str : rem.busStop){
                                ansStop.add(str);
                            }
                            ansStop.add(areaDetails.get(rem.code).areaCode);
                            if(rem.prevBus == areaDetails.get(rem.code).busOut.get(i)){
                                minCount  = rem.count;
                            }else{
                                minCount = rem.count + 1;
                            }
                            if(minCount == 1){
                                break;
                            }
                            totalMinStop = tstop;
                    }
                    
                }
                    
                }
            }

        visited[rem.code] = true;
        for(int i =0 ;i<areaDetails.get(rem.code).busOut.size();i++){
            for(int j = 0;j<busDetails.get(areaDetails.get(rem.code).busOut.get(i)).imsI.size();j++){
                if(visited[busDetails.get(areaDetails.get(rem.code).busOut.get(i)).imsI.get(j)] == false){
                    pp np = new pp();
                    np.code = busDetails.get(areaDetails.get(rem.code).busOut.get(i)).imsI.get(j);
                    np.prevBus =  areaDetails.get(rem.code).busOut.get(i);
                    for(int input : rem.busNo){
                        np.busNo.add(input);
                    }
                    np.busNo.add(areaDetails.get(rem.code).busOut.get(i));
                    for(int input : rem.busStop){
                        np.busStop.add(input);
                    }
                    np.busStop.add(rem.code);
                    if(rem.prevBus == areaDetails.get(rem.code).busOut.get(i)){
                        np.count = rem.count;
                    }else{
                        np.count = rem.count  + 1;
                    }
                    np.totalStop = rem.totalStop + 
                                   interBusStop(areaDetails.get(rem.code).busOut.get(i), 
                                                rem.code,
                                                busDetails.get(areaDetails.get(rem.code).busOut.get(i)).imsI.get(j));
                    q.addLast(np);

                }
            }
        }
        
    }
       
     resultPair rs = new resultPair();
     rs.bus = ansNo;
     rs.stop = ansStop;
     rs.minStop = totalMinStop;
     rs.totalChange = minCount;

    
        return rs;
    }
    public static ArrayList<resultPair> bfsAllRoute(int start,int end){
        minCount = Integer.MAX_VALUE;
        totalMinStop = Integer.MAX_VALUE;
        ArrayList<resultPair> result = new ArrayList<>();
        boolean[] visited = new boolean[totalArea + 1];
        ArrayDeque<pp> q =new ArrayDeque<>();
        ArrayList<Integer> ansStop = new ArrayList<>();
        ArrayList<Integer> ansNo = new ArrayList<>();
        pp st = new pp();
        st.code = start;
        st.count = 1;
        st.prevBus = totalBus;
        st.totalStop = 1;
        q.addLast(st);
        while(q.size() > 0){
            pp rem = q.getFirst();
            q.removeFirst();
            if(visited[rem.code] == true){
                continue;
            }
            if(result.size()<10){
            for(int i=0;i<areaDetails.get(rem.code).busOut.size();i++){
                for(int j=0;j<areaDetails.get(end).busIn.size();j++){
                    // int busId = searchDtcBus(areaDetails.get(end).busIn.get(j));
                    if(areaDetails.get(rem.code).busOut.get(i).equals(areaDetails.get(end).busIn.get(j))){
                       
                        int tstop = rem.totalStop + interBusStop(areaDetails.get(rem.code).busOut.get(i), rem.code, end);
                        // if(tstop < totalMinStop){
                           
                            if(tstop < totalMinStop && rem.count < 4 ){
                            result.add(0,new resultPair());
                         
                            for(int str : rem.busNo){
                                result.get(0).bus.add(str);
                            }
                            result.get(0).bus.add(areaDetails.get(rem.code).busOut.get(i));
                            for(int str : rem.busStop){
                                result.get(0).stop.add(str);
                            }
                            result.get(0).stop.add(areaDetails.get(rem.code).areaCode);
                            if(rem.prevBus == areaDetails.get(rem.code).busOut.get(i)){
                                 result.get(0).totalChange  = rem.count;
                            }else{
                               result.get(0).totalChange = rem.count + 1;
                            }
                            if(totalMinStop > tstop){
                                totalMinStop = tstop;
                            }
                           
                            result.get(0).minStop = tstop;
                            }
                    
                }
                }
                    
                }
            }

        visited[rem.code] = true;
        for(int i =0 ;i<areaDetails.get(rem.code).busOut.size();i++){
            for(int j = 0;j<busDetails.get(areaDetails.get(rem.code).busOut.get(i)).imsI.size();j++){
                if(visited[busDetails.get(areaDetails.get(rem.code).busOut.get(i)).imsI.get(j)] == false){
                    pp np = new pp();
                    np.code = busDetails.get(areaDetails.get(rem.code).busOut.get(i)).imsI.get(j);
                    np.prevBus =  areaDetails.get(rem.code).busOut.get(i);
                    for(int input : rem.busNo){
                        np.busNo.add(input);
                    }
                    np.busNo.add(areaDetails.get(rem.code).busOut.get(i));
                    for(int input : rem.busStop){
                        np.busStop.add(input);
                    }
                    np.busStop.add(rem.code);
                    if(rem.prevBus == areaDetails.get(rem.code).busOut.get(i)){
                        np.count = rem.count;
                    }else{
                        np.count = rem.count  + 1;
                    }
                    np.totalStop = rem.totalStop + 
                                   interBusStop(areaDetails.get(rem.code).busOut.get(i), 
                                               rem.code,
                                               busDetails.get(areaDetails.get(rem.code).busOut.get(i)).imsI.get(j));
                    q.addLast(np);

                }
            }
        }
        
    }
       
    
     return result;
    }
    
    
}
