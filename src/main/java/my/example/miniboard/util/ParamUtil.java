package my.example.miniboard.util;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.Set;

public class ParamUtil {

    /**
     * 입력되지 않은 key 를 리턴하는 메소드
     * @param paramMap
     * @return
     */
    public static String validationCheck(Map<String, String[]> paramMap){

        if (!paramMap.isEmpty()) {
            Set<Map.Entry<String, String[]>> entrySet = paramMap.entrySet();
            for (Map.Entry<String, String[]> entry: entrySet) {
                String key = entry.getKey();
                String[] value = entry.getValue();

                if (value == null || value[0].equals("")) {
                    return key;
                }
            }
        }

        return null;
    }

    public void validationCheckReq(HttpServletRequest req) {

    }
}
