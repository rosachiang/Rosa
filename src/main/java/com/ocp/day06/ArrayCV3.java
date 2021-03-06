
package com.ocp.day06;
/*
// 求標準差
調查五位學生之身高及體重如下，試比較其分散程度。
身高：172、168、164、170、176(公分)
體重：62、57、58、64、64(公斤)
請問身高及體重哪一個較集中?
*/
public class ArrayCV3 {
    public static void main(String[] args) {
        double []h={172,168,164,170,176};
        double h_cv=MyMath.cv(h);
        double []w={62,57,58,64,64};
        double w_cv=MyMath.cv(w);
        String result=(h_cv<w_cv)?"身高":"體重";
        System.out.printf("身高 cv: %.2f%% 體重 cv: %.2f%% %s集中度較高", h_cv*100,w_cv*100,result);
        
        
    }
}
