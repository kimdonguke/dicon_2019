//package com.example.dicon_2019;
//
//
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
//
//
//public class NetRetrofit {
//    final static String url="http:3.15.34.178:3000";
//    final static int port=3000;
//
//    private static Retrofit retrofit;
//    public static NetRetrofitServices getInstance(){
//        if(retrofit==null){
//            retrofit=new Retrofit.Builder()
//                    .baseUrl(url+":"+port)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//        return retrofit.create(RetrofitServices.class);
//    }
//}
