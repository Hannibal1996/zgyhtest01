package jco;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoParameterList;

/**
 * @author gyh
 * @create 2020-08-27 8:32
 */
public class GetLabst {
   public static Labst GetLabst(String username, String password, String werks, String matnr, String lgort){
       Labst la = new Labst();
       JCoFunction function = null;
       JCoDestination dest = null;
       String labst="";//调用接口返回信息
       String meins="";//调用接口返回信息
       try {
           //调用ZCHENH001函数
           SapConn con = new SapConn(
                   "192.168.10.81",
                   "00",
                   "610",
                   username,
                   password,
                   "ZH",
                   "3",
                   "10",
                   ""
           );
           dest = SAPConnUtils.connect(con);
           function = dest.getRepository().getFunction("ZPJ_KC");
           JCoParameterList input = function.getImportParameterList();
           input.setValue("Z_WERKS", werks);
           input.setValue("Z_MATNR", matnr);
           input.setValue("Z_LGORT", lgort); // 输入参数
           function.execute(dest);
           labst= function.getExportParameterList().getString("Z_LABST");//调用接口返回信息
           meins= function.getExportParameterList().getString("Z_MEINS");//调用接口返回信息
           la.setLabst(labst);
           la.setMeins(meins);
       }catch (Exception e) {
           e.printStackTrace();
       }

       return la;
   }
}
