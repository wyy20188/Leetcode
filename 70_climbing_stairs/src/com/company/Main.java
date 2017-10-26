package com.company;

import jdk.nashorn.internal.ir.IdentNode;

import java.util.HashMap;
import java.util.Map;

public class Main {

    class Solution {
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        public int climbStairs(int n) {
            map.put(1,1);
            map.put(2,2);
            return quickClimb(n);
        }
        public int quickClimb(int m){
            if (map.containsKey(m)){
                return map.get(m);
            }else{
                int x1=quickClimb(m-1);
                int x2=quickClimb(m-2);
                map.put(m-1,x1);
                map.put(m-2,x2);
                return x1+x2;
            }
        }
    }
}
