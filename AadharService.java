package project1;

import java.util.HashMap;
import java.util.Map;

public class AadharService {
    private static Map<String,Aadhaar> aadhaarMap = new HashMap<>();
    static {
        aadhaarMap.put("123423482" , new Aadhaar("123423482" , "Piyush" ,"Mr Pradeep kharapkar" ,
                "Mumbai"));
        aadhaarMap.put("123423462" , new Aadhaar("123423462" , "Tom" , "Mr Rick Curry" , "" +
                "Nagpur"));
    }

    public Aadhaar getAadharByNumber(String aadharNumber){
        return aadhaarMap.get(aadharNumber);
    }
}
