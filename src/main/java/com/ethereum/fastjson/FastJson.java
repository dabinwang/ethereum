package com.ethereum.fastjson;
import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * Created by wangbin on 2017/11/1.
 */
public class FastJson {

    public User getUser(){
        User user=new User();
        user.setId("02");
        user.setName("张三");
        user.setAge(33);
        user.setPay(6666.88);
        user.setValid(true);
        user.setOne('E');
        user.setBirthday(new Date(20l*366*24*3600*1000)); //1990年

        Link link = new Link();
        link.setAddress("河南省济源市");
        link.setPhone("13899995555");
        link.setQq("123456");
        user.setLink(link);

        Map map=new HashMap();
        map.put("aa", "this is aa");
        map.put("bb", "this is bb");
        map.put("cc", "this is cc");
        user.setMap(map);

        List list=new ArrayList(){};
        list.add("普洱");
        list.add("大红袍");
        user.setList(list);

        Set set=new HashSet();
        set.add("篮球");
        set.add("足球");
        set.add("乒乓球");
        user.setSet(set);

        return user;
    }

    public List getList(){
        List list = new ArrayList();

        Link link1 = new Link();
        link1.setAddress("河南省济源市");
        link1.setPhone("23899995555");
        link1.setQq("123456");
        Link link2 = new Link();
        link2.setAddress("河南省济源市");
        link2.setPhone("13899995555");
        link2.setQq("123456");
        Link link3 = new Link();
        link3.setAddress("河南省济源市");
        link3.setPhone("13899995555");
        link3.setQq("123456");

        list.add(link1);
        list.add(link2);
        list.add(link3);

        return list;
    }

    /*public static final <T> T parseObject(String text, Class<T> clazz); // 把JSON文本parse为JavaBean
    public static final JSONArray parseArray(String text); // 把JSON文本parse成JSONArray
    public static final <T> List<T> parseArray(String text, Class<T> clazz); //把JSON文本parse成JavaBean集合
    public static final String toJSONString(Object object); // 将JavaBean序列化为JSON文本
    public static final Object toJSON(Object javaObject); 将JavaBean转换为JSONObject或者JSONArray。*/

    /**
     * 对象转换为json
     * @return
     */
    public String objectToJson(){
        User user = this.getUser();
        String json = JSON.toJSONString(user);
        return json;
    }

    /**
     * json转换为对象
     * @return
     */
    public Object jsonToObject(){
        String json = this.objectToJson();
        User user = JSON.parseObject( json , User.class);
        return null;
    }


    /**
     * list转换为json
     * @return
     */
    public String listToJson(){
        List list = this.getList();
        String json = JSON.toJSONString(list);
        return json;
    }


    public List jsonToList(){
        String json = this.listToJson();
        List<Link> list = JSON.parseArray( json , Link.class);
        for( Link link : list){
        }
        return list;
    }
}























