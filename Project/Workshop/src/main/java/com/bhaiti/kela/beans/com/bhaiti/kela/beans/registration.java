package com.bhaiti.kela.beans;

import java.util.ArrayList;
import java.util.List;

public class registration {
    private List<work> workRecords;
    private static registration workregd = null;
    private registration(){
    workRecords = new ArrayList<work>();
    }
    public static registration getInstance() {
        if(workregd == null) {
              workregd = new registration();
              return workregd;
            }
            else {
                return workregd;
            }
    }
    public void add(work w) {
    workRecords.add(w);
    }
public String upDateWork(work w) {
for(int i=0; i<workRecords.size(); i++)
        {
            work w1 = workRecords.get(i);
            if(w1.getWorkid().equals(w.getWorkid())) {
              workRecords.set(i,w);//update the new record
              return "Update successful";
            }
        }
return "Update un-successful";
}
public String deleteWork(String workid) {
for(int i=0; i<workRecords.size(); i++)
        {
            work w = workRecords.get(i);
            if(w.getWorkid().equals(workid)){
              workRecords.remove(i);//update the new record
              return "Delete successful";
            }
        }
return "Delete un-successful";
}
    public List<work> getworkRecords() {
    return workRecords;
    }
}