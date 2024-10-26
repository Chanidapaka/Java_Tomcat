package sit.int202;

import java.util.*;

public class TestSotedSet {
    //ความแตกต่างระหว่าง ArrayList และ TreeSet
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>(); //เป็น ArrayList ที่ใช้เก็บจำนวนเต็ม
//        Set<Integer> set = new TreeSet<Integer>(); //เป็น TreeSet ที่ใช้เก็บจำนวนเต็มเช่นกัน
//        for (int i =0; i < 20; i++){ //วนลูป 20 ครั้ง เพื่อสร้างจำนวนสุ่มระหว่าง 10 ถึง 109
//            int x = (int)(Math.random()*100)+10;
//            list.add(x);
//            set.add(x);
//        }
//        System.out.println(list); //ผลลัพธ์จาก ArrayList ลำดับของข้อมูลไม่แน่นอน */มีข้อมูลซ้ำ
//        System.out.println(set); //ผลลัพธ์จาก TreeSet ข้อมูลถูกเรียงลำดับจากน้อยไปมาก */ไม่มีข้อมูลซ้ำ

        //----------------- ทำของ Student--------------------//
        List<Student> list = new ArrayList();
        Set<Student> set = new TreeSet();
        Set<Student> hash = new HashSet<>();
        Student x = null;
        for (int i =0; i < 20; i++){
            x = new Student();
            x.setId(i+101);
            list.add(x);
            set.add(x);
            hash.add(x);
        }
        System.out.println(list); //ผลลัพธ์จาก ArrayList  ข้อมูลถูกเรียงลำดับจากน้อยไปมาก */ไม่มีข้อมูลซ้ำ
        System.out.println(set); //ผลลัพธ์จาก TreeSet ข้อมูลถูกเรียงลำดับจากน้อยไปมาก */ไม่มีข้อมูลซ้ำ
        System.out.println(hash); //ผลลัพธ์จาก HashSet ข้อมูลไม่เรียงลำดับจากน้อยไปมาก */ไม่มีข้อมูลซ้ำ
    }
}
