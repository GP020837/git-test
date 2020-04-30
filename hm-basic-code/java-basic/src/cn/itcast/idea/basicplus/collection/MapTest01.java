package cn.itcast.idea.basicplus.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Map练习1 class
 *
 * @author hzx
 * @date 2020-04-23
 */
public class MapTest01 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap();
        Scanner sc = new Scanner(System.in);
        System.out.println("请在控制台输入一个字符串...");
        String s = sc.next();
        for (char aChar : s.toCharArray()) {
            if (map.containsKey(aChar)) {
                map.put(aChar, map.get(aChar) + 1);
            } else {
                map.put(aChar, 1);
            }
        }
        System.out.println(map);
    }
}
