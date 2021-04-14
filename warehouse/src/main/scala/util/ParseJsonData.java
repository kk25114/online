package util;

import com.alibaba.fastjson.JSONObject;
import java.util.Collection;

public class ParseJsonData {
  public static JSONObject getJsonData(String data) {
    try {
      return JSONObject.parseObject(data);
    } catch (Exception e) {
      return null;
    }
  }

  public static void main(String[] args) {
    JSONObject jsonData = getJsonData(
        "E:\\source\\online\\warehouse\\src\\main\\resources\\memberRegtype.log");

    String dn = jsonData.getString("dn");
    System.out.println(dn);

  }
}
