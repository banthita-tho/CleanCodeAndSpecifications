package lab;

/**
 * ==========================================================================
 *  ส่วน B — ฝึกเขียน Spec (JavaDoc) เอง
 * --------------------------------------------------------------------------
 *  โค้ดข้างล่างนี้ "ทำงานถูกต้องแล้ว" — ห้ามแก้ตัวโค้ด
 *  หน้าที่ของนิสิต: อ่านโค้ด แล้วเติม JavaDoc ให้แต่ละเมธอด
 *
 *  ต้องมีอย่างน้อย:
 *    - บรรทัดสรุปว่าเมธอด "ทำอะไร" (what, ไม่ใช่ how)
 *    - @param   ของทุกพารามิเตอร์ พร้อมข้อจำกัด (pre-condition)
 *    - @return  อธิบายค่าที่คืน (post-condition)
 *    - @throws  ทุก exception ที่โยน พร้อมเงื่อนไข
 * ==========================================================================
 */
public class Specs {

    // TODO ข้อ 4: เขียน JavaDoc ให้เมธอดนี้
    /**
     * เช็คค่าของ arr ว่าตรงกับค่า key มั้ยถ้าตรงจะ -1
     * @param arr not null
     * @param key ค่าที่ต้องการหา
     * @return -1 ถ้า arr ตรงกับ key
     * @throws IllegalArg arr == null
     */
    public static int firstIndexOf(int[] arr, int key) {
        if (arr == null) throw new IllegalArgumentException("arr must not be null");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    // TODO ข้อ 5: เขียน JavaDoc ให้เมธอดนี้
    /**
     * คำนวนค่าพื้นที่วงกลม
     * @param radius ต้องมากกว่า 0
     * @throws IllegalArg ถ้า radius <= 0
     * @return หาค่าพื้นที่วงกลม PI * radius * radius
     */
    public static double circleArea(double radius) {
        if (radius < 0) throw new IllegalArgumentException("radius must be >= 0");
        return Math.PI * radius * radius;
    }

    // TODO ข้อ 6: เขียน JavaDoc ให้เมธอดนี้
    //    input null ให้คืน string ว่าง)

    /**
     * เมธอดนี้ตัดช่องว่างหน้า-หลัง แล้วแปลงเป็นตัวพิมพ์เล็ก;
     * @param s not null
     * @return ข้อความเป็นตัวพิมพ์เล็กไม่เว้นช่องหน้าหลัง
     */
    public static String normalize(String s) {
        if (s == null) return "";
        return s.trim().toLowerCase();
    }
}
