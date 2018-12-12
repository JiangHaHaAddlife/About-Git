package com.tl.utils;

import redis.clients.jedis.Jedis; 

public class RedisUtil {   
	 private Jedis jedis; 
	 public RedisUtil(String host,int port){ 
		 jedis=new Jedis("localhost", 6379); 		 
	 }
	 
	 public void set(String key,String value){ 
		 jedis.set(key, value); 
	 }
	 
	 public String getString(String key){ 
		 return jedis.get(key); 
	 }
	
	public static void main(String[] args) {      
		// 连接本地的 Redis 服务      
		RedisUtil redisUtil=new RedisUtil("localhost",6379); 
		System.out.println
		 	("jedis_k1=:"+ redisUtil.getString("jedis_k1")); 
		} 
}
