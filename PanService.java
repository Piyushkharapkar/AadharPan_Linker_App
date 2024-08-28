package project1;

import java.util.HashMap;
import java.util.Map;

public class PanService {
    private static Map<String,Pan> panMap = new HashMap<>();

    static {
        panMap.put("EDWABCS123N8" , new Pan("EDWABCS123N8" , "123423482" ,"HDFC" ,
                "Stocks,FD , mutual funds"));
        panMap.put("EDWABCS123N6" , new Pan("EDWABCS123N6" , "123423462" , "Union Bank Of India"
        , "Indexfund , crypto , sensex , stocks"));
    }
    public Pan getPanByAadharNumber(String aadharNumber)
    {
        for( Pan pan: panMap.values() ){
            if (pan.getAadharNumber().equals(aadharNumber))
            {
                return pan;
            }
        }
        return null;
    }

}
