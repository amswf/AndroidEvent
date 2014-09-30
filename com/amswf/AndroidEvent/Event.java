package com.amswf.AndroidEvent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by amy on 14/9/30.
 */
public class Event {
    public static HashMap map = new HashMap();
    //派送
    public static void dispatch(String name,Object data){
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry entry = (Map.Entry) iter.next();
            if(entry.getValue() == name){
                EventCallBack callBack = (EventCallBack)entry.getKey();
                callBack.execute(data);
            }
        }
    }
    //接收
    public static void addListener(String name,EventCallBack callback){
        map.put(callback,name);
    }

    public static void removeListener(String name,EventCallBack callback){
        map.remove(callback);
    }

    public interface EventCallBack {
        void execute(Object data);
    }
}