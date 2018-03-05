package com.dzlb.algorithms.chapter02;

/**
 * 归并排序 , 分治思想 , 牺牲空间 , 换取时间 .
 * 排序所需时间与NlgN成正比
 * 需要与N的大小成正比的额外空间
 * 另:递归本身就是很耗费空间的做法
 * Created by wuhai on 2018/2/1.
 */
public class Merge extends SortExample{

    private static Comparable[] aux;

    /**
     *
     * @param a
     */
    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a,0,a.length - 1);
    }

    /**
     * 递归调用 , 分上半段,下半段排序 , 再合并
     * @param a
     * @param lo
     * @param hi
     */
    private static void sort(Comparable[] a, int lo,int hi){
        if(hi <= lo){
           return;
        }
        int mid = lo + (hi - lo)/2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }

    /**
     *
     * @param a
     * @param lo
     * @param mid
     * @param hi
     */
    public static void merge(Comparable[] a , int lo,int mid,int hi){
        int i = lo;
        int j = mid + 1;
        for(int k = lo; k <= hi ; k++){
            aux[k] = a[k];
        }
        for(int k = lo; k <= hi ; k++){
            if(i > mid){
                a[k] = aux[j++];
            }else if(j > hi){
                a[k] = aux[i++];
            }else if(less(aux[j],aux[i])){
                a[k] = aux[j++];
            }else{
                a[k] = aux[i++];
            }
        }
    }

}
