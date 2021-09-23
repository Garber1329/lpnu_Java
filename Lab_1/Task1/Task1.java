package com.company.Task1;

public class Task1 {

    public static void main(final String[] args) {
        final String[] arr ={"avd", "llcdcv", "kc", "dscsdvsdv", "dvf", "d", "dfasdf"};

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j  = 0 ; j < i ; j++){
                if( arr[j].length() > arr[j+1].length()){
                    final String tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for(int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
