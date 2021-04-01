
package com.ocp.day06;
import java.util.Arrays;
public class ArrayBMICV {
    public static void main(String[] args) {
        String []name={"A","B","C","D","E"};
                
        double []h={172,168,164,170,176};
        double []w={62,57,58,64,64};
        Person []persons=new Person[5];
        
        for(int i=0;i<persons.length;i++){
         Person p=new Person(name[i],h[i], w[i]);
         persons[i]=p;
         System.out.println(persons[i]);
    }
        for(Person p:persons){
            System.out.printf("bmi: %.1f\n",p.bmi);
        }
        double []bmis=new double[5];
        for(int i=0;i<persons.length;i++){
            bmis[i]=persons[i].bmi;
        }
        System.out.println(Arrays.toString(bmis));
        double bmi_cv=MyMath.cv(bmis);
        System.out.printf("BMI c.v: %.2f%%\n", bmi_cv*100);
    }
    
    
        
    
}
