package sit.int202;

import lombok.EqualsAndHashCode;
import lombok.Getter; //ตัวที่ช่วยทำ คือการเอาทุกอย่างไปทำให้ ตามฟิล
import lombok.Setter; //ตัวที่ช่วยทำ คือการเอาทุกอย่างไปทำให้ ตามฟิล
import lombok.ToString; //ตัวที่ช่วยทำ คือการเอาทุกอย่างไปทำให้ ตามฟิล

@Setter //ขอจาก Lombok
@Getter //ขอจาก Lombok
@ToString(exclude = "gpax") //คือการไม่อยากได้
@EqualsAndHashCode //สร้างเมธอด equals() และ hashCode() //คือการเอาfield มาเทียบกัน ถ้าเท่ากับคืออันเดียวกัน

public class Student implements Comparable<Student> {
    private Integer id;
    private String name;
    private Double gpax;

    @Override
    public int compareTo(Student o) {
        //ถ้า เอาStudentคนที่1 Compare Studentคนที่2
        //this.id คือ x // o คือ y
        return -(this.id - o.id);
    /*การลบค่า ID ทั้งสองจะให้ผลลัพธ์ดังนี้:
     ค่าเป็นบวก: หมายความว่าวัตถุปัจจุบันมีค่า ID มากกว่าวัตถุที่เปรียบเทียบ
     ค่าเป็นศูนย์: หมายความว่าวัตถุทั้งสองมีค่า ID เท่ากัน
     ค่าเป็นลบ: หมายความว่าวัตถุปัจจุบันมีค่า ID น้อยกว่าวัตถุที่เปรียบเทียบ*/
    }
}
